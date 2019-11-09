# Inhalte
> **Was ist dieses Dokument bzw. was ist es nicht?**  
> Dies ist eine Übersicht über die Inhalte, die im Seminar besprochen werden sollten. Der Sinn dieses Dokumentes ist es *nicht*, Erläuterungen zu allen Inhalten des Seminars bereitzustellen. Dies ist keine Lern-Ressource oder gar "Script" zum Seminar. Ziel ist vielmehr eine möglichst vollständige und semantisch bzw. didaktisch strukturierte Aufstellung aller Themen und Aspekte, ergänzt durch unterstützende Materialien (siehe Ordner `Materialien`), Links zu relevanten, weiterführenden Ressourcen (mit `#` gekennzeichnet), sowie passende Übungs- und Hausaufgaben aus diesem Repository (siehe Ordner `Hausaufgaben`).

- [Inhalte](#inhalte)
  - [Die Programmiersprache Java](#die-programmiersprache-java)
  - [Erste Schritte](#erste-schritte)
    - [Hello World! :rocket:](#hello-world-rocket)
    - [Pakete](#pakete)
    - [Java-Klassenbibliothek](#java-klassenbibliothek)
  - [Eclipse IDE](#eclipse-ide)
  - [Objektorientierte Programmierung (OOP)](#objektorientierte-programmierung-oop)
  - [Variablen](#variablen)
  - [Datentypen](#datentypen)
    - [Primitive Datentypen](#primitive-datentypen)
    - [Komplexe Datentypen](#komplexe-datentypen)
    - [Casting / Typumwandlung bei primitiven Datentypen](#casting--typumwandlung-bei-primitiven-datentypen)
  - [Methoden](#methoden)
  - [Operatoren](#operatoren)
    - [Arithmetische- / Rechenoperatoren](#arithmetische---rechenoperatoren)
    - [Vergleichsoperatoren](#vergleichsoperatoren)
    - [Boolsche / Logische Operatoren](#boolsche--logische-operatoren)
    - [Operatoren zur Bit-Manipulation (erstmal weglassen?)](#operatoren-zur-bit-manipulation-erstmal-weglassen)
    - [Zuweisungsoperatoren](#zuweisungsoperatoren)
  - [Strings / Zeichenketten](#strings--zeichenketten)
  - [Arrays](#arrays)
  - [Kontrollstrukturen](#kontrollstrukturen)
  - [Fehlerbehandlung](#fehlerbehandlung)
  - [JavaDoc](#javadoc)
  - [OOP-Klassenkonzepte](#oop-klassenkonzepte)
    - [Konstruktoren](#konstruktoren)
    - [Sichtbarkeits-/Zugriffsmodifizierer](#sichtbarkeits-zugriffsmodifizierer)
    - [Getter & Setter](#getter--setter)
    - [Vererbung](#vererbung)
      - [Einfache Vererbung](#einfache-vererbung)
      - [Abstrakte Klassen](#abstrakte-klassen)
      - [Interfaces](#interfaces)
      - [Casting von komplexen Datentypen](#casting-von-komplexen-datentypen)


##  Die Programmiersprache Java
- C-artige, universelle Programmiersprache
- JVM [#](https://de.wikibooks.org/wiki/Java_Standard:_Java_Virtual_Machine)
- Bytecode
- Garbage Collector
- von Grund auf objektorientiert [#](https://de.wikibooks.org/wiki/Java_Standard:_Objektorientierung)
- sehr umfangreiche Standard-Library / Klassenbibliothek

![Java Platform Diagram](Materialien/Java-Platform-Diagram.png)
Grafik: [#](Materialien/Java-Platform-Diagram.png)

## Erste Schritte

### Hello World! :rocket:
- Woraus besteht eine **Klasse** mindestens?
- Was ist eine **Methode**?
- **main**-Methode mit "Hello World!"
  - Einstiegspunkt ins Programm
  - Was ist ein String / Zeichenkette (Klasse/Objekt!)?

<details><summary>CODE: Hello World!</summary>

```java
public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello World!"); // ach, was!
      }
}
```
</details>

### Pakete
- Was sind Pakete und wozu sind sie da? [#](https://de.wikibooks.org/wiki/Java_Standard:_Erste_Schritte#Pakete)
- Wie sehen Pakete auf meiner Festplatte aus?
  
### Java-Klassenbibliothek
- Beispiele für häufig verwendete Klassen [#](https://de.wikibooks.org/wiki/Java_Standard:_Erste_Schritte#Klassenbibliothek)
- Paketstruktur der Klassenbibliothek

## Eclipse IDE
- Was ist das für ein Programm? [#](https://de.wikibooks.org/wiki/Java_Standard:_Einrichten_der_Programmierumgebung#Eclipse)
- Die wichtigsten Views (Package Manager, Editor, Outline, Console)
- Das erste Projekt anlegen
  - Was ist da alles drin?
  - Wo findet man das Paket-Konzept wieder?
- Import / Export von Projekten
- Programme ausführen über Kontextmenü und "Play"-Button

## Objektorientierte Programmierung (OOP)
- Was ist **OOP**? [#](https://de.wikibooks.org/wiki/Java_Standard:_Objektorientierung_Sinn_und_Zweck)
- Was ist eine **Klasse** (*konzeptuell, im Kontext d. OOP*)?
- Was ist ein **Objekt** (*konzeptuell, im Kontext d. OOP*)?

## Variablen
- sind Bezeichner für Werte in bestimmten Speicherbereichen, die mit der Variable angesprochen werden können
- Java ist streng typisiert, Deklaration daher immer unter Angabe des Datentyps
- naming conventions (lowerCamelCase)
- Gültigkeitsbereiche
  - Methode, Kontrollstruktur oder Klasse (**Klassenvariablen**!)

## Datentypen
### Primitive Datentypen
- `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
- Welche **default values** haben diese Datentypen?

![primitive types overview](Materialien/primitive-data-types.png)
Grafik: [#](Materialien/primitive-data-types.png)

### Komplexe Datentypen
- Klassen und Arrays sind komplexe Datentypen (dazu später mehr!)

### Casting / Typumwandlung bei primitiven Datentypen
- Implizite Typumwandlung: Ein "niederwertiger" Typ wird einem "höherwertigen" Typ zugewiesen (Umwandlung geschieht automatisch)
  - `double d; int i = 2; d = i;`

![upcast](Materialien/typecast_1.jpg)
Grafik: [#](Materialien/typecast_1.jpg), Quelle: [#](https://www.java-tutorial.org/typecasting.html)

- Explizite Typumwandlung: Ein "höherwertiger" Typ wird in "niederwertigen" Typ umgewandelt
  - geschieht mittels cast-Operator
  - Ziel-Typ **muss** angegeben werden
  - `double d = 2.2d; int i; i = (int) d;`

![upcast](Materialien/typecast_2.jpg)
Grafik: [#](Materialien/typecast_2.jpg), Quelle: [#](https://www.java-tutorial.org/typecasting.html)

## Methoden
- Rückgabetyp / `void`
- Parameter
- `return`
- naming: `lowerCamelCase()`
- Überlagerung von Methoden

## Operatoren
### Arithmetische- / Rechenoperatoren
- Einfache: ` + - * / % `
- Post-/Preinkrement `++` / `--`

<details><summary>CODE: Unterschied Post-/Preinkrement</summary>

```java
int i = 5;
int x = ++i; // i = 6 und a = 6 (hochzählen, dann zuweisen)

int i = 5;
int x = i++; // i = 6 und b = 5 (zuweisen, dann hochzählen)
```
</details>

### Vergleichsoperatoren
- Ergebnis von Vergleichsoperationen ist **immer** `true` oder `false`!
- `==`, `!=`, `>`, `<`, `>=`, `<=`

### Boolsche / Logische Operatoren
- `&&` und `||`
- Negation: `!` (invertiert einen Ausdruck)
- Exklusives ODER: `!=` (wenn nur 1 Operand `true` ist)

### Operatoren zur Bit-Manipulation (erstmal weglassen?)
- `~`, `&`, `|`, `^`
- `>>`, `>>>`, `<<`

### Zuweisungsoperatoren
- Einfache: `=`
- Arithmetische: `+=`, `-=`, `/=`, `*=`, `%=`
- Logische: `&=`, `|=`, ...

<details><summary>CODE: Logische Zuweisungsoperatoren</summary>

```java
boolean t = true;
boolean f = false;
t &= f; // hiernach: t = false, weil nicht beide true
```
</details>

## Strings / Zeichenketten
- `String` ist eine Klasse in Java
- Ein `String` ist eine Zeichenkette, also eine Sequenz (intern: Array) von `char`-Werten
- Strings sind in Java **nicht veränderlich** (denn sie sind Arrays von `char`s)
- String-Literals erzeugen Strings ohne den `new`-Operator werden mit `"doppelten Anführungszeichen"` gebildet
- Konkatenation/Verkettung von Strings mit `+`
- Spezial-Zeichen
  - `"\n"` (newline) und `"\t"` (tab)
  - `\` muss deshalb maskiert werden: `"\\"`
- Für viele Veränderungen: `StringBuffer`

## Arrays
...

## Kontrollstrukturen
...

## Fehlerbehandlung
...

## JavaDoc
...

## OOP-Klassenkonzepte
Welche Konzepte stehen zum Aufbau von Klassen zur Verfügung?
### Konstruktoren
...
### Sichtbarkeits-/Zugriffsmodifizierer
- `private`
- `(default)`
- `protected`
- `public`
### Getter & Setter
### Vererbung
- Alle Klassen erben automatisch von `Object`
#### Einfache Vererbung
#### Abstrakte Klassen
#### Interfaces
#### Casting von komplexen Datentypen