
# Hello World! :rocket:

Zum Erlernen einer Programmiersprache gehört immer auch ein _"Hello World"_-Beispiel, das den Quelltext eines minimalen Programms zeigt, welches einfach nur die Worte _"Hello World!"_ auf der Konsole ausgibt. Mit dieser Tradition wollen wir hier nicht brechen.

Das folgende Java-Programm wäre lauffähig und würde die Worte _"Hello World!"_ auf der Konsole ausgeben:

```java
public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello World!");
      }
}
```

Wenn du Java nicht schon beherrschst, siehst du in diesem winzigen Beispiel bereits viele Dinge, die dir jetzt noch nichts sagen. Im Folgenden sollen die auseinandergenommenen Kleinteile dieses Codes benannt werden, damit du weißt, wonach du in den folgenden Kapiteln suchen musst, um wirklich _alles_ an diesem Beispiel zu verstehen.

> :warning: **Du das nicht!** Es ergibt keinen Sinn. Nimm diesen Code erstmal so hin - du wirst in später noch verstehen! Die folgende Auflistung dient nur der Vollständigkeit. Lies sie dir gern durch, aber versuche vorerst nicht, alles nachzuvollziehen.

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



<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>