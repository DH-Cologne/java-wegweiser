# Operatoren :symbols:

> :construction: **TODO:** Alles. Bisher sind hier nur die zu besprechenden Inhalte aufgelistet. Es fehlen Erläuterungen.


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


## Post- / Preinkrement

-   Ausdruck und Operation mittels: `++` / `--`

```java
// Unterschied Post-/Preinkrement:
int i = 5;
int x = ++i; // i = 6 und x = 6 (hochzählen, dann zuweisen)

int i = 5;
int x = i++; // i = 6 und x = 5 (zuweisen, dann hochzählen)
```


## Vergleichsoperatoren

-   Ergebnis von Vergleichsoperationen ist **immer** `true` oder `false`!
-   `==`, `!=`, `>`, `<`, `>=`, `<=`


## Boolsche / Logische Operatoren

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