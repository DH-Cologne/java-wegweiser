# `final`<!-- omit in toc -->

- [Finale Variablen](#finale-variablen)
- [Finale Methoden](#finale-methoden)
- [Finale Klassen](#finale-klassen)
- [Konstanten in Java](#konstanten-in-java)


Das Schlüsselwort `final` markiert eine (benannte) Einheit (Variable, Methode oder Klasse), der nur ein einziges mal ein Wert (o.ä.) zugewiesen werden kann. Dies hat in unterschiedlichen Kontexten unterschiedliche weitere Auswirkungen ...


## Finale Variablen

Finalen Variablen (also Variablen, die als `final` markiert sind), kann nur ein mal ein Wert zugewiesen und dann nicht mehr geändert werden, d.h. eine primitive `int`-Variable `number`...

```java
final int number = 42;
```

...wird immer den Wert `42` behalten (solange sie existiert). Der Wert einer Variablen mit komplexem Datentyp ist die Adresse des zugewiesenen Objektes. Dadurch wird der Wert einer `User`-Variable `user`...

```java
final User user = new User("Foo Bar", "foo.bar@example.org");
```

...immer die Referenz auf genau dieses `User`-Objekt sein.

> :speech_balloon: Finale Variablen können auch noch _nach_ der Deklaration einen Wert erhalten, aber eben nur ein mal!

Im folgenden Beispiel kann der Name des Users nur einmal (bei Instanziierung der Klasse bzw. Erzeugung eines Objektes) gesetzt werden. Der Wert dieser [Instanzvariable](Variablen.md#instanzvariablen) kann dann für dieses Objekt nicht mehr geändert werden. Die Instanziierung (Aufruf des Konstruktors) ist _der letzte mögliche Zeitpunkt zum Setzen eines Wertes für dieses finale Attribut!_

```java
public class User {

  private final String name;

  public User(String name){
    this.name = name;
  }

}
```


## Finale Methoden

> :warning: Dieser Abschnitt setzt Kenntnisse zu [objektorientierter Programmierung](../README.md#objektorientierte-programmierung-oop) voraus.

Auf Methoden hat die Verwendung von `final` eine etwas andere Wirkung, die sich semantsch aber gut anschließt: Finale [Methoden](Methoden.md) können **nicht** [überschrieben](Vererbung-I-Grundlagen.md#überschreiben-von-methoden) werden.

```java
public final void someMethod(){
  /*
  * Diese Methode kann in einer erweiternden (erbenden)
  * Klasse nicht überschrieben werden!
  */
}
```

Das ist dann eine gute Idee, wenn die konkrete Implementation dieser Methode wichtig für die Integrität der Klasse ist. Das ist besonders beim Design von :point_right: [APIs](../Glossar.md#api) relevant.


## Finale Klassen

> :warning: Dieser Abschnitt setzt Kenntnisse zu [objektorientierter Programmierung](../README.md#objektorientierte-programmierung-oop) voraus.

Sehr ähnlich wie bei Methoden wirkt sich `final` bei [Klassen](OOP-Klassen-und-Objekte.md) aus: Finale Klassen können **nicht** [erweitert](Vererbung-I-Grundlagen.md) werden.

```java
final class ImmutableClass {
  // Diese Klasse kann nicht erweitert werden!
}
```

Dies wird dann verwendet, wenn die Klasse nicht dafür gedacht ist, erweitert zu werden. Dafür kann es unterschiedliche Gründe geben, die z.B. [hier](https://programming.guide/java/when-to-create-a-final-class.html) oder [hier](https://stackoverflow.com/questions/5181578/what-is-the-point-of-final-class-in-java) nachzulesen sind. Diese Entscheidung ist besonders beim Design von :point_right: [APIs](../Glossar.md#api) relevant.


## Konstanten in Java

Konstanten sind Variablen mit unveränderbarem Wert. Also Variablen, die _nicht variabel_ sind und deren Wert nur ein einziges mal gesetzt werden kann. Java hat kein eigenes Schlüsselwort zum definieren von Konstanten (wie etwa `const` in anderen Sprachen). Stattdessen kann das bereits vorhandene Schlüsselwort `final` genutzt werden, um [finale Variablen](#finale-variablen) zu definieren - die ja im Grunde nichts anderes sind.

Klassischerweise werden Konstanten dazu genutzt, unveränderbare Eigenschaften von Klassen zu repräsentieren. Es bietet sich in Java deshalb die zusätzliche Verwendung von `static` an, um die "Konstante" an die Klasse zu binden. Die folgende Ausführung ist durchaus der Standard und sehr oft genau so anzutreffen:

```java
// könnten auch "public" sein!
private static final int THIS_IS_A_PRIVATE_CONSTANT = 2;
private static final double PI = 3.142;
```

> :speech_balloon: Mit den [Zugriffsmodfizierern](Objekte-I-Initialisierung-Members-Zugriff.md#sichtbarkeits-zugriffsmodifizierer) `public`, `private`, (...) können solche "Konstanten" öffentlich oder nur beschränkt sichtbar gemacht werden.

Den Java [Naming Conventions](Naming-Conventions.md) folgend werden solche "Konstanten" wie oben zu sehen im `UPPERCASE_MIT_UNTERSTRICHEN` geschrieben!

> :warning: Obwohl der Wert einer "Konstanten" (`static final`) unveränderbar ist, kann das von einer Konstante mit komplexem Datentyp referenzierte Objekt selbst verändert werden, indem sich Eigenschaften dieses Objektes ändern! Beispiel: `private static final User STANDARD_USER = new User("Max Mustermann");` ... und dann ... `STANDARD_USER.setName("Maximiliane Muserfrau");`. Die Konstante referenziert dann noch immer das selbe Objekt!




<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>