# Der wachsende Reader zu Softwaretechnologie: Java

Ergänzende **Lernressource**, **Nachschlagewerk** und **Wegweiser** für TeilnehmerInnen des Softwaretechnologie-Moduls (_BM4_) der Studiengänge **Informationsverarbeitung** und **Medieninformatik** des **IDH** _(Institut für Digital Humanities, Universität zu Köln)_.

> Work in progress. Forever. :snail:

[&ddarr; **Direkt zum Inhalt** &ddarr;](#inhalt)


## Was ist das hier bzw. was ist es nicht?

Dies ist eine erläuterte Übersicht über die Inhalte des Moduls _Softwaretechnologie: Java_ (und einige mehr). Es handelt sich _nicht_ um eine vollständige Lösung zum Erlernen der behandelten Konzepte (Lehrbücher gibt es genug), sondern um eine ergänzende Ressource zur Wiederholung und Orientierung für TeilnehmerInnen des Moduls. Dieses Repository unterscheidet sich von einem Java-Lehrbuch also eben durch die bewusste Reduktion des Inhalts auf die für das Modul relevanten Inhalte und deren möglichst effektive Erläuterung (effektiv im Gegensatz zu ausschweifend!).

Es finden sich zwischen den Zeilen außerdem Code-Beispiele, unterstützende Materialien, Links zu weiterführenden Ressourcen (mit `#` gekennzeichnet), sowie passende Übungs-Aufgaben (siehe Ordner `projects`).

## Mitwirken / Contribution

In guter Open Source-Manier ist jede\*r TeilnehmerIn dazu eingeladen, dieses Repository mitzugestalten, inhaltlich zu erweitern oder auch einfach nur etwaige Fehler zu korrigieren.  
Es wird darum gebeten, hierfür den üblichen Weg über einen Fork &rarr; neuer Branch &rarr; Pull Request zu gehen oder (einfacher) die Funktion zur direkten Editierung von Markodown-Files in GitHub zu nutzen (diese erstellt automatisch einen Pull Request).

## Inhalt

**[Die Programmiersprache Java](/documents/Die-Programmiersprache-Java.md)**  
Warum Java? Warum lieber nicht? Was unterscheidet Java von anderen Programmiersprachen? Was ist das *Java Ecosystem*?

**[Erste Schritte](/documents/Erste-Schritte.md)**  
Hello World! 

**[Eclipse IDE](/documents/Eclipse-IDE.md)**  
Ein Beschreibung der wichtigsten Funktionen der *Eclipse* IDE (**I**ntegrated **D**evelopment **I**nvironment oder *Entwicklungsumgebung*)

**[Variablen](/documents/Variablen.md)**  
Referenzen auf Werte und Objekte

**[Datentypen](/documents/Datentypen.md)**  
Alles zu primitiven und komplexen Datentypen

**[Casting](/documents/Casting.md)**  
Typumwandlung von primitiven und komplexen Datentypen

**[Methoden](/documents/Methoden.md)**  
Aufbau, Rückgabewerte, Parameter/Argumente, `return`-Statement

**[Operatoren](/documents/Operatoren.md)**  
Rechenoperatoren, Vergleichsoperatoren, logische Operatoren, Zuweisungsoperatoren 

**[Strings](/documents/Strings.md)**  
Zeichenketten in Java

**[Arrays](/documents/Arrays.md)**  
Eine grundlegende, lineare Datenstruktur

**[Konditionale](/documents/Konditionale.md)**  
`if`...`else if`...`else`, Ternary-Operator und `switch`

**[Schleifen](/documents/Arrays.md)**  
`while`, `do`...`while`, `for` (...und for-each)





-   [Objektorientierte Programmierung mit Java](#objektorientierte-programmierung-mit-java)
    -   [Was ist OOP?](#was-ist-oop)
    -   [Klassenattribute](#klassenattribute)
    -   [Sichtbarkeits- / Zugriffsmodifizierer](#sichtbarkeits---zugriffsmodifizierer)
    -   [this](#this)
    -   [super](#super)
    -   [Getter & Setter](#getter--setter)
    -   [Konstruktoren](#konstruktoren)
    -   [final](#final)
    -   [static](#static)
    -   [Konstanten in Java](#konstanten-in-java)
    -   [Vererbung](#vererbung)
        -   [Terminologie](#terminologie)
        -   [Wozu ist Vererbung gut?](#wozu-ist-vererbung-gut)
        -   [Wie funktioniert das?](#wie-funktioniert-das)
        -   [Casting von komplexen Datentypen](#casting-von-komplexen-datentypen)
        -   [instanceof](#instanceof)
        -   [Überschreiben von Methoden](#Überschreiben-von-methoden)
        -   [toString()](#tostring)
        -   [equals()](#equals)
        -   [Abstrakte Klassen und Methoden](#abstrakte-klassen-und-methoden)
        -   [Interfaces](#interfaces)
-   [Fehlerbehandlung](#fehlerbehandlung)
    -   [Exceptions und Errors](#exceptions-und-errors)
    -   [try-catch-finally](#try-catch-finally)
    -   [try-with-resources](#try-with-resources)
    -   [throws](#throws)
-   [Dokumentation JavaDoc](#dokumentation-javadoc)
-   [Input/Output](#inputoutput)
    -   [Streams](#streams)
    -   [Buffering](#buffering)
    -   [Reader und Writer](#reader-und-writer)
    -   [Objekt-Serialisierung (Serializable)](#objekt-serialisierung-serializable)
-   [Datenstrukturen II: Verkettete Listen](#datenstrukturen-ii-verkettete-listen)
    -   [Einfach verkettete Listen](#einfach-verkettete-listen)
    -   [Zweifach verkettete Listen](#zweifach-verkettete-listen)
-   [Generics](#generics)
-   [Datenstrukturen III: Das Collections Framework](#datenstrukturen-iii-das-collections-framework)
    -   [List](#list)
    -   [Set](#set)
    -   [Map](#map)
    -   [Object equality im Kontext von HashMaps/Sets](#object-equality-im-kontext-von-hashmapssets)






# Objektorientierte Programmierung mit Java

## Was ist OOP?

> siehe z.B. [hier](https://de.wikibooks.org/wiki/Java_Standard:_Objektorientierung_Sinn_und_Zweck)

-   Was ist eine **Klasse** (_konzeptuell, im Kontext d. OOP_)?
-   Was ist ein **Objekt** (_konzeptuell, im Kontext d. OOP_)?

![Mitarbeiter-Klasse](/assets/images/Employee-Class.png)  
Quelle: [_Wikimedia: Von Binz - Own Creation, CC BY-SA 4.0_](https://commons.wikimedia.org/w/index.php?curid=62707688)

## Klassenattribute

-   sind Variablen, die ihren Gültigkeitsbereich in der gesamten Klasse haben
-   werden im Klassenkörper deklariert
-   per Konvention _ganz oben_ im Klassenkörper
-   werden auch _Felder_ oder (engl.) _member variables_ genannt

## Sichtbarkeits- / Zugriffsmodifizierer

Sichtbarkeitsmodifizierer beeinflussen die Sichtbarkeit von Klassen, Klassenattributen und Methoden. Dabei sind Konstrukte markiert als ...

-   ... `private` sichtbar innerhalb der Klasse.
-   ... `(default)` sichtbar wie `private` und in dem Package, in dem sich die Klasse befindet (nicht aber in Unter-/Überpackages).
-   ... `protected` sichtbar wie `(default)` und in allen (erbenden) Unterklassen.
-   ... `public` überall sichtbar.
-   Mit diesen Modifizierern lässt sich [Datenkapselung](<https://de.wikipedia.org/wiki/Datenkapselung_(Programmierung)>) (order auch das Geheimnisprinzip) umsetzen.

```java
//... bei Klassen
public class User {

  //... bei Klassenattributen
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

-   einfache Methoden zum Lesen und Setzen von Klassenattributen
-   bieten Kontrolle über die Werte, die gesetzt werden und können ggf. Fehler ausgeben oder Werte vorher manipulieren
-   Entsprechende Klassenattribute werden `private` gesetzt, damit sie nur über die _Getter_ bzw. _Setter_ zugänglich sind ([_Datenkapselung / Geheimnisprinzip_](<https://de.wikipedia.org/wiki/Datenkapselung_(Programmierung)>)).
-   können sehr gut in Konstruktoren wiederverwendet werden, damit die Logik zum Setzen von Werten auf Klassenattribute an einem Ort ist

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
    // Logik zum Setzen der name-Klassenattribut
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

-   Konstruktoren bieten die Möglichkeit, die Initialisierung von Objekten zu kontrollieren und für die Initialisierung benötigte Daten einzufordern.
-   Jede Klasse hat (automatisch) einen Konstruktor, nämlich mindestens den default-Konstruktor (oder auch _no-argument-constructor_) ihrer Superklasse.
    -   auch der default-Konstruktor lässt sich explizit machen
-   Konstruktoren lassen sich überlagern (wie Methoden auch).
-   Wenn nur ein (oder mehrere) explizite/r Konstruktor/en **mit** Parametern existieren, dann hat die Klasse **keinen _no-argument-constructor_**

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

-   Es wird bei der Initialisierung automatisch ein Aufruf des _no-argument-constructor_ der Superklasse gemacht, falls diese keinen Konstruktor mit Prametern besitzt. Falls doch, **muss** jeder Konstruktor jeder Subklasse als erstes (!) diesen (oder einen) Konstruktor der Superklasse aufrufen: `super(param1, param2);`

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

-   markiert eine (benannte) Einheit (Variable, Methode oder Klasse), der nur ein einziges mal ein Wert (o.ä.) zugewiesen werden kann
-   finale Variablen
    -   primitive: Wert kann nicht geändert werden
    -   komplexe: Referenz kann nicht auf anderes Objekt geändert werden, aber Felder des Objektes können geändert werden
    -   Unterschied zu z.B. C++ `const`: finale Variablen können auch noch _nach_ der Deklaration einen Wert erhalten, aber eben nur ein mal!
-   finale Methoden können nicht überschrieben werden
-   finale Klassen können nicht erweitert werden

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

Im folgenden Beispiel kann der Name des Users nur einmal (bei Instanziierung der Klasse bzw. Erzeugung eines Objektes) gesetzt werden. Der Wert kann dann für dieses Objekt nicht mehr geändert werden. Die Instanziierung (Aufruf des Konstruktors) ist _der letzte mögliche Zeitpunkt zum Setzen eines Wertes für dieas finale Klassenattribut!_

```java
public class User {

  private final String name;

  public User(String name){
    this.name = name;
  }

}
```

## static

`static` bedeutet _"an die Klasse gebunden"_ im Gegensatz zu _"an das Objekt gebunden"_. Dies hat folgende Auswirkungen:

-   Statische _Methoden_ **und** _Klassenattribute_ sind **ohne** Instanz der Klasse verfügbar (sofern sie sichtbar sind!).
-   Statische _Klassenattribute_ haben klassenweit - also in jeder Instanz der Klasse - immer den selben Wert. Die werden auch _Klassenvariablen_ genannt!
-   In _statischen Methoden_ kann **nicht** auf _nicht-statische Klassenattribute_ zugegriffen werden, da diese (anders als die statische Methode) an Instanzen der Klasse gebunden sind und ohne Instanziierung der Klasse keinen Wert haben **können**.

**Beispiel für _Klassenvariablen_:**

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

**Beispiel für _statische Methoden_:**

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

Konstanten (hier: unveränderbare Felder, die über alle Instanzen hinweg den selben Wert haben) werden für gewöhnlich mit `static` _und_ `final` definiert und befolgen die Naming Conventions:

```java
// könnte auch "public" sein
private static final int THIS_IS_A_PRIVATE_CONSTANT = 2;
```

## Vererbung

Klassen können Eigenschaften (Klassenattribute / _features_) und Fähigkeiten (Methoden / _behavior_) von anderen Klassen _erben_.

### Terminologie

Die _vererbenden_ Klassen werden als **Superklassen**, **Elternklassen** oder **Überklassen** (Englisch _parent class_ oder _super class_) bezeichnet, die _erbenden_ hingegen respektive als **Subklassen**, **Kindklassen** oder **Unterklassen** (Englisch _child class_ oder _sub class_).  
Die _erbende_ Klasse **erweitert** die Klasse, von der sie erbt, da sie (normalerweise) Eigenschaften und Fähigkeiten besitzt, die über jene der Superklasse hinausgehen.

### Wozu ist Vererbung gut?

-   Eigenschaften und Fähigkeiten von Klassen werden zu Eigenschaften und Fähigkeiten aller Subklassen. So wird nicht nur Code wiederverwendet, sondern die Logik dieser Eigenschaften und Fähigkeiten lässt sich für _alle_ Subklassen an einer einzigen Stelle ändern, ohne den Code der Subklassen zu verändern.
-   Der Code modelliert reale Phänomene und Beziehungen auf semantisch klare Weise.
-   Sie ermöglicht [Polymorphie](<https://de.wikipedia.org/wiki/Polymorphie_(Programmierung)>) unter Typen, denn jede Instanz einer Klasse ist auch eine Instanz aller Superklassen.
-   ...

### Wie funktioniert das?

-   Alle Klassen erben automatisch von der Klasse `Object` (denn alle Instanzen von Klassen sind Objekte).
-   Mit dem Schlüsselwort `extends` wird eine Verwandschaft markiert.
-   Jede Klasse kann in Java nur von einer anderen Klasse erben. Es ist **keine Mehrfachvererbung** möglich!

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

-   möglich von Superklassen zu Subklassen (auf eigene Verantwortung)
-   unnötig von Subklassen zu Superklassen (wg. [Polymorphie](<https://de.wikipedia.org/wiki/Polymorphie_(Programmierung)>))
-   ...

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
> _Indicates that a method declaration is intended to override a method declaration in a supertype. If a method is annotated with this annotation type compilers are required to generate an error message unless at least one of the following conditions hold:_
>
> -   _The method does override or implement a method declared in a supertype._
> -   _The method has a signature that is override-equivalent to that of any public method declared in Object._
>
> &rarr; `@Override` ist also _nicht_ nötig, macht aber den Code eindeutiger und veranlasst den Compiler dazu, hilfreiche Fehlermeldungen zu liefern!

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

-   gibt eine möglichst sinnvolle textuelle (_String_-) Repräsentation des Objektes zurück, für das es aufgerufen wird
-   sollte in eigenen Klassen generell überschrieben werden, mindestens aber in Datenklassen/POJOs
-   falls `toString()` für den Typ des Objektes nicht überschrieben ist, wird (wie bei allen entsprechenden Methoden) die `toString()`-Methode der Superklasse - nämlich `Object` aufgerufen

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

Objekte werden **nicht** mit `==` verglichen, sondern mit `equals()`, denn `==` überprüft nicht die semantische Gleichheit von zwei Objekten, sondern bildet lediglich einen _wahren_ Ausdruck, wenn es sich um zwei Referenzen _auf das selbe Objekt_ handelt!  
Genau wie `toString()`, sollte `equals()` grundsätzlich überschrieben werden (mindestens in Datenklassen / POJOs).

> **(!) Achtung:**  
> Man versucht gern mit `"hallo" == "hallo"` zu beweisen, dass sich Strings in Java so nicht vergleichen lassen (aus oben genannten Gründen) und steht dann ziemlich dumm da, wenn der Ausdruck plötzlich doch `true` ergibt. Das liegt an Javas _[string interning](https://stackoverflow.com/questions/10578984/what-is-java-string-interning)_, wodurch identische Strings intern auf das selbe Objekt (und somit die selbe Speicher-Referenz) reduziert werden!

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

-   Abstrakte Klassen können und sollen nicht direkt instanziiert werden, da sie lediglich (teilweise implementierte) Vorlagen für ihre Subklassen sind.
-   Das Schlüsselwort `abstract` macht eine Klasse zu einer abstrakten Klasse.
-   Eine abstrakte Klasse _kann_ abstrakte Methoden enthalten, muss dies aber nicht.
-   Abstrakte Klassen werden benötigt, wenn sich mehrere Klassen gemeinsame Eigenschaften und Fähigkeiten teilen (also eine Superklasse brauchen), diese gemeinsamen Eigenschaften und Fähigkeiten aber noch keine sinnvolle/brauchbare Klasse ergeben, von der man Instanzen erzeugen können sollte.

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

-   werden mit `interface` eingeleitet (nicht mit `class`, siehe Beispiel unten)
-   werden von Klassen _implementiert_ (nicht erweitert) mit dem Schlüsselwort `implements`, oder von anderen Interfaces erweitert (in diesem Fall mit `extends`)
-   sind (wörtlich) eine **Schnittstelle** zu anderen Programmteilen
-   können nicht instanziiert werden
-   enthalten **keinerlei** Implementationen von Methoden, sondern nur abstrakte Methoden
    -   **Ausnahme:** Seit Java 8 gibt es [default methods](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)
-   Methoden sind hier automatisch `abstract` und `public`, wobei `public` meist trotzdem mit angegeben wird.

**Ein (minimales) Anwendungsbeispiel zu Interfaces:**  
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

-   In Programmen können Fehler (**Exceptions** und **Errors**) auftreten (man sagt auch, es wird ein Fehler _"geworfen"_)
-   Errors sind Fehler, die _nicht aufgefangen werden können_ (catch), sie bringen das Programm zum Absturz
-   Exceptions können _"aufgefangen"_ werden (catch), d.h. es kann mit Hilfe einer gut durchdachten Fehlerbehandlung mit dem Fehler umgegangen werden, sodass das Programm nicht unerwartet beendet werden muss
-   **Exception** und **Error** sind vom Typ _Throwable_ (deshalb _"Werfen"_ von Fehlern), es steckt eine ganze Klassenhierarchie hinter den verschiedenen Fehlertypen

![Exceptions/Errors Class Hierarchy](/assets/images/Exception-Hierarchy-Diagram.jpeg)  
Quelle: [programcreek.com](http://www.programcreek.com/2009/02/diagram-for-hierarchy-of-exception-classes/)

## try-catch-finally

-   Mit einem Code-Block aus `try`, `catch` und `finally` wird der Umgang mit potentiellen Exceptions definiert
-   `try`-Block enthält den Code, der eine Exception verursachen könnte.
-   `catch`-Block/Blöcke (einer oder mehrere) enthält den Code, der im Falle einer bestimmten Exception ausgeführt wird. Ein `catch`-Block wird nur dann ausgeführt, wenn die geworfene Exception
-   `finally`-Block (falls vorhanden, optional!) enthält den Code, der unabhängig von einem ausgelösten `catch`-Block **am Ende der Fehlerbehandlung** ausgeführt wird. Dabei spielt es keine Rolle, ob eine Fehler überhaupt aufgetreten ist!
-   Nach dem _try-catch(-finally)_-Block wird der darauf folgende Programm-Code weiter ausgeführt.
-   Falls im `try`-Block kein Fehler auftritt, werden alle `catch`-Blöcke ignoriert; ein etwaiges `finally` wird aber noch ausgeführt.
-   Falls kein `catch`-Block die geworfene Exception abfängt, wird trotzdem ein evtl. vorhandener `finally`-Block ausgeführt, bevor die Exception dann von der default-Fehlerbehandlung verarbeitet wird (Stack Trace über den ErrOut auf Konsole ausgeben).

![try-catch-finally-flow](/assets/images/java-try-catch-finally-flow.jpg)  
Quelle: [howtodoinjava.com](https://howtodoinjava.com/java/exception-handling/try-catch-finally/)

**Syntax und Beispiel:**

```java
  int[] numbers = {1,2,3};
  int number = 0;

  try {
    number = numbers[3]; //Index existiert nicht!
  } catch (ArrayIndexOutOfBoundsException ex){
    //auf diesen speziellen Fehler reagieren
    System.out.println("Dieser Index existiert nicht!");
  } catch (Exception ex) {
    //ansonsten: Auf jeden anderen Fehler reagieren
    System.out.println("Es ist ein Fehler aufgetreten!");
  } finally {
    //wird auf jeden Fall (ggf. am Ende der Fehlerbehandlung) ausgeführt:
    if (number == 0) number = -1;
    System.out.println(number);
  }
```

Dieser Code würde für `number = numbers[2]` einfach `3` ausgeben. Falls aber ein Fehler auftritt, etwa wie im Beispiel bei `number = numbers[3]`, wäre die Ausgabe `Dieser Index existiert nicht! -1` (Zeilenumbruch hier entfernt).

## try-with-resources

-   Spezialform der Fehlerbehandlung für im `try`-Block verwendete Ressourcen, die nach ihrer Verwendung wieder geschlossen werden müssen (etwa beim Arbeiten mit Datenströmen)
-   Der `try`-Block deklariert die entsprechende(n) Ressource(n) (mehrere Ressourcen durch `;` getrennt möglich!)
-   Normalerweise würde man die Ressourcen im `finally`-Block schließen - dies geschieht hier aber automatisch!
-   Diese Form des `try`-Blocks funktioniert mit allen Ressourcen, die `java.lang.AutoCloseable` implementieren (schließt `java.lang.Closeable` ein, denn `Closeable` erweitert `AutoCloseable`).

**Beispiel Datei einlesen OHNE try-with-resources**

```java
  BufferedReader br = null;
  String line;

  try {
    br = new BufferedReader(new FileReader("text.txt"));
    while ((line = br.readLine()) != null) {
      System.out.println("Zeile gelesen: " + line);
    }
  } catch (IOException e) {
    System.out.println("IOException im try-Block: " + e.getMessage());
  } finally {
    System.out.println("Ausführung finally-Block...");
    //so müsste man den Reader eigentlich schließen:
    try {
      if (br != null) {
        br.close();
      }
    } catch (IOException e) {
      System.out.println("IOException im finally-Block: " + e.getMessage());
    }
  }
```

**Beispiel Datei einlesen MIT try-with-resources**

```java
  String line;

  try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
    while ((line = br.readLine()) != null) {
      System.out.println("Zeile gelesen: " + line);
    }
  } catch (IOException e) {
    System.out.println("IOException im try-Block: " + e.getMessage());
  }
```

## throws

-   Eine Methode kann explizit dazu in der Lage sein, eine bestimmte Exception zu "werfen". Dies wird mit dem Schlüsselwort `throws` markiert.
-   Der Typ der Exception muss dabei angegeben werden.
-   Methoden, in denen diese "werfende" Methode aufgerufen wird, müssen eine Fehlerbehandlung vornehmen (Ausnahme: Exceptions vom Typ `RuntimeException`)!

```java
public int thisWillFail(int[] numbers) throws ArrayIndexOutOfBoundsException {
  return numbers[numbers.length];
}
```

# Dokumentation JavaDoc

-   ...

> An dieser Stelle gut zur Wiederholung geeignet:  
> **Projekt: [StringList](/projects/StringList)**

# Input/Output

> **Projekt: [IO-Benchmarking](/projects/IO-Benchmarking)**

## Streams

-   ...

## Buffering

-   ...

## Reader und Writer

-   ...

## Objekt-Serialisierung (Serializable)

-   ...

# Datenstrukturen II: Verkettete Listen

## Einfach verkettete Listen

-   ...

## Zweifach verkettete Listen

-   ...

# Generics

-   ...
-   Implementation am Beispiel der verketteten Liste
-   ...
    > **Projekt: [GenericList](/projects/GenericList)**

# Datenstrukturen III: Das Collections Framework

## List

-   ...

## Set

-   ...

## Map

-   ...

## Object equality im Kontext von HashMaps/Sets

-   Vertrag zwischen `equals()` und `hashCode()`
