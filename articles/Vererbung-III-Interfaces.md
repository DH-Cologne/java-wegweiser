# Vererbung III: Interfaces :electric_plug:

> :speech_balloon: _deu.: Schnittstelle_

- [Vererbung III: Interfaces :electric_plug:](#vererbung-iii-interfaces-)
  - [Zum Nutzen von Interfaces :thinking:](#zum-nutzen-von-interfaces-)
  - [Funktionsweise](#funktionsweise)
  - [`default`-Methoden](#default-methoden)


Bei Interfaces handelt es sich (ganz wörtlich) um **Schnittstellen** zu anderen Programmteilen. Schnittstellen bedeuten immer eine festgelegte Art der Interaktion bzw. Kommunikation - und genau das ist es, was _Interfaces_ in der OOP leisten.


## Zum Nutzen von Interfaces :thinking:

Die Frage, wozu Interfaces eigentlich gut sind, kommt den meisten, die objektorientierte Programmierung erlernen. Am besten lässt sie sich wohl mit einem Anwendungsbeispiel beantworten:

Stellen wir uns einmal vor, es gäbe in Java keine eingebaute Möglichkeit, die Elemente einer Datenstruktur zu sortieren. Wir entscheiden uns deshalb dazu, diese Funktionalität zu implementieren und zur offiziellen Java Standard Library beizutragen (easy), damit jede\*r Programmierer\*in auf der Welt diese Sortierfunktion nutzen kann.

Dabei gibt es aber ein Problem: Wir wissen nicht, welche Datentypen die zukünftigen Anwender*innen damit sortieren wollen. Und um irgendwelche Dinge sortieren zu können, **müssen** diese untereinander vergleichbar sein! Wie also sollen wir z.B. eine Klasse schreiben, die den Inhalt von Datenstrukturen sortieren kann, ohne dass wir im Voraus wissen, was dieser Inhalt sein wird?

Die Antwort: Ein _Interface_ muss her! Eine _Schnittstelle_ zwischen unserer Sortier-Klasse und den Datentypen, die damit sortiert werden können. Diese Schnittstelle sollte alle Eigenschaften festlegen, die ein _sortierbarer_ Datentyp mitbringen muss, damit er zu unserer Klasse kompatibel ist. Und diese Eigenschaft haben wir oben bereits gefunden: Die Instanzen des Datentyps **müssen untereinander vergleichbar sein**!

Weil wir gute Programmierer*innen sind, geben wir unserem Interface einen sprechenden Namen, der das abbildet, was das Interface beschreibt: `Comparable` (_deu.: vergleichbar_). Alle Klassen, die das _Interface_ `Comparable` implementieren (so heißt das bei Interfaces - **nicht** "erweitern"), sollten eine Methode `compareTo()` besitzen, die das jeweilige Objekt mit einem übergebenen Objekt vergleicht und je nach Ergebnis `true` oder `false` (also ein `boolean`-Wert) zurückgibt. Dass diese Methode vorhanden sein muss, legen wir in unserem Interface `Comparable` fest. Fertig.

Jetzt programmieren wir also unsere Sortier-Klasse so, dass sie Datenstrukturen sortieren kann, die `Comparable`s enthalten - ganz egal, was für Datentypen das nun eigentlich sind. Uns interessiert nur die Vergleichbareit - die Rückgabe der Methode `compareTo()`!

> :speech_balloon: Das Interface `Comparable` gibt es übrigens wirklich. Dieses Beispiel ist nicht ausgedacht - im Gegenteil: Genau so funktioniert das Zusammenspiel von [`Comparable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) und [`Collections.sort()`](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List)).


## Funktionsweise

Interfaces werden mit `interface` eingeleitet (nicht mit `class`, siehe Beispiel unten). Sie enthalten **keinerlei** Implementationen von Methoden, sondern nur abstrakte Methoden (Ausnahme: Seit Java 8 gibt es [default methods](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)).

Die in Interfaces durch bloße Signaturen definierten Methoden sind automatisch `abstract` und `public`, wobei `public` meist trotzdem mit angegeben wird.

```java
public interface TextProcessor {

  public String process(String input);

}
```

Interfaces werden von Klassen _implementiert_ (nicht erweitert), wobei eine Klasse beliebig viele Interfaces implementieren kann. Dies geschieht mit dem Schlüsselwort `implements`. Die Klasse **muss** dann alle im Interface vorgeschriebenen Methoden implementieren:

```java
public class TextToUpperCase implements TextProcessor {

  @Override
  public String process(String text){
    return text.toUpperCase();
  }

}
```

Ein Interface **kann nicht direkt instanziiert werden**, d.h. es kann von einem Interface `TextProcessor` (siehe Beispiel oben) keine Instanz mittels `new TextProcessor()` erzeugt werden*. Eine Instanz eines Interface kann nur dadurch erzeugt werden, dass eine Instanz einer Klasse erzeugt wird, die dieses Interface implementiert**.

> \* _Das stimmt so nicht ganz: Siehe [Anonyme Klassen](Innere-und-anonyme-Klassen.md)!_

> \*\* _Das hingegen stimmt so und steht **nicht** im Widerspruch zu [Anonymen Klassen](Innere-und-anonyme-Klassen.md)!_

Hier wird einer Methode eine Instanz von `TextProcessor` übergeben (es ist unbekannt - und unwichtig - das das genau für ein `Textprocessor` ist!):

```java
public class TextEditor {

  private String text;

  public void applyTextProcessor(TextProcessor tp){
    text = tp.process(text);
  }

}
```

Interfaces können von anderen Interfaces erweitert werden! Dies geschieht wie beim Erweitern von Klassen - mit dem Schlüsselwort `extends`.

```java
public interface SpecialTextProcessor extends TextProcessor {

  //Dieses Interface "erbt" alle Methoden von "TextProcessor"
  //und fügt eigene hinzu:

  public String specialProcess(String input);

}
```

So ließe sich ein Programm entwickeln, welches Text-Prozessoren einsetzt, ohne jemals zu wissen, um was für Text-Prozessoren es sich genau handelt. Auf diese Weise kann das Entwickeln von Text-Prozessoren anderen Personen überlassen werden oder man fügt selbst später weitere mögliche Text-Prozessoren hinzu - und das alles ohne dass die Klasse `TextEditor` verändert werden müsste!

Da die Methode `applyTextProcessor()` der Klasse `TextEditor` gegen das Interface `TextProcessor` entwickelt wurde, funktioniert sie mit **jeder** "ordentlichen" Implementation von `TextProcessor`.


## `default`-Methoden

> :construction: **TODO:** Abschnitt über [`default`-Methoden](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)


<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>