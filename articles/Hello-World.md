
# Hello World! :rocket:

Zum Erlernen einer Programmiersprache gehört immer auch ein **_"Hello World"_**-Beispiel, das den Quelltext eines minimalen Programms zeigt, welches einfach nur die Worte `Hello World!` auf der Konsole ausgibt. Mit dieser Tradition wollen wir hier - Gott bewahre! - nicht brechen.

Das folgende Java-Programm wäre lauffähig und würde die Zeichenkette `Hello World!` auf der Konsole ausgeben:

```java
1   public class HelloWorld {
2         public static void main(String[] args) {
3             System.out.println("Hello World!");
4         }
5   }
```

Da du vermutlich gerade erst anfängst Java zu lernen, musst du diesen Quellcode noch nicht im Detail verstehen. Es reichen zunächst folgende Dinge:

Java-Programme sind aus sogenannten [_Klassen_](OOP-Klassen-und-Objekte.md) aufgebaut (dazu später mehr!). In Zeile `1` wird eine neue Klasse definiert (sie heißt `HelloWorld`). Die darauf folgende geschweifte Klammer `{` (auch in Zeile `1`) markiert den Anfang des _Gültigkeitsbereichs_ dieser Klasse - d.h. wo die Klasse anfängt und wo sie endet. Der Gültigkeitsbereich der Klasse `HelloWorld` endet mit der schließenden Klammer `}` in Zeile `5`. Damit das auch auf einen Blick erkennbar ist, wird **alles** was sich **innerhalb** dieses Gültigkeitsbereichs befindet, **eingerückt** (`TAB`-Taste). Diese Regel für die Code-Formatierung gilt übrigens **für alle Gültigkeitsbereiche `{ ... }`!**

Der einzige Inhalt der Klasse `HelloWorld` ist eine [_Methode_](Methoden.md) mit dem Namen `main` (Zeile 2). Was genau eine Methode ist und was die ganzen anderen Schlüsselwörter in Zeile `2` bedeuten, wird ebenfalls später erklärt. Wichtig ist im Moment nur eines: Die `main`-Methode ist der Einstiegspunkt eines Java-Programms - hier beginnt die Ausführung des Programms. Wenn dein Programm keine `main`-Methode hat, in der etwas passiert, dann tut das Programm auch nichts. Auch Methoden haben (offensichtlich) einen Gültigkeitsbereichs - wieder markiert durch `{` und `}`.

Zuletzt sehen wir uns noch Zeile `3` an: Der Inhalt der `main`-Methode ist eine einzige Anweisung - nämlich ein Ausdruck, in dem die Methode `println` aufgerufen wird. Diese Methode gehört zu einer anderen Klasse, auf die wir von hier aus zugreifen können. `System.out.println()` ist also ein Methoden-Aufruf. Die Methode `println` gibt das auf der Konsole aus, was ihr in den runden Klammern `(...)` übergeben wurde. In diesem Fall `"Hello World!"`. Am Ende von Zeile `3` steht ein Semikolon `;`. In Java müssen viele Anweisungen mit `;` abgeschlossen werden - welche das sind, wird später klarer.s


> :warning: **Nochmal: Wenn du Java nicht schon beherrschst**, siehst du in diesem winzigen Beispiel bereits viele Dinge, die dir jetzt noch nichts sagen. **Das ist in Ordnung!** Nimm den Code einfach so hin, wie er ist. Später kannst du hierher zurückkehren und prüfen, ob du schon alle in diesem Beispiel vorkommenden Konzepte kennst. Im Folgenden sollen dazu die einzelnen Bestandteile des Beispiel-Codes noch einmal genau benannt (**nicht** erklärt) werden, damit du weißt, wonach du in den weiteren Kapiteln suchen musst...


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