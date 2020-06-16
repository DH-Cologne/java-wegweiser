# Coding Lingo :speaking_head:

**Allgemeine Terminologie der Programmierung**

> :construction: :snail: Dieses Verzeichnis wird wohl für immer **_work in progress_** sein!

> :milky_way: **TODO:** Referenz, Quelltext, Code, Bezeichner

Es ist am Anfang nicht immer leicht, den Überblick über die Terminologie in der (objektorientierten) Programmierung zu behalten. Dies ist aber extrem wichtig für das Verständnis von Erläuterungen, Dokumentationen etc.! Im Folgenden werden solche Begriffe alphabetisch sortiert aufgelistet und miteinander verknüpft.

> :warning: **Achtung:** Hier sind die Java-spezifischen Themen aus dem eigentlichen [Java-Wegweiser](https://dh-cologne.github.io/java-wegweiser) **nicht noch einmal aufgeführt**.

> :speech_balloon: In diesem Stichwort-Verzeichnis geht es außerdem **nicht** um [ulkige Bezeichnungen für Dinge aus der Welt des Programmierens](https://blog.codinghorror.com/new-programming-jargon/) (schade!), sondern um allgemeine Begriffe, die zur Kommunikation über das Programmieren und Quelltext genutzt werden.

## Legende
:point_right: Verweis auf einen anderen Begriff in diesem Verzeichnis  
:telescope: Verweis auf einen Artikel / Abschnitt im [Java-Wegweiser](https://dh-cologne.github.io/java-wegweiser)



## A

### Anweisung
Auch: :point_right: [Statement](#statement) (eng.) oder Instruktion (unüblich)

### Argument
Auch: :point_right: [Parameter](#parameter)

### Ausdruck
Eine Kombination aus Variablen, Literals, Konstanten, Operatoren und Rückgabewerten von Methoden. Ein Ausdruck ergibt als ganzes einen Wert. Z.B. hat der Ausdruck `2 < 9` den Wert `true` und der Ausdruck `(4 - Math.max(15, 46)) * ( 1 + 1 == 1 ? 1 : -1)` den Wert `42`.

### Aussage
:point_right: [Ausdruck](#ausdruck) mit einem :point_right: [Wahrheitswert](#wahrheitswert), etwa `2 == 7` (hat üblicherweise den Wert `false`)

## B

...


## C

### Control flow
Englisch für :point_right: [Kontrollfluss](#kontrollfluss)


## D

### Deklaration
Die _Deklaration_ einer :telescope: [articles/Variable](Variablen.md) besteht aus der Angabe ihres :telescope: [Datentyps](articles/Datentypen.md) und ihres Namens (_Variablenname_), etwa `int thisIsAnInteger`.


## E

### Expression
Englisch für :point_right: [Ausdruck](#ausdruck)


## F

...


## G

### Gültigkeitsbereich
Der Gültigkeitsbereich eines :point_right: [Bezeichners](#bezeichner) (Methodenname, Variablenname, etc.) ist der Bereich im :point_right: [Quelltext](#quelltext), von dem aus der Zugriff auf diesen Bezeichner möglich ist; auch: :point_right: [Scope](#scope)


## H

...


## I

### Instanz
Siehe :telescope: [OOP-Einführung](articles/OOP-Einfuehrung.md) bzw. :telescope: [Klassen und Objekte](articles/Klassen-und-Objekte.md)

### Instanzvariable
Siehe :telescope: [Arten von Variablen](articles/Variablen.md#arten-von-variablen)

### Instruktion
Auch: :point_right: [Statement](#statement) oder Anweisung; englisch.: _instruction_


## J

...


## K

### Klasse
Siehe :telescope: [OOP-Einführung](articles/OOP-Einfuehrung.md) bzw. :telescope: [Klassen und Objekte](articles/Klassen-und-Objekte.md)

### Klassenvariable
Siehe :telescope: [Arten von Variablen](articles/Variablen.md#arten-von-variablen)

### Kontrollfluss
Die Steuerung des Ablaufs eine Programmes. Für den Kontrollfluss werden :telescope: [Konditionale](articles/Konditionale.md) und :telescope: [Schleifen](articles/Schleifen.md) genutzt, die das Programm abhängig von festgelegten :point_right: [Bedingungen](#bedingung) steuern.

## L

### Lokale Variable
Siehe :telescope: [Arten von Variablen](articles/Variablen.md#arten-von-variablen)


## M

...


## N

...


## O

### Objekt
Eine :point_right: [Instanz](#instanz) einer :telescope: [Klasse](articles/OOP-Einfuehrung.md), siehe auch :telescope: [Klassen und Objekte](articles/Klassen-und-Objekte.md)


## P

### Parameter
Bei der Ausführung an ein Programm oder eine :telescope: [Methode](articles/Methoden.md) übergebene Daten; auch: :point_right: [Argument](#argument)


## Q

...


## R

...


## S

### Scope
Auch: :point_right: [Gültigkeitsbereich](#gültigkeitsbereich)

### Statement
Eigentlich englisch für "Aussage", im Programmier-Kontext ist aber **_Anweisung_** gemeint. In Java gibt es **drei verschiedene** Arten von Statements: _Expression Statements_ (siehe :point_right: [Ausdruck](#ausdruck)), _Declaration Statements_ (siehe :point_right: [Deklaration](#deklaration)) und _Control-flow statements_ (siehe :point_right: [Kontrollfluss](#kontrollfluss))


## T

...


## U

...


## V

...


## W

### Wahrheitswert
Wert einer :point_right:[Aussage](#aussage). Kann (im Programmier-Kontext) `true` oder `false` sein und ist somit vom :telescope: [Datentyp](articles/Datentypen.md) `boolean` (bzw. `Boolean`).


## X

...


## Y

...


## Z

### Zuweisung
Operation, bei der einer :telescope: [Variable](articles/Variablen.md) mittels des _Zuweisungsoperators_ (`=`) ein Wert zugewiesen wird.