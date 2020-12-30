# Objekte I: Initialisierung, Members, Zugriff<!-- omit in toc -->

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

> 💬 Engl.: _constructors_

Konstruktoren bieten die Möglichkeit, die Initialisierung von Objekten zu kontrollieren und dafür benötigte Daten über Parameter "einzufordern". Man könnte sagen, dass Konstruktoren spezielle Methoden sind, die beim Initialisieren von Objekten ausgeführt werden, aber darüber wird gestritten.

> 👩‍🏫 Bei der Initialisierung eines Objektes wird **immer genau ein** Konstruktor ausgeführt!

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

> 💬 `name` ist in diesem Beispiel eine Instanzvariable (siehe unten!).

Es sollte bei der Initialisierung ein Aufruf eines Konstruktors der Superklasse erfolgen. Falls diese keinen Konstruktor mit Parametern besitzt, wird mit `super()` ihr default-Konstruktor aufgerufen. Falls doch, **muss** jeder Konstruktor jeder Subklasse als erstes (!) diesen (oder einen anderen) Konstruktor der Superklasse aufrufen: `super(param1, param2);`

> 💬 Mehr zum Schlüsselwort `super` erfährst du auf der Seite [Vererbung I: Grundlagen](Vererbung-I-Grundlagen.md)

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

> 💬 Engl.: _instance variables / (non-static) member variables_

Siehe [Variablen &rArr; Arten von Variablen &rArr; Instanzvariablen](Variablen.md#instanzvariablen)


## Instanzmethoden

> 💬 Engl.: _instance methods / non-static methods_

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

Bei Gettern und Settern handelt es sich um Methoden zum Lesen bzw. Schreiben von Instanzvariablen (s.o.) oder ähnlichen Werten, die den Zustand eines Objektes beschreiben.

Getter geben entweder einfach den Wert einer Instanzvariable zurück, oder generieren den gewünschten Wert aus anderen Werten:

```java
public class User {

  private String firstName;
  private String lastName;
  // ...

  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return firstName;
  }

  public String getFullName(){
    return firstName + " " + lastName;
  }

  // ...

}
```

Setter hingegen bieten Kontrolle über die Werte, die für Instanzvariablen gesetzt werden können. Sie geben ggf. Fehler aus wenn ein ungültiger Wert übergeben wird oder manipulieren diesen vor der Zuweisung:

```java
public class User {

  private String firstName;
  // ...

  public void setFirstName(String firstName){
    if (firstName.length() > 64){
      System.err.println("First name too long. Trimming.");
      firstName = firstName.substring(0, 63);
    }
    this.firstName = firstName;
  }

  // ...

}
```

Klassenattribute werden für gewöhnlich `private` gesetzt, damit sie von außerhalb entweder **nicht** (weil nicht nötig) oder eben **nur über die _Getter_ bzw. _Setter_** zugänglich sind ([_Datenkapselung / Geheimnisprinzip_](https://de.wikipedia.org/wiki/Datenkapselung_(Programmierung))).

Getter und Setter können sehr gut in Konstruktoren wiederverwendet werden, damit die Logik zum Setzen von Werten an einem Ort zentralisiert ist:

```java
public class User {

  private String firstName;
  // ...

  public User(String firstName){
    setFirstName(firstName); // Setter in Konstruktor nutzen
  }

  // ...

  public void setFirstName(String firstName){
    // Logik zum Setzen der name-Klassenattribut
    // Beispiel: Wert darf nicht null sein
    if (firstName == null) {
      // Oder wie auch immer man reagieren möchte...
      System.err.println("That's not a real name!");
    } else {
      this.firstName = firstName;
    }
  }

  // ...

}
```

> 🔗 **Tipp:** Zum Thema Getter und Setter sind [diese Frage](https://softwareengineering.stackexchange.com/questions/416386/i-still-don-t-fully-understand-getters-setters) aus dem StackExchange-Netzwerk (zu Softwareengineering) und ihre akzeptierte Antwort _sehr lesenswert_!






