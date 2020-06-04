
# Hello World! :rocket:

Zum Erlernen einer Programmiersprache gehört immer auch ein **_"Hello World"_**-Beispiel, das den Quelltext eines minimalen Programms zeigt, welches einfach nur die Worte `Hello World!` auf der Konsole ausgibt. Mit dieser Tradition wollen wir hier - Gott bewahre - nicht brechen!

Das folgende Java-Programm wäre lauffähig und würde die Zeichenkette `Hello World!` auf der Konsole ausgeben:

```java
public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello World!");
      }
}
```


> :warning: **Wenn du Java nicht schon beherrschst**, siehst du in diesem winzigen Beispiel bereits viele Dinge, die dir jetzt noch nichts sagen. **Das ist in Ordnung!** Nimm den Code einfach so hin, wie er ist. Später kannst du hierher zurückkehren und prüfen, ob du schon alle in diesem Beispiel vorkommenden Konzepte kennst. Im Folgenden sollen dazu die einzelnen Bestandteile des Beispiel-Codes benannt (**nicht** erklärt) werden, damit du weißt, wonach du in den weiteren Kapiteln suchen musst...


Code | Was ist das?
--- | ---
`public` | ein Zugriffs-/Sichtbarkeits-Modifizierer
`class` | das Schlüsselwort, mit dem eine Klassen-Definition eingeleitet wird
`HelloWorld` | der Name der Klasse
`static` | ein Polymorphie-Modifizierer
`void` | das Schlüsselwort für "kein Rückgabetyp"
`main` | der Name einer Methode - hier: der `main`-Methode
`()` | die Klammern um die Parameter der Methode
`String[]` | Datentyp des einzigen Methoden-Parameters (ein String-Array)
`args` | Name des einzigen Methoden-Parameters
`System.out.println()` | Aufruf der statischen Methode `println()` zum Ausgeben einer Textzeile in den Datenstrom, der Text-Ausgaben des Systems auf der Konsole transportiert
`"Hello World!"` | Ein String. Genauer: Ein String-Literal, das die Worte _Hello World!_ beinhaltet
`;` | Jede Anweisung wird in Java von einem `;` abgeschlossen.
`{}` | Die geschweiften Klammern geben den Gültigkeitsbereich der verschiedenen Konstrukte (hier: Klasse oder Methode) an.



<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>