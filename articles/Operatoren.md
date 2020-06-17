# Operatoren :symbols:

> :construction: **TODO:** Alles. Bisher sind hier nur die zu besprechenden Inhalte aufgelistet. Es fehlen Erläuterungen.

> :speech_balloon: Die auf dieser Seite erläuterten Operatoren sind tatsächlich noch nicht alle, die es in Java gibt. Andere Operatoren wie [`new`](Objekte-I-Initialisierung-Members-Zugriff.md), [`instanceof`](Vererbung-I-Grundlagen.md) oder der [Ternary-Operator](Konditionale.md) passen aber viel besser in den Kontext anderer Seiten, weshalb sie dort und nicht auf dieser Seite hier zu finden sind.


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

Da der Wert des Ausdrucks `i++` **zuerst um `1` erhöht** und dann "abgefragt":

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

> :warning: **Achtung:** Wenn der Vergleichsoperator `==` zum Vergleichen von Objekten (oder besser: Objekt-Referenzen) genutzt wird **nicht** die semantische _Gleichheit_ der Objekte, sondern tatsächlich die Gleichheit der Referezen überprüft. D.h. der Vergleich ist nur dann `true`, wenn es sich **um das selbe Objekt an der selben Speicherstelle** handelt!  
> Die Gleichheit von Objekten wird deshalb anders überprüft, nämlich mit Hilfe der `equals()`-Methode! Mehr dazu [hier](Objekte-II-Repraesentation-Identitaet-Gleichheit.md).


## Logische Operatoren

> :speech_balloon: Auch: _Boolsche Operatoren_

-   `&&` und `||`
-   Negation: `!` (invertiert einen Ausdruck)
-   Exklusives ODER: `!=` (wenn nur 1 Operand `true` ist)


## Operatoren zur Bit-Manipulation

> :question: **Fraglich:** Lieber erstmal weglassen?

-   `~`, `&`, `|`, `^`
-   `>>`, `>>>`, `<<`


## Zuweisungsoperatoren

-   Einfache: `=`
-   Arithmetische: `+=`, `-=`, `/=`, `*=`, `%=`
-   Logische: `&=`, `|=`, ...

```java
// Logische Zuweisungsoperatoren
boolean t = true;
boolean f = false;
t &= f; // hiernach: t = false, weil nicht beide true
```



<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>