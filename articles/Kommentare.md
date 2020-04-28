# Kommentare :speech_balloon:

Kommentare machen es möglich, Text in den Quellcode zu schreiben, der vom Compiler ignoriert wird.
Sie können dazu benutzt werden, Code übersichtlicher zu gestalten und zu erläutern, was man sich denn beim
Programmieren des jeweiligen Code-Blockes denn gedacht hat.  
Dies ist besonders hilfreich für andere Personen,
die sich den Code ansehen oder kann auch für einen selbst nützlich sein, wenn man sich den Code nach einem längeren Zeitabstand wieder 
vor Augen führen möchte.
## Inline-Kommentare
Für Inline-Kommentare benutzt man `//`. 
``` java
   10 //Der unten stehende Code gibt "Quarktasche" in der Konsole aus:
   11   
   12 System.out.println("Quarktasche");
```
Es wird aber nur das auskommentiert, was in `Zeile 10` hinter `//` geschrieben wurde.  

  #####  Tipp: In Ecclipse werden mit `Strg + Shift + 7` oder `Strg + Shift + C`alle markierten Zeilen mit einem Inline-Kommentare versehen. #####
``` java
   10 //Der unten stehende Code gibt "Quarktasche" in der Konsole aus:
   11   
   12 System.out.println("Quarktasche");
   13 
   14 //System.out.println("Obstsalat");
```
Man kann Kommentare auch dazu benutzen, Code, beispielsweise aus Testgründen, nicht auszuführen. Die Methode in `Zeile 14`
wird nicht compiliert.
## Mehrzeilige Kommentare

Ein mehrzeiliger Kommentar beginnt mit `/*` und wird `*/` beendet. 
``` java
   09
   10 /*   Als Herr Bilbo Beutlin von Beutelsend ankündigte, daß er demnächst zur Feier
   11      seines einundelfzigsten Geburtstages ein besonders prächtiges Fest geben wolle, war
   12      des Geredes und der Aufregung in Hobbingen kein Ende. Bilbo war sehr reich und
   13      sehr absonderlich, und seit er vor sechzig Jahren plötzlich verschwunden und unerwartet
   14      zurückgekehrt war, hatte man im Auenland nicht aufgehört, sich über ihn zu
   15      verwundern.   */ 
   16
   17
```



Sämtliches, was sich zwischen diesen beiden Zeichenkombinationen befindet,
wird vom Compiler ignoriert. Somit kann man einen Kommentar über mehrere Zeilen ziehen.


<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>
