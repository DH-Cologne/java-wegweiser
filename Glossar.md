# Glossar :closed_book:

**Allgemeine Terminologie der Softwaretechnologie**

Es ist am Anfang nicht immer leicht, den Überblick über die Terminologie in der (objektorientierten) Programmierung zu behalten. Dies ist aber extrem wichtig für das Verständnis von Erläuterungen, Dokumentationen etc.! Im Folgenden werden solche Begriffe alphabetisch sortiert aufgelistet und miteinander verknüpft.


> :construction: :snail:
> Dieses Verzeichnis wird wohl für immer **_work in progress_** sein!

> :warning:
> **Achtung:** Hier sind die Java-spezifischen Themen aus dem eigentlichen [Java-Wegweiser](https://dh-cologne.github.io/java-wegweiser) **nicht noch einmal aufgeführt**. Es geht hier um **allgemeine** Software-Terminologie!

> :speech_balloon:
> In diesem Stichwort-Verzeichnis geht es außerdem **nicht** um [ulkige Bezeichnungen für Dinge aus der Welt des Programmierens](https://blog.codinghorror.com/new-programming-jargon/) (schade!), sondern um allgemeine Begriffe, die zur Kommunikation über das Programmieren und Quelltext genutzt werden.

> :milky_way:
> **TODO:** `Attribut`, `Test`, `Unit Test`, `Datenklasse`, `POJO`, `Polymorphie`, `Race Condition`, `Implementation` ...



## Legende
:point_right: Verweis auf einen anderen Begriff in diesem Verzeichnis  
:telescope: Verweis auf einen Artikel / Abschnitt im [Java-Wegweiser](https://dh-cologne.github.io/java-wegweiser)  
:link: Verweis auf eine externe Ressource




## A

### Abstraktion
Trennung von Konzept und Umsetzung (:point_right: [Implementation](#implementation)). 

### Algorithmus
Abfolge von aufeinanderfolgenden Einzelschritten zur Lösung eines Problems; siehe auch :link: [Algorithmus](https://de.wikipedia.org/wiki/Algorithmus).

### Anweisung
:point_right: [Statement](#statement) (eng.) oder Instruktion (unüblich)

### Argument
:point_right: [Parameter](#parameter)

### Ausdruck
Eine Kombination aus Variablen, Literals, Konstanten, Operatoren und Rückgabewerten von Methoden. Ein Ausdruck ergibt als ganzes einen Wert. Z.B. hat der Ausdruck `2 < 9` den Wert `true` und der Ausdruck `(4 - Math.max(15, 46)) * ( 1 + 1 == 1 ? 1 : -1)` den Wert `42`.

### Aussage
:point_right: [Ausdruck](#ausdruck) mit einem :point_right: [Wahrheitswert](#wahrheitswert), etwa `2 == 7` (hat üblicherweise den Wert `false`).


## B

### Bezeichner
Von dem/der Programmierer*in frei (aber gut) gewählter Name für eine :telescope: [Klasse](articles/Klassen-und-Objekte.md), eine :telescope: [Methode](articles/Methoden.md) oder eine :telescope: [Variable](articles/Variablen.md).


## C

### Code
Englisch für :point_right: [Quelltext](#quelltext); auch: Ein System zum Umwandeln von Informationen.

### Compiler
Computerprogramm, das den Quelltext einer Programmiersprache in Maschinencode übersetzt, der von einem Computer ausgeführt werden kann. Im Falle von Java ist das :telescope: [Bytecode](articles/Die-Programmiersprache-Java.md), der von der :telescope: [JVM](articles/Die-Programmiersprache-Java.md) ausgeführt werden kann. Siehe auch: :link: [Compiler](https://de.wikipedia.org/wiki/Compiler).

### Control flow
Englisch für :point_right: [Kontrollfluss](#kontrollfluss).


## D

### Deklaration
Die _Deklaration_ einer :telescope: [articles/Variable](Variablen.md) besteht aus der Angabe ihres :telescope: [Datentyps](articles/Datentypen.md) und ihres Namens (_Variablenname_), etwa `int thisIsAnInteger`.

### Deployment
Der Vorgang des Installierens einer Software auf dem Zielsystem. Auch: _Auslieferung_ oder :link: [_Softwareverteilung_](https://de.wikipedia.org/wiki/Softwareverteilung).


## E

### Exit-Code
Auch: _Exit-Status_, _Return Code_ oder _Rückgabestatus_. Ein numerischer Wert, den ein Programm zurückgibt, wenn es sich beendet (oder beendet wird). Dabei steht `0` üblicherweise für ein reguläres (fehlerfreies) Programm-Ende, andere Werte für unterschiedliche Programm-Abbrüche durch Fehler. Siehe auch :link: [Return Code](https://de.wikipedia.org/wiki/Return_Code)

### Expression
Englisch für :point_right: [Ausdruck](#ausdruck).


## F

### Funktion
Ein :point_right: [Code](#code)-Block, der über einen Namen (:point_right: [Bezeichner](#bezeichner)) angesprochen und ausgeführt werden kann. Es ist ggf. möglich/nötig, der Funktion :point_right: [Parameter](#parameter) zu übergeben. Außerdem _können_ Funktionen am Ende ihrer Ausführung Daten :link: [zurückgeben](https://de.wikipedia.org/wiki/Funktion_(Programmierung)#Direktes_Verwenden_des_Ergebnisses). Siehe auch: :telescope: [Methode](articles/Methoden.md).


## G

### Getter
Siehe :telescope: [Getter und Setter](articles/Objekte-I-Initialisierung-Members-Zugriff.md)

### Gültigkeitsbereich
Der Gültigkeitsbereich eines :point_right: [Bezeichners](#bezeichner) (Methodenname, Variablenname, etc.) ist der Bereich im :point_right: [Quelltext](#quelltext), von dem aus der Zugriff auf diesen Bezeichner möglich ist; auch: :point_right: [Scope](#scope).


## H

### Hard Coding
Das Verwenden von expliziten Werten (mittels :point_right: [Literals](#literal)) direkt im Quelltext. Von Hard Coding (auch: etwas ist _hard-coded_) sprcht man etwa, wenn der Pfad zu einer Datei, die Zugangsdaten zu einer Datenbank o.ä. direkt in den Quelltext geschrieben werden statt sie z.B: aus einer Konfigurationsdatei zu laden, sie von User abzufragen oder aus einer sonstigen externen Quelle abzuleiten. Siehe auch: :link: [Hard Coding](https://en.wikipedia.org/wiki/Hard_coding). 


## I

### Index
Ein :telescope: [Integer](articles/Datentypen.md) größer oder gleich `0`, der auf ein Element in einem :telescope: [Array](articles/Arrays.md) oder einer ähnlichen linearen :telescope: [Datenstruktur](articles/DIY-Datenstrukturen.md) verweist; auch: Eine :link: [spezielle Datenstruktur zur Nutzung in einer Suchmaschine](https://de.wikipedia.org/wiki/Suchmaschine).

### Instanz
Siehe :telescope: [OOP-Einführung](articles/OOP-Einfuehrung.md) bzw. :telescope: [Klassen und Objekte](articles/Klassen-und-Objekte.md).

### Instanzvariable
Siehe :telescope: [Arten von Variablen](articles/Variablen.md#arten-von-variablen).

### Instruktion
:point_right: [Statement](#statement) oder Anweisung; englisch.: _instruction_.


## J

...


## K

### Klasse
Siehe :telescope: [OOP-Einführung](articles/OOP-Einfuehrung.md) bzw. :telescope: [Klassen und Objekte](articles/Klassen-und-Objekte.md).

### Klassenvariable
Siehe :telescope: [Arten von Variablen](articles/Variablen.md#arten-von-variablen).

### Komplexität
> Konzept zur Abschätzung des Ressourcenaufwandes zur :point_right: [algorithmischen](#algorithmus) Behandlung bestimmter Probleme. — :link: [Wikipedia](https://de.wikipedia.org/wiki/Komplexit%C3%A4t#Informatik)

### Kontrollfluss
Die Steuerung des Ablaufs eine Programmes. Für den Kontrollfluss werden :telescope: [Konditionale](articles/Konditionale.md) und :telescope: [Schleifen](articles/Schleifen.md) genutzt, die das Programm abhängig von festgelegten :point_right: [Bedingungen](#bedingung) steuern.


## L

### Laufzeit
(1.) Zeitraum, in dem ein Programm läuft bzw. ausgeführt wird; (2.) :point_right: [Performanz](#performanz) eines :point_right: [Algorithmus](#algorithmus) oder sonstigen Programmteils. Siehe auch :link: [Laufzeit (Informatik)](https://de.wikipedia.org/wiki/Laufzeit_(Informatik)).

### Literal
Ausdruck, der zur direkten Darstellung eines Wertes (numerischer Wert, String, Array, ...) genutzt wird. Mit Literals werden Werte :point_right: "[hard coded](#hard-coding)" in den Quelltext geschrieben. Siehe auch: :link: [Literal](https://de.wikipedia.org/wiki/Literal).

### Lokale Variable
Siehe :telescope: [Arten von Variablen](articles/Variablen.md#arten-von-variablen).

### low-level
Sich auf einer niedrigen (:point_right: [Abstraktions](#abstraktion)-) Ebene befindend. Beschreibt z.B. Code, der ohne den Einsatz von Frameworks o.ä. arbeitet oder maschinennahe Programme wie Treiber.


## M

### Member
Englisch für _Mitglied_; :point_right: [Attribut](#attribut) (Eigenschaft) oder :point_right: [Methode](#methode) (Fähigkeit) einer :point_right: [Klasse](#klasse).

### Methode
Eine :point_right: [Funktion](#funktion), die ein :point_right: [Member](#member) einer :point_right: [Klasse](#klasse) ist. Siehe auch: :telescope: [Methoden](articles/Methoden.md).

### Multiprocessing
:point_right: [Multitasking](#multitasking) auf mehreren :link: [CPUs](https://de.wikipedia.org/wiki/Prozessor).

### Multitasking
Die Fähigkeit einer einzelnen :link: [CPU](https://de.wikipedia.org/wiki/Prozessor), mehr als eine Aufgabe gleichzeitig zu bearbeiten. Dies funktioniert, indem das Betriebssystem verschiedenen Tasks nach und nach Rechenzeit zuteilt.

### Multithreading
Das Ausführen mehrerer :point_right: [Threads](#thread) in einem :point_right: [Prozess](#prozess).

## N

...


## O

### Objekt
Eine :point_right: [Instanz](#instanz) einer :telescope: [Klasse](articles/OOP-Einfuehrung.md); siehe auch :telescope: [Klassen und Objekte](articles/Klassen-und-Objekte.md).


## P

### Parameter
Bei der Ausführung an ein Programm oder eine :telescope: [Methode](articles/Methoden.md) übergebene Daten; auch: :point_right: [Argument](#argument).

### Performance
Englisch für :point_right: [Performanz](#performanz).

### Performanz
Eigenschaft eines Programmes oder Programmteils, viel oder wenig Rechenzeit in Anspruch zu nehmen (seltener benutzt im Kontext von Speicherbedarf). Siehe auch :point_right: [teuer](#teuer).

### Prozess
Ein laufendes Programm im Kontext eines Computersystems. Siehe auch: :point_right: [Thread](#thread).


## Q

### Quelltext
Das, was ein/e Programmierer\*in schreibt, um eine Software zu programmieren; auch: :point_right: [Code](#code).


## R

### Referenz
Verweis auf einen Wert (:telescope: [primitiver Wert](articles/Datentypen.md) oder :telescope: [Pointer](articles/Methoden.md#java-ist-immer--pass-by-value) auf ein :telescope: [Objekt](articles/OOP-Einfuehrung.md)), etwa eine :telescope: [Variable](articles/Variablen.md), oder ein :point_right: [Index](#index) eines :telescope: [Arrays](articles/Arrays.md).

### Runtime
Englisch für :point_right: [Laufzeit](#laufzeit).


## S

### Schnittstelle
Genormte oder mindestens genau beschriebene logische Berührungspunkte von (Software-) Systemen. Siehe auch :telescope: [Interfaces](articles/Vererbung-III-Interfaces.md).

### Scope
:point_right: [Gültigkeitsbereich](#gültigkeitsbereich)

### Setter
Siehe :telescope: [Getter und Setter](articles/Objekte-I-Initialisierung-Members-Zugriff.md)

### Statement
Eigentlich englisch für "Aussage", im Programmier-Kontext sind aber unterschiedliche Dinge damit gemeint. In Java gibt es **drei verschiedene** Arten von Statements: _Expression Statements_ (siehe :point_right: [Ausdruck](#ausdruck)), _Declaration Statements_ (siehe :point_right: [Deklaration](#deklaration)) und _Control-flow statements_ (siehe :point_right: [Kontrollfluss](#kontrollfluss)).


## T

### teuer
Als "teuer" wird umgangssprachlich eine Operation bezeichnet, die vergleichsweise viel Rechenleistung und/oder Speicher kostet. Siehe auch :point_right: [Laufzeit](#laufzeit) und :point_right: [Performanz](#performanz).

### Thread
Ein _Ausführungsstrang_ in einem Computerprogramm. Threads sind Teil eines :point_right: [Prozesses](#prozess). Auch: _Leichtgewichtiger Prozess_; siehe auch: :link: [Thread](https://de.wikipedia.org/wiki/Thread_(Informatik)).

## U

...


## Ü

### Überladen
Siehe :telescope: [Methoden &rArr; Überladen von Methoden](articles/Methoden.md#%C3%BCberladen-von-methoden).

### Überschreiben
Siehe :telescope: [Vererbung-I-Grundlagen &rArr; Überschreiben von Methoden](articles/Vererbung-I-Grundlagen.md#%C3%BCberschreiben-von-methoden).


## V

...


## W

### Wahrheitswert
Wert einer :point_right:[Aussage](#aussage). Kann (im Programmier-Kontext) `true` oder `false` sein und ist somit vom :telescope: [Datentyp](articles/Datentypen.md) `boolean` (bzw. `Boolean`).

### Wrapper
Programm-Einheit (z.B. eine Klasse oder eine ganze Library), die als :point_right: [abstrahierende](#abstraktion) Zwischenschicht um eine komplexere Logik (:point_right: [low-level](#low-level)) gebaut ist. In Java auch: Die Klassen `Boolean`, `Integer`, `Double`, [...], die als komplexe "Verpackung" um die primitiven Datentypen fungieren.


## X

...


## Y

...


## Z

### Zuweisung
Operation, bei der einer :telescope: [Variable](articles/Variablen.md) ein Wert zugewiesen wird (mittels des _Zuweisungsoperators_ `=`).