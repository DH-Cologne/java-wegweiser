# Die IDE Eclipse 🌘<!-- omit in toc -->

Diese Seite erläutert die ersten Grundlagen zum Umgang mit der Entwicklungsumgebung _Eclipse_. Hier werden ausdrücklich **nicht alle Funktionen** von Eclipse erläutert, sondern nur diejenigen, die man für das anfängliche Arbeiten benötigt. Ein vollständiges Eclipse-Handbuch findet sich [hier](https://help.eclipse.org/2020-03/topic/org.eclipse.platform.doc.user/gettingStarted/qs-02a.htm?cp=0_1_0_0).

- [Was ist eine IDE?](#was-ist-eine-ide)
- [Warum Eclipse?](#warum-eclipse)
- [Workspaces](#workspaces)
- [Die wichtigsten Views](#die-wichtigsten-views)
  - [Editor](#editor)
    - [Zusatzfunktionen](#zusatzfunktionen)
    - [Keyboard-Shortcuts im Editor](#keyboard-shortcuts-im-editor)
  - [Package Explorer](#package-explorer)
  - [Outline](#outline)
  - [Console](#console)
- [Ein neues Projekt anlegen](#ein-neues-projekt-anlegen)
- [Eine neue Klasse erzeugen](#eine-neue-klasse-erzeugen)
- [Import und Export von Projekten](#import-und-export-von-projekten)
- [Programme ausführen](#programme-ausführen)
- [Automatisch generierter Code](#automatisch-generierter-code)

## Was ist eine IDE?

Bei einer [IDE](https://de.wikipedia.org/wiki/Integrierte_Entwicklungsumgebung) (**I**ntegrated **D**evelopment **E**nvironment - oder dt.: _Integrierte Entwicklungsumgebung_) handelt es sich um ein Programm (oder ggf. mehrere), das das Entwickeln von Software erleichtern soll, indem es alle nötigen Funtionalitäten in einer "Entwicklungsumgebung" vereint. Für eine _noch_ genauere Definition muss der oben verlinkte Wikipedia-Artikel herhalten.


## Warum Eclipse?

Es gibt viele [verschiedene _IDEs_ für die Entwicklung von Java](https://hackr.io/blog/best-java-ides). Am häufigsten läuft man aber wohl _IntelliJ IDEA_, _Netbeans_ und eben _Eclipse_ über den Weg.

Während _IntelliJ IDEA_ sehr beliebt ist, ist das Programm aber doch keine echte kostenlose Open-Source Software - das ist es nur in der Community-Edition. Die Vollversion kostet Geld, ist aber für Studierende kostenlos verfügbar.

_Netbeans_ ist eine sehr etablierte Open-Source IDE. Es steht Eclipse im Prinzip in nichts nach, auch wenn der Umfang der für Eclipse verfügbaren Plugins etwas größer ist.

_Eclipse_ wurde gezielt als IDE für Java entwickelt (auch wenn es genau wie die anderen beiden inzwischen auch andere Sprachen beherrscht). Es handelt sich um eine sehr umfangreiche IDE mit Werkzeugen für [Modelling](https://de.wikipedia.org/wiki/Unified_Modeling_Language), [Testing](https://de.wikipedia.org/wiki/Modultest) und [Debugging](https://de.wikipedia.org/wiki/Debugger).

Da _Eclipse_ die meistgenutzte (kostenlose) Java-IDE ist, wird diese IDE auch im Java-Seminar genutzt und alle vermittelten Tipps und Tricks beziehen sich auf Eclipse. Natürlich ist darüber hinaus die persönliche Wahl der IDE freigestellt.

![Java IDE shares 2018](https://programmer9.com/assets/images/largest-java-survey-ever/which_IDE_developers_use.png)
> _Stand: 2018; Grafik: [#]([../assets/images/Java-Platform-Diagram.png](https://programmer9.com/assets/images/largest-java-survey-ever/which_IDE_developers_use.png));
Quelle: [programmer9.com](https://programmer9.com/2019/02/06/largest-java-survey-2018.html)_


## Workspaces

Als _Workspace_ wird in Eclipse (und anderen IDEs) ein Ordner (z.B. auf der lokalen Festplatte) bezeichnet, der Projekte enthält (oder auf sie verweist, falls sie an einem anderen Ort gespeichert sind). Workspaces sind eine gute Möglichkeit, die Entwicklungsumgebung aufgeräumt zu halten. Es empfiehlt sich z.B. sehr, einen eigenen Workspace für die Hausaufgaben aus dem Java-Seminar anzulegen, damit diese z.B. nicht mit anderen eigenen Projekten durcheinander kommen.

Beim ersten Start von Eclipse wird nach dem zu öffnenden Workspace gefragt (oder es wird einer angelegt). Möchte man später zu einem anderen Workspace wechseln oder einen neuen anlegen, geht das über das Menü `File` &rarr; `Switch Workspace` (hier kann über `Other...` ein neuer Ordner zum Workspace gemacht werden!)


## Die wichtigsten Views

Das Hauptfenster von Eclipse ist in verschiedene Bereiche aufgeteilt, in denen sogenannte _Views_ eingeblendet werden können. Es handelt sich dabei um kleinere "Unterfenster", die auf die Darstellung verschiedener Inhalte spezialisiert sind.  
Der eigentliche Editor ist immer groß in der Fenstermitte zu sehen, die anderen Views verteilen sich am Rand. Einige Views sind sehr wichtig und deshalb standardmäßig aktiviert (Package Manager, Outline, ...), andere können bei Bedarf über das Menü `Window` &rarr; `Show View` &rarr; `...` dazugeschaltet werden.


### Editor

In diesem View, einem leistungsfähigen Text-Editor mit jeder Menge Zusatzfunktionen, wird der eigentliche Programmcode geschrieben.


#### Zusatzfunktionen
- Zeilennummern: Selbsterklärend (links)
- Folding: Code-Blöcke ein- oder ausklappen (links, kann und sollte am Anfang über Rechtsklick ausgeschaltet werden)
- Farbige Hervorhebung des [Gültigkeitsbereichs](https://de.wikipedia.org/wiki/Variable_(Programmierung)#Scope), in dem sich der Cursor befindet (link, mit zusätzlichen Icons für `//TODO`-[Kommentare](Kommentare.md), [Breakpoints](https://de.wikipedia.org/wiki/Haltepunkt_(Programmierung)) u.ä.)
- Farbige Markierungen am Scroll-Balken für Fehler, Warnungen, `//TODO`-Kommentare und Vorkommen eines markierten [Identifiers](https://de.wikipedia.org/wiki/Bezeichner) (rechts)


#### Keyboard-Shortcuts im Editor
> ⚠️ Bis auf den ersten brauchst du diese Shortcuts am Anfang noch nicht unbedingt!

Der Editor bietet unzählige nützliche Keyboard-Shortcuts. Einige Beispiele sind sind...

- `Strg`+`Space`: Code-Vervollständigung / -Vorschläge (diese Tastenkombination braucht man im Prinzip _die ganze Zeit_)
- `Shift`+`Alt`+`R`: Refactor Identifier ([Refactoring](https://de.wikipedia.org/wiki/Refactoring) eines Identifiers, also Umbenennung mit Änderung aller Referenzen im gesamten Projekt)
- `Strg`+`Shift`+`O`: Alle fehlenden Imports anlegen / importieren (bei Doppeldeutigkeiten wird eine Auswahl eingeblendet)
- ...


### Package Explorer

Der [_Package Explorer_](https://help.eclipse.org/2020-03/topic/org.eclipse.jdt.doc.user/gettingStarted/qs-4.htm?cp=1_1_0_2) befindet sich im Normalfall in der linken Seitenleiste. Er stellt den Inhalt des momentan geöffneten _Workspace_ dar. Die Handhabung ähnelt sehr stark der eines gewöhnlichen [Verzeichnisbaumes](https://de.wikipedia.org/wiki/Verzeichnisstruktur) in einem [Dateimanager](https://de.wikipedia.org/wiki/Dateimanager).  

Es handelt sich aber um eine auf die Entwicklung von Java-Projekten spezielisierte Variante eines Dateimanagers. Es werden nicht einfach die Dateien aus den Projektordnern in ihrer vorliegenden Hierarchie angezeigt, stattdessen werden [Packages](https://www.w3schools.com/java/java_packages.asp) in einer abgeflachten Hierarchie dargestellt und in das Projekt eingebundene Ressourcen (wie die [JRE System Library](Die-Programmiersprache-Java.md#java-class-library)) werden gesondert angezeigt.


### Outline

Die [_Outline_](https://help.eclipse.org/2020-03/topic/org.eclipse.platform.doc.user/concepts/coutline.htm?resultof=%22%4f%75%74%6c%69%6e%65%22%20%22%6f%75%74%6c%69%6e%22%20) View stellt die innere Struktur der gerade im Editor geöffneten Klasse (Quelltextdatei) graphisch dar - eine sehr praktische Übersicht über alle Felder und Methoden sowie deren Sichtbarkeit!


### Console

Die [_Console_](https://help.eclipse.org/2020-03/topic/org.eclipse.jdt.doc.user/reference/views/console/ref-console_view.htm?resultof=%22%43%6f%6e%73%6f%6c%65%22%20%22%63%6f%6e%73%6f%6c%22%20) View ist eine gewöhnliche Konsole, welche die Text-Ausgaben eines ausgeführten Programmes anzeigt. Hier werden Ausgaben über den [_Standard Output (stdout)_](https://en.wikipedia.org/wiki/Standard_streams#Standard_output_(stdout)) in schwarz (je nach Theme) und über den [_Error Output (stderr)_](https://en.wikipedia.org/wiki/Standard_streams#Standard_error_(stderr)) in rot ausgegeben. User-Eingaben erscheinen hingegen grün.


## Ein neues Projekt anlegen

Ein neues Java-Projekt kann man auf drei verschiedene (und doch identische) Wege anlegen:

- Im Menü: `File` &rarr; `New` &rarr; `Java Project`
- Rechtsklick in den _Package Explorer_ (s.o.): `New` &rarr; `Java Project`
- Oder: `Shift`+`Alt`+`N` &rarr; `Java Project`

Egal, wie man es macht: Am Ende öffnet sich der Dialog zum Erstellen eines neuen Java-Projektes. Hier lässt sich u.a. der Name des Projektes (den Konventionen nach großgeschrieben) festlegen. Die restlichen Einstellungen sind im Normalfall so in Ordnung, wie sie sind. Ein Klick auf `Finish` legt dann das neue Prjekt an. Es ist jetzt im _Package Explorer_ (s.o.) zu sehen.


## Eine neue Klasse erzeugen

Auch hier gibt es, wie bei einem neuen Projekt, viele Wege. Damit eine neue Klasse aber nicht aus Versehen in einem anderen (weil markierten) Projekt anlegt, sollte man so explizit wie möglich vorgehen:

Rechtsklick auf den `src`-Ordner des gewünschten Projektes (oder direkt auf ein Package darin!) &rarr; `New` &rarr; `Class`

Auch hier sind außer dem Klassen-Namen alle anderen Einstellungen für gewöhnlich in Ordnung - wenn man möchte, kann man noch eine `main`-Methode generieren lassen, aber der Zeitgewinn ist, nun ja, marginal.


## Import und Export von Projekten

> 👉 **Hinweis:** Dieser Punkt ist **sehr wichtig für die Hausaufgaben** im Java-Seminar!

**Projekt Exportieren** ⬆️
1. Rechtsklick **auf den Projekt-Ordner im _Package Explorer_** &rarr; `Export` &rarr; `General` &rarr; `Archive File`
2. Jetzt lässt sich der Pfad und Name des zu exportierenden `.zip`-Archivs festlegen!
3. `Finish`

**Projekt Importieren** ⬇️
1. Im Menü `File` &rarr; `Import` **oder** Rechtsklick im _Package Explorer_ &rarr; `Import`
2. ❌ Hier **NICHT** `General` &rarr; `Archive File` auswählen (auch wenn ein `.zip`-Archiv importiert werden soll!), **sondern:**
3. :+1: `General` &rarr; `Existing Projects into Workspace` auswählen
4. Oben entweder `Select root directory` (falls das Archiv schon entpackt wurde) oder (wahrscheinlicher) `Select archive file` auswählen
5. Den entsprechenden Pfad anwählen
6. `Finish`


## Programme ausführen

Zum Ausführen eines Projektes führt der "expliziteste" Weg über einen Rechtsklick auf das Projekt &rarr; `Run As` &rarr; `Java Application`. Sollte das Projekt mehrere Klassen mit `main`-Methoden enthalten (was durchaus möglich ist), dann fragt Eclipse nach, welche ausgeführt werden soll.

> 💬 Es lässt sich auch direkt eine Klasse mit `main`-Methode über einen Rechtsklick auf die Klasse (und dann wie oben beschrieben) ausführen.

> 👉 **Eine Abkürzung** ist der Play-Button oben in der Toolbar. Aber **Achtung**: Dieser führt immer das zuletzt ausgeführte Programm noch einmal aus - nicht etwa das gerade geöffnete! Über den kleinen Pfeil daneben öffnet sich ein Dropdown-Menü mit den zuletzt ausgeführten Programmen.


## Automatisch generierter Code

> ⚠️ Die folgenden Funktionen sind zwar sehr hilfreich, aber du solltest natürlich trotzdem lernen, wie du deinen Code komplett selbst schreibst! Erst wenn du das beherrschst, solltest du dir von deiner IDE Code generieren lassen!

Eclipse bietet sehr viele Funktionen zur Code-Generierung (_Content Assist / Code Proposals_). Einige sind direkt im Editor als Auto-Vervollständigung eingerichtet. Wenn du ein bestimmtes Schlüsselwort eingibst und dann `Strg`+`Space` drückst, bietet dir Eclipse an, den gewünschten Code automatisch einzufügen. Hier einige Beispiele:

| Schlüsselwort | `Strg`+`Space` generiert ... |
| --- | --- |
| `syso` | `System.out.println()` |
| `for` | `for (int i = 0; i < array.length; i++){ ... }` |
| `main` | Eine `main`-Methode |

Andere sind über das Kontextmenü (Rechtsklick) &rArr; `Source` im Editor zu finden: Dort lassen sich z.B. automatisch [Getter und Setter](Objekte-I-Initialisierung-Members-Zugriff.md#getter--setter) oder [Konstruktoren](Objekte-I-Initialisierung-Members-Zugriff.md#konstruktoren) unter Verwendung der bereits angelegten [Members](../Coding-Lingo.md#m) generieren!




