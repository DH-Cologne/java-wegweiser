# Operatoren 🔣<!-- omit in toc -->

> 💬 Die auf dieser Seite erläuterten Operatoren sind tatsächlich noch nicht alle, die es in Java gibt. Andere Operatoren wie [`new`](Objekte-I-Initialisierung-Members-Zugriff.md), [`instanceof`](Vererbung-I-Grundlagen.md) oder der [Ternary-Operator](Konditionale.md) passen aber viel besser in den Kontext anderer Seiten, weshalb sie dort und nicht auf dieser Seite hier zu finden sind.

- [Arithmetische- / Rechenoperatoren](#arithmetische---rechenoperatoren)
  - [Grundrechenarten `+`, `-`, `*`, `/`](#grundrechenarten-----)
  - [Modulo `%`](#modulo-)
- [Post-/Pre-Increment und Post-/Pre-Decrement](#post-pre-increment-und-post-pre-decrement)
- [Vergleichsoperatoren](#vergleichsoperatoren)
- [Logische Operatoren](#logische-operatoren)
  - [UND `&&`](#und-)
  - [ODER `||`](#oder-)
  - [⚠️ `&&` und `||` und der Kurzschluss](#️--und--und-der-kurzschluss)
  - [Exklusives ODER `!=`](#exklusives-oder-)
  - [NEGATION `!`](#negation-)
  - [Bitweise UND `&` und ODER `|`](#bitweise-und--und-oder-)
- [Operatoren zur Bit-Manipulation](#operatoren-zur-bit-manipulation)
- [Zuweisungsoperatoren](#zuweisungsoperatoren)
  - [Explizite Zuweisung `=`](#explizite-zuweisung-)
  - [Kombinierte Zuweisungsoperatoren](#kombinierte-zuweisungsoperatoren)


## Arithmetische- / Rechenoperatoren

### Grundrechenarten `+`, `-`, `*`, `/`
Die vier Grundrechenarten lassen sich ganz einfach in Rechen-Ausdrücken wie in Formeln verwenden. Es sollte aber darauf geachtet werden, dass in Java wie auch sonst überall gilt: Punktrechnung (`*`, `/`) vor Strichrechnung (`+`, `-`)! Deshalb müssen wenn nötig Klammern gesetzt werden:

```java
int number = 11;
int result = (4 + number) * 10;
System.out.println("Das Ergebnis dieser unsinnigen Rechnung ist " + result);
```

### Modulo `%`
Der Modulo-Operator wird mit `%` notiert (hat aber nichts mit Prozentrechnung zu tun!). Ein Ausdruck mit diesem Operator hat als Wert den Rest der Division der beiden Operanden:

```java
int modulus = 5 % 2; // Wert: 1 (Rest der Division 5/2)
modulus = 10 % 2; // Wert: 0 (Rest der Division 10/2)
modulus = 11 % 4; // Wert: 3 (Rest der Division 11/4)
```

Der Modulo-Operator kann etwa zur Ermittlung von geraden oder ungeraden Zahlen ...

```java
public boolean isEven(int number){
    return number % 2 == 0;
}
```

... oder für eine Ausgabe von Prozess-Schritten in bestimmten Intervallen genutzt werden:

```java
// 100 Iterationen
for (int i = 0; i <= 100; i++) {
    if (i % 25 == 0) {
        System.out.println("Geschafft: " + i + " von 100");
    }
}
```

Dieses Beispiel erzeugt die Ausgabe:

```
Geschafft: 0 von 100
Geschafft: 25 von 100
Geschafft: 50 von 100
Geschafft: 75 von 100
Geschafft: 100 von 100
```


## Post-/Pre-Increment und Post-/Pre-Decrement

Diese beiden Operatoren erhöhen (`++`) oder verringern (`--`) einen numerischen Wert um `1`. Dabei spielt die Position des Operators eine Rolle: Angenommen die Variable `i` hat den Wert `2`. Während der Ausdruck `i++` zuerst nach `2` aufgelöst wird **und erst dann** um eins erhöht wird, wird der Ausdruck `++i` zuerst erhöht und dann aufgelöst, nämlich nach `3`.

Ein praktisches Beispiel (Post-Increment):

```java
int i = 2;
System.out.println(i++);
System.out.println(i);
```

Da der Wert des Ausdrucks `i++` zuerst "abgefragt" und **dann erhöht** wird, lautet die Ausgabe:

```java
2
3
```

Anders ist das beim Ausdruck `++i` (Pre-Increment):

```java
int i = 2;
System.out.println(++i);
System.out.println(i);
```

Da der Wert des Ausdrucks `i++` **zuerst um `1` erhöht** und dann "aufgelöst" wird:

```java
3
3
```


## Vergleichsoperatoren

Ausdrücke mit Vergleichsoperatoren haben **immer** den Wert `true` oder `false`, sind also _boolsche_ Ausdrücke. Die meisten dieser Operatoren sollten aus dem Mathematikunterricht bekannt sein:

| Vergleichsoperator | Erläuterung |
| -- | -- |
| `==` | ist gleich |
| `!=` | ist ungleich |
| `>` | ist größer als |
| `<` | ist kleiner als |
| `>=` | ist größer oder gleich |
| `<=` | ist kleiner oder gleich |

Der Wert des Ausdrucks `2 >= 6` wäre dann folgerichtig `false`, usw.

> ⚠️ **Achtung:** Wenn der Vergleichsoperator `==` zum Vergleichen von Objekten (oder besser: Objekt-Referenzen) genutzt wird **nicht** die semantische _Gleichheit_ der Objekte, sondern tatsächlich die Gleichheit der Referezen überprüft. D.h. der Vergleich ist nur dann `true`, wenn es sich **um das selbe Objekt an der selben Speicherstelle** handelt!  
> Die Gleichheit von Objekten wird deshalb anders überprüft, nämlich mit Hilfe der `equals()`-Methode! Mehr dazu [hier](Objekte-II-Repraesentation-Identitaet-Gleichheit.md).


## Logische Operatoren

> 💬 Auch: _Boolsche Operatoren_

Logische Operatoren verknüpfen mehrere Aussagen (also Ausdrücke, die `true` oder `false` sind) zu größeren, komplexeren Aussagen. So ist etwa die Aussage

    i < 10

nur dann wahr, wenn `i` kleiner als `10` ist, die Aussage

    i > 5

nur dann wahr, wenn `i` größer als `5` ist.


### UND `&&`

Ausgehend vom obigen Beispiel ist nun aber die Aussage

    i < 10 && i > 5

nur dann wahr, wenn **beides** der Fall ist. In diesem Beispiel werden die beiden Aussagen durch ein logisches **UND**, nämlich `&&` verknüpft.


### ODER `||`

Mit einem logischen **ODER** `||` wäre der ganze Ausdruck eben auch dann wahr, wenn nur eine der Teil-Aussagen wahr ist:

    i < 10 || i > 5

> 👩‍🏫 Natürlich ist dieses letzte Beispiel völliger Unsinn, denn jede Zahl ist entweder kleiner als `10` oder größer als `5`.


### ⚠️ `&&` und `||` und der Kurzschluss

Die logischen Operatoren `&&` und `||` sind _short-circuiting_, d.h. der rechte Teil des Ausdrucks wird nur dann aufgelöst, wenn dies nötig ist! In `2 > 17 && 1 == 1` wird z.B. `1 == 1` nicht überprüft, da der Ausdruck nach der Auswertung von `2 > 17` bereits nur noch `false` sein kann!

In fast allen Fällen ist dies gewünscht, denn es spart Rechenzeit. Manchmal ist es aber wichtig, dass beide Seiten eines logischen Ausdrucks aufgelöst werden. Siehe dazu den Abschnitt zum bitweisen UND bzw. ODER (unten!).


### Exklusives ODER `!=`

Das als Vergleichsoperator bekannte `!=` (dort: _ungleich_) ist gleichzeitig auch ein logischer Operator. Er sorgt dafür, dass der Gesamtausdruck nur dann `true` ist, wenn **nur genau eine** der Teil-Aussagen wahr ist!

> 💬 Bei genauerem Hinsehen ist hier aber nicht etwa das selbe Symbol - also `!=` - für zwei verschiedene Dinge verwendet worden. Vielmehr ist der Vergleichsoperator ganz automatisch auch ein logischer Operator, denn `true != false` ließe sich sowohl als _"wahr ist ungleich unwahr"_, als auch als _"Einer der Ausdrücke **wahr** oder **unwahr** ist wahr_ lesen. Somit handelt es sich hier nicht wirklich um zwei verschiedene, sondern ein und denselben Operator - nur eben in leicht unterschiedlichen Kontexten.


### NEGATION `!`

Um eine Aussage zu _negieren_ (also sie zu verneinen oder logisch zu invertieren) nutzt man den Negations-Operator `!` (NOT). Er sorgt dafür, dass der wahre (`true`) Ausdruck

    (2 + 2 == 4)

unwahr (`false`) wird:

    !(2 + 2 == 4)

Gelesen: _NOT..._

> 👨‍🏫 Es können mit Hilfe der beschriebenen logischen Operatoren beliebig lange und komplexe logische Ausdrücke gebildet werden, wie etwa  
> `!((a > b) && (x == y)) || z`


### Bitweise UND `&` und ODER `|`

> eng.: _bit-wise and_; _bit-wise or_

> ⚠️ Dieser Abschnitt ist recht komplex und evtl. nicht gut für den Einstieg geeignet. Wenn du gerade erst die Operatoren in Java kennenlernst, dann ignoriere diesen Abschnitt lieber vorerst.

Die Operatoren `&` und `|` sind zwei der Operatoren in Java, die auf Bit-Ebene arbeiten. Zwar sollen Bit-Operatoren an dieser Stelle als solche keine Rolle spielen, aber gerade bei diesen beiden lohnt es sich doch, sie sich genauer anzusehen. Denn eigentlich sind bitweise Operatoren zur Verwendung mit Zahlen gedacht, aber sie funktionieren auch mit Boolean-Werten. Immerhin ist ein `boolean` auch nur eine Zahl (`0` oder `1` im binären System).

Sehen wir uns zunächst die Funktion von `&` und `|` zur Manipulation von Integern auf Bit-Ebene an: Der Ausdruck `42 & 11` hat den Wert `10`. Dazu kommt es so:

`42` hat im Binärsystem den Wert `00101010`  
`11` hat im Binärsystem den Wert `00001011`  
(jeweils aufgefüllt auf 8 Stellen, also 1 Byte)  

Der `&`-Operator vergleicht nun paarweise nacheinander alle Stellen dieser beiden Zahlen daraufhin, ob die Paare beide `1` sind (UND-Operation):

        00101010
        00001011
    ------------
    &   00001010

Da dies nur bei zwei Stellen der Fall ist, ist das Ergebnis `00001010`, was im Dezimalsystem wiederum `10` ist.

Aber warum interessiert uns das für logische Operationen? Ganz einfach: Man kann `&` und `|` auch als logische Operatoren verwenden. Der Unterschied zu den eigentlichen logischen Operatoren `&&` und `||` ist, dass `&` und `|` **nicht kurzschließen**, d.h. es werden **immer beide Seiten des logischen Ausdrucks aufgelöst** (siehe Abschnitt zum Kurzschluss bei `&` und `|` oben!). Das ist dann nützlich, wenn die rechte Seite eines logischen Ausdrucks unbedingt aufgelöst werden muss, weil sie eine Operation enthält, die in jedem Fall ausgeführt werden soll:


## Operatoren zur Bit-Manipulation

(Die weiteren) Operatoren zur Bit-Manipulation werden hier bewusst ausgelassen. Wer sich dennoch für `~`, `&`, `|`, `^`, `>>`, `>>>` und `<<` interessiert, kann z.B. [hier](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html) oder [hier](https://www.baeldung.com/java-bitwise-operators) nachlesen.


## Zuweisungsoperatoren

Zuweisungsoperatoren dienen dazu, [Variablen](Variablen.md) Werte zuzuweisen. Es gibt hiervon unterschiedliche Arten...

### Explizite Zuweisung `=`

Der einfache, explizite Zuweisungsoperator `=` weist den Wert des Ausdrucks **rechts** vom `=` der Variable **links** vom `=` zu:

```java
String answerToEverything = "42";
```

### Kombinierte Zuweisungsoperatoren

Die arithmetischen und bitweisen Operatoren lassen sich mit dem Zuweisungsoperator `=` kombinieren, um eine verkürzte 👉 [Syntax](../Glossar.md#syntax) zu erzielen:

```java
x = x + 2;
```

entspricht

```java
x += 2;
```

In beiden Fällen nimmt die Variable `x` als Wert das Ergebnis der Addition des vorherigen Wertes und `2` an.

Auf dieselbe Weise lässt sich der Zuweisungsoperator `=` mit den weiteren arithmetischen und bitweisen Operatoren verbinden:

`+=`, `-=`, `/=`, `*=`, `%=`, `&=`, `|=`, ...




