# :building_construction: Klassen und Objekte

## Was ist eine Klasse?

...

## Was ist ein Objekt?

...

## Erzeugen eines Objektes: Der `new`-Operator

...

## Klassenattribute

-   sind Variablen, die ihren Gültigkeitsbereich in der gesamten Klasse haben
-   werden im Klassenkörper deklariert
-   per Konvention _ganz oben_ im Klassenkörper
-   werden auch _Felder_ oder (engl.) _member variables_ genannt

## Sichtbarkeits-/Zugriffsmodifizierer

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