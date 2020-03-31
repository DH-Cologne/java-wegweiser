# Arrays

Ein Array ist eine lineare [Datenstruktur](https://de.wikipedia.org/wiki/Datenstruktur), das heißt, ein Array organisiert Daten (_"Elemente"_) in sequentieller Form. Oder einfacher: Die Daten/Objekte, die in einem Array organisiert sind, haben eine Reihenfolge.  

- [Arrays](#arrays)
  - [Funktionsweise](#funktionsweise)
    - [Indizierung](#indizierung)
    - [Feste Größe](#feste-größe)
    - [Typisierung](#typisierung)
  - [Erzeugen eines Arrays](#erzeugen-eines-arrays)
    - [... mit dem `new`-Operator](#-mit-dem-new-operator)
    - [... mit Array-Literals](#-mit-array-literals)
  - [Zugriff und Manipulation](#zugriff-und-manipulation)
  - [Mehrdimensionale Arrays](#mehrdimensionale-arrays)

## Funktionsweise

### Indizierung
Die Elemente eines Arrays sind indiziert, d.h. fortlaufend durchnummeriert. Die Zählung beginnt dabei **immer bei** `0` und schreitet in ganzzahligen Schritten fort:

![array](/assets/images/array.jpeg)  
Grafik: [#](/assets/images/array.jpeg), Quelle [#](https://javatutorial.net/java-array)

Wie auf der Grafik zu sehen ist, hat das erste Element den Index `0`, das letzte Element den Index `4` (also **Länge des Arrays minus `1`!**). So können die Elemente eines Arrays über ihren Index (die Nummer) angesprochen und entweder gelesen oder manipuliert werden (_siehe unten!_).

### Feste Größe
Ein Array hat, einmal erzeugt, eine **fest Größe**, d.h. es kann nicht verlängert oder gekürzt werden. Ein Array mit 5 Stellen wird immer 5 Stellen haben!

### Typisierung
In Java muss jedes Array typisiert sein, d.h. es muss festgelegt werden, von welchem Datentyp alle (!) Elemente des Arrays sein müssen.


## Erzeugen eines Arrays

Die Größe und der Datentyp eines Arrays **müssen** bei der Initialisierung festgelegt werden. Die Syntax für ein Array für Elemente mit einem bestimmten Datentyp ist `Typ[]`, wobei `Typ` den Datentyp angibt und die Klammern `[]` anzeigen, dass es sich um ein Array handelt bzw. wie groß dieses ist oder auf welches Element zugegriffen wird (das alles wird im Folgenden gezeigt).

Ein Array kan auf zwei verschiedene Weisen erzeugt werden ...

### ... mit dem `new`-Operator

[Arrays sind Objekte](https://docs.oracle.com/javase/specs/jls/se8/html/jls-10.html) (vom Typ `Object`), somit können sie mit dem `new`-Operator erzeugt werden.

```java
int[] numbers = new int[5];
```

Im obigen Beispiel wird ein Array für `int`-Werte mit der Größe 5 initialisiert und einer entsprechend typisierten Variable zugewiesen. `[5]` legt hier die Größe fest. Das selbe wäre auch für Strings (und alle anderen Datentypen!) möglich:

```java
String[] words = new String[5];
```

Nach der initialisierung eines Arrays mit dem `new`-Operator haben alle Elemente des Arrays den default-Wert ihres entsprechenden Datentyps. Beim `new int[5]` im Beispiel oben wären das also fünf `int`-Werte, und zwar jeweils `0`.

### ... mit Array-Literals

Eine andere Variante der Initialisierung von Arrays sind Array-Literals. Ähnlich den String-Literals handelt es sich hierbei um eine spezielle Notation, die ein Objekt erzeugt und gleichzeitig seinen Inhalt festlegt.

Angelehnt an die beiden Beispiele mit dem `new`-Operator sehen wir hier, wie `ìnt`- bzw. `String`-Arrays über Array-Literals erzeugt werden:

```java
int[] numbers = {3, 6, 345, 1, 0, 4};
String[] words = {"Dies", "sind", "Strings!"};
```

Die erste Zeile erzeugt hier ein Array für `int`-Werte (`int[]`) mit der Länge 6 und fügt die Werte `3`, `6`, ..., `4` ein. Dieses Array wird (wie oben) einer entsprechend typisierten Variable zugewiesen.  
In der zweiten Zeile geschieht das selbe für ein Array mit drei Strings.

Eine explizite Angabe der Größe des erzeugten Arrays ist hier nicht nötig, denn diese ist durch die Anzahl der definierten Elemente bereits implizit festgelegt.

> :warning: **Übrigens:** Es mag sehr reizvoll und elegant erscheinen, ein Array gleich mit allen Werten zu initialisieren, aber im Alltag wird das doch eher selten getan - immerhin muss die Person, die den Programm-Code schreibt, schon beim Programmieren genau wissen, welche Werte in das Array sollen. Das kommt nicht oft vor!


## Zugriff und Manipulation

Der Zugriff auf ein Element eines Arrays erfolgt über seinen _Index_ (also die Zahl zwischen `0` und Länge des Arrays - 1). Angesprochen wird das Array über eine Referenz (z.B. Variable), gefolgt von den eckigen Klammern mit dem Index, auf den zugegriffen werden soll:

```java
// ein Array für 3 int-Werte
int[] numbers = new int[2];
// Zugriff und Manipulation
numbers[0] = 45; // erstes Element
numbers[1] = 2; // zweites Element
numbers[3] = numbers[0]; // drittes Element
```

In diesem Beispiel werden die drei Elemente eines `int`-Arrays von ihren default-Werten (`0`) auf andere Werte geändert. Die Zuweisung des dritten Elements zeigt dabei, dass der _"Lese"_-Zugriff auf ein Element genauso funktioniert. Am einfachsten ist es wohl, sich sich `numbers[0]`, `numbers[1]` und `numbers[3]` wie einzelne Variablen vorzustellen, die auf 3 verschiedene `int`-Werte verweisen. 


<!--

**Anwendungs-Beispiel**

```java
/*
  * Alle Wörter eines Strings "umkehren",
  * die länger sind als 4 Zeichen...
  */

String text = "Ein Raabe geht im Feld spazieren";
String[] words = text.split(" ");

for (int i = 0; i < words.length; i++) {
  // wenn Wort länger als 4...
  if (words[i].length() > 4) {
    // ...Wort "umkehren"
    String reversed = "";
    for (int j = words[i].length() - 1; j >= 0; j--) {
      reversed += words[i].charAt(j); // teuer!
    }
    words[i] = reversed;
  }
}

for (int i = 0; i < words.length; i++) {
  System.out.print(words[i] + " ");
}
```
-->

## Mehrdimensionale Arrays

-   Arrays können (theoretisch) beliebig viele Dimensionen besitzen bzw. beliebig tief "verschachtelt" sein
-   Jedes Array einer Unter-Ebene _kann_ dabei eine andere Länge besitzen

```java
// zwei-dimensionales int-Array; entspricht einem
// Array aus vier int-Arrays der Länge 2
int[][] matrix = new int[4][2];
// Die Länge der Arrays in tieferen Dimensionen kann
// (vorerst) unbestimmt bleiben und sich letztendlich
// unterscheiden
int[][] twoDimensions = new int[4][];
// auch hier sind Litarals möglich:
int[][] twoDimLiteral = {{2, 4}, {1, 54, 6}};
```
