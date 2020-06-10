# Konditionale :railway_track:

> (engl.: _conditional statements_)

Konditionale steuern den Ablauf eines Programmes in Abhängigkeit von Bedingungen.


## `if`, `else if`, `else`

Ein `if/else`-Statement führt Code in Abhängigkeit vom Wahrheitsgehalt (`true`/`false`) einer Aussage bzw. eines boolschen Ausdrucks aus. Es besteht mindestens aus **einem** `if`-Block (_wenn, dann..._), einer **beliebigen Anzahl von** `else if`-Blöcken (_sonst wenn, dann..._) und **maximal einem** `else`-Block (_sonst..._). 

**Syntax-Beispiel:**

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

> :speech_balloon: **Elvis-Operator:** Der Ternary-Operator wird "umgangssprachlich" auch als _Elvis-Operator_ bezeichnet, weil die Symbole in seiner Syntax, also `?` und `:` dem Elvis-Smiley* ähneln, bei dem das `?` die typische Elvis-Locke darstellen soll: `?:)`

> :speech_balloon: **\* Smileys** sind Gesichter aus Sonderzeichen, die man benutzt hat, als es noch keine Emojis gab :older_woman: :older_man: 


## switch

-   Ersetzt sperrige `if`/`else`-Konstrukte, die nur den Wert eines einzigen Ausdrucks überprüfen
-   ...

> :construction: **TODO:** `switch`


<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>