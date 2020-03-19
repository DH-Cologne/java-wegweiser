# Der wachsende Reader zu Softwaretechnologie: Java

Ergänzende **Lernressource**, **Nachschlagewerk** und **Wegweiser** für TeilnehmerInnen des Softwaretechnologie-Moduls (_BM4_) der Studiengänge **Informationsverarbeitung** und **Medieninformatik** des **IDH** _(Institut für Digital Humanities, Universität zu Köln)_.

> Work in progress. Forever. :snail:

[&ddarr; **Direkt zum Inhalt** &ddarr;](#inhalt)


## Was ist das hier bzw. was ist es nicht?

Dies ist eine erläuterte Übersicht über die Inhalte des Moduls _Softwaretechnologie: Java_ (und einige mehr). Es handelt sich _nicht_ um eine vollständige Lösung zum Erlernen der behandelten Konzepte (Lehrbücher gibt es genug), sondern um eine ergänzende Ressource zur Wiederholung und Orientierung für TeilnehmerInnen des Moduls. Dieses Repository unterscheidet sich von einem Java-Lehrbuch also eben durch die bewusste Reduktion des Inhalts auf die für das Modul relevanten Inhalte und deren möglichst effektive Erläuterung (effektiv im Gegensatz zu ausschweifend!).

Es finden sich zwischen den Zeilen außerdem Code-Beispiele, unterstützende Materialien, Links zu weiterführenden Ressourcen (mit `#` gekennzeichnet), sowie passende Übungs-Aufgaben (siehe Ordner `projects`).

## Mitwirken / Contribution

In guter Open Source-Manier ist jede\*r TeilnehmerIn dazu eingeladen, dieses Repository mitzugestalten, inhaltlich zu erweitern oder auch einfach nur etwaige Fehler zu korrigieren.  
Es wird darum gebeten, hierfür den üblichen Weg über einen Fork &rarr; neuer Branch &rarr; Pull Request zu gehen oder (einfacher) die Funktion zur direkten Editierung von Markodown-Files in GitHub zu nutzen (diese erstellt automatisch einen Pull Request).



## Inhalt


### Einstieg

#### [Die Programmiersprache Java](/documents/Die-Programmiersprache-Java.md)
Warum Java?
Warum lieber nicht?
Was unterscheidet Java von anderen Programmiersprachen?
Was ist das *Java Ecosystem*?

#### [Erste Schritte](/documents/Erste-Schritte.md)
*Hello World*;
Packages

#### [Eclipse IDE](/documents/Eclipse-IDE.md)
Ein Beschreibung der wichtigsten Funktionen der *Eclipse* IDE (**I**ntegrated **D**evelopment **I**nvironment oder *Entwicklungsumgebung*)

#### [Variablen](/documents/Variablen.md)
Referenzen auf Werte und Objekte

#### [Primitive Datentypen](/documents/Primitive-Datentypen.md)
Alles zu primitiven Datentypen

#### [Casting](/documents/Casting.md)
Typumwandlung von primitiven und komplexen Datentypen

#### [Methoden](/documents/Methoden.md)
Rückgabewerte;
Parameter/Argumente;
`return`-Statement;
Überlagerung

#### [Operatoren](/documents/Operatoren.md)
Rechenoperatoren;
Vergleichsoperatoren;
logische Operatoren;
Zuweisungsoperatoren

#### [Arrays](/documents/Arrays.md)
Eine grundlegende, lineare Datenstruktur  

#### [Strings](/documents/Strings.md)
Alles rund um Zeichenketten in Java

#### [Konditionale](/documents/Konditionale.md)
`if`...`else if`...`else`;
Ternary-Operator;
`switch`

#### [Schleifen](/documents/Arrays.md)
`while`;
`do`...`while`;
`for` (...und for-each)


### Objektorientierte Programmierung (OOP)

#### [OOP: Eine Einführung](/documents/OOP-Eine-Einführung.md)
Was ist OOP?
Wann und wozu braucht man das?
Welche Rolle spielt OOP?

#### [Klassen-Design](/documents/Klassen-Design.md)
Klassenattribute;
Sichtbarkeits-/Zugriffsmodifizierer (`private`, `(default)`, `protected`, `public`);
`this`;
Getter und Setter;
Konstruktoren;
`final`;
`static`;
Konstanten in Java;
`toString()`;
`equals()`

#### [Vererbung](/documents/Vererbung.md)
Wozu Vererbung?
Terminologie;
`extends`;
`super`;
`instanceof`;
Überschreiben von Methoden;
abstrakte Klassen und Methoden;
Interfaces


### Undsoweiter...

#### [Fehlerbehandlung](/documents/Fehlerbehandlung.md)
Errors;
Exceptions;
`try`...`catch`...`finally`;
`try` with resources;
`throws`


-   [Fehlerbehandlung](#fehlerbehandlung)
    -   [Exceptions und Errors](#exceptions-und-errors)
    -   [try-catch-finally](#try-catch-finally)
    -   [try-with-resources](#try-with-resources)
    -   [throws](#throws)
-   [Dokumentation JavaDoc](#dokumentation-javadoc)
-   [Input/Output](#inputoutput)
    -   [Streams](#streams)
    -   [Buffering](#buffering)
    -   [Reader und Writer](#reader-und-writer)
    -   [Objekt-Serialisierung (Serializable)](#objekt-serialisierung-serializable)
-   [Datenstrukturen II: Verkettete Listen](#datenstrukturen-ii-verkettete-listen)
    -   [Einfach verkettete Listen](#einfach-verkettete-listen)
    -   [Zweifach verkettete Listen](#zweifach-verkettete-listen)
-   [Generics](#generics)
-   [Datenstrukturen III: Das Collections Framework](#datenstrukturen-iii-das-collections-framework)
    -   [List](#list)
    -   [Set](#set)
    -   [Map](#map)
    -   [Object equality im Kontext von HashMaps/Sets](#object-equality-im-kontext-von-hashmapssets)



# Fehlerbehandlung

## Exceptions und Errors

-   In Programmen können Fehler (**Exceptions** und **Errors**) auftreten (man sagt auch, es wird ein Fehler _"geworfen"_)
-   Errors sind Fehler, die _nicht aufgefangen werden können_ (catch), sie bringen das Programm zum Absturz
-   Exceptions können _"aufgefangen"_ werden (catch), d.h. es kann mit Hilfe einer gut durchdachten Fehlerbehandlung mit dem Fehler umgegangen werden, sodass das Programm nicht unerwartet beendet werden muss
-   **Exception** und **Error** sind vom Typ _Throwable_ (deshalb _"Werfen"_ von Fehlern), es steckt eine ganze Klassenhierarchie hinter den verschiedenen Fehlertypen

![Exceptions/Errors Class Hierarchy](/assets/images/Exception-Hierarchy-Diagram.jpeg)  
Quelle: [programcreek.com](http://www.programcreek.com/2009/02/diagram-for-hierarchy-of-exception-classes/)

## try-catch-finally

-   Mit einem Code-Block aus `try`, `catch` und `finally` wird der Umgang mit potentiellen Exceptions definiert
-   `try`-Block enthält den Code, der eine Exception verursachen könnte.
-   `catch`-Block/Blöcke (einer oder mehrere) enthält den Code, der im Falle einer bestimmten Exception ausgeführt wird. Ein `catch`-Block wird nur dann ausgeführt, wenn die geworfene Exception
-   `finally`-Block (falls vorhanden, optional!) enthält den Code, der unabhängig von einem ausgelösten `catch`-Block **am Ende der Fehlerbehandlung** ausgeführt wird. Dabei spielt es keine Rolle, ob eine Fehler überhaupt aufgetreten ist!
-   Nach dem _try-catch(-finally)_-Block wird der darauf folgende Programm-Code weiter ausgeführt.
-   Falls im `try`-Block kein Fehler auftritt, werden alle `catch`-Blöcke ignoriert; ein etwaiges `finally` wird aber noch ausgeführt.
-   Falls kein `catch`-Block die geworfene Exception abfängt, wird trotzdem ein evtl. vorhandener `finally`-Block ausgeführt, bevor die Exception dann von der default-Fehlerbehandlung verarbeitet wird (Stack Trace über den ErrOut auf Konsole ausgeben).

![try-catch-finally-flow](/assets/images/java-try-catch-finally-flow.jpg)  
Quelle: [howtodoinjava.com](https://howtodoinjava.com/java/exception-handling/try-catch-finally/)

**Syntax und Beispiel:**

```java
  int[] numbers = {1,2,3};
  int number = 0;

  try {
    number = numbers[3]; //Index existiert nicht!
  } catch (ArrayIndexOutOfBoundsException ex){
    //auf diesen speziellen Fehler reagieren
    System.out.println("Dieser Index existiert nicht!");
  } catch (Exception ex) {
    //ansonsten: Auf jeden anderen Fehler reagieren
    System.out.println("Es ist ein Fehler aufgetreten!");
  } finally {
    //wird auf jeden Fall (ggf. am Ende der Fehlerbehandlung) ausgeführt:
    if (number == 0) number = -1;
    System.out.println(number);
  }
```

Dieser Code würde für `number = numbers[2]` einfach `3` ausgeben. Falls aber ein Fehler auftritt, etwa wie im Beispiel bei `number = numbers[3]`, wäre die Ausgabe `Dieser Index existiert nicht! -1` (Zeilenumbruch hier entfernt).

## try-with-resources

-   Spezialform der Fehlerbehandlung für im `try`-Block verwendete Ressourcen, die nach ihrer Verwendung wieder geschlossen werden müssen (etwa beim Arbeiten mit Datenströmen)
-   Der `try`-Block deklariert die entsprechende(n) Ressource(n) (mehrere Ressourcen durch `;` getrennt möglich!)
-   Normalerweise würde man die Ressourcen im `finally`-Block schließen - dies geschieht hier aber automatisch!
-   Diese Form des `try`-Blocks funktioniert mit allen Ressourcen, die `java.lang.AutoCloseable` implementieren (schließt `java.lang.Closeable` ein, denn `Closeable` erweitert `AutoCloseable`).

**Beispiel Datei einlesen OHNE try-with-resources**

```java
  BufferedReader br = null;
  String line;

  try {
    br = new BufferedReader(new FileReader("text.txt"));
    while ((line = br.readLine()) != null) {
      System.out.println("Zeile gelesen: " + line);
    }
  } catch (IOException e) {
    System.out.println("IOException im try-Block: " + e.getMessage());
  } finally {
    System.out.println("Ausführung finally-Block...");
    //so müsste man den Reader eigentlich schließen:
    try {
      if (br != null) {
        br.close();
      }
    } catch (IOException e) {
      System.out.println("IOException im finally-Block: " + e.getMessage());
    }
  }
```

**Beispiel Datei einlesen MIT try-with-resources**

```java
  String line;

  try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
    while ((line = br.readLine()) != null) {
      System.out.println("Zeile gelesen: " + line);
    }
  } catch (IOException e) {
    System.out.println("IOException im try-Block: " + e.getMessage());
  }
```

## throws

-   Eine Methode kann explizit dazu in der Lage sein, eine bestimmte Exception zu "werfen". Dies wird mit dem Schlüsselwort `throws` markiert.
-   Der Typ der Exception muss dabei angegeben werden.
-   Methoden, in denen diese "werfende" Methode aufgerufen wird, müssen eine Fehlerbehandlung vornehmen (Ausnahme: Exceptions vom Typ `RuntimeException`)!

```java
public int thisWillFail(int[] numbers) throws ArrayIndexOutOfBoundsException {
  return numbers[numbers.length];
}
```

# Dokumentation JavaDoc

-   ...

> An dieser Stelle gut zur Wiederholung geeignet:  
> **Projekt: [StringList](/projects/StringList)**

# Input/Output

> **Projekt: [IO-Benchmarking](/projects/IO-Benchmarking)**

## Streams

-   ...

## Buffering

-   ...

## Reader und Writer

-   ...

## Objekt-Serialisierung (Serializable)

-   ...

# Datenstrukturen II: Verkettete Listen

## Einfach verkettete Listen

-   ...

## Zweifach verkettete Listen

-   ...

# Generics

-   ...
-   Implementation am Beispiel der verketteten Liste
-   ...
    > **Projekt: [GenericList](/projects/GenericList)**

# Datenstrukturen III: Das Collections Framework

## List

-   ...

## Set

-   ...

## Map

-   ...

## Object equality im Kontext von HashMaps/Sets

-   Vertrag zwischen `equals()` und `hashCode()`
