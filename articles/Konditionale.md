# Konditionale 🛤️<!-- omit in toc -->

> (engl.: _conditional statements_)

Konditionale steuern den Ablauf eines Programmes in Abhängigkeit von Bedingungen.

- [`if`, `else if`, `else`](#if-else-if-else)
- [Ternary-Operator](#ternary-operator)
- [switch](#switch)



## `if`, `else if`, `else`

Ein `if/else`-Statement führt Code in Abhängigkeit vom Wahrheitsgehalt (`true`/`false`) einer Aussage bzw. eines boolschen Ausdrucks aus. Es besteht mindestens aus **einem** `if`-Block (_wenn, dann..._), einer **beliebigen Anzahl von** `else if`-Blöcken (_sonst wenn, dann..._) und **maximal einem** `else`-Block (_sonst..._). 

**👉 [Syntax](../Glossar.md#syntax)-Beispiel:**

```java
int i = 4;

if (i > 5){
  // größer!
} else if (i < 5) {
  // kleiner!
} else {
  // gleich!
}
```

Es wird hier generell immer **nur einer** der Blöcke ausgeführt! Wenn im `if`-Block die Bedingung erfüllt ist, dann werden die folgenden Blöcke ignoriert. Wenn nicht, dann werden nacheinander die (optionalen) `else if`-Blöcke überprüft und ggf. einer davon ausgeführt. Falls keine der angegebenen Bedingungen zutraf, wird der (ebenfalls optionale) `else`-Block ausgeführt.


## Ternary-Operator

Ein Ternary-Operator nimmt den einen oder anderen Wert in Abhängigkeit einer Bedingung an. Die Syntax lautet `Bedingung ? Wert wenn wahr : Wert wenn unwahr`, es wird also die Bedingung mit einem `?` abgeschlossen, gefolgt vom anzunehmenden Wert bei erfüllter Bedingung, gefolgt von `:` und dem anzunehmenden Wert bei unerfüllter Bedingung:

```java
int i = 4;
String gt = i > 5 ? "größer" : "nicht größer";
System.out.println(i + " ist " + gt + " als fünf!")
```

...erzeugt die Ausgabe `4 ist nicht größer als fünf!`

> 💬 **Elvis-Operator:** Der Ternary-Operator wird "umgangssprachlich" auch als _Elvis-Operator_ bezeichnet, weil die Symbole in seiner Syntax, also `?` und `:` dem Elvis-Smiley* ähneln, bei dem das `?` die typische Elvis-Locke darstellen soll: `?:)`

> 💬 **\* Smileys** sind Gesichter aus Sonderzeichen, die man benutzt hat, als es noch keine Emojis gab 👵 👴 


## switch

Das `switch`-Statement ersetzt sperrige `if`/`else`-Konstrukte, bei denen je nach dem Wert eines einzelnen Ausdrucks ein bestimmter Code-Block ausgeführt werden soll. `switch`-Statements funktionieren dabei nur mit `int`-Werten (sowie den kompatiblen Typen `byte`, `short` und `char`), [Enums](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html) und `String`-Objekten (seit Java 7).

```java
int i = 1;

switch (i) {
case 1:
  System.out.println("eins");
  break;
case 2:
  System.out.println("zwei");
  break;
default:
  System.out.println("nicht eins oder zwei");
  break;
}
```

Dieses `switch`-Statement lässt sich etwa folgendermaßen lesen: Wenn `i` den Wert `1` hat, `...`. Sonst: Wenn `i` den Wert `2` hat, `...`. In jedem anderen Fall: `...`.

Die Ausgabe des Codes lautet `eins`, weil `case 1` mit einem `break`-Statement abschließt, welches das gesamte `switch`-Statement beendet. Würden die `break`-Statements fehlen, so würden ab dem zutreffenden Fall (`case`) **alle Code-Blöcke ohne weitere Überprüfung bis zu einem eventuellen `break` ausgeführt!**. Somit hätte der Code ...

```java
int i = 1;

switch (i) {
case 1:
  System.out.println("eins");
case 2:
  System.out.println("zwei");
default:
  System.out.println("nicht eins oder zwei");
}
```

... die Ausgabe ...

```
eins
zwei
nicht eins oder zwei
```

... denn die `break`-Statements fehlen hier. In den meisten Fällen ist ein `break`-Statement am Ende eines `case` erwünscht. Das sogenannte _Durchfallen_ (engl.: _fall through_) durch die folgenden Fälle bei fehlendem `break` kann aber auch nützlich sein. Die folgende Methode gibt für die Folgenzahl eine beliebigen Monats in einem beliebigen Jahr die Anzahl der Tage in diesem Monat zurück. Da mehrere Monate `30` bzw. `31` Tage haben, kann hier mit fehlenden `break`-Statements und also einem gewollen _fall through_ viel Code gespart werden:

```java
private static int daysInMonth(int month, int year) {
  int days = 0;

  switch (month) {
    case 1: case 3: case 5: case 7:
    case 8: case 10: case 12:
      // Monate mit 31 Tagen
      days = 31;
      break;
    case 4: case 6:
    case 9: case 11:
      // Monate mit 30 Tagen
      days = 30;
      break;
    case 2:
      // Februar (29 bzw. im Schaltjahr 28 Tage)
      if (((year % 4 == 0) && !(year % 100 == 0))
          || (year % 400 == 0)) {
        days = 29;
      } else {
        days = 28;
      }
      break;
    default:
      System.out.println("Invalid month.");
      break;
  }
  
  return days;
}
```

Die Ausgabe bei folgendem Aufruf dieser Methode ...

```java
System.out.println("Der Februar 2020 hatte " + daysInMonth(2, 2020) + " Tage.");
```

... die Ausgabe ...

```
Der Februar 2020 hatte 29 Tage.
```



