
# Python3 script to replace all :emoji_names: with actual emoji characters
# in all files ending with ".md" throughout the whole project

import io
import json
import os
from pathlib import Path

parent_dir = Path(__file__).parent
root_dir = (parent_dir / "../../").resolve()
emojis_data = (parent_dir / "emojis.json").resolve()
emojis = None
text = None

with open(emojis_data, "r") as f:
	emojis = json.load(f)["emojis"]

for subdir, dirs, files in os.walk(root_dir):
	for f_name in files:
		f_path = os.path.join(subdir, f_name)
		if not f_path.endswith(".md"):
			print("Not a Markdown file: " + f_path)
			continue
		print(f_path)
		with open(f_path, "r") as f:
			text = f.read()
		for e in emojis:
			if len(e["shortname"]) < 3:
				continue
			text = text.replace(e["shortname"], e["emoji"])
		with open(f_path, "w") as f:
			f.write(text)
