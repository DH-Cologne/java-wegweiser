# Konditionale :railway_track:

-   steuern den Ablauf des Programms
-   bilden eigene Gültigkeitsbereiche

## if, else if, else

-   Ausführung von Code abhängig von Wahrheitswert einer Aussage / eines boolschen Ausdrucks
-   Lässt sich gut übersetzen mit _"wenn", "dann", "sonst"_ bzw. _"wenn", "dann", "sonst wenn", ..., "sonst"_
-   besteht mindestens aus **einem** `if`-Block, einer **beliebigen Anzahl von** `else if`-Blöcken und **maximal einem** `else`-Block

> :construction: **TODO:** Schöneres Beispiel

```java
boolean t = true;
boolean f = false;

if (t && f){
  // beides wahr!
} else if (t || f) {
  // eins von beidem wahr!
} else {
  // beides unwahr!
}
```

## Ternary-Operator

-   Ausdruck nimmt den einen oder anderen Wert an, in Abhängigkeit von der Bedingung / Wahrheitsgehalt der Aussage
-   Syntax: `Bedingung ? Wert wenn wahr : Wert wenn unwahr`

```java
int i = 4;
String kleinerFuenf = (i < 5) ? "kleiner" : "größer";
```

## switch

-   Ersetzt sperrige `if`/`else`-Konstrukte, die nur den Wert eines einzigen Ausdrucks überprüfen
-   ...

> :construction: **TODO:** `switch`


<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>