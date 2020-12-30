# Generics 📌<!-- omit in toc -->

- [Das Problem](#das-problem)
- [Die Lösung: Generics](#die-lösung-generics)
- [Type Erasure](#type-erasure)
- [Type Wildcards](#type-wildcards)
- [Generische Methodendefinitionen](#generische-methodendefinitionen)

Generics in Java ermöglichen es einer Klasse oder Methode mit Objekten arbiträrer Datentypen zu arbeiten und dennoch Typsicherheit (zur 🔭 [compile-time](../Glossar.md#compile-time)) zu gewährleisten. Das bringt es auf den Punkt, ist aber nicht gleich einleuchtend. Versuchen wir es mit einem Beispielszenario ...


## Das Problem

Angenommen, eine fiktive Datenstruktur `BadList` hat die Aufgabe, Objekte in einer Art Liste zu verwalten.  
Um neue Objekte in die Liste aufzunehmen, besitzt `BadList` eine Methode `add(Object o)`. Der Datentyp `Object` ist hier deshalb gewählt, weil unsere `BadList` natürlich nicht nur für Objekte eines einzigen Typs einsetzbar sein soll:

```java
public class BadList {
    // ...
    public void add(Object o){
        // ...
    }
}
```

Wie genau die Liste intern funktioniert, soll uns hier egal sein. Aber der skizzierte Ansatz stellt uns bereits vor ein Problem: Wenn wir von dieser Liste später ein Objekt abrufen wollen - etwa mit einem Aufruf wie `list.get(0)` - dann bekommen wir natürlich ein `Object` zurück. Wir müssten dieses dann [casten](Casting.md), um Zugriff auf die Methoden des konkreten Datentyps zu erhalten. Aber welcher ist das?

Jede Instanz unserer Liste sollte also nur Objekte eines bestimmten Datentyps aufnehmen können. Aber wie soll das gehen? Wenn wir statt `Object` den konkreten Datentyp - z.B. `Student` - einsetzen, funktioniert unsere Liste ausschließlich mit `Student`-Objekten. Wir müssten für jeden zu verwaltenden Datentyp eine neue Liste programmieren.


## Die Lösung: Generics

> Hier am Beispiel generischer Klassendefinitionen

Eine Lösung für solche Situationen bieten Generics: Mit ihnen kann der Datentyp, mit dem eine Klasse oder Methode arbeiten soll, an mehreren Stellen im Code "gleichgeschaltet" werden, ohne diesen direkt festzulegen (eben ein _generischer_ Typ). Dafür werden Platzhalter benutzt, die den später eingesetzten Datentyp markieren (hier `T`):

```java
public class GoodList<T> {
    // ...
    public void add(T o){
        // ...
    }
}
```

Die Syntax für die Definition des Platzhalters ist also `<T>` (der Platzhalter in spitzen Klammern). In der restlichen Klasse (bzw. Methode, siehe unten!) ist `T` dann als Typ verfügbar (siehe Parameter `T o` in der Methode oben!).

Um diese Liste zu benutzen, wird nun bei ihrer Initialisierung der zu verwaltende Datentyp festgelegt:

```java
GoodList<Student> students = new GoodList<Student>();
students.add(new Student()); // hinzufügen (Beispiel!)
Student s = students.get(0); // abrufen (Beispiel!)
```

Es muss hier keine Typumwandlung (casting) mehr stattfinden. Wir haben nun eine echte _generische_ Datenstruktur, die für den Typen-Platzhalter `T` den Typ `Student` verwendet!

> ⚠️ Generics in Java funktionieren [nur mit komplexen Datentypen](https://www.baeldung.com/java-generics#generics-primitive-data-types)!

Bei der Initialisierung der generischen Klasse kann der Datentyp auch weggelassen werden, wenn er in der Deklaration der zugehörigen Variable angegeben wurde (sog. _diamond operator_):

```java
GoodList<Student> students = new GoodList<>();
```

Mehrere Typen-Platzhalter können durch Kommata getrennt definiert werden:

```java
public class Something<X, Y> {
    // ...
}
```

Natürlich sollte gut [dokumentiert](Javadoc.md) sein, wofür welcher Typ genutzt wird.

> 💬 Wann nutze ich welchen Platzhalter? Hier eine [Antwort](https://stackoverflow.com/questions/6008241/what-is-the-difference-between-e-t-and-for-java-generics)!


## Type Erasure

Generics existieren nur zur _compile time_, d.h. **vor** dem Kompilieren des Codes. Dadurch kann der Kompiler auf einen falsch verwendeten Datentyp (`Teacher`-Objekt wird einer Liste für `Student`-Objekte hinzugefügt o.ä.) bei der Kompilierung des Programmes reagieren und einen Fehler erzeugen. _Nach_ der Kompilierung steht die Information des festgelegten Datentyps allerdings nicht mehr zu Verfügung, weil dieser währenddessen durch ein Verfahren namens [type erasure](https://en.wikipedia.org/wiki/Generics_in_Java#Problems_with_type_erasure) entfernt wurde.  
Unsere Liste aus dem Beispiel oben verwaltet nach der Kompilierung also tatsächlich wieder `Object`-Instanzen!


## Type Wildcards

Um Spielraum für den verwendeten Datentyp zu ermöglichen, kann `?` als Wildcard benutzt werden. Weil diese völlige Freiheit dann aber auch wieder völlige Unklarheit über den Datentyp bedeuten würde, wird der Typ üblicherweise _nach oben oder unten begrenzt_, d.h. es wird festgelegt, dass der Datentyp entweder eine bestimmte Klasse erweitern muss (`extends`) oder eben eine Superklasse von einer bestimmten Klasse sein muss (`super`). Die Syntax hierfür ist dann ...

```java
public class Something<? extends Foo> {
    // ...
}
```

... bzw. ...

```java
public class Something<? super Foo> {
    // ...
}
```


## Generische Methodendefinitionen

Es ist außerdem möglich, die Typen von Rückgaben und Parametern von Methoden generisch zu gestalten:

```java
public <T> Whoop<T, T> bar(T param) {
    return new Whoop<T, T>(param, param);
}
```

Hier stellt die erste Erwähnung von `T`, nämlich `<T>`, die deklaration dieses Platzhalters dar. Alle weiteren Verwendungen von `T` sind dann tatsächliche Platzhalter. Dies führt zu folgendem Verhalten (ausgehend vom Beispiel oben):

```java
Yeah y = new Yeah();
foo.bar(y); // Rückgabe ist ein Whoop<Yeah, Yeah>
```


> 🔗 Siehe auch [hier](https://www.baeldung.com/java-generics).

> 🔗 ... und natürlich [hier](https://docs.oracle.com/javase/tutorial/java/generics/index.html) und [hier](https://docs.oracle.com/javase/tutorial/extra/generics/).

> 🔗 Java Generics [FAQ](http://www.angelikalanger.com/GenericsFAQ/JavaGenericsFAQ.html)



