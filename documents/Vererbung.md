# :family: Vererbung

Klassen können Eigenschaften (Klassenattribute / _features_) und Fähigkeiten (Methoden / _behavior_) von anderen Klassen _erben_.


## Wozu Vererbung?

-   Eigenschaften und Fähigkeiten von Klassen werden zu Eigenschaften und Fähigkeiten aller Subklassen. So wird nicht nur Code wiederverwendet, sondern die Logik dieser Eigenschaften und Fähigkeiten lässt sich für _alle_ Subklassen an einer einzigen Stelle ändern, ohne den Code der Subklassen zu verändern.
-   Der Code modelliert reale Phänomene und Beziehungen auf semantisch klare Weise.
-   Sie ermöglicht [Polymorphie](<https://de.wikipedia.org/wiki/Polymorphie_(Programmierung)>) unter Typen, denn jede Instanz einer Klasse ist auch eine Instanz aller Superklassen.
-   ...


## Terminologie

Die _vererbenden_ Klassen werden als **Superklassen**, **Elternklassen** oder **Überklassen** (Englisch _parent class_ oder _super class_) bezeichnet, die _erbenden_ hingegen respektive als **Subklassen**, **Kindklassen** oder **Unterklassen** (Englisch _child class_ oder _sub class_).  
Die _erbende_ Klasse **erweitert** die Klasse, von der sie erbt, da sie (normalerweise) Eigenschaften und Fähigkeiten besitzt, die über jene der Superklasse hinausgehen.


## extends

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


## super

Mit dem Schlüsselwort `super` referenziert eine Klasse ihre Superklasse (siehe [Vererbung](#vererbung))!


## instanceof

`instanceof` ist ein Operator, der die Zugehörigkeit eines Objektes zu einem bestimmten Typ überprüft:

```java
User user = new User("Tonky McWigglefritts");
System.out.println(user instanceof Person); // true
System.out.println(user instanceof Object); // true
System.out.println(user instanceof CharSequence); // false
System.out.println(user instanceof List); // false
```


## Überschreiben von Methoden

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


## Abstrakte Klassen und Methoden

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


## Interfaces

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
