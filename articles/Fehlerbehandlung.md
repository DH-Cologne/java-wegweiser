# Fehlerbehandlung :x:<!-- omit in toc -->

- [Throwable](#throwable)
- [Errors](#errors)
- [Exceptions](#exceptions)
- [try-catch-finally](#try-catch-finally)
- [throws](#throws)
- [try-with-resources](#try-with-resources)
- [Weiterführende Links](#weiterführende-links)


## Throwable
In Programmen können verschiedene Fehler auftreten. All diese Fehler sind (auf höchster Ebene) durch das Interface `Throwable` repräsentiert (siehe Grafik unten!). Der Name kommt daher, dass man auch sagt, ein auftretender Fehler wird "_geworfen_" (eng. _thrown_). D.h. das Programm teilt mit, dass an einer bestimmten stelle des Codes ein Fehler aufgetreten ist. Man unterscheidet zwischen zwei Arten von Fehlern: **Errors** und **Exceptions** (siehe auch hier Grafik unten!).

![Exceptions/Errors Class Hierarchy](../assets/images/Exception-Hierarchy-Diagram.jpeg)  
> _Quelle: [programcreek.com](http://www.programcreek.com/2009/02/diagram-for-hierarchy-of-exception-classes/)_


## Errors

**Errors** sind Fehler, die _nicht aufgefangen werden können_ (_catch_), d.h. das Programm kann nicht konstruktiv auf sie reagieren. Sie bringen das Programm unweigerlich zum Absturz. Sie entstehen etwa durch fehlende Systemressourcen. Beispiele hierfür sind `OutOfMemoryError` (mehr :link: [hier](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/memleaks002.html)) oder `StackOverflowError` (mehr :link: [hier](https://dzone.com/articles/stackoverflowerror-causes-amp-solutions)).

```java
// dieser Code führt zu einem OutOfMemoryError
String s = "ThisWillThrowAnError";
while(true) {
  s += s;
}
```

```java
// das Aufrufen dieser Methode führt zu einem StackOverflowError
public static void stackOverflow() {
  stackOverflow();
}
```


## Exceptions

Exceptions sind Fehler, die durch eine korrekte Fehlerbehandlung "_aufgefangen_" werden können (eng. _catch_). In diesem Fall weiß das Programm mit einem Fehler umzugehen und kann weiter ausgeführt werden. 

Es werden "_checked_" und "_unchecked_" Exceptions unterschieden: _Checked_ Exceptions sind solche Exceptions, deren mögliches Auftreten (und fehlendes Auffangen!) bereits vom :point_right: [Compiler](../Glossar.md#compiler) überprüft wird. Beispiele sind die `ClassNotFoundException` oder die `IOException`. _Unchecked_ Exceptions hingegen treten während der Laufzeit des Programmes auf (siehe `RuntimeException` in der Grafik oben!) - sie können nicht vorhergesagt werden und lassen sich nur durch das schreiben von gutem, fehlerfreiem Code verhindern.

```java
// dieser Code erzeugt eine NullPointerException,
// weil auf ein Array-Element zugegriffen wird, das null ist.
String[] s = new String[2];
System.out.println(s[0].length());
```

```java
// dieser Code erzeugt eine ArrayIndexOutOfBoundsException,
// weil auf einen Array-Index zugegriffen wird, der nicht existiert.
String[] s = new String[2];
System.out.println(s[7]);
```

```java
// dieser Code erzeugt eine ArithmeticException: / by zero,
// weil durch die Zählvariable i (mit dem Wert 0) geteilt wird.
for (int i = 5; i >= -5; i--) {
		System.out.println(5 / i);
}
```

Exceptions können durch den Code bewusst "_geworfen_" (eng. _throw_), also ausgelöst, oder - um mit ihnen umzugehen - "_aufgefangen_" werden (eng. _catch_). Genau damit beschäftigen sich die folgenden Kapitel.


## try-catch-finally

Mit einem Statement aus `try`, `catch` und `finally` wird der Umgang mit potentiellen Exceptions definiert. Ein solches Statement (siehe Beispiel unten!) wird immer dann verwendet, wenn es aufgrund einer checked Exception vom Compiler verlangt wird, oder wenn der/die Programmierer*in
damit rechnet, dass ein Code unter bestimmten Bedingungen eine Exception werden könnte.

Der `try`-Block enthält den Code, der eine Exception verursachen könnte. Mindestens ein `catch`-Block enthält den Code, der im Falle einer bestimmten Exception ausgeführt werden soll. Ein `catch`-Block wird nur dann ausgeführt, wenn die geworfene Exception innerhalb des `try`-Blocks geworfen wird und die Art der Exception der im Kopf des `catch`-Blocks angegebenen Exception entspricht (siehe Beipspiel unten!). Der `finally`-Block (falls vorhanden, er ist optional!) enthält Code, der unabhängig von einem ausgelösten `catch`-Block **am Ende der Fehlerbehandlung** auf jeden Fall ausgeführt werden soll. Dabei spielt es keine Rolle, ob ein Fehler aufgetreten ist!

![try-catch-finally-flow](../assets/images/java-try-catch-finally-flow.jpg)  
> _Quelle: [howtodoinjava.com](https://howtodoinjava.com/java/exception-handling/try-catch-finally/)_

Nach dem _try-catch(-finally)_-Statement wird der darauf folgende Programm-Code weiter ausgeführt. Falls im `try`-Block kein Fehler auftritt, werden alle `catch`-Blöcke ignoriert; ein etwaiges `finally` wird aber generell ausgeführt. Falls keiner der definierten `catch`-Blöcke die geworfene Exception abfängt, wird trotzdem ein evtl. vorhandener `finally`-Block ausgeführt, bevor die Exception dann von der default-Fehlerbehandlung verarbeitet wird (:link: [StackTrace](https://en.wikipedia.org/wiki/Stack_trace) über den :link: [Stderr](https://en.wikipedia.org/wiki/Standard_streams#Standard_error_(stderr)) auf der Konsole ausgeben).


**Syntax und Beispiel:**

Nehmen wir eine Methode `schroedingersArray()` an, die (völlig unberechenbar) entweder eine `ArrayIndexOutOfBoundsException` oder eine `ArithmeticException` verursacht:

```java
public static void schroedingersArray() {
    	// Zufallszahlen-Generator erzeugen
    	Random rnd = new Random();
    	
    	// Array zufälliger Größe zwischen 1 und 10 erzeugen
    	int[] numbers = new int[rnd.nextInt(10) + 1];
    	
    	// alle Stellen des Arrays mit zufälligen Zahlen zwischen 0 und 4 füllen
    	for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(5);
		}
    	
    	/*
    	 * Auf die Indizes 0 bis 9 des Arrays zugreifen und i durch den Wert
    	 * des aktuellen Elementes teilen. Dabei ist nicht sicher, ob zuerst
    	 * eine ArrayIndexOutOfBoundsException oder eine ArithmeticException
    	 * auftritt:
    	 */
    	for (int i = 0; i < 10; i++) {
			System.out.println(i / numbers[i]);
		}
}
```

Um nun mit diesen möglichen Exceptions umzugehen, damit sie unser Programm nicht vorzeitig beenden, nehmen wir den Aufruf von `schroedingersArray()` im `try`-Block einer entsprechenden Fehlerbehandlung vor:

```java
try {
  schroedingersArray();
} catch (ArithmeticException e1) {
  //auf diesen speziellen Fehler reagieren
  System.out.println("Hier wurde wohl durch 0 geteilt :(");
} catch (ArrayIndexOutOfBoundsException e2) {
  //auf diesen speziellen Fehler reagieren
  System.out.println("Dieser Index existiert nicht!");
} catch (Exception e3) {
  //auf alle sonstigen Fehler reagieren
  System.out.println("Unbekannter Fehler aufgetreten!");
} finally {
  //dieser Code wird in jedem Fall ausgeführt
  System.out.println("Das alles war von Anfang an keine gute Idee!");
}
    	
System.out.println("...aber das Leben geht weiter!");
```

Dieser Code würde nun so etwas wie...

```
0
0
Dieser Index existiert nicht!
Das alles war von Anfang an keine gute Idee!
...aber das Leben geht weiter!
```

...ausgeben. Das Programm läuft also _nach_ dem Fehler weiter!


## throws

Eine Methode kann explizit dazu in der Lage sein, eine bestimmte Exception zu "_werfen_". Dies wird mit dem Schlüsselwort `throws` markiert. Der Typ der Exception muss dabei angegeben werden. Methoden, in denen diese "_werfende_" Methode aufgerufen wird, _müssen_ eine Fehlerbehandlung vornehmen (Ausnahme: Exceptions vom Typ `RuntimeException`)!

```java
public String thisWillFail() throws IOException {
  return Files.readString(
      new File("this_file_doesnt_exist.haha").toPath());
}
```


## try-with-resources

> :warning: Die Lektüre dieses Kapitels empfiehlt sich erst, wenn die Inhalte zu [Input / Output (I/O)](IO.md) bereits bekannt sind!

Eine Spezialform der Fehlerbehandlung für im `try`-Block verwendete Ressourcen, die nach ihrer Verwendung wieder geschlossen werden müssen (etwa beim Arbeiten mit Datenströmen) ist das sog. _try-with-resources_-Statement.

Der `try`-Block deklariert die entsprechende(n) Ressource(n) (mehrere Ressourcen durch `;` getrennt möglich!) in runden Klammern nach dme `try`. Normalerweise würde man die verwendeten Ressourcen im `finally`-Block schließen - dies geschieht hier aber automatisch! Diese Form des `try`-Blocks funktioniert mit allen Ressourcen, die `java.lang.AutoCloseable` implementieren (schließt `java.lang.Closeable` ein, denn `Closeable` erweitert `AutoCloseable`).

**Beispiel Datei einlesen OHNE try-with-resources**

```java
  BufferedReader br = null;
  String line;

  try {
    br = new BufferedReader(new FileReader("text.txt"));
    while ((line = br.readLine()) != null) {
      System.out.println("Zeile gelesen: " + line);
    }
  } catch (IOException e) {
    System.out.println("IOException im try-Block: " + e.getMessage());
  } finally {
    System.out.println("Ausführung finally-Block...");
    //so müsste man den Reader eigentlich schließen:
    try {
      if (br != null) {
        br.close();
      }
    } catch (IOException e) {
      System.out.println("IOException im finally-Block: " + e.getMessage());
    }
  }
```

**Beispiel Datei einlesen MIT try-with-resources**

```java
  String line;

  try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
    while ((line = br.readLine()) != null) {
      System.out.println("Zeile gelesen: " + line);
    }
  } catch (IOException e) {
    System.out.println("IOException im try-Block: " + e.getMessage());
  }
```


## Weiterführende Links
- [Difference Between Error and Exception in Java](https://techdifferences.com/difference-between-error-and-exception.html)
- [ORACLE Lesson: Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [List of Java Exceptions](https://programming.guide/java/list-of-java-exceptions.html)




<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>