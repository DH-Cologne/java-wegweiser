# Variablen :label:

Eine Variable dient dazu, Werte oder Objekte zu speichern und sie über einen _Bezeichner_, den _Variablennamen_ referenzierbar (oder auch: _ansprechbar_) zu machen. Technisch gesehen hat eine Variable in Java entweder einen [primitiven Wert](Datentypen.md#primitive-datentypen) oder hält die Adresse eines [Objektes](OOP-Einfuehrung.md) bereit.

> :construction: **TODO:**  Alles! Siehe README!
> -   sind Bezeichner für Werte in bestimmten Speicherbereichen, die mit der Variable angesprochen werden können
> -   Java ist streng typisiert, Deklaration daher immer unter Angabe des Datentyps
> -   naming conventions (lowerCamelCase)
> -   Gültigkeitsbereiche
>     -   Methode, Kontrollstruktur oder Klasse (siehe [Klassenattribute](#klassenattribute))


## Typsicherheit

> :speech_balloon: **eng.:** type safety

Java ist eine _stark typisierte_ Sprache. Das bedeutet, dass alle Variablen in Java **einen bestimmten Datentyp** haben und sich dieser **nicht ändern** kann. Dieser Umstand gewährleistet _Typsicherheit_, d.h. man kann sich darauf verlassen, dass das Objekt (oder der Wert), auf den eine Variable verweist, den Datentyp der entsprechenden Variable besitzt.

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

<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>