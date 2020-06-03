# Die IDE Eclipse :waning_crescent_moon:

> :construction: **TODO:** Vorbereitete Struktur mit Text füllen

Diese Seite erläutert die ersten Grundlagen zum Umgang mit der Entwicklungsumgebung _Eclipse_. Hier werden ausdrücklich **nicht alle Funktionen** von Eclipse erläutert, sondern nur diejenigen, die man für das anfängliche Arbeiten benötigt. Ein vollständiges Eclipse-Handbuch findet sich [hier](https://help.eclipse.org/2020-03/index.jsp).


## Was ist eine IDE?

Bei einer [IDE](https://de.wikipedia.org/wiki/Integrierte_Entwicklungsumgebung) (**I**ntegrated **D**evelopment **I**nvironment - oder dt.: _Integrierte Entwicklungsumgebung_) handelt es sich um ein Programm (oder ggf. mehrere), das das Entwickeln von Software erleichtern soll, indem es alle nötigen Funtionalitäten in einer "Entwicklungsumgebung" vereint. Für eine _noch_ genauere Definition muss der oben verlinkte Wikipedia-Artikel herhalten.


## Warum Eclipse?

Es gibt viele [verschiedene _IDEs_ für die Entwicklung von Java](https://hackr.io/blog/best-java-ides). Am häufigsten läuft man aber wohl _IntelliJ IDEA_, _Netbeans_ und eben _Eclipse_ über den Weg.  
Während _IntelliJ IDEA_ sehr beliebt ist, ist das Programm aber doch keine echte kostenlose Open-Source Software - das ist es nur in der Community-Edition. Die Vollversion kostet Geld, ist aber für Studierende kostenlos verfügbar.  
_Netbeans_ ist eine sehr etablierte Open-Source IDE. Es steht Eclipse im Prinzip in nichts nach, auch wenn der Umfang der für Eclipse verfügbaren Plugins etwas größer ist.  
_Eclipse_ wurde gezielt als IDE für Java entwickelt (auch wenn es genau wie die anderen beiden inzwischen auch andere Sprachen beherrscht). Es handelt sich um eine sehr umfangreiche IDE mit Werkzeugen für [Modelling](https://de.wikipedia.org/wiki/Unified_Modeling_Language), [Testing](https://de.wikipedia.org/wiki/Modultest) und [Debugging](https://de.wikipedia.org/wiki/Debugger).  
Da _Eclipse_ die meistgenutzte (kostenlose) Java-IDE ist, wird diese IDE auch im Java-Seminar genutzt und alle vermittelten Tipps und Tricks beziehen sich auf Eclipse. Natürlich ist darüber hinaus die persönliche Wahl der IDE jede*r/m freigestellt.

![Java IDE shares 2018](https://programmer9.com/assets/images/largest-java-survey-ever/which_IDE_developers_use.png)
> _Stand: 2018; Grafik: [#]([../assets/images/Java-Platform-Diagram.png](https://programmer9.com/assets/images/largest-java-survey-ever/which_IDE_developers_use.png));
Quelle: [programmer9.com](https://programmer9.com/2019/02/06/largest-java-survey-2018.html)_



## Workspaces

Als _Workspace_ wird in Eclipse (und anderen IDEs) ein Ordner (z.B. auf der lokalen Festplatte) bezeichnet, der Projekte enthält (oder auf sie verweist, falls sie an einem anderen Ort gespeichert sind). Workspaces sind eine gute Möglichkeit, die Entwicklungsumgebung aufgeräumt zu halten. Es empfiehlt sich z.B. sehr, einen eigenen Workspace für die Hausaufgaben aus dem Java-Seminar anzulegen, damit diese z.B. nicht mit anderen eigenen Projekten durcheinander kommen.  
Beim ersten Start von Eclipse wird nach dem zu öffnenden Workspace gefragt (oder es wird einer angelegt). Möchte man später zu einem anderen Workspace wechseln oder einen neuen anlegen, geht das über das Menü `File` &rarr; `Switch Workspace` (hier kann über `Other...` ein neuer Ordner zum Workspace gemacht werden!)


## Views

Das Hauptfenster von Eclipse ist in verschiedene Bereiche aufgeteilt, in denen sogenannte _Views_ eingeblendet werden können. Es handelt sich dabei um kleinere "Unterfenster", die auf die Darstellung verschiedener Inhalte spezialisiert sind.  
Der eigentliche Editor ist immer groß in der Fenstermitte zu sehen, die anderen Views verteilen sich am Rand. Einige Views sind sehr wichtig und deshalb standardmäßig aktiviert (Package Manager, Outline, ...), andere können bei Bedarf über das Menü `Window` &rarr; `Show View` &rarr; `...` dazugeschaltet werden.


### Editor

In diesem View, einem leistungsfähigen Text-Editor mit jeder Menge Zusatzfunktionen, wird der eigentliche Programmcode geschrieben.


#### Zusatzfunktionen
- Zeilennummern: Selbsterklärend (links)
- Folding: Code-Blöcke ein- oder ausklappen (links, kann und sollte am Anfang über Rechtsklick ausgeschaltet werden)
- Farbige Hervorhebung des [Gültigkeitsbereichs](https://de.wikipedia.org/wiki/Variable_(Programmierung)#Scope), in dem sich der Cursor befindet (link, mit zusätzlichen Icons für `//TODO`-Kommentare, [Breakpoints](https://de.wikipedia.org/wiki/Haltepunkt_(Programmierung)) u.ä.)
- Farbige Markierungen am Scroll-Balken für Fehler, Warnungen, `//TODO`-Kommentare und Vorkommen eines markierten [Identifiers](https://de.wikipedia.org/wiki/Bezeichner) (rechts)


#### Keyboard-Shortcuts im Editor
> :warning: **Achtung:** Bis auf den ersten brauchst du diese Shortcuts am Anfang noch nicht unbedingt!

Der Editor bietet unzählige nützliche Keyboard-Shortcuts. Die mutmaßlich Wichtigsten sind:

- `Strg`+`Space`: Code-Vervollständigung / -Vorschläge (diese Tastenkombination braucht man im Prinzip _die ganze Zeit_)
- `Shift`+`Alt`+`R`: Refactor Identifier ([Refactoring](https://de.wikipedia.org/wiki/Refactoring) eines Identifiers, also Umbenennung mit Änderung aller Referenzen im gesamten Projekt)
- `Strg`+`Shift`+`O`: Alle fehlenden Imports anlegen / importieren (bei Doppeldeutigkeiten wird eine Auswahl eingeblendet)
- ...


### Package Manager

Der _Package Manager_ befindet sich im Normalfall in der linken Seitenleiste. Er stellt den Inhalt des momentan geöffneten _Workspace_ dar. :construction:


### Outline

> :construction: TODO


### Console

> :construction: TODO


## Ein neues Projekt anlegen

> :construction: TODO


## Import und Export von Projekten

> :construction: TODO


## Programme ausführen

> :construction: TODO

### Über das Kontextmenu
...

### Über den "Play"-Button
...


<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>