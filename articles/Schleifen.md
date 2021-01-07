# Schleifen 🎀<!-- omit in toc -->

Schleifen wiederholen die Ausführung eines Blockes von Anweisungen in Abhängigkeit von bestimmten Voraussetzungen. In Java gibt es vier verschiedene Formen von Schleifen.

- [`while`-Schleife](#while-schleife)
- [`do-while`-Schleife](#do-while-schleife)
- [`for`-Schleife](#for-schleife)
- [for-each-Schleife](#for-each-schleife)
- [Unterbrechen von Schleifen](#unterbrechen-von-schleifen)
  - [`continue`-Statement](#continue-statement)
  - [`break`-Statement](#break-statement)
- [Endlosschleifen 💥](#endlosschleifen-)



## `while`-Schleife

Eine `while`-Schleife führt einen Block von Anweisungen immer wieder aus, solange eine Bedingung erfüllt ist:

```java
while(bedingung == true) {
    // Code, der wiederholt ausgeführt wird
}
```

Bei jedem Durchlauf der `while`-Schleife wird zunächst eine **Bedingung** (eine "Aussage" vom Typ `boolean`) überprüft. Hat diese den Wert `true`, wird die **Anweisung** ausgeführt. Wird die Bedingung unwahr, wird die Schleife abgebrochen bzw. gar nicht erst ausgeführt. Mit der while-Schleife kann eine Anweisung beliebig oft ausgeführt werden, ohne im Vorfeld die Anzahl der Durchläufe festzulegen.

**Beispiel:**

```java
int number = 10;

while(--number > 0) {
    System.out.print(number + " ");
}
```

Die Ausgabe dieses Beispiels wäre ...

```
9 8 7 6 5 4 3 2 1 
```

... wobei am Anfang nicht `10` augegeben wird, da der Wert von `number` ja vor der ersten Ausführung bereits in der Bedingung vermindert wird!


## `do-while`-Schleife

```java
do {
    // Anweisung
} while(bedingung == true);
```

Die `do-while`-Schleife funktioniert ähnlich wie die `while`-Schleife. Allerdings wird hier immer erst die Anweisung ausgeführt und dann die Bedingung überprüft. Die Anweisung wird also immer mindestens einmal ausgeführt, auch wenn die Bedingung `false` ist.

**Beispiel:**

```java
int number = 10;

do {
    System.out.print(number + " ");
} while(--number > 0);
```

Dieses Beispiel erzeugt die Ausgabe ...

```
10 9 8 7 6 5 4 3 2 1 
```


## `for`-Schleife

Eine `for`-Schleife wird auch als _Zählschleife_ bezeichnet. Zwar könnte jede `for`-Schleife auch durch eine `while`-Schleife ersetzt werden, aber z.B. beim Iterieren über eine Datenstruktur oder sequenziellen Operationen mit Zahlen bildet sie wesentlich besser ab, was im Code passiert. Die `for`-Schleife ist in solchen Fällen also wesentlich _lesbarer_.

```java
// Pseudo-Code!
for(Startwert; Bedingung; Operation) {
    // Anweisungen
}
```

Die `for`-Schleife iteriert über einen Laufindex (auch: _Zählvariable_). Der Kopf der `for`-Schleife besteht aus drei Teilen:
 
1. Der **Startwert** (Deklaration und Initialisierung) legt die Zählvariable fest, und mit welchem Wert die Schleife anfangen soll, zu zählen.
2. Die **Bedingung** wird vor jedem Durchlauf geprüft. Wenn sie `true` ist, wird die Schleife ausgeführt. Sobald die Bedingung `false` ist, wird die Schleife abgebrochen.   
3. Die **Zähl-Operation** (oder: _Iteration_) manipuliert den Wert der Zählvariable und wird immer _nach dem Schleifenkörper_ (also den Anweisungen in der Schleife) ausgeführt.

**Beispiel:**

```java
// alle Werte eines Array auf der Konsole ausgeben
int[] numbers = {1, 2, 3, 4, 5};

for(int i = 0; i < numbers.length; i++) {
    System.out.println("Der Wert ist " + numbers[i]);
}
```

... erzeugt folgende Ausgabe:

```
Der Wert ist 1
Der Wert ist 2
Der Wert ist 3
Der Wert ist 4
Der Wert ist 5
```

Theoretisch ist es auch möglich, die Zähl-Operation im Schleifenkopf wegzulassen und sie im Schleifen-Körper vorzunehmen:

```java
int[] numbers = {1, 2, 3, 4, 5};

for(int i = 0; i < numbers.length;) {
    System.out.println("Der Wert ist " + numbers[i++]);
}
```

Das ist aber wirklich nur dann sinnvoll, wenn es einen Mehrwert bietet (etwa wenn die Art der Manipulation der Zählvariable sich erst im Körper der Schleife ergibt).


## for-each-Schleife

Eine for-each-Schleife ist eine Spezialform der `for`-Schleife. Sie bietet eine noch klarere und reduziertere 👉 [Syntax](../Glossar.md#syntax), denn es wird auf eine Zählvariable verzichtet. Stattdessen ist die for-each-Schleife speziell dazu gedacht, über **jedes** Element einer Datenstruktur (genauer: eines `Iterable` oder eines Arrays) vom "ersten" bis zum "letzten" zu iterieren.

Damit über eine Datenstruktur mit einer for-each-Schleife iteriert werden kann, **muss** sie das Interface `Iterable` implementieren (das trifft z.B. auf alle _Collections_ aus dem [Collections Framework](Collections-Framework.md) zu). Eine Ausnahme stellen **Arrays** dar - auch diese sind mit der for-each-Schleife kompatibel.

> 👉 Näheres zu `Iterable` findest du im Artikel über [Datenstrukturen](Datenstrukturen.md).

Die Syntax der for-each-Schleife (die eigentlich nur 👉 [Syntactic sugar](../Glossar.md#syntactic-sugar) ist), liest sich fast wie natürliche Sprache: _Für jedes Element `e` aus der Datenstruktur `data`, führe folgendes aus..._

```java
for(Typ e : data ) {
    // Anweisungen (können auf e zugreifen)
}
```
    
`e` dient hierbei im Schleifenkörper als Referenz zum Wert des jeweiligen Elements der Datenstruktur.

**Beispiel:**

```java
String[] words = new String[]{"these", "are", "arbitrary", "words"};
    
for(String word : words) {
    System.out.println(word.toUpperCase());
}
```

Dies erzeugt folgende Ausgabe:

```
THESE
ARE
ARBITRARY
WORDS
```


## Unterbrechen von Schleifen

Es gibt zwei nützliche Schlüsselwörter, mit denen Schleifen aus dem Schleifenkörper (Anweisungblock) heraus unterbrochen werden können: `continue` und `break`.


### `continue`-Statement

Durch `continue` alle folgenden Anweisungen übersprungen und  es wird mit dem nächsten Schleifen-Durchlauf fortgefahren.

```java
for(int i = 0; i <= 10; i++) {
    if(i == 5) continue;
    System.out.print(i + " ");
}
```

Hier wird der Durchlauf bei `i == 5` übersprungen, ohne `i` auf der Konsole auszugeben. Die Ausgabe ist dementsprechend `0 1 2 3 4 6 7 8 9 10 `.


### `break`-Statement

Durch `break` wird die Schleife ganz abgebrochen. Damit können zusätzliche Abbruchbedingungen formuliert werden:

```java
for(int i = 0; 1 <= 10; i++) {
    if(i == 5)break;
    System.out.print(i + " ");
}
```

Hier wird die Schleife bei `i == 5` abgebrochen, auf der Konsole wird nur `0 1 2 3 4` ausgegeben.


## Endlosschleifen 💥

Endlosschleifen sind genau das, wonach es klingt: Schleifen ohne Ende. Das heißt, dass die Bedingung der Schleife nie den Wert `false` annimmt und die Schleife immer weiter ausgeführt wird. Das sollte natürlich generell vermieden werden.

- Ist die Bedingung der Schleife richtig formuliert?
- Wurden alle Variablen initialisiert?
- Bei `while` oder `do-while`: Sorgt eine Anweisung innerhalb der Schleife dafür, dass die Bedingung `false` wird?

---------------
> **Quellen und weitere Informationen:**
> - [http://www.java-programmieren.com/schleifen-java.php](http://www.java-programmieren.com/schleifen-java.php)  
> - [https://www.w3schools.com/java/java_while_loop.asp](https://www.w3schools.com/java/java_while_loop.asp)  
> - [https://www.geeksforgeeks.org/loops-in-java/](https://www.geeksforgeeks.org/loops-in-java/)  
> - [https://java-tutorial.org/schleifen.html](https://java-tutorial.org/schleifen.html)  





