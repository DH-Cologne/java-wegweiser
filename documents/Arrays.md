# Arrays

-   lineare Datenstruktur (Elemente haben klare Reihenfolge)
-   Indizes von `0` bis `array.length - 1` (!)
-   Arrays müssen typisiert werden, alle Typen (primitive und komplexe) möglich
-   Arrays sind in Größe/Länge **unveränderlich**!
-   Arrays **sind Objekte** und vom Typ `Object` (siehe [JLS Java SE 8 Edition](https://docs.oracle.com/javase/specs/jls/se8/html/jls-10.html))

![array](/assets/images/array.jpeg)  
Grafik: [#](/assets/images/array.jpeg), Quelle [#](https://javatutorial.net/java-array)


## Deklaration und Initialisierung

-   Deklaration mit `typ[] arrayName` bzw. `Typ[] arrayName`
-   Initialisierung mit `new typ[n]` bzw. `new Typ[n]`, wobei `n` die Größe des Arrays angibt
    -   Größe der (mind.) ersten Dimension muss angegeben werden!

```java
// ein Array für 5 int-Werte
int[] numbers = new int[5];
// ein Array für 5 String-Objekte
String[] words = new String[5];
```

-   Die initialien Werte eines leeren Arrays entsprechen den default-Werten des entsprechenden Datentyps

```java
int[] numbers = new int[5]; // entspricht {0, 0, 0, 0, 0}
```

-   Array Literals mit enthaltenen Werten: `{E1, E2, E2, E4, ..., En}`
    -   Länge des Arrays implizit!

```java
int[] numbers = {3, 6, 345, 1, 0, 4}; // Länge: 6
String[] words = {"Dies", "sind", "Strings!"}; // Länge: 3
```


## Zugriff und Manipulation

-   Zugriff auf Elemente mit numerischem Index-Wert: `array[i]`
-   Manipulation der Elemente mittels Zuweisung: `array[i] = 3`

```java
// ein Array für 3 int-Werte
int[] numbers = new int[2];
// Zugriff und Manipulation
numbers[0] = 45; // erstes Element
numbers[1] = 2; // zweites Element
numbers[3] = numbers[0]; // drittes Element
```

-   Zugriff auch über for-each-Schleife

```java
int[] numbers = {3, 6, 345, 1, 0, 4};

for (int n : numbers){
  // n referenziert aktuellen Wert
}
```

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
