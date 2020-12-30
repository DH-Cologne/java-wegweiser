# Kommentare 💬<!-- omit in toc -->

Kommentare ermöglichen es, Text in den Quellcode zu schreiben, der vom Compiler ignoriert wird.
Sie können dazu benutzt werden, Code übersichtlicher zu gestalten und ihn zu erläutern. Das ist besonders hilfreich für andere Personen, die den Code lesen möchten. Es hilft aber auch dabei, zu einem späteren Zeitpunkt schnell wieder den Überblick über den eigenen Code zu erlangen.

- [Inline-Kommentare](#inline-kommentare)
- [Mehrzeilige Kommentare](#mehrzeilige-kommentare)


## Inline-Kommentare

Inline-Kommentare (am Zeilen-Ende) werden mit `//` eingeleitet: 
``` java
10 //Der unten stehende Code gibt "Quarktasche" in der Konsole aus:
11   
12 System.out.println("Quarktasche");
```
Es wird aber nur das auskommentiert, was in Zeile `10` hinter `//` geschrieben wurde.  


``` java
10 //Der unten stehende Code gibt "Quarktasche" in der Konsole aus:
11   
12 System.out.println("Quarktasche");
13 
14 //System.out.println("Obstsalat");
```

Man kann Kommentare auch dazu benutzen, Code z.B. zu Testzwecken nicht auszuführen. Der Methoden-Aufruf in Zeile `14` etwa wird vom Compiler ignoriert.

> 👉 In Eclipse werden mit `Strg + Shift + 7` oder `Strg + Shift + C` alle markierten Zeilen mit einem Inline-Kommentar versehen.


## Mehrzeilige Kommentare

Ein mehrzeiliger Kommentar beginnt mit `/*` und wird `*/` geschlossen. 
``` java
   09
   10 /* Als Herr Bilbo Beutlin von Beutelsend ankündigte, daß er demnächst zur Feier
   11      seines einundelfzigsten Geburtstages ein besonders prächtiges Fest geben wolle, war
   12      des Geredes und der Aufregung in Hobbingen kein Ende. Bilbo war sehr reich und
   13      sehr absonderlich, und seit er vor sechzig Jahren plötzlich verschwunden und unerwartet
   14      zurückgekehrt war, hatte man im Auenland nicht aufgehört, sich über ihn zu
   15      verwundern. */ 
   16
   17
```

Alles, was sich zwischen diesen beiden Markierungen befindet,
wird vom Compiler ignoriert. Auf diese Weise kann man einen Kommentar über mehrere Zeilen ziehen.








