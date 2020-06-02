# Vererbung III: Interfaces 

-   werden mit `interface` eingeleitet (nicht mit `class`, siehe Beispiel unten)
-   werden von Klassen _implementiert_ (nicht erweitert) mit dem Schlüsselwort `implements`, oder von anderen Interfaces erweitert (in diesem Fall mit `extends`)
-   sind (wörtlich) eine **Schnittstelle** zu anderen Programmteilen
-   können nicht instanziiert werden
-   enthalten **keinerlei** Implementationen von Methoden, sondern nur abstrakte Methoden
    -   **Ausnahme:** Seit Java 8 gibt es [default methods](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)
-   Methoden sind hier automatisch `abstract` und `public`, wobei `public` meist trotzdem mit angegeben wird.

**Ein (minimales) Anwendungsbeispiel zu Interfaces:**  
Mit einem Interface `TextProcessor`, welches die Fähigkeiten von Text-Prozessoren beschreibt (nämlich das Prozessieren von Text, was auch immer das bedeutet) ...

```java
public interface TextProcessor {

  public String process(String input);

}
```

... lässt sich ein Programm entwickeln, welches Text-Prozessoren einsetzt, ohne jemals zu wissen, um was für Text-Prozessoren es sich genau handelt:

```java
public class TextEditor {

  private String text;

  public void applyTextProcessor(TextProcessor tp){
    text = tp.process(text);
  }

}
```

So kann das Entwickeln von Text-Prozessoren anderen Personen überlassen werden oder man fügt selbst später weitere mögliche Text-Prozessoren hinzu - und das alles ohne dass die Klasse `TextEditor` verändert werden müsste:

```java
public class TextToUpperCase implements TextProcessor {

  @Override
  public String process(String text){
    return text.toUpperCase();
  }

}
```

Da die Methode `applyTextProcessor()` der Klasse `TextEditor` gegen das Interface `TextProcessor` entwickelt wurde, funktioniert sie mit **jeder** ordentlichen Implementation von `TextProcessor`.


## Erweitern von Interfaces

Ein Interface kann ein anderes Interface erweitern:

```java
public interface Bar extends Foo {
    // ...
}
```

Die entsprechenden Methoden von `Foo` müssen dann von Klassen, die `Bar` implementieren, ebenfalls implementiert werden.


## `default`-Methoden

> :construction: **TODO:** Abschnitt über [`default`-Methoden](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)


<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>