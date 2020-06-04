# Contribution: Wie kann ich mitwirken? :woman_technologist:


## Wer wird hier angesprochen?

In guter Open Source-Manier ist jede\*r Teilnehmer\*in des Softwaretechnologie-Moduls (und jede\*r Interessierte) dazu eingeladen, dieses Repository mitzugestalten, inhaltlich zu erweitern, Erläuterungen zu verbessern oder auch einfach nur eventuelle Fehler zu korrigieren.


## Warum sollte ich? :man_shrugging:

Du hilfst dabei, eine Ressource zu verbessern, von der du selbst profitierst. Du nimmst Open Source-Kultur teil und tust damit etwas Gutes. Davon abgesehen kannst du nebenbei lernen, wie man mit [Git](https://git-scm.com/) und [GitHub](https://github.com) umgeht und sich mit Hilfe dieser Werkzeuge an offenen Projekten beteiligt. :raised_hands:   
Übrigens: Bei einer Bewerbung sehen Beteiligungen an Open Source-Projekten sicherlich auch nicht schlecht aus!

Falls dir das nicht reicht, findest du [hier](https://www.makeuseof.com/tag/people-contribute-open-source-projects/), [hier](https://opensource.com/life/15/12/why-open-source) oder zur Not sogar [hier](https://opensource.google/docs/why/) weitere Gründe.


## Wie weise ich auf Fehler, fehlende Inhalte etc. hin?

Benutze dazu bitte das [Issue-System dieses Repositories](https://github.com/DH-Cologne/java-wegweiser/issues). Überprüfe zunächst, ob es schon ein Issue zu dem Thema gibt, das du ansprechen möchtest. Falls nicht, eröffne ein neues Issue!  
Bitte führe nicht mehrere unzusammenhängende Probleme in einem Issue auf, sondern erstelle jeweils separate Issues!


## Was kann ich verbessern?

Wenn dir selbst keine Probleme aufgefallen sind, dann schau doch mal ins [Issue-System dieses Repositories](https://github.com/DH-Cologne/java-wegweiser/issues)!


## Wie bearbeite ich die Inhalte?

### Ablauf einer "Contribution"
Es gibt einen mehr oder weniger [üblichen Weg](https://opensource.guide/how-to-contribute/), um an Open-Source-Projekten auf GitHub mitzuwirken. Dieser sei hier **in Kürze** (und in einer sehr vereinfachten Variante) beschrieben...

> :warning: Du brauchst vorher natürlich einen [GitHub-Account](https://github.com/join) und solltest ungefähr verstanden haben, was [Git](https://de.wikipedia.org/wiki/Git) ist, [wie](https://rogerdudler.github.io/git-guide/index.de.html) es [funktioniert](https://git-scm.com/book/de/v2) und du solltest es [auf deinem Computer installieren](https://git-scm.com/downloads)!

1) Besuche die GitHub-Seite dieses Repositories unter [https://github.com/DH-Cologne/java-wegweiser](https://github.com/DH-Cologne/java-wegweiser) und erstelle einen Fork des Repositories, indem du oben rechts auf den Button **"Fork"** klickst. Dadurch wird deine eigene Kopie des Repos in deinem GitHub-Account erstellt.
2) Öffne ein Terminal (oder in Windows die _hoffentlich_ mitinstallierte Git-Bash) und [navigiere](https://duckduckgo.com/?q=navigieren+im+terminal) zu dem Ordner, in dem du die lokale Version deines Repos speichern möchtest und führe dann den Git-Befehl `git clone https://github.com/deinGitHubName/java-wegweiser.git` aus (ersetze bitte `deinGitHubName` durch deinen GitHub-Benutzernamen). Git "klont" nun das Repo in den Ordner `java-wegweiser`.
3) Du kannst jetzt die Dateien im Ordner `java-wegweiser` mit einem beliebigen Text-Editor bearbeiten (siehe Abschnitt [Markdown](#markdown) und [Leitfaden...](#leitfaden-f%c3%bcr-dieses-repository) weiter unten!).
4) Wenn du mit deinen Änderungen fertig bist, musst du sie in dein lokales Repository _committen_. Füge sie dazu zunächst dem _Index_ hinzu - das ist eine Struktur, in der alle Änderungen, die Teil dieses Commits werden sollen, gespeichert sind. Um das zu tun, öffne wieder das Terminal, navigiere in den Ordner `java-wegweiser` und führe den Befehl `git add --all` aus. Dadurch werden **alle** Änderungen, die du an den Dateien vorgenommen hast, _committet_.
5) Um den Zustand deines lokalen Repositories auf dein Remote-Repository (das in deinem GitHub-Account) zu übertragen, führe danach den Befehl `git push origin master` aus. Git wird dich nach deinen Zugangsdaten für GitHub fragen.
6) Jetzt sollten deine Änderungen auf deinen "Fork" in deinem Account bei GitHub übertragen sein! Überprüfe das, indem du dir die Dateien bei GitHub ansiehst.
7) Um nun die Änderungen, die in deinem Fork gemacht wurden, als Änderungen für das öffentliche `java-wegweiser`-Repository vorzuschlagen, musst du einen so genannten [Pull Request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests) bei GitHub stellen - also eine Anfrage zum Übernehmen der Änderungen an die Person, die für `java-wegweiser` verantwortlich ist. Gehe dazu auf die [GitHub-Seite von `java-wegweiser`](https://github.com/DH-Cologne/java-wegweiser) und klicke auf **"New pull request"**. Klicke dann auf den link "compare across forks", um als _head repository_ dein eigenes auswählen zu können (wähle deinen Namen aus der Liste aus). Jetzt kannst du den Pull Request stellen!

> :speech_balloon: Falls du einen modernen Text-Editor / IDE mit einer Git-Integration benutzt, kannst du die Schritte **4** und **5** auch dort in der graphischen Oberfläche ausführen, statt die Git-Befehle im Terminal zu benutzen.

> :speech_balloon: **Übrigens:** Eine Alternative wäre das direkte Bearbeiten der Dateien hier in GitHub - diese Variante ist aber eher nur für kleinere Änderungen oder Korrekturen geeignet. GitHub erstellt dann automatisch einen [Pull Request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests) für die Änderungen.

### Markdown
Es handelt sich bei den Dokumenten in diesem Repository um [Markdown](https://de.wikipedia.org/wiki/Markdown)-Dateien (eine sehr einfache Auszeichnungssprache), die sich ganz leicht in jedem Text-Editor bearbeiten lassen. Gute Text-Editoren (die auch Markdown unterstützen) sind z.B. [VSCode](https://code.visualstudio.com/), [SublimeText](https://www.sublimetext.com/) oder [Atom](https://atom.io/).

> :speech_balloon: Eine gute Einführung zu Markdown findest du [hier](https://guides.github.com/features/mastering-markdown/).  

### Leitfaden für dieses Repository

:warning: Bitte beachte den [**Leitfaden für Beiträge / Contributions**](Leitfaden.md) !!!


<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>