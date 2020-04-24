# Fehlerbehandlung :x: 

## Exceptions und Errors

-   In Programmen können Fehler (**Exceptions** und **Errors**) auftreten (man sagt auch, es wird ein Fehler _"geworfen"_)
-   Errors sind Fehler, die _nicht aufgefangen werden können_ (catch), sie bringen das Programm zum Absturz
-   Exceptions können _"aufgefangen"_ werden (catch), d.h. es kann mit Hilfe einer gut durchdachten Fehlerbehandlung mit dem Fehler umgegangen werden, sodass das Programm nicht unerwartet beendet werden muss
-   **Exception** und **Error** sind vom Typ _Throwable_ (deshalb _"Werfen"_ von Fehlern), es steckt eine ganze Klassenhierarchie hinter den verschiedenen Fehlertypen

![Exceptions/Errors Class Hierarchy](../assets/images/Exception-Hierarchy-Diagram.jpeg)  
Quelle: [programcreek.com](http://www.programcreek.com/2009/02/diagram-for-hierarchy-of-exception-classes/)

## try-catch-finally

-   Mit einem Code-Block aus `try`, `catch` und `finally` wird der Umgang mit potentiellen Exceptions definiert
-   `try`-Block enthält den Code, der eine Exception verursachen könnte.
-   `catch`-Block/Blöcke (einer oder mehrere) enthält den Code, der im Falle einer bestimmten Exception ausgeführt wird. Ein `catch`-Block wird nur dann ausgeführt, wenn die geworfene Exception
-   `finally`-Block (falls vorhanden, optional!) enthält den Code, der unabhängig von einem ausgelösten `catch`-Block **am Ende der Fehlerbehandlung** ausgeführt wird. Dabei spielt es keine Rolle, ob eine Fehler überhaupt aufgetreten ist!
-   Nach dem _try-catch(-finally)_-Block wird der darauf folgende Programm-Code weiter ausgeführt.
-   Falls im `try`-Block kein Fehler auftritt, werden alle `catch`-Blöcke ignoriert; ein etwaiges `finally` wird aber noch ausgeführt.
-   Falls kein `catch`-Block die geworfene Exception abfängt, wird trotzdem ein evtl. vorhandener `finally`-Block ausgeführt, bevor die Exception dann von der default-Fehlerbehandlung verarbeitet wird (Stack Trace über den ErrOut auf Konsole ausgeben).

![try-catch-finally-flow](../assets/images/java-try-catch-finally-flow.jpg)  
Quelle: [howtodoinjava.com](https://howtodoinjava.com/java/exception-handling/try-catch-finally/)

**Syntax und Beispiel:**

```java
  int[] numbers = {1,2,3};
  int number = 0;

  try {
    number = numbers[3]; //Index existiert nicht!
  } catch (ArrayIndexOutOfBoundsException ex){
    //auf diesen speziellen Fehler reagieren
    System.out.println("Dieser Index existiert nicht!");
  } catch (Exception ex) {
    //ansonsten: Auf jeden anderen Fehler reagieren
    System.out.println("Es ist ein Fehler aufgetreten!");
  } finally {
    //wird auf jeden Fall (ggf. am Ende der Fehlerbehandlung) ausgeführt:
    if (number == 0) number = -1;
    System.out.println(number);
  }
```

Dieser Code würde für `number = numbers[2]` einfach `3` ausgeben. Falls aber ein Fehler auftritt, etwa wie im Beispiel bei `number = numbers[3]`, wäre die Ausgabe `Dieser Index existiert nicht! -1` (Zeilenumbruch hier entfernt).

## try-with-resources

-   Spezialform der Fehlerbehandlung für im `try`-Block verwendete Ressourcen, die nach ihrer Verwendung wieder geschlossen werden müssen (etwa beim Arbeiten mit Datenströmen)
-   Der `try`-Block deklariert die entsprechende(n) Ressource(n) (mehrere Ressourcen durch `;` getrennt möglich!)
-   Normalerweise würde man die Ressourcen im `finally`-Block schließen - dies geschieht hier aber automatisch!
-   Diese Form des `try`-Blocks funktioniert mit allen Ressourcen, die `java.lang.AutoCloseable` implementieren (schließt `java.lang.Closeable` ein, denn `Closeable` erweitert `AutoCloseable`).

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

## throws

-   Eine Methode kann explizit dazu in der Lage sein, eine bestimmte Exception zu "werfen". Dies wird mit dem Schlüsselwort `throws` markiert.
-   Der Typ der Exception muss dabei angegeben werden.
-   Methoden, in denen diese "werfende" Methode aufgerufen wird, müssen eine Fehlerbehandlung vornehmen (Ausnahme: Exceptions vom Typ `RuntimeException`)!

```java
public int thisWillFail(int[] numbers) throws ArrayIndexOutOfBoundsException {
  return numbers[numbers.length];
}
```


<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#">:arrow_up:</a>