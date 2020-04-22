# Konditionale :railway_track:

-   steuern den Ablauf des Programms
-   bilden eigene Gültigkeitsbereiche

## if, else if, else

-   Ausführung von Code abhängig von Wahrheitswert einer Aussage / eines boolschen Ausdrucks
-   Lässt sich gut übersetzen mit _"wenn", "dann", "sonst"_ bzw. _"wenn", "dann", "sonst wenn", ..., "sonst"_
-   besteht mindestens aus **einem** `if`-Block, einer **beliebigen Anzahl von** `else if`-Blöcken und **maximal einem** `else`-Block

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
boolean condition = true;
String istEsWirklichWahr = condition ? "wahr" : "unwahr";
```

## switch

-   Ersetzt sperrige `if`/`else`-Konstrukte, die nur den Wert eines einzigen Ausdrucks überprüfen
-   ...