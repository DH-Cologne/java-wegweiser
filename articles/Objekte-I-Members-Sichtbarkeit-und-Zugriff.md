# Objekte I: Members, Sichtbarkeit und Zugriff

> :construction: **TODO:**  
> - gründlichere Formulierungen in ganzen Sätzen
> - weitere Inhalte aus der Übersicht in der README!



## Instanzvariablen

> :speech_balloon: Engl.: _instance variables / (non-static) member variables_

Siehe [Variablen &rArr; Arten von Variablen &rArr; Instanzvariablen](Variablen.md#instanzvariablen)


## Instanzmethoden

> :speech_balloon: Engl.: _instance methods / non-static methods_

Siehe [Methoden &rArr; ]


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

Mit dem Schlüsselwort `this` wird das aktuelle Objekt (Instanz der Klasse) referenziert bzw. referenziert sich ein Objekt selbst!

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

> :speech_balloon: Engl.: _constructors_

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








<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>