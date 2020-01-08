# Softwaretechnologie Java: Inhalte

> **Was ist dieses Dokument bzw. was ist es nicht?**  
> Dies ist eine Übersicht über die Inhalte, die im Seminar besprochen werden sollten. Der Sinn dieses Dokumentes ist es *nicht*, Erläuterungen zu allen Inhalten des Seminars bereitzustellen. Dies ist keine Lern-Ressource oder gar "Script" zum Seminar. Ziel ist vielmehr eine möglichst vollständige und semantisch bzw. didaktisch strukturierte Aufstellung aller Themen und Aspekte, ergänzt durch unterstützende Materialien (siehe Ordner `Materialien`), Links zu relevanten, weiterführenden Ressourcen (mit `#` gekennzeichnet), sowie passende Übungs- und Hausaufgaben aus diesem Repository (siehe Ordner `Projekte`).

- [Softwaretechnologie Java: Inhalte](#softwaretechnologie-java-inhalte)
- [Die Programmiersprache Java](#die-programmiersprache-java)
- [Erste Schritte](#erste-schritte)
  - [Hello World! :rocket:](#hello-world-rocket)
  - [Pakete](#pakete)
  - [Java-Klassenbibliothek](#java-klassenbibliothek)
- [Eclipse IDE](#eclipse-ide)
- [Variablen](#variablen)
- [Datentypen](#datentypen)
  - [Primitive Datentypen](#primitive-datentypen)
  - [Komplexe Datentypen](#komplexe-datentypen)
  - [Casting / Typumwandlung bei primitiven Datentypen](#casting--typumwandlung-bei-primitiven-datentypen)
- [Methoden](#methoden)
- [Operatoren](#operatoren)
  - [Arithmetische- / Rechenoperatoren](#arithmetische---rechenoperatoren)
- [Post-/Preinkrement](#post-preinkrement)
  - [Vergleichsoperatoren](#vergleichsoperatoren)
  - [Boolsche / Logische Operatoren](#boolsche--logische-operatoren)
  - [Operatoren zur Bit-Manipulation (erstmal weglassen?)](#operatoren-zur-bit-manipulation-erstmal-weglassen)
  - [Zuweisungsoperatoren](#zuweisungsoperatoren)
- [Strings / Zeichenketten](#strings--zeichenketten)
- [Datenstrukturen I: Arrays](#datenstrukturen-i-arrays)
  - [Deklaration und Initialisierung](#deklaration-und-initialisierung)
  - [Zugriff und Manipulation](#zugriff-und-manipulation)
  - [Mehrdimensionale Arrays](#mehrdimensionale-arrays)
- [Kontrollstrukturen](#kontrollstrukturen)
  - [if, else if, else](#if-else-if-else)
  - [Ternary-Operator](#ternary-operator)
  - [switch](#switch)
  - [Schleifen](#schleifen)
    - [for](#for)
    - [while](#while)
    - [do-while](#do-while)
- [Objektorientierte Programmierung mit Java](#objektorientierte-programmierung-mit-java)
  - [Was ist OOP?](#was-ist-oop)
  - [Klassenvariablen](#klassenvariablen)
  - [Sichtbarkeits- / Zugriffsmodifizierer](#sichtbarkeits---zugriffsmodifizierer)
  - [this](#this)
  - [super](#super)
  - [Getter &amp; Setter](#getter-amp-setter)
  - [Konstruktoren](#konstruktoren)
  - [final](#final)
  - [static](#static)
  - [Konstanten in Java](#konstanten-in-java)
  - [Vererbung](#vererbung)
    - [Terminologie](#terminologie)
    - [Wozu ist Vererbung gut?](#wozu-ist-vererbung-gut)
    - [Wie funktioniert das?](#wie-funktioniert-das)
    - [Casting von komplexen Datentypen](#casting-von-komplexen-datentypen)
    - [instanceof](#instanceof)
    - [Überschreiben von Methoden](#Überschreiben-von-methoden)
    - [toString()](#tostring)
    - [equals()](#equals)
    - [Abstrakte Klassen und Methoden](#abstrakte-klassen-und-methoden)
    - [Interfaces](#interfaces)
- [Fehlerbehandlung](#fehlerbehandlung)
  - [Exceptions und Errors](#exceptions-und-errors)
  - [try-catch-finally](#try-catch-finally)
  - [try-with-resources](#try-with-resources)
- [Dokumentation JavaDoc](#dokumentation-javadoc)
- [Input/Output](#inputoutput)
  - [Streams](#streams)
  - [Buffering](#buffering)
  - [Reader und Writer](#reader-und-writer)
  - [Objekt-Serialisierung (Serializable)](#objekt-serialisierung-serializable)
- [Datenstrukturen II: Verkettete Listen](#datenstrukturen-ii-verkettete-listen)
  - [Einfach verkettete Listen](#einfach-verkettete-listen)
  - [Zweifach verkettete Listen](#zweifach-verkettete-listen)
- [Generics](#generics)
- [Datenstrukturen III: Das Collections Framework](#datenstrukturen-iii-das-collections-framework)
  - [List](#list)
  - [Set](#set)
  - [Map](#map)
  - [Object equality im Kontext von HashMaps/Sets](#object-equality-im-kontext-von-hashmapssets)


#  Die Programmiersprache Java
- C-artige, universelle Programmiersprache
- JVM [#](https://de.wikibooks.org/wiki/Java_Standard:_Java_Virtual_Machine)
- Bytecode
- Garbage Collector
- von Grund auf objektorientiert [#](https://de.wikibooks.org/wiki/Java_Standard:_Objektorientierung)
- sehr umfangreiche Standard-Library / Klassenbibliothek

![Java Platform Diagram](Materialien/Java-Platform-Diagram.png)
Grafik: [#](Materialien/Java-Platform-Diagram.png)

# Erste Schritte

## Hello World! :rocket:
- Woraus besteht eine **Klasse** mindestens?
- Was ist eine **Methode**?
- **main**-Methode mit "Hello World!"
  - Einstiegspunkt ins Programm
  - Was ist ein String / Zeichenkette (Klasse/Objekt!)?

```java
public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello World!"); // ach, was!
      }
}
```

## Pakete
- Was sind Pakete und wozu sind sie da? [#](https://de.wikibooks.org/wiki/Java_Standard:_Erste_Schritte#Pakete)
- Wie sehen Pakete auf meiner Festplatte aus?
  
## Java-Klassenbibliothek
- Beispiele für häufig verwendete Klassen [#](https://de.wikibooks.org/wiki/Java_Standard:_Erste_Schritte#Klassenbibliothek)
- Paketstruktur der Klassenbibliothek

# Eclipse IDE
- Was ist das für ein Programm? [#](https://de.wikibooks.org/wiki/Java_Standard:_Einrichten_der_Programmierumgebung#Eclipse)
- Die wichtigsten Views (Package Manager, Editor, Outline, Console)
- Das erste Projekt anlegen
  - Was ist da alles drin?
  - Wo findet man das Paket-Konzept wieder?
- Import / Export von Projekten
- Programme ausführen über Kontextmenü und "Play"-Button

# Variablen
- sind Bezeichner für Werte in bestimmten Speicherbereichen, die mit der Variable angesprochen werden können
- Java ist streng typisiert, Deklaration daher immer unter Angabe des Datentyps
- naming conventions (lowerCamelCase)
- Gültigkeitsbereiche
  - Methode, Kontrollstruktur oder Klasse (siehe [Klassenvariablen](#klassenvariablen))

# Datentypen

## Primitive Datentypen
- `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
- Welche **default values** haben diese Datentypen?

![primitive types overview](Materialien/primitive-data-types.png)
Grafik: [#](Materialien/primitive-data-types.png), Quelle [#](https://de.wikibooks.org/wiki/Java_Standard)

## Komplexe Datentypen
- Klassen und Arrays sind komplexe Datentypen (dazu später mehr!)

## Casting / Typumwandlung bei primitiven Datentypen
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

# Methoden
- Rückgabetyp / `void`
- Parameter
- `return`
- naming: `lowerCamelCase()`
- Überlagerung von Methoden

# Operatoren

## Arithmetische- / Rechenoperatoren
- Einfache: ` + - * / % `
  
# Post-/Preinkrement
- Ausdruck und Operation mittels: `++` / `--`

```java
// Unterschied Post-/Preinkrement:
int i = 5;
int x = ++i; // i = 6 und x = 6 (hochzählen, dann zuweisen)

int i = 5;
int x = i++; // i = 6 und x = 5 (zuweisen, dann hochzählen)
```

## Vergleichsoperatoren
- Ergebnis von Vergleichsoperationen ist **immer** `true` oder `false`!
- `==`, `!=`, `>`, `<`, `>=`, `<=`

## Boolsche / Logische Operatoren
- `&&` und `||`
- Negation: `!` (invertiert einen Ausdruck)
- Exklusives ODER: `!=` (wenn nur 1 Operand `true` ist)

## Operatoren zur Bit-Manipulation (erstmal weglassen?)
- `~`, `&`, `|`, `^`
- `>>`, `>>>`, `<<`

## Zuweisungsoperatoren
- Einfache: `=`
- Arithmetische: `+=`, `-=`, `/=`, `*=`, `%=`
- Logische: `&=`, `|=`, ...

```java
// Logische Zuweisungsoperatoren
boolean t = true;
boolean f = false;
t &= f; // hiernach: t = false, weil nicht beide true
```

# Strings / Zeichenketten
- `String` ist eine Klasse in Java
- Ein `String` ist eine Zeichenkette, also eine Sequenz (intern: Array) von `char`-Werten
- Strings sind in Java **nicht veränderlich** (denn sie sind Arrays von `char`s)
- String-Literals erzeugen Strings ohne den `new`-Operator
  - werden mit `"doppelten Anführungszeichen"` gebildet
- Konkatenation/Verkettung von Strings mit `+`
- Zeichen mit Sonderfunktionen
  - `"\n"` (newline) und `"\t"` (tab)
  - `\` muss deshalb maskiert werden: `"\\"`
- Für viele/wiederholte Manipulationen: `StringBuilder`

# Datenstrukturen I: Arrays
- lineare Datenstruktur (Elemente haben klare Reihenfolge)
- Indizes von `0` bis `array.length - 1` (!)
- Arrays müssen typisiert werden, alle Typen (primitive und komplexe) möglich
- Arrays sind in Größe/Länge **unveränderlich**!
- Arrays **sind Objekte** und vom Typ `Object` (siehe [JLS Java SE 8 Edition](https://docs.oracle.com/javase/specs/jls/se8/html/jls-10.html))

![array](Materialien/array.jpeg)
Grafik: [#](Materialien/array.jpeg), Quelle [#](https://javatutorial.net/java-array)

## Deklaration und Initialisierung
- Deklaration mit `typ[] arrayName` bzw. `Typ[] arrayName`
- Initialisierung mit `new typ[n]` bzw. `new Typ[n]`, wobei `n` die Größe des Arrays angibt
  - Größe der (mind.) ersten Dimension muss angegeben werden!

```java
// ein Array für 5 int-Werte
int[] numbers = new int[5];
// ein Array für 5 String-Objekte
String[] worte = new String[5];
```

- Die initialien Werte eines leeren Arrays entsprechen den default-Werten des entsprechenden Datentyps

```java
int[] numbers = new int[5]; // entspricht {0, 0, 0, 0, 0}
```

- Array Literals mit enthaltenen Werten: `{E1, E2, E2, E4, ..., En}`
  - Länge des Arrays implizit!

```java
int[] numbers = {3, 6, 345, 1, 0, 4}; // Länge: 6
String[] worte = {"Dies", "sind", "Strings!"}; // Länge: 3
```

## Zugriff und Manipulation
- Zugriff auf Elemente mit numerischem Index-Wert: `array[i]`
- Manipulation der Elemente mittels Zuweisung: `array[i] = 3`

```java
// ein Array für 3 int-Werte
int[] numbers = new int[2];
// Zugriff und Manipulation
numbers[0] = 45; // erstes Element
numbers[1] = 2; // zweites Element
numbers[3] = numbers[0]; // drittes Element
```

- Zugriff auch über for-each-Schleife

```java
int[] numbers = {3, 6, 345, 1, 0, 4};

for (int n : numbers){
  // n referenziert aktuellen Wert
}
```

**Anwendungs-Beispiel**
```java
/*
  * Alle Wörter eines Strings "umkehren",
  * die länger sind als 4 Zeichen...
  */

String text = "Ein Raabe geht im Feld spazieren";
String[] words = text.split(" ");

for (int i = 0; i < words.length; i++) {
  // wenn Wort länger als 4...
  if (words[i].length() > 4) {
    // ...Wort "umkehren"
    String reversed = "";
    for (int j = words[i].length() - 1; j >= 0; j--) {
      reversed += words[i].charAt(j); // teuer!
    }
    words[i] = reversed;
  }
}

for (int i = 0; i < words.length; i++) {
  System.out.print(words[i] + " ");
}
```

## Mehrdimensionale Arrays
- Arrays können (theoretisch) beliebig viele Dimensionen besitzen bzw. beliebig tief "verschachtelt" sein
- Jedes Array einer Unter-Ebene *kann* dabei eine andere Länge besitzen

```java
// zwei-dimensionales int-Array; entspricht einem
// Array aus vier int-Arrays der Länge 2
int[][] matrix = new int[4][2];
// Die Länge der Arrays in tieferen Dimensionen kann
// (vorerst) unbestimmt bleiben und sich letztendlich 
// unterscheiden
int[][] twoDimensions = new int[4][];
// auch hier sind Litarals möglich:
int[][] twoDimLiteral = {{2, 4}, {1, 54, 6}};
```

# Kontrollstrukturen
- steuern den Ablauf des Programms
- bilden eigene Gültigkeitsbereiche
  
## if, else if, else
- Ausführung von Code abhängig von Wahrheitswert einer Aussage / eines boolschen Ausdrucks
- Lässt sich gut übersetzen mit *"wenn", "dann", "sonst"* bzw. *"wenn", "dann", "sonst wenn", ..., "sonst"*
- besteht mindestens aus **einem** `if`-Block, einer **beliebigen Anzahl von** `else if`-Blöcken und **maximal einem** `else`-Block

```java
boolean t = true;
boolean f = false;

if (t && f){
  // beides wahr!
} else if (t || f) {
  // eins von beidem wahr!
} else {
  // beides unwahr!
}
```

## Ternary-Operator
- Ausdruck nimmt den einen oder anderen Wert an, in Abhängigkeit von der Bedingung / Wahrheitsgehalt der Aussage
- Syntax: `Bedingung ? Wert wenn wahr : Wert wenn unwahr`

```java
boolean condition = true;
String istEsWirklichWahr = condition ? "wahr" : "unwahr";
```

## switch
- Ersetzt sperrige `if`/`else`-Konstrukte, die nur den Wert eines einzigen Ausdrucks überprüfen
- ...
  
## Schleifen
Schleifen wiederholen die Ausführung einer Menge von Anweisungen (oder: bestimmter Code-Blöcke) in Abhängigkeit bestimmter Voraussetzungen.

### for
Zählschleife ...

### while
...

### do-while
...


# Objektorientierte Programmierung mit Java

## Was ist OOP?
> siehe z.B. [hier](https://de.wikibooks.org/wiki/Java_Standard:_Objektorientierung_Sinn_und_Zweck)
- Was ist eine **Klasse** (*konzeptuell, im Kontext d. OOP*)?
- Was ist ein **Objekt** (*konzeptuell, im Kontext d. OOP*)?

## Klassenvariablen
- werden im Klassenkörper deklariert
- per Konvention *ganz oben* im Klassenkörper
- haben ihren Gültigkeitsbereich in der gesamten Klasse
- werden auch *Felder* oder (engl.) *member variables* genannt

## Sichtbarkeits- / Zugriffsmodifizierer
Sichtbarkeitsmodifizierer beeinflussen die Sichtbarkeit von Klassen, Klassenvariablen und Methoden. Dabei sind Konstrukte markiert als ...
- ... `private` sichtbar innerhalb der Klasse.
- ... `(default)` sichtbar wie `private` und in dem Package, in dem sich die Klasse befindet (nicht aber in Unter-/Überpackages).
- ... `protected` sichtbar wie `(default)` und in allen (erbenden) Unterklassen.
- ... `public` überall sichtbar.
- Mit diesen Modifizierern lässt sich [Datenkapselung](https://de.wikipedia.org/wiki/Datenkapselung_(Programmierung)) (order auch das Geheimnisprinzip) umsetzen.

```java
//... bei Klassen
public class User {

  //... bei Klassenvariablen
  protected String name;
  private UserLogin login;

  //... bei Methoden
  public void sayName(){
    System.out.println(name);
  }

  ///... oder bei lokalen Klassen
  private class UserLogin {
    private String userName;
    private String password;
  }
}
```

## this
Mit dem Schlüsselwort `this` referenziert sich ein Objekt selbst!

## super
Mit dem Schlüsselwort `super` referenziert eine Klasse ihre Superklasse (siehe [Vererbung](#vererbung))!
  
## Getter & Setter
- einfache Methoden zum Lesen und Setzen von Klassenvariablen
- bieten Kontrolle über die Werte, die gesetzt werden und können ggf. Fehler ausgeben oder Werte vorher manipulieren
- Entsprechende Klassenvariablen werden `private` gesetzt, damit sie nur über die *Getter* bzw. *Setter* zugänglich sind.
- können sehr gut in Konstruktoren wiederverwendet werden, damit die Logik zum Setzen von Werten auf Klassenvariablen an einem Ort ist
- Getter und Setter sind Teil der [Datenkapselung](https://de.wikipedia.org/wiki/Datenkapselung_(Programmierung))

```java
public class User {

  private String name;

  public User(String name){
    setName(name); // Setter in Konstruktor nutzen
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    // Logik zum Setzen der name-Klassenvariable
    // Beispiel: Wert darf nicht null sein
    if (name == null) {
      // Oder wie auch immer man reagieren möchte...
      System.err.println("So heißt doch niemand!");
    } else {
      this.name = name;
    }
  }

}
```

## Konstruktoren
- Konstruktoren bieten die Möglichkeit, die Initialisierung von Objekten zu kontrollieren und für die Initialisierung benötigte Daten einzufordern.
- Jede Klasse hat (automatisch) einen Konstruktor, nämlich mindestens den default-Konstruktor (oder auch *no-argument-constructor*) ihrer Superklasse.
  - auch der default-Konstruktor lässt sich explizit machen
- Konstruktoren lassen sich überlagern (wie Methoden auch).
- Wenn nur ein (oder mehrere) explizite/r Konstruktor/en **mit** Parametern existieren, dann hat die Klasse **keinen _no-argument-constructor_**
  
```java
public class User {

  String name;

  // ein überschriebener default-Konstruktor
  public User(){
    this.name = "No Name"; // hier verhindert "this" einen Namenskonflikt!
    System.out.println("A User instance was created using the " +
      "no-argument-constructor! This user has no name :(");
  }

  // ein weiterer Konstruktor, der nach einem String verlangt
  public User(String name){
    this.name = name; // hier verhindert "this" einen Namenskonflikt!
    System.out.println("A User instance was created! " +
      "The user's name seems to be " + name + "!");
  }

}
```

- Es wird bei der Initialisierung automatisch ein Aufruf des *no-argument-constructor* der Superklasse gemacht, falls diese keinen Konstruktor mit Prametern besitzt. Falls doch, **muss** jeder Konstruktor jeder Subklasse als erstes (!) diesen (oder einen) Konstruktor der Superklasse aufrufen: `super(param1, param2);`

```java
public class User {

  String name;

  public User(String name){
    this.name = name; // hier verhindert "this" einen Namenskonflikt!
  }

}

public class SpecialUser extends User {

  public SpecialUser(){
    super("default name string");
    //... whatever else ...
  }

  public SpecialUser(String name){
    super(name);
    //... whatever else ...
  }

}
```

## final
- markiert eine (benannte) Einheit (Variable, Methode oder Klasse), der nur ein einziges mal ein Wert (o.ä.) zugewiesen werden kann
- finale Variablen
  - primitive: Wert kann nicht geändert werden
  - komplexe: Referenz kann nicht auf anderes Objekt geändert werden, aber Felder des Objektes können geändert werden
  - Unterschied zu z.B. C++ `const`: finale Variablen können auch noch *nach* der Deklaration einen Wert erhalten, aber eben nur ein mal!
- finale Methoden können nicht überschrieben werden
- finale Klassen können nicht erweitert werden

```java
final class ImmutableClass {
  // Diese Klasse kann nicht erweitert werden!
}
```

```java
public final void someMethod(){
  // Diese Methode kann nicht überschrieben werden!
}
```

Im folgenden Beispiel kann der Name des Users nur einmal (bei Instanziierung der Klasse bzw. Erzeugung eines Objektes) gesetzt werden. Der Wert kann dann für dieses Objekt nicht mehr geändert werden. Die Instanziierung (Aufruf des Konstruktors) ist *der letzte mögliche Zeitpunkt zum Setzen eines Wertes für die finale Klassenvariable!*

```java
public class User {

  private final String name;

  public User(String name){
    this.name = name;
  }
  
}
```

## static
`static` bedeutet *"an die Klasse gebunden"* im Gegensatz zu *"an das Objekt gebunden"*. Dies hat folgende Auswirkungen:
- Statische *Methoden* **und** *Klassenvariablen* sind **ohne** Instanz der Klasse verfügbar (sofern sie sichtbar sind!).
- Statische *Klassenvariablen* haben klassenweit - also in jeder Instanz der Klasse - immer den selben Wert.
- In *statischen Methoden* kann **nicht** auf *nicht-statische Klassenvariablen* zugegriffen werden, da diese (anders als die statische Methode) an Instanzen der Klasse gebunden sind und ohne Instanziierung der Klasse keinen Wert haben **können**.

**Beispiel für *statische Felder/Klassenvariablen*:**

```java
public class User {

  private static String displayString;

  public User(){
    // default displayString setzen
    this.displayString = "User";
  }

  public void setDisplayString(String displayString){
    this.displayString = displayString;
  }

  public String getDisplayString(){
    return this.displayString;
  }
  
}


public class Application {

  public static void main(String[] args){
    User userOne = new User();
    User userTwo = new User();
    // displayString für userOne ändern
    userOne.setDisplayString("Benutzer");
    // gibt "Benutzer" aus (erwartbar)
    System.out.println(userOne.getDisplayString());
    // gibt ebenfalls "Benutzer" aus, weil das Feld statisch ist!
    System.out.println(userTwo.getDisplayString());
  }

}
```

**Beispiel für *statische Methoden*:**

```java
public class User {

  private String id;
  private String eMail;

  public User(String eMail){
    this.eMail = eMail;
    this.id = User.generateUserID(eMail);
  }

  public static String generateUserID(String userMailAddress){
    return "User" + Math.abs(userMailAddress.hashCode());
  }
  
}


public class Application {

  public static void main(String[] args){
    String someMailAddress = "this.is.my.email@provider.com";
    // Welche ID hat ein User mit dieser Adresse?
    // Wenn es sie/ihn gibt, dann diese ID (statische Methode
    // wird ohne User-Objekt aufgerufen!):
    System.out.println(User.generateUserID(someMailAddress));
  }

}
```

## Konstanten in Java
Konstanten (hier: unveränderbare Felder, die über alle Instanzen hinweg den selben Wert haben) werden für gewöhnlich mit `static` *und* `final` definiert und befolgen die Naming Conventions:
```java
// könnte auch "public" sein
private static final int THIS_IS_A_PRIVATE_CONSTANT = 2;
```

## Vererbung
Klassen können Eigenschaften (Klassenvariablen / *features*) und Fähigkeiten (Methoden / *behavior*) von anderen Klassen *erben*.

### Terminologie
Die *vererbenden* Klassen werden als **Superklassen**, **Elternklassen** oder **Überklassen** (Englisch *parent class* oder *super class*) bezeichnet, die *erbenden* hingegen respektive als **Subklassen**, **Kindklassen** oder **Unterklassen** (Englisch *child class* oder *sub class*).  
Die *erbende* Klasse **erweitert** die Klasse, von der sie erbt, da sie (normalerweise) Eigenschaften und Fähigkeiten besitzt, die über jene der Superklasse hinausgehen.

### Wozu ist Vererbung gut?
- Eigenschaften und Fähigkeiten von Klassen werden zu Eigenschaften und Fähigkeiten aller Subklassen. So wird nicht nur Code wiederverwendet, sondern die Logik dieser Eigenschaften und Fähigkeiten lässt sich für *alle* Subklassen an einer einzigen Stelle ändern, ohne den Code der Subklassen zu verändern.
- Der Code modelliert reale Phänomene und Beziehungen auf semantisch klare Weise.
- Sie ermöglicht [Polymorphie](https://de.wikipedia.org/wiki/Polymorphie_(Programmierung)) unter Typen, denn jede Instanz einer Klasse ist auch eine Instanz aller Superklassen.
- ...

### Wie funktioniert das?
- Alle Klassen erben automatisch von der Klasse `Object` (denn alle Instanzen von Klassen sind Objekte).
- Mit dem Schlüsselwort `extends` wird eine Verwandschaft markiert.
- Jede Klasse kann in Java nur von einer anderen Klasse erben. Es ist **keine Mehrfachvererbung** möglich!

```java
// jede Person ist auch ein Object
public class Person(){
  protected String name;
}

// jeder User ist auch eine Person und ein Object
// und hat einen Namen UND einen Username
public class User extends Person {
  private String userName;
}
```

### Casting von komplexen Datentypen
- möglich von Superklassen zu Subklassen (auf eigene Verantwortung)
- unnötig von Subklassen zu Superklassen (wg. [Polymorphie](https://de.wikipedia.org/wiki/Polymorphie_(Programmierung)))
- ...

### instanceof
`instanceof` ist ein Operator, der die Zugehörigkeit eines Objektes zu einem bestimmten Typ überprüft:

```java
User user = new User("Tonky McWigglefritts");
System.out.println(user instanceof Person); // true
System.out.println(user instanceof Object); // true
System.out.println(user instanceof CharSequence); // false
System.out.println(user instanceof List); // false
```

### Überschreiben von Methoden
Methoden von Superklassen können in Subklassen überschrieben werden (markiert durch die `@Override`-Annotation)

> **(!) Aus den docs zu** `@Override` [#](https://docs.oracle.com/javase/8/docs/api/java/lang/Override.html)  
> *Indicates that a method declaration is intended to override a method declaration in a supertype. If a method is annotated with this annotation type compilers are required to generate an error message unless at least one of the following conditions hold:*
> - *The method does override or implement a method declared in a supertype.*
> - *The method has a signature that is override-equivalent to that of any public method declared in Object.* 
>  
> &rarr; `@Override` ist also *nicht* nötig, macht aber den Code eindeutiger und veranlasst den Compiler dazu, hilfreiche Fehlermeldungen zu liefern!

```java
// jede Person ist auch ein Object
public class Person(){
  public String something(){
    // ...
  }
}

// jeder User ist auch eine Person und ein Object
// und hat einen Namen UND einen Username
public class User extends Person {
  @Override
  public String something(){
    // eigene, unabhängige Implementation!
  }
}
```

### toString()
- gibt eine möglichst sinnvolle textuelle (*String*-) Repräsentation des Objektes zurück, für das es aufgerufen wird
- sollte in eigenen Klassen generell überschrieben werden, mindestens aber in Datenklassen/POJOs
- falls `toString()` für den Typ des Objektes nicht überschrieben ist, wird (wie bei allen entsprechenden Methoden) die `toString()`-Methode der Superklasse - nämlich `Object` aufgerufen

Dieser Code ...
```java
public class User {

	private String name;
	
	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "User(" + name + ")";
	}

}

public class Program {

	public static void main(String[] args) {
		User u = new User("Otto Normal");
		System.out.println(u);
	}

}
```
... würde **ohne** überschriebene `toString()`-Methode in der Klasse User **User@4aa298b7** (o.ä.) ausgeben, gibt nun aber stattdessen **User(Otto Normal)** aus. Diese Repräsentation des User-Objektes ist wesentlich wertvoller.


### equals()
Objekte werden **nicht** mit `==` verglichen, sondern mit `equals()`, denn `==` überprüft nicht die semantische Gleichheit von zwei Objekten, sondern bildet lediglich einen *wahren* Ausdruck, wenn es sich um zwei Referenzen *auf das selbe Objekt* handelt!  
Genau wie `toString()`, sollte `equals()` grundsätzlich überschrieben werden (mindestens in Datenklassen / POJOs).

> **(!) Achtung:**  
> Man versucht gern mit `"hallo" == "hallo"` zu beweisen, dass sich Strings in Java so nicht vergleichen lassen (aus oben genannten Gründen) und steht dann ziemlich dumm da, wenn der Ausdruck plötzlich doch `true` ergibt. Das liegt an Javas *[string interning](https://stackoverflow.com/questions/10578984/what-is-java-string-interning)*, wodurch identische Strings intern auf das selbe Objekt (und somit die selbe Speicher-Referenz) reduziert werden!

```java
public class User {
	
	private String eMail;
	
	public User(String eMail) {
		this.eMail = eMail;
	}
	
	public String getEMail() {
		return eMail;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null
			&& obj instanceof User
			&& ((User)obj).getEMail().equals(this.getEMail());
	}
	
}

public class Program {
	public static void main(String[] args) {
		User u1 = new User("otto@normal.de");
		User u2 = new User("otto@normal.de");
		System.out.println(u1 == u2); // false
		System.out.println(u1.equals(u2)); // true
	}
}
```

### Abstrakte Klassen und Methoden
- Abstrakte Klassen können und sollen nicht direkt instanziiert werden, da sie lediglich (teilweise implementierte) Vorlagen für ihre Subklassen sind.
- Das Schlüsselwort `abstract` macht eine Klasse zu einer abstrakten Klasse.
- Eine abstrakte Klasse *kann* abstrakte Methoden enthalten, muss dies aber nicht.
- Abstrakte Klassen werden benötigt, wenn sich mehrere Klassen gemeinsame Eigenschaften und Fähigkeiten teilen (also eine Superklasse brauchen), diese gemeinsamen Eigenschaften und Fähigkeiten aber noch keine sinnvolle/brauchbare Klasse ergeben, von der man Instanzen erzeugen können sollte.

```java
/*
 * Diese abstrakte Klasse kann nicht
 * direkt instanziiert werden (mit new Vehicle())
 */
public abstract class Vehicle {
  private float speed;
  private boolean flying;
  private String name;
	// ...
}

/*
 * Diese Klasse erweitert die abstrakte Klasse
 * Vehicle und kann instanziiert werden.
 */
public class Rocket extends Vehicle {
  private double maxFuel;
	// Rocket-Erweiterung von Vehicle ...
}
```

In diesem Beispiel ist `Vehicle` eine Abstraktion von `Rocket`. Andersherum ist `Rocket` eine Konkretisierung von `Vehicle`.

Abstrakte Methoden müssen in der erweiternden (erbenden) Klasse implementiert werden:

```java
public abstract class Vehicle {

  private float currentSpeed;
  private float accelleration;
  private boolean flying;
  private String name;
	
  // abstrakte Methoden besitzen keinen
  // Methoden-Körper!
  public abstract void accellerate();
}

public class Rocket extends Vehicle {

  private boolean inSpace;
	
  @Override
  public void accellerate(){
    currentSpeed += accelleration * (inSpace ? 2 : 1);
  }

}
```

**Ausnahme:** Die erweiternde/erbende Klasse ist selbst auch eine abstrakte Klasse. In diesem Fall kann sie die geerbte abstakte Methode ebenfalls als abstrakte Methode "weitergeben"!

### Interfaces
- werden mit `interface` eingeleitet (nicht mit `class`, siehe Beispiel unten)
- werden von Klassen *implementiert* (nicht erweitert) mit dem Schlüsselwort `implements`, oder von anderen Interfaces erweitert (in diesem Fall mit `extends`)
- sind (wörtlich) eine **Schnittstelle** zu anderen Programmteilen
- können nicht instanziiert werden
- enthalten **keinerlei** Implementationen von Methoden, sondern nur abstrakte Methoden
  - **Ausnahme:** Seit Java 8 gibt es [default methods](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)
- Methoden sind hier automatisch `abstract` und `public`, wobei `public` meist trotzdem mit angegeben wird.

**Ein (kleines) Anwendungsbeispiel zu Interfaces:**  
Mit einem Interface `TextProcessor`, welches die Fähigkeiten von Text-Prozessoren beschreibt (nämlich das Prozessieren von Text, was auch immer das bedeutet) ...

```java
public interface TextProcessor {

  public String process(String input);

}
```

... lässt sich ein Programm entwickeln, welches Text-Prozessoren einsetzt, ohne jemals zu wissen, um was für Text-Prozessoren es sich genau handelt:

```java
public class TextEditor {

  private String text;

  public void applyTextProcessor(TextProcessor tp){
    text = tp.process(text);
  }

}
```

So kann das Entwickeln von Text-Prozessoren anderen Personen überlassen werden oder man fügt selbst später weitere mögliche Text-Prozessoren hinzu - und das alles ohne dass die Klasse `TextEditor` verändert werden müsste:

```java
public class TextToUpperCase implements TextProcessor {

  @Override
  public String process(String text){
    return text.toUpperCase();
  }

}
```

Da die Methode `applyTextProcessor()` der Klasse `TextEditor` gegen das Interface `TextProcessor` entwickelt wurde, funktioniert sie mit **jeder** ordentlichen Implementation von `TextProcessor`.

# Fehlerbehandlung
## Exceptions und Errors
- Klassenhierarchie Exceptions...
- ...
## try-catch-finally
- ...
## try-with-resources
- ...
# Dokumentation JavaDoc
- ...

# Input/Output
## Streams
- ...
## Buffering
- ...
## Reader und Writer
- ...
## Objekt-Serialisierung (Serializable)
- ...

# Datenstrukturen II: Verkettete Listen
## Einfach verkettete Listen
- ...
## Zweifach verkettete Listen
- ...

# Generics
- ...
- Implementation am Beispiel der verketteten Liste
- ...

# Datenstrukturen III: Das Collections Framework
## List
- ...
## Set
- ...
## Map
- ...
## Object equality im Kontext von HashMaps/Sets
- Vertrag zwischen `equals()` und `hashCode()`