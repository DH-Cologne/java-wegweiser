# Glossar 📕

**Erläuterung und Verknüpfung von Begriffen rund um Softwaretechnologie**

Es ist für Anfänger nicht immer leicht den Überblick über all die relevanten (Fach-)begriffe zur Softwaretechnologie zu behalten. Genau das ist aber sehr wichtig für das Verständnis von Lehrveranstaltungen, Büchern, Dokumentationen etc.! Im Folgenden sind die wichtigsten (nicht Java-spezifischen!) Begriffe alphabetisch sortiert aufgelistet, kurz erläutert und miteinander verknüpft.

> 🚧 🐌
> Dieses Verzeichnis wird wohl für immer **_work in progress_** sein!

> ⚠️
> **Achtung:** Hier sind die Java-spezifischen Themen aus dem eigentlichen [Java-Wegweiser](https://dh-cologne.github.io/java-wegweiser) **nicht noch einmal aufgeführt**. Es geht hier um **allgemeine** Software-Terminologie!

> 💬
> In diesem Stichwort-Verzeichnis geht es außerdem **nicht** um [ulkige Bezeichnungen für Dinge aus der Welt des Programmierens](https://blog.codinghorror.com/new-programming-jargon/) (schade!), sondern um allgemeine Begriffe, die zur Kommunikation über das Programmieren und Quelltext genutzt werden.

> 🌌
> **TODO:** `...`, ...


## Legende
👉 Verweis auf einen anderen Begriff in diesem Verzeichnis  
🔭 Verweis auf einen Artikel / Abschnitt im [Java-Wegweiser](https://dh-cologne.github.io/java-wegweiser)  
🔗 Verweis auf eine externe Ressource (meist Wikipedia)


## Verzeichnis
[**A**](#a) · [**Ä**](#ä) · [**B**](#b) · [**C**](#c) · [**D**](#d) · [**E**](#e) · [**F**](#f) · [**G**](#g) · [**H**](#h) · [**I**](#i) · [**J**](#j) · [**K**](#k) · [**L**](#l) · [**M**](#m) · [**N**](#n) · [**O**](#o) · [**Ö**](#ö) · [**P**](#p) · [**Q**](#q) · [**R**](#r) · [**S**](#s) · [**T**](#t) · [**U**](#u) · [**Ü**](#ü) · [**V**](#v) · [**W**](#w) · [**X**](#x) · [**Y**](#y) · [**Z**](#z)


## A

### Abstraktion
Trennung von Konzept und Umsetzung (👉 [Implementation](#implementation)). 

### Algorithmus
Abfolge von aufeinanderfolgenden Einzelschritten zur Lösung eines Problems; siehe auch 🔗 [Algorithmus](https://de.wikipedia.org/wiki/Algorithmus).

### Anweisung
Siehe 👉 [Statement](#statement) (eng.) oder Instruktion (unüblich)

### API
Kurz für _**A**pplication **P**rogramming **I**nterface_ (deu.: _Anwendungs­programmier­schnittstelle_). Eine Schnittstelle zur Anbindung an Anwendungen auf Quelltext-Ebene (nicht Binärcode). Siehe auch 🔗 [Programmierschnittstelle](https://de.wikipedia.org/wiki/Programmierschnittstelle).

### Arbeitsspeicher

Der Speicher eines Computers, der die gerade laufenden Programme und verwendeten Daten enthält. Auch: _Hauptspeicher_ bzw. eng. _(main) memory_ oder _RAM (Random Access Memory)_.

### Argument
Siehe 👉 [Parameter](#parameter)

### Attribut
Ein einem Objekt zugeordnetes Merkmal bzw. Eigenschaft. Wird oft als anderes Wort für 👉 [Instanszvariable](#instanzvariable) genutzt.

### Ausdruck
Eine Kombination aus Variablen, Literals, Konstanten, Operatoren und Rückgabewerten von Methoden. Ein Ausdruck ergibt als ganzes einen Wert. Z.B. hat der Ausdruck `2 < 9` den Wert `true` und der Ausdruck `(4 - Math.max(15, 46)) * ( 1 + 1 == 1 ? 1 : -1)` den Wert `42`.

### Aussage
👉 [Ausdruck](#ausdruck) mit einem 👉 [Wahrheitswert](#wahrheitswert), etwa `2 == 7` (hat üblicherweise den Wert `false`). Auch: Englisch für 👉 [Statement](#statement) (aber als deutsche Entsprechung dafür eher unüblich im Programmier-Kontext).


## Ä

...


## B

### Bezeichner
Von dem/der Programmierer*in frei (aber gut) gewählter Name für eine 🔭 [Klasse](articles/Klassen-und-Objekte.md), eine 🔭 [Methode](articles/Methoden.md) oder eine 🔭 [Variable](articles/Variablen.md).

### Bug
Fehler in einem Computerprogramm.


## C

### Code
Englisch für 👉 [Quelltext](#quelltext); auch: Ein System zum Umwandeln von Informationen.

### compile-time
(Zum) Zeitpunkt der Kompilierung des Quellcodes. Siehe zum Vergleich: 👉 [run-time](#run-time).

### Compiler
Computerprogramm, das den Quelltext einer Programmiersprache in Maschinencode übersetzt, der von einem Computer ausgeführt werden kann. Im Falle von Java ist das 🔭 [Bytecode](articles/Die-Programmiersprache-Java.md), der von der 🔭 [JVM](articles/Die-Programmiersprache-Java.md) ausgeführt werden kann. Siehe auch: 🔗 [Compiler](https://de.wikipedia.org/wiki/Compiler).

### Control flow
Englisch für 👉 [Kontrollfluss](#kontrollfluss).

### CPU
**C**entral **P**rocessing **U**nit. Siehe auch 🔗 [Prozessor](https://de.wikipedia.org/wiki/Prozessor)


## D

### Datenklasse
Eine Klasse ohne eigene Logik / Funktionalität. Für gewöhnlich umfasst eine Datenklasse nur 👉[Instanzvariablen](#instanzvariable) und ggf. 🔭 [Getter und Setter](articles/Objekte-I-Initialisierung-Members-Zugriff.md). Auch: _POJO_.

### Datenstruktur
Objekt zur Speicherung und Verwaltung von Daten bzw. Referenzen auf Daten oder weitere Objekte. Siehe auch 🔗 [hier](https://de.wikipedia.org/wiki/Datenstruktur) und 🔭 [hier](articles/DIY-Datenstrukturen.md).

### Datentyp
Siehe 🔭 [Datentypen](articles/Datentypen.md).

### Debugger
Eine Software (oft eine Komponente einer 👉 [IDE](#ide)), die als Werkzeug für das 👉 [Debugging](#debugging) verwendet wird.

### Debugging
Das Auffinden und Beheben von 👉 [Bugs](#bug). Dazu _kann_ ein 👉 [Debugger](#debugger) genutzt werden, muss aber nicht.

### Deklaration
Die _Deklaration_ einer 🔭 [articles/Variable](Variablen.md) besteht aus der Angabe ihres 🔭 [Datentyps](articles/Datentypen.md) und ihres Namens (_Variablenname_), etwa `int thisIsAnInteger`.

### Deployment
Der Vorgang des Installierens einer Software auf dem Zielsystem. Auch: _Auslieferung_ oder 🔗 [_Softwareverteilung_](https://de.wikipedia.org/wiki/Softwareverteilung).

### Design Pattern
Englisch für 👉 [Entwurfsmuster](#entwurfsmuster).


## E

### Endlosschleife
🔭 [Schleife](articles/Schleifen.md) oder 🔭 [Rekursion](articles/Rekursion.md), die durch fehlende oder nicht erreichbare Abbruchbedingung (oder immer wahre Ausführungsbedingung) nie beendet wird und letztendlich zu einem Programmabsturz führt. Siehe auch 🔗 [Endlosschleife](https://de.wikipedia.org/wiki/Endlosschleife).

### Entwurfsmuster
Wiederverwendbare, bewährte (Architektur-)Vorlagen zur Lösung üblicher Probleme. Siehe auch 🔗 [Entwurfsmuster](https://de.wikipedia.org/wiki/Entwurfsmuster).


### Exit-Code
Auch: _Exit-Status_, _Return Code_ oder _Rückgabestatus_. Ein numerischer Wert, den ein Programm zurückgibt, wenn es sich beendet (oder beendet wird). Dabei steht `0` üblicherweise für ein reguläres (fehlerfreies) Programm-Ende, andere Werte für unterschiedliche Programm-Abbrüche durch Fehler. Siehe auch 🔗 [Return Code](https://de.wikipedia.org/wiki/Return_Code)

### Expression
Englisch für 👉 [Ausdruck](#ausdruck).


## F

### Funktion
Ein 👉 [Code](#code)-Block, der über einen Namen (👉 [Bezeichner](#bezeichner)) angesprochen und ausgeführt werden kann. Es ist ggf. möglich/nötig, der Funktion 👉 [Parameter](#parameter) zu übergeben. Außerdem _können_ Funktionen am Ende ihrer Ausführung Daten 🔗 [zurückgeben](https://de.wikipedia.org/wiki/Funktion_(Programmierung)#Direktes_Verwenden_des_Ergebnisses). Siehe auch: 🔭 [Methode](articles/Methoden.md).


## G

### Getter
Siehe 🔭 [Getter und Setter](articles/Objekte-I-Initialisierung-Members-Zugriff.md).

### GUI
**G**raphical **U**ser **I**nterface (_deu.: grafische Benutzeroberfläche_); eine grafische, nicht 👉 [Kommandozeilen](#kommandozeile)-basierte Benutzerschnittstelle eines Programmes.

### Gültigkeitsbereich
Der Gültigkeitsbereich eines 👉 [Bezeichners](#bezeichner) (Methodenname, Variablenname, etc.) ist der Bereich im 👉 [Quelltext](#quelltext), von dem aus der Zugriff auf diesen Bezeichner möglich ist; auch: 👉 [Scope](#scope).


## H

### Hard Coding
Das Verwenden von expliziten Werten (mittels 👉 [Literals](#literal)) direkt im Quelltext. Von Hard Coding (auch: etwas ist _hard-coded_) sprcht man etwa, wenn der Pfad zu einer Datei, die Zugangsdaten zu einer Datenbank o.ä. direkt in den Quelltext geschrieben werden statt sie z.B: aus einer Konfigurationsdatei zu laden, sie von User abzufragen oder aus einer sonstigen externen Quelle abzuleiten. Siehe auch: 🔗 [Hard Coding](https://en.wikipedia.org/wiki/Hard_coding). 

### Hauptspeicher
Siehe 👉 [Arbeitsspeicher](#arbeitsspeicher).

### high-level
Sich auf einer hohen (👉 [Abstraktions](#abstraktion)-)Ebene befindend. Beschreibt z.B. Code, der durch die Verwendung einer entsprechenden 👉 [Programmbibliothek](#programmbibliothek), die technische Details 👉 [kapselt](#kapselung), sehr einfach lesbar und semantisch verständlich ist. Gegenteil von 👉 [low-level](#low-level).

## I

### IDE
**I**ntegrated **D**evelopment **E**nvironment (dt.: _Integrierte Entwicklungsumgebung_). Siehe auch 🔭 [Eclipse IDE](articles/Eclipse-IDE.md).

### Implementierung
Das Umsetzen (oder "Einbauen") eines geplanten Konzeptes oder einer Spezifikation als Software (also in Quellcode). Beispiel: Implementieren eines 👉 [Interfaces](#interface) oder eines neuen Programm-Features. Siehe auch 🔗 [Implementierung](https://de.wikipedia.org/wiki/Implementierung#Softwaretechnik).

### Index
Ein 🔭 [Integer](articles/Datentypen.md) größer oder gleich `0`, der auf ein Element in einem 🔭 [Array](articles/Arrays.md) oder einer ähnlichen linearen 🔭 [Datenstruktur](articles/DIY-Datenstrukturen.md) verweist; auch: Eine 🔗 [spezielle Datenstruktur zur Nutzung in einer Suchmaschine](https://de.wikipedia.org/wiki/Suchmaschine).

### Instanz
Siehe 🔭 [OOP-Einführung](articles/OOP-Einfuehrung.md) bzw. 🔭 [Klassen und Objekte](articles/Klassen-und-Objekte.md).

### Instanzvariable
Siehe 🔭 [Arten von Variablen](articles/Variablen.md#arten-von-variablen).

### Instruktion
👉 [Statement](#statement) oder Anweisung; englisch.: _instruction_.

### Interface
Englisch für 👉 [Schnittstelle](#schnittstelle). Im Kontext von OOP siehe auch 🔭 [Interfaces](articles/Vererbung-III-Interfaces.md).


## J

...


## K

### Kapselung
Verbergen von Daten, Informationen oder Programmlogik vor (ungeregeltem) Zugriff von "außen". Auch wichtiges Mittel zur Erstellung von aufgeräumtem, wartbarem Quellcode. Siehe auch 🔗 [Datenkapselung (Programmierung)](https://de.wikipedia.org/wiki/Datenkapselung_(Programmierung)#Herleitung) und (speziell mit Bezug auf 🔭 [OOP](articles/OOP-Klassen-und-Objekte.md)) 🔗 [Datenkapselung im objektorientierten Paradigma](https://de.wikipedia.org/wiki/Datenkapselung_(Programmierung)#Datenkapselung_im_objektorientierten_Paradigma).

### Klasse
Siehe 🔭 [OOP-Einführung](articles/OOP-Einfuehrung.md) bzw. 🔭 [Klassen und Objekte](articles/Klassen-und-Objekte.md).

### Klassenvariable
Siehe 🔭 [Arten von Variablen](articles/Variablen.md#arten-von-variablen).

### Kommandozeile
Siehe 🔗 [hier](https://fossbytes.com/difference-between-shell-console-terminal/) und 🔗 [hier](https://askubuntu.com/questions/506510/what-is-the-difference-between-terminal-console-shell-and-command-line).

### Komplexität
Konzept zur Abschätzung des Ressourcenaufwandes zur 👉 [algorithmischen](#algorithmus) Behandlung bestimmter Probleme. — 🔗 [Wikipedia](https://de.wikipedia.org/wiki/Komplexit%C3%A4t#Informatik)

### Konsole
Siehe 🔗 [hier](https://fossbytes.com/difference-between-shell-console-terminal/) und 🔗 [hier](https://askubuntu.com/questions/506510/what-is-the-difference-between-terminal-console-shell-and-command-line).

### Kontrollfluss
Die Steuerung des Ablaufs eine Programmes. Für den Kontrollfluss werden 🔭 [Konditionale](articles/Konditionale.md) und 🔭 [Schleifen](articles/Schleifen.md) genutzt, die das Programm abhängig von festgelegten 👉 [Bedingungen](#bedingung) steuern.


## L

### Laufzeit
(1.) Zeitraum, in dem ein Programm läuft bzw. ausgeführt wird; (2.) 👉 [Performanz](#performanz) eines 👉 [Algorithmus](#algorithmus) oder sonstigen Programmteils. Siehe auch 🔗 [Laufzeit (Informatik)](https://de.wikipedia.org/wiki/Laufzeit_(Informatik)).

### Library
Kurz und Englisch für 👉 [Programmbibliothek](#programmbibliothek).

### Listener
Begriff aus dem Kontext des 🔗 [Listener](https://docs.oracle.com/javase/tutorial/uiswing/events/intro.html) - 👉 [Entwurfsmusters](#entwurfsmuster), der ein Objekt beschreibt, das auf bestimmte Ereignisse reagiert. 

### Literal
Ausdruck, der zur direkten Darstellung eines Wertes (numerischer Wert, String, Array, ...) genutzt wird. Mit Literals werden Werte 👉 "[hard coded](#hard-coding)" in den Quelltext geschrieben. Siehe auch: 🔗 [Literal](https://de.wikipedia.org/wiki/Literal).

### Lokale Variable
Siehe 🔭 [Arten von Variablen](articles/Variablen.md#arten-von-variablen).

### low-level
Sich auf einer niedrigen (👉 [Abstraktions](#abstraktion)-) Ebene befindend. Beschreibt z.B. Code, der ohne den Einsatz von Frameworks o.ä. arbeitet oder maschinennahe Programme wie Treiber. Gegenteil von 👉 [high-level](#high-level).


## M

### Member
Englisch für _Mitglied_; Überbegriff für 👉 [Attribute](#attribut) und 👉 [Methoden](#methode) einer 👉 [Klasse](#klasse).

### Memory
Meist kurz für _main memory_ (Englisch für 👉 [Arbeitsspeicher](#arbeitsspeicher)).

### Methode
Eine 👉 [Funktion](#funktion), die ein 👉 [Member](#member) einer 👉 [Klasse](#klasse) ist. Siehe auch: 🔭 [Methoden](articles/Methoden.md).

### Multiprocessing
👉 [Multitasking](#multitasking) auf mehreren 🔗 [CPUs](https://de.wikipedia.org/wiki/Prozessor).

### Multitasking
Die Fähigkeit einer einzelnen 🔗 [CPU](https://de.wikipedia.org/wiki/Prozessor), mehr als eine Aufgabe gleichzeitig zu bearbeiten. Dies funktioniert, indem das Betriebssystem verschiedenen Tasks nach und nach Rechenzeit zuteilt.

### Multithreading
Das Ausführen mehrerer 👉 [Threads](#thread) in einem 👉 [Prozess](#prozess).

## N

### Nullwert
Auch **NULL** oder **NIL**. Ein Zustandswert, der die Abwesenheit eines Wertes kennzeichnet. Es wird mit diesem Wert also ausgedrückt, dass kein Wert vorhanden ist. In Java: `null`.


## O

### Objekt
Eine 👉 [Instanz](#instanz) einer 🔭 [Klasse](articles/OOP-Einfuehrung.md); siehe auch 🔭 [Klassen und Objekte](articles/Klassen-und-Objekte.md).

### Objekt-Gleichheit
Die _Gleichheit_ (eng. _equality_) zweier 👉 [Objekte](#objekt) ist gegeben, wenn diese sich in Hinsicht auf alle (oder bestimmte festgelegte) 👉 [Eigenschaften](#attribut) gleichen.

### Objekt-Identität
Die _Identität_ (eng. _identity_) zweier 👉 [Objekte](#objekt) ist gegeben, wenn diese überhaupt nicht zwei Objekte sind, sondern nur eines. Und zwar _das selbe_ (an der selben Stelle im 👉 [Arbeitsspeicher](#arbeitsspeicher)).

### Operation
Verarbeitungsschritt in einem Software-Programm. Siehe auch 🔗[Operation](https://de.wikipedia.org/wiki/Operation_(Informatik)).


## Ö

...


## P

### Parameter
Bei der Ausführung an ein Programm oder eine 🔭 [Methode](articles/Methoden.md) übergebene Daten; auch: 👉 [Argument](#argument).

### Performance
Englisch für 👉 [Performanz](#performanz).

### Performanz
Eigenschaft eines Programmes oder Programmteils, viel oder wenig Rechenzeit in Anspruch zu nehmen (seltener benutzt im Kontext von Speicherbedarf). Siehe auch 👉 [teuer](#teuer).

### POJO
**P**lain **O**ld **J**ava **O**bject - oft umgangssprachlich für eine 👉 [Datenklasse](#datenklasse) in Java.

### Polymorphie
Konzept in der objektorientierten Programmierung: Ein 👉 [Bezeichner](#bezeichner) (🔭 [Variable](articles/Variablen.md)) kann Objekte unterschiedlichen 👉 [Datentyps](#datentyp) referenzieren. Dabei hat der Bezeichner einen gleichen oder höherwertigen Datentyp, als das referenzierte Objekt. Beispiel: `SpecialUser su = new SpecialUser(); User u = su;` Siehe auch 🔗 [Polymorphie](https://de.wikipedia.org/wiki/Polymorphie_(Programmierung)).

### Programmbibliothek
Sammlung von Programmbestandteilen, die in anderen Programmen verwendet werden können. Dies geschieht über die Benutzung der 👉 [API](#api) der entsprechenden Bibliothek. Siehe auch 🔗 [Programmbibliothek](https://de.wikipedia.org/wiki/Programmbibliothek).

### Prozess
Ein laufendes Programm im Kontext eines Computersystems. Siehe auch: 👉 [Thread](#thread).


## Q

### Quelltext
Das, was ein/e Programmierer\*in schreibt, um eine Software zu programmieren; auch: 👉 [Code](#code).


## R

### Race Condition
Ursache für sehr schwer auffindbare 👉 [Bugs](#bug). Entsteht, wenn das Ergebnis einer 👉 [Operation](#operation) vom zeitlichen Ablauf zweier einzelner anderer Operationen abhängt (z.B. zwei 🔭 [Threads](articles/Multithreading.md), die auf die selbe Variable zugreifen). Siehe auch 🔗 [Wettlaufsituation](https://de.wikipedia.org/wiki/Wettlaufsituation).

### Refactoring
Verbesserung der Struktur des 👉 [Quelltextes](#quelltext) eines Programms, ohne dessen Verhalten zu verändern.

### Referenz
Verweis auf einen Wert (🔭 [primitiver Wert](articles/Datentypen.md) oder 🔭 [Pointer](articles/Methoden.md#java-ist-immer--pass-by-value) auf ein 🔭 [Objekt](articles/OOP-Einfuehrung.md)), etwa eine 🔭 [Variable](articles/Variablen.md), oder ein 👉 [Index](#index) eines 🔭 [Arrays](articles/Arrays.md).

### run-time
(Während der) Ausführung eines Programmes (also während der 👉 [Runtime](#runtime)). Siehe zum Vergleich: 👉 [compile-time](#compile-time).

### Runtime
Englisch für 👉 [Laufzeit](#laufzeit).


## S

### Schnittstelle
Genormte oder mindestens genau beschriebene logische Berührungspunkte von (Software-) Systemen. Siehe auch 🔭 [Interfaces](articles/Vererbung-III-Interfaces.md).

### Scope
Englisch für 👉 [Gültigkeitsbereich](#gültigkeitsbereich).

### Setter
Siehe 🔭 [Getter und Setter](articles/Objekte-I-Initialisierung-Members-Zugriff.md).

### Standard-Datenströme
Drei Datenströme (👉 [Stdout](#stdout), 👉 [Stdin](#stdin) und 👉 [Stderr](#stderr)) zur Daten Ein-/Ausgabe zwischen einem Programm und dem Betriebssystem bzw. der Umgebung, in der das Programm ausgeführt wird. Siehe auch 🔗 [Standard-Datenströme]([Standard-Datenströme](https://de.wikipedia.org/wiki/Standard-Datenstr%C3%B6me)).

### Statement
Eigentlich englisch für "Aussage", im Programmier-Kontext sind aber unterschiedliche Dinge damit gemeint. In Java gibt es **drei verschiedene** Arten von Statements: _Expression Statements_ (siehe 👉 [Ausdruck](#ausdruck)), _Declaration Statements_ (siehe 👉 [Deklaration](#deklaration)) und _Control-flow statements_ (siehe 👉 [Kontrollfluss](#kontrollfluss)).

### Stderr
Error-Datenstrom der 👉 [Standard-Datenströme](#standard-datenströme). Kurz für _Standard Error_.

### Stdin
Eingabe-Datenstrom der 👉 [Standard-Datenströme](#standard-datenströme). Kurz für _Standard Input_.

### Stdout
Ausgabe-Datenstrom der 👉 [Standard-Datenströme](#standard-datenströme). Kurz für _Standard Output_.

### Syntactic sugar
👉 [Syntax](#syntax)-Feature einer Programmierprache, mit dem eine bestimmte Anweisung (ö.ä.) einfacher oder leichter lesbar formuliert werden kann. Siehe auch 🔗 [Syntactic sugar](http://en.wikipedia.org/wiki/Syntactic_sugar).

### Syntax
System zur Formung gültiger ([Quell-](#quelltext))Texte aus dem Zeichenvorrat einer Sprache. Siehe auch 🔗 [Syntax](https://de.wikipedia.org/wiki/Syntax#Syntax_formaler_Sprachen).

## T

### Terminal
Siehe 🔗 [hier](https://fossbytes.com/difference-between-shell-console-terminal/) und 🔗 [hier](https://askubuntu.com/questions/506510/what-is-the-difference-between-terminal-console-shell-and-command-line).

### Test
Im Kontext der Softwaretechnologie: Testet eine Software auf Funktionalität und Qualität. Niedrigste Stufe sind 👉 [Unit Tests](#unit-test) (oder: _Komponententests_), die einzelne Komponenten / Einheiten der Software testen. Für Erläuterungen zu weiteren Arten von Tests auf höheren Ebenen siehe auch 🔗 [Softwaretest](https://de.wikipedia.org/wiki/Softwaretest).

### teuer
Als "teuer" wird umgangssprachlich eine Operation bezeichnet, die vergleichsweise viel Rechenleistung und/oder Speicher kostet. Siehe auch 👉 [Laufzeit](#laufzeit) und 👉 [Performanz](#performanz).

### Thread
Ein _Ausführungsstrang_ in einem Computerprogramm. Threads sind Teil eines 👉 [Prozesses](#prozess). Auch: _Leichtgewichtiger Prozess_; siehe auch: 🔗 [Thread](https://de.wikipedia.org/wiki/Thread_(Informatik)).


## U

### Unit Test
👉 Software-[Test](#test) zum testen einzelner Programm-Komponenten.


## Ü

### Überladen
Siehe 🔭 [Methoden &rArr; Überladen von Methoden](articles/Methoden.md#%C3%BCberladen-von-methoden).

### Überschreiben
Siehe 🔭 [Vererbung-I-Grundlagen &rArr; Überschreiben von Methoden](articles/Vererbung-I-Grundlagen.md#%C3%BCberschreiben-von-methoden).


## V

...


## W

### Wahrheitswert
Wert einer 👉[Aussage](#aussage). Kann (im Programmier-Kontext) `true` oder `false` sein und ist somit vom 🔭 [Datentyp](articles/Datentypen.md) `boolean` (bzw. `Boolean`).

### Wrapper
Programm-Einheit (z.B. eine Klasse oder eine ganze Library), die als 👉 [abstrahierende](#abstraktion) Zwischenschicht um eine komplexere Logik (👉 [low-level](#low-level)) gebaut ist. In Java auch: Die Klassen `Boolean`, `Integer`, `Double`, [...], die als komplexe "Verpackung" um die primitiven Datentypen fungieren.


## X

...


## Y

...


## Z

### Zuweisung
👉 [Operation](#operation), bei der einer 🔭 [Variable](articles/Variablen.md) (oder einer Speicherstelle eines 🔭 [Arrays](articles/Arrays.md)) ein Wert zugewiesen wird (mittels des _Zuweisungsoperators_ `=`).







