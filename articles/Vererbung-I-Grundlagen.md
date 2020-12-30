# Vererbung I: Grundlagen 👪<!-- omit in toc -->

Klassen können Eigenschaften (Klassenattribute / _features_) und Fähigkeiten (Methoden / _behavior_) von anderen Klassen _erben_.

- [Wozu Vererbung?](#wozu-vererbung)
- [Terminologie](#terminologie)
- [`extends`](#extends)
- [`super`](#super)
- [`instanceof`](#instanceof)
- [Überschreiben von Methoden](#überschreiben-von-methoden)

## Wozu Vererbung?

-   Eigenschaften und Fähigkeiten von Klassen werden zu Eigenschaften und Fähigkeiten aller Subklassen. So wird nicht nur Code wiederverwendet, sondern die Logik dieser Eigenschaften und Fähigkeiten lässt sich für _alle_ Subklassen an einer einzigen Stelle ändern, ohne den Code der Subklassen zu verändern.
-   Der Code modelliert reale Phänomene und Beziehungen auf semantisch klare Weise.
-   Sie ermöglicht [Polymorphie](<https://de.wikipedia.org/wiki/Polymorphie_(Programmierung)>) unter Typen, denn jede Instanz einer Klasse ist auch eine Instanz aller Superklassen.
-   ...


## Terminologie

Die _vererbenden_ Klassen werden als **Superklassen**, **Elternklassen** oder **Überklassen** (Englisch _parent class_ oder _super class_) bezeichnet, die _erbenden_ hingegen respektive als **Subklassen**, **Kindklassen** oder **Unterklassen** (Englisch _child class_ oder _sub class_).  
Die _erbende_ Klasse **erweitert** die Klasse, von der sie erbt, da sie (normalerweise) Eigenschaften und Fähigkeiten besitzt, die über jene der Superklasse hinausgehen.


## `extends`

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


## `super`

Mit dem Schlüsselwort `super` referenziert eine Klasse ihre Superklasse (siehe [Vererbung](#vererbung))!


## `instanceof`

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



