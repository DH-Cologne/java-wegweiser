# Vererbung III: Interfaces 🔌<!-- omit in toc -->

> 💬 _deu.: Schnittstelle_

- [Zum Nutzen von Interfaces 🤔](#zum-nutzen-von-interfaces-)
- [Funktionsweise](#funktionsweise)
- [Default-Methoden](#default-methoden)
- [Statische Methoden in Interfaces](#statische-methoden-in-interfaces)


Bei Interfaces handelt es sich (ganz wörtlich) um **Schnittstellen** zu anderen Programmteilen. Schnittstellen bedeuten immer eine festgelegte Art der Interaktion bzw. Kommunikation - und genau das ist es, was _Interfaces_ in der OOP leisten.


## Zum Nutzen von Interfaces 🤔

Die Frage, wozu Interfaces eigentlich gut sind, kommt den meisten, die objektorientierte Programmierung erlernen. Am besten lässt sie sich wohl mit einem Anwendungsbeispiel beantworten:

Stellen wir uns einmal vor, es gäbe in Java keine eingebaute Möglichkeit, die Elemente einer Datenstruktur zu sortieren. Wir entscheiden uns deshalb dazu, diese Funktionalität zu implementieren und zur offiziellen Java Standard Library beizutragen (easy), damit jede\*r Programmierer\*in auf der Welt diese Sortierfunktion nutzen kann.

Dabei gibt es aber ein Problem: Wir wissen nicht, welche Datentypen die zukünftigen Anwender*innen damit sortieren wollen. Und um irgendwelche Dinge sortieren zu können, **müssen** diese untereinander vergleichbar sein! Wie also sollen wir z.B. eine Klasse schreiben, die den Inhalt von Datenstrukturen sortieren kann, ohne dass wir im Voraus wissen, was dieser Inhalt sein wird?

Die Antwort: Ein _Interface_ muss her! Eine _Schnittstelle_ zwischen unserer Sortier-Klasse und den Datentypen, die damit sortiert werden können. Diese Schnittstelle sollte alle Eigenschaften festlegen, die ein _sortierbarer_ Datentyp mitbringen muss, damit er zu unserer Klasse kompatibel ist. Und diese Eigenschaft haben wir oben bereits gefunden: Die Instanzen des Datentyps **müssen untereinander vergleichbar sein**!

Weil wir gute Programmierer*innen sind, geben wir unserem Interface einen sprechenden Namen, der das abbildet, was das Interface beschreibt: `Comparable` (_deu.: vergleichbar_). Alle Klassen, die das _Interface_ `Comparable` implementieren (so heißt das bei Interfaces - **nicht** "erweitern"), sollten eine Methode `compareTo()` besitzen, die das jeweilige Objekt mit einem übergebenen Objekt vergleicht und je nach Ergebnis `true` oder `false` (also ein `boolean`-Wert) zurückgibt. Dass diese Methode vorhanden sein muss, legen wir in unserem Interface `Comparable` fest. Fertig.

Jetzt programmieren wir also unsere Sortier-Klasse so, dass sie Datenstrukturen sortieren kann, die `Comparable`s enthalten - ganz egal, was für Datentypen das nun eigentlich sind. Uns interessiert nur die Vergleichbareit - die Rückgabe der Methode `compareTo()`!

> 💬 Das Interface `Comparable` gibt es übrigens wirklich. Dieses Beispiel ist nicht ausgedacht - im Gegenteil: Genau so funktioniert das Zusammenspiel von [`Comparable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) und [`Collections.sort()`](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List)).


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


## Default-Methoden

Seit Java 8 können Interfaces sogenannte Default-Methoden (markiert mit dem Schlüsselwort `default`) besitzen. Diese Methoden sind, wie alle Methoden-Signaturen in Interfaces, weiterhin dazu gedacht, in Klassen implementiert zu werden, die das jeweilige Interface implementieren. Das Besondere an Default-Methoden ist aber, dass sie eine Standard-Implementation ihrer selbst zur Verfügung stellen, falls sie in der implementierenden Klasse nicht berücksichtigt werden.

```java
public interface ExampleInterface {
	// normale Methoden Signatur
	String why();
	
	// Default-Methode
	default String because() {
		return "I can.";
	}
}
```

Es drängt sich natürlich die Frage auf, wozu es diese Methoden denn dann gibt, wenn sie nicht mehr implementiert werden müssen - immerhin ist das ja Sinn und Zweck von Interfaces!

Der Grund für Default-Methoden liegt in der langfristigen Wartbarkeit und Kompatibilität größerer, evtl. weit verbreiteter Programme- und Bibliotheken. Bevor es die Default-Methoden gab, konnte nämlich zu einem Interface keine zusätzliche Methode(-ensignatur) hinzugefügt werden, ohne dass alle implementierenden Klassen angepasst werden mussten. Jetzt geht das - mit einer default-Implementation der neuen Methode!

> 🔗 Einen weiterführenden Artikel zum Thema findest du [hier](https://www.baeldung.com/java-static-default-methods).

> 💬 Ein schönes Beispiel für den Einsatz von `default`-Methoden in Interfaces ist auch die [Methode `remove()` des Interfaces `Iterator`](https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html): Seit Java 8 ist diese eine `default`-Methode und _muss nicht mehr zwingend implementiert werden_. Die `default`-Implementation wirft einfach eine `UnsupportedOperationException`. Siehe auch [_Iterable und Iterator_](Iterable-und-Iterator.md).


## Statische Methoden in Interfaces

Ebenfalls seit Java 8 ist es möglich Interfaces mit statischen Methoden auszustatten. Der Hintergedanke hierzu ist, dass bisher sehr häufig sogenannte "Helferklassen" (oder auch "helper classes" oder "utility classes") geschrieben wurden, die ausschließlich statische Methoden enthalten, die vollkommen zustandslos sind. Ein (bewusst simpel gehaltenes) Beispiel wäre diese Klasse:

```java
public class StringHelper {
	
	public static int vowelsCount(String s) {
		return s.replaceAll("(?i)[^aeiou]", "").length();
	}
	
	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
}
```

Hier werden zwei einfache Methoden angeboten, die irgendetwas mit Strings tun. Sie benutzen keine Klassenvariablen und stehen einfach so für sich.

Nun sind Klassen in der objektorientierten Programmierung aber dazu da, Objekte mit Eigenschaften und Fähigkeiten zu beschreiben. Die Klasse `StringHelper` tut das nicht: Es wäre sinnlos, ein Objekt vom Typ `StringHelper` zu erzeugen.

Aus diesem Grund kann man nun Interfaces mit statischen Methoden Schreiben:

```java
public interface StringHelper {
	
	public static int vowelsCount(String s) {
		return s.replaceAll("(?i)[^aeiou]", "").length();
	}
	
	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
}
```

> 💬 Hier hat sich nur `class` in `interface` geändert!

Der Unterschied ist natürlich marginal, aber es ist semantisch viel sauberer, denn Interfaces können ohnehin nicht instanziiert werden. Man ruft diese Methoden wie alle anderen statischen Methoden in der Form `StringHelper.reverse("Hello")` auf. Anders geht es auch nicht - denn es gibt ja keine Instanz von `StringHelper`!

> 🔗 Einen weiterführenden Artikel zum Thema findest du [hier](https://www.baeldung.com/java-static-default-methods).






