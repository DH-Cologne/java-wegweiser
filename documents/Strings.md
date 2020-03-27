# :ab: Strings

(auch: *Zeichenketten*)

-   `String` ist eine Klasse in Java
-   Ein `String` ist eine Zeichenkette, also eine Sequenz (intern: Array) von `char`-Werten
-   Strings sind in Java **nicht veränderlich** (denn sie sind Arrays von `char`s)
-   String-Literals erzeugen Strings ohne den `new`-Operator
    -   werden mit `"doppelten Anführungszeichen"` gebildet
-   Konkatenation/Verkettung von Strings mit `+`
-   Zeichen mit Sonderfunktionen
    -   `"\n"` (newline) und `"\t"` (tab)
    -   `\` muss deshalb maskiert werden: `"\\"`
-   Für viele/wiederholte Manipulationen: `StringBuilder`