# Arrays<!-- omit in toc -->

Ein [Array](https://de.wikipedia.org/wiki/Feld_(Datentyp)) ist eine lineare [Datenstruktur](https://de.wikipedia.org/wiki/Datenstruktur), das heißt, ein Array organisiert Daten (_"Elemente"_) in sequentieller Form. Oder einfacher: Die Daten/Objekte, die in einem Array organisiert sind, haben eine Reihenfolge.  

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

![array](../assets/images/array.jpeg)  
> _Grafik: [#](../assets/images/array.jpeg), Quelle [javatutorial.net](https://javatutorial.net/java-array)_

Wie auf der Grafik zu sehen ist, hat das erste Element den Index `0`, das letzte Element den Index `4` (also **Länge des Arrays minus `1`!**). So können die Elemente eines Arrays über ihren Index (die Nummer) angesprochen und entweder gelesen oder manipuliert werden (_siehe unten!_).

### Feste Größe
Ein Array hat, einmal erzeugt, eine **fest Größe**, d.h. es kann nicht verlängert oder gekürzt werden. Ein Array mit 5 Stellen wird immer 5 Stellen haben!

### Typisierung
In Java muss jedes Array typisiert sein, d.h. es muss festgelegt werden, von welchem Datentyp alle (!) Elemente des Arrays sein müssen.


## Erzeugen eines Arrays

Die Größe und der Datentyp eines Arrays **müssen** bei der Initialisierung festgelegt werden. Die :point_right: [Syntax](../Glossar.md#syntax) für ein Array für Elemente mit einem bestimmten Datentyp ist `Typ[]`, wobei `Typ` den Datentyp angibt und die Klammern `[]` anzeigen, dass es sich um ein Array handelt bzw. wie groß dieses ist oder auf welches Element zugegriffen wird (das alles wird im Folgenden gezeigt).

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

Angelehnt an die beiden Beispiele mit dem `new`-Operator sehen wir hier, wie `int`- bzw. `String`-Arrays über Array-Literals erzeugt werden:

```java
int[] numbers = {3, 6, 345, 1, 0, 4};
String[] words = {"Dies", "sind", "Strings!"};
```

Die erste Zeile erzeugt hier ein Array für `int`-Werte (`int[]`) mit der Länge 6 und fügt die Werte `3`, `6`, ..., `4` ein. Dieses Array wird (wie oben) einer entsprechend typisierten Variable zugewiesen.  
In der zweiten Zeile geschieht das selbe für ein Array mit drei Strings.

Eine explizite Angabe der Größe des erzeugten Arrays ist hier nicht nötig, denn diese ist durch die Anzahl der definierten Elemente bereits implizit festgelegt.

Soll eine Array-Variable deklariert, das Array aber erst an späterer Stelle initialisiert werden, ist folgende :point_right: [Syntax](../Glossar.md#syntax) nötig:

``` java
String[] words;
words = new String[]{"eins", "zwo", "drei"};
```

Die gleiche Syntax ermöglicht auch die direkte Rückgabe eines via Literal erzeugten Arrays im `return` einer Methode:

``` java
public int[] aUselessMethod(){
  return new int[]{7, 6, 4, 9, 11};
}
```

> :warning: Es mag sehr reizvoll und elegant erscheinen, ein Array gleich mit allen Werten zu initialisieren, aber im Alltag wird das doch eher selten getan - immerhin muss die Person, die den Programm-Code schreibt, schon beim Programmieren genau wissen, welche Werte in das Array sollen. Das kommt nicht oft vor!


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

Natürlich bietet sich für einen Zugriff auf jedes einzelne Element - also für ein _**Iterieren über alle Elemente**_ - eine `for`-Schleife an (_siehe dazu das Kapitel zu Schleifen!_).  
Hier ein etwas umfassenderes Beispiel - eine Methode, die ein `int[]` mit einer bestimmten Sequenz aus der Potenzen-Reihe von `power` zurückgibt:

``` java
public static int[] powerSequence(int power, int from, int to){
  int[] seq = new int[to - from + 1];

  for (int i = 0; i < seq.length; i++) {
    seq[i] = (int) Math.pow(power, from + i);
  }

  return seq;
}
```

Der Aufruf `powerSequence(2, 1, 10)` (also ein Array mit den Zweier-Potenzen von `1` bis `8`) ergäbe folgendes Array: `[2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]`.


## Mehrdimensionale Arrays

Arrays können (theoretisch) beliebig viele Dimensionen besitzen bzw. beliebig tief "verschachtelt" sein. Dies bedeutet, dass die erste Dimension eines Arrays nicht etwa `int`- oder `String`-Werte enthält, sondern eben weitere Arrays. Jedes Array einer Unter-Ebene _kann_ dabei eine andere Länge besitzen:

```java
// zwei-dimensionales int-Array; entspricht einem
// Array aus vier int-Arrays der Länge 2
int[][] matrix = new int[4][2];

// Die Länge der Arrays in tieferen Dimensionen kann
// (vorerst) unbestimmt bleiben und sich letztendlich
// unterscheiden
int[][] twoDimensions = new int[4][];

// auch hier sind Litarals möglich:
int[][] twoDimLiteral = { {2, 4}, {1, 54, 6} };
```

Als weiteres Beispiel soll eine Methode dienen, die ein 2-dimensionales Array mit der Multiplikationstabelle (_einmal-eins_) von `from` bis `to` mit der Länge `multiplyTo` zurückgibt:

``` java
public static int[][] multiplicationTable(int from, int to, int multiplyTo){
  int[][] table = new int[to - from + 1][multiplyTo];
  
  for (int i = 0; i < table.length; i++) {
    for (int j = 0; j < table[i].length; j++) {
      table[i][j] = (i + 1) * (j + 1);
    }
  }
  
  return table;
}
```

Der Aufruf `multiplicationTable(1, 10, 10)`, also eine Multiplikationstabelle mit den Ergebnissen für `1` bis `10`, jeweils multipliziert bis `10`, sähe (in formatierter Textform) so aus:

```
[
  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
  [2, 4, 6, 8, 10, 12, 14, 16, 18, 20],
  [3, 6, 9, 12, 15, 18, 21, 24, 27, 30],
  [4, 8, 12, 16, 20, 24, 28, 32, 36, 40],
  [5, 10, 15, 20, 25, 30, 35, 40, 45, 50],
  [6, 12, 18, 24, 30, 36, 42, 48, 54, 60],
  [7, 14, 21, 28, 35, 42, 49, 56, 63, 70],
  [8, 16, 24, 32, 40, 48, 56, 64, 72, 80],
  [9, 18, 27, 36, 45, 54, 63, 72, 81, 90],
  [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
]

```





