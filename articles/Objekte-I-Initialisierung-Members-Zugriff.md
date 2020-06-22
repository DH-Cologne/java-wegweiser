# Objekte I: Initialisierung, Members, Zugriff

- [Objekte I: Initialisierung, Members, Zugriff](#objekte-i-initialisierung-members-zugriff)
  - [Initialisierung von Objekten: Der `new`-Operator](#initialisierung-von-objekten-der-new-operator)
  - [`this`](#this)
  - [Konstruktoren](#konstruktoren)
  - [Instanzvariablen](#instanzvariablen)
  - [Instanzmethoden](#instanzmethoden)
  - [Zugriffs-/Sichtbarkeitsmodifizierer](#zugriffs-sichtbarkeitsmodifizierer)
  - [Getter & Setter](#getter--setter)

## Initialisierung von Objekten: Der `new`-Operator

Ein neues Objekt, also eine neue Instanz einer Klasse, wird mit dem `new`-Operator erzeugt:

```java
User u;
u = new User();
```

Der Ausdruck `new User()`, der das eigentliche Objekt erzeugt, führt dabei automatisch den _no-argument constructor_ (default-Konstruktor) der Klasse `User` aus (siehe unten!).


## `this`

Mit dem Schlüsselwort `this` wird das aktuelle Objekt (Instanz der Klasse) referenziert bzw. referenziert sich ein Objekt selbst! Die Verwendung von `this` wird in den Abschnitten zu Konstruktoren sowie Gettern und Settern klarer.


## Konstruktoren

> :speech_balloon: Engl.: _constructors_

Konstruktoren bieten die Möglichkeit, die Initialisierung von Objekten zu kontrollieren und dafür benötigte Daten über Parameter "einzufordern". Man könnte sagen, dass Konstruktoren spezielle Methoden sind, die beim Initialisieren von Objekten ausgeführt werden, aber darüber wird gestritten.

> :woman_teacher: Bei der Initialisierung eines Objektes wird **immer genau ein** Konstruktor ausgeführt!

Jede Klasse hat, wenn sie keine anderen Konstruktoren besitzt, automatisch mindestens den default-Konstruktor (oder auch _no-argument-constructor_) ihrer Superklasse (falls ein solcher vorhanden ist!). Der default-Konstruktor ist, wenn er nicht explizit in den Programmcode geschrieben wird, nicht sichtbar und wird später einfach vom Compiler hinzugefügt. Er sieht wie folgt aus ...

```java
public class User {
  //default-Konstruktor
  public User(){
  }
}
```

... kann aber auch Code enthalten, wenn man ihn explizit einfügt:

```java
public class User {
  public User(){
    System.out.println("Ein User ist geboren!");
  }
}
```

Eine Objekt-Initialisierung `new User()` würde dann die Ausgabe `Ein User ist geboren!` erzeugen.

Konstruktoren lassen sich außerdem überladen - genau wie Methoden:

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

> :speech_balloon: `name` ist in diesem Beispiel eine Instanzvariable (siehe unten!).

Es sollte bei der Initialisierung ein Aufruf eines Konstruktors der Superklasse erfolgen. Falls diese keinen Konstruktor mit Parametern besitzt, wird mit `super()` ihr default-Konstruktor aufgerufen. Falls doch, **muss** jeder Konstruktor jeder Subklasse als erstes (!) diesen (oder einen) Konstruktor der Superklasse aufrufen: `super(param1, param2);`

> :speech_balloon: Mehr zum Schlüsselwort `super` erfährst du auf der Seite [Vererbung I: Grundlagen](Vererbung-I-Grundlagen.md)

```java
public class User {

  String name;

  public User(String name){
    super();
    this.name = name; // hier verhindert "this" einen Namenskonflikt!
  }

}

public class SpecialUser extends User {

  public SpecialUser(){
    super("default name string");
    //... was auch immer ...
  }

  public SpecialUser(String name){
    super(name);
    //... was auch immer ...
  }

}
```


## Instanzvariablen

> :speech_balloon: Engl.: _instance variables / (non-static) member variables_

Siehe [Variablen &rArr; Arten von Variablen &rArr; Instanzvariablen](Variablen.md#instanzvariablen)


## Instanzmethoden

> :speech_balloon: Engl.: _instance methods / non-static methods_

Als Instanzmethoden bezeichnet man in Java alle Methoden, die nicht statisch (`static`) sind. Diese Methoden sind _an das Objekt_ (also eine Instanz der Klasse) gebunden und können nicht aus einem statischen Kontext heraus aufgerufen werden.


## Zugriffs-/Sichtbarkeitsmodifizierer

Zugriffs-/Sichtbarkeitsmodifizierer beeinflussen die Sichtbarkeit von Klassen, Klassenattributen und Methoden. Dabei sind diese markiert als ...

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


## Getter & Setter

Bei Gettern und Settern handelt es sich um einfache Methoden zum Lesen und Setzen von Instanzvariablen (s.o.). Sie bieten Kontrolle über die Werte, die gesetzt werden und können ggf. Fehler ausgeben oder Werte vorher manipulieren.

Die entsprechenden Klassenattribute werden für gewöhnlich `private` gesetzt, damit sie nur über die _Getter_ bzw. _Setter_ zugänglich sind ([_Datenkapselung / Geheimnisprinzip_](https://de.wikipedia.org/wiki/Datenkapselung_(Programmierung))).

Getter und Setter können sehr gut in Konstruktoren wiederverwendet werden, damit die Logik zum Setzen von Werten an einem Ort zentralisiert ist:

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








<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>