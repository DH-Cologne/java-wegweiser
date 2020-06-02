# Methoden :clamp:


## Definition

Zunächst muss an dieser Stelle geklärt werden, was _Funktionen_ sind: _Funktionen_ sind Code-Blöcke, die einen Namen tragen und über diesen "aufgerufen" (engl.: _call_) werden können. Über Parameter können einer Funktion Daten übergeben werden, die sie verarbeiten (oder nutzen) soll. Optional kann eine Funktion nach ihrer Ausführung auch Daten "zurückgeben" (engl.: _return_).

Eine **Methode** ist eine _Funktion_, die an ein Objekt (nicht-statisch) oder eine Klasse (statisch) gebunden ist. Dadurch hat eine Methode Zugriff auf die Eigenschaften und Fähigkeiten eines Objektes (nicht-statisch) oder einer Klasse (statisch).  
Da in Java **alles** in Klassen passiert - Java ist [fast](https://de.wikipedia.org/wiki/Java_(Programmiersprache)#Objektorientierung) völlig objektorientiert - gibt es in Java **nur Methoden** bzw. alle Funktionen in Java **sind Methoden**.

> :speech_balloon: **Übrigens:** Eine gute Diskussion dieser Unterscheidung findet sich in dieser [SO-Frage](https://de.wikipedia.org/wiki/Java_(Programmiersprache)#Objektorientierung)!


## Aufbau

Eine gewöhnliche (nicht-statische) Methode hat den folgenden Aufbau:

```java
public String greet(String name){
    return "Good day, " + name + "!";
}
```

Der Reihe nach gelesen ist ...

1. ... `public` ein Sichtbarkeits- oder Zugriffsmodifizierer (es könnte auch `private`, `protected` oder keiner sein).
2. ...`String` der Rückgabetyp der Methode (`void` würde markieren, dass diese Methode keinen Rückgabety hat).
3. ... `greet` der Name der Methode. Methoden werden in Java **immer** kleingeschrieben (im [lowerCamelCase](https://de.wikipedia.org/wiki/Binnenmajuskel#Programmiersprachen))!
4. ... `String` der Datentyp des einzigen Parameters der Methode.
5. ... `name` der Name der Variable, mit der der Parameter innerhalb der Methode referenziert werden kann.
6. ... `return` das Schlüsselwort, welches die Methode beendet und die Rückgabe festlegt. 

Aufrufen ließe sich diese Methode z.B. so:

```java
System.out.println("Foo: " + greet("Bar"));
System.out.println("Bar: " + greet("Foo"));
```

Ein (zugegeben) etwas verspieltes, aber auch freundliches Beispiel - es erzeugt die folgende Ausgabe:

```
Foo: Good day, Bar!
Bar: Good day, Foo!
```


## return

Das Schlüsselwort `return` (zu sehen im obigen Beispiel) hat zwei Aufgaben: Zum einen beendet es sofort die Methode (es muss nicht am Ende der Methode stehen und es kann auch mehrere `return`-Statements geben!). Zum anderen legt es fest, was genau die Methode zurückgibt. In Methoden mit einem Rückgabetyp folgt auf ein `return` immer die Rückgabe (siehe Beispiel oben).

Daraus folgt, dass eine Methode **mit** Rückgabetyp auch ein (oder mehrere) `return`-Statement(s) besitzen **muss**. Eine Methode **ohne** Rückgabetyp _kann_ zum frühzeitigen Beenden der Methode ein (oder mehrere) `return`-Statements (dann ohne Rückgabe) besitzen.


## Überladen von Methoden

Es kann in der selben Klasse mehrere Methoden mit dem selben Namen geben - allerdings nur, wenn sich diese Methoden in der Anzahl oder dem Datentyp ihrer Parameter unterscheiden:

```java
public void something(int number){
    // ... Code in der Methode ...
}

public void something(float number){
    // ... Code in der Methode ...
}

public void something(int number1, int number2){
    // ... Code in der Methode ...
}
```

Dies wird vor allem dann genutzt, wenn eine (eigentlich einzelne) Methode Parameter unterschiedlichen Typs verarbeiten können soll. Meist ruft dann (nach einer Umwandlung oder Verarbeitung der Parameter) die eine Methode eine andere gleichnamige Methode auf.

> :speech_balloon: **Übrigens:** Das Überladen ist auch bei [Konstruktoren](Konstruktoren.md) möglich (und sogar sehr üblich!).


<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>