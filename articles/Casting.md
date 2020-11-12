# Casting :currency_exchange:<!-- omit in toc -->

(auch: *Typumwandlung*)

Beim Casting wird ein Wert eines bestimmten [Datentyps](Datentypen.md) in einen anderen Datentyp umgewandelt

- [... bei primitiven Datentypen](#-bei-primitiven-datentypen)
- [... bei komplexen Datentypen](#-bei-komplexen-datentypen)


## ... bei primitiven Datentypen

**Implizite Typumwandlung** (_upcasting_)

Bei der _impliziten Typumwandlung_ wird ein "niederwertiger" Typ einem "höherwertigen" Typ zugewiesen (die Umwandlung geschieht automatisch, oder eben "implizit"):

```java
int i = 2;
double d = i;
```

![upcast](../assets/images/typecast_1.jpg)  
> _Grafik: [#](../assets/images/typecast_1.jpg), Quelle: [java-tutorial.org](https://www.java-tutorial.org/typecasting.html)_


**Explizite Typumwandlung** (_downcasting_)

Bei der _expliziten Typumwandlung_ wird ein "höherwertiger" Typ in "niederwertigen" Typ umgewandelt. Dies geschieht mittels cast-Operators. Der cast-Operator setzt sich aus dem Ziel-Typ in runden Klammern zusammen:

```java
double d = 2.2d;
int i = (int) d;
```

![downcast](../assets/images/typecast_2.jpg)  
> _Grafik: [#](../assets/images/typecast_2.jpg), Quelle: [java-tutorial.org](https://www.java-tutorial.org/typecasting.html)_


## ... bei komplexen Datentypen

> :speech_balloon: engl.: _Reference Casting_

> **:warning: Achtung!** Der folgende Abschnitt ist erst relevant, wenn du bereits mit Vererbung und Klassenhierarchien vertraut bist!

Beim Casting von komplexen Datentypen gibt es ebenfalls _implizite_ und _explizite_ Umwandlung - genau wie bei den primitiven Datentypen.

**Implizite Typumwandlung** (_upcasting_)

> :link: Siehe [Polymorphie](https://de.wikipedia.org/wiki/Polymorphie_(Programmierung))

Die _implizite Typumwandlung_ bei komplexen Datentypen ist eine Umwandlung von einer Subklasse (Spezialisierung oder Erweiterung) zu  einer ihrer Superklassen (Abstraktion der Subklasse). Es wird hierbei nicht wirklich der Datentyp des Objektes umgewandelt, sondern lediglich ein Bezeichner mit einem "niederwertigen" Datentyp verwendet:

```java
SpecialUser specialUser = new SpecialUser();
User user = specialUser; // implizite Typumwandlung (Polymorphie)
```

> :warning: Da im obigen Beispiel die Variable `user` den Datentyp `User` besitzt, kann diese Referenz auf das Objekt (das ja eigentlich vom Typ `SpecialUser` ist) **ausschließlich** auf die Eigenschaften der Klasse `User` zurückgreifen. Alle Erweiterungen, die in `SpecialUser` definiert sind, sind durch die Verwendung des niederen Typs nicht zugänglich!  

> :woman_teacher: Falls die Klasse `SpecialUser` eine Methode der Klasse `User` überschreibt (_Overriding_) und diese Methode über einen Bezeichner mit Typ `User` aufgerufen wird, wird **trotzdem die Methode aus `SpecialUser` aufgerufen**!

**Explizite Typumwandlung** (_downcasting_)

Die Umwandlung von Superklassen zu Subklassen muss explizit geschehen (ausgehend vom obigen Beispiel):

```java
SpecialUser specialUser = (SpecialUser) user;
```

Oder, wenn nur einmalig eine Methode des höherwertigen Typs (Subklasse) genutzt werden soll:

```java
((SpecialUser) user).specialUserMethod("I need this method once!");
```

Natürlich geschieht das Downcasting bei komplexen Typen "auf eigene Gefahr": Man sollte sich sehr sicher sein, dass das Objekt wirklich vom höheren Typ ist! Dafür kann der [`instanceof`-Operator](Vererbung-I-Grundlagen.md) nützlich sein:

```java
if (user instanceof SpecialUser){
    ((SpecialUser) user).specialUserMethod("I need this method once!");
}
```

> :man_teacher: Im Falle einer ungültigen Typumwandlung wirft der betreffende Code eine [**ClassCastException**](https://stackoverflow.com/questions/907360/explanation-of-classcastexception-in-java).






<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>