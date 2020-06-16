# Variablen :label:

Eine Variable dient dazu, Werte oder Objekte zu speichern und sie über einen _Bezeichner_, den _Variablennamen_ referenzierbar (oder auch: _ansprechbar_) zu machen. Technisch gesehen hat eine Variable in Java entweder einen [primitiven Wert](Datentypen.md#primitive-datentypen) oder hält die Adresse eines [Objektes](OOP-Einfuehrung.md) bereit.

> :warning: _Variablennamen_ werden in Java [per Konvention](Naming-Conventions.md) immer im [lowerCamelCase](Naming-Conventions.md#variablen) geschrieben!


## Typsicherheit

> :speech_balloon: **eng.:** type safety

Java ist eine _stark typisierte_ (oder auch _streng typisierte_) Sprache. Das bedeutet, dass alle Variablen in Java **einen bestimmten Datentyp** haben und sich dieser **nicht ändern** kann. Dieser Umstand gewährleistet _Typsicherheit_, d.h. man kann sich darauf verlassen, dass das Objekt (oder der Wert), auf den eine Variable verweist, den Datentyp der entsprechenden Variable besitzt.

> :speech_balloon: Das geht auch anders: Sprachen wie Python, JavaScript oder PHP sind nicht- oder lose typisiert - der Datentyp einer Variable kann sich dort ändern bzw. ist nicht festgelegt.


## Deklaration und Zuweisung

Als **Deklaration** einer Variable bezeichnet man den Vorgang des Festlegens von Datentyp und Variablenname. Dies geschieht grundsätzlich in der genannten Reihenfolge, also erst der Datentyp, dann der Variablenname:

```java
String userName
```

Das Beispiel zeigt die Deklaration einer String-Variable mit dem Namen `userName`. Als alleinstehende Anweisung etwa würde sie (wie jede Anweisung) mit einem `;` abschließen:

```java
String userName;
```
Die Deklaration einer Variable kann aber in unterschiedlichen Kontexten stattfinden (siehe [Arten von Variablen](#arten-von-variablen)).

Die explizite **Zuweisung** eines Wertes zu einer Variablen geschieht grundsätzlich mit dem _Zuweisungsoperator_: `=`

```java
String userName;
userName = "melanie_1959";
```

Oder als **ein** Statement / Anweisung:

```java
String userName = "melanie_1959";
```

Eine Variable kann allerdings auch auf anderem Wege einen Wert erhalten (siehe [Arten von Variablen](#arten-von-variablen)).


## Arten von Variablen


### Instanzvariablen

> :speech_balloon: Engl.: _instance variables / (non-static) member variables_

Instanzvariablen sind mit einem Objekt (also einer Instanz einer Klasse) verknüpft. Sie werden im Klassenkörper deklariert und sind nicht statisch, also nicht mit `static` markiert und können auch nicht aus einem statischen Kontext heraus angesprochen werden. Der [Gültigkeitsbereich](https://de.wikipedia.org/wiki/Variable_(Programmierung)#Scope) einer Instanzvariable entspricht dem gesamten Klassenkörper, bzw. (bei Verwendung außerhalb der Klasse bei Instanzvariablen die nicht `private` sind) dem Gültigkeitsbereich der Referenz auf die Instanz.

``` java
public class User {
    private String userName; // eine Instanzvariable

    // ...
}
```


### Klassenvariablen

Klassenvariablen (oder: _statische Variablen_) sind an die Klasse geknüpft, in der sie deklariert werden. Sie werden mit dem Schlüsselwort `static` als "statisch" markiert, d.h. dass ihr Wert in allen Instanzen der Klasse **immer der selbe** ist und dass auf sie **ohne eine Instanz der Klasse zugegriffen werden kann** (sofern dies nicht durch den [Sichtbarkeitsmodfizierer](Objekte-I-Members-Sichtbarkeit-und-Zugriff.md#sichtbarkeits-zugriffsmodifizierer) verhindert wird).

``` java
public class ImageLoader {
    public static String imagesPath; // eine Klassenvariable

    // ...
}
```


### Parameter / Argumente

Ein Methoden-Parameter oder -Argument ist eine Variable, die einen an eine Methode übergebenen Wert referenziert. Der Gültigkeitsbereich ist der gesamte Methodenkörper:

``` java
public void sayName(String name){
    System.out.println("The name is " + name);
}
```

In diesem Beispiel besteht von außerhalb der Methode `sayName()` kein Zugriff auf die Variable `name`, die ein Parameter dieser Methode ist. Diese Variablen existieren nur während der Ausführung der Methode!


### Lokale Variablen

Als lokale Variablen werden Variablen bezeichnet, die innerhalb eines Methodenkörpers deklariert werden. Genau wie bei Parametern / Argumenten entspricht ihr Gültigkeitsbereich dem Methodenkörper und sie existieren nur während der Ausführung der Methode.

``` java
public void combineNames(String firstName, String lastName){
    String fullName = firstName + " " + lastName;
    System.out.println("The full name is " + fullName);
}
```




<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>