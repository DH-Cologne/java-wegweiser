# Objekte II: Repräsentation, Identität, Gleichheit

- [Objekte II: Repräsentation, Identität, Gleichheit](#objekte-ii-repräsentation-identität-gleichheit)
	- [toString()](#tostring)
	- [Objekt-Identität](#objekt-identität)
	- [Objekt-Gleichheit](#objekt-gleichheit)
	- [`equals()`](#equals)
	- [`hashCode()`](#hashcode)
	- [Der Vertrag zwischen `equals()` und `hashCode()`](#der-vertrag-zwischen-equals-und-hashcode)

## toString()

> :warning: Hier geht es zum Teil um das Überschreiben von Methoden. Um dieses Kapitel gänzlich zu verstehen, solltest du die [Grundlagen der Vererbung](Vererbung-I-Grundlagen.md) bereits kennen!

Die `toString()`-Methode gibt eine möglichst sinnvolle textuelle (_String_-) Repräsentation des Objektes zurück, für das es aufgerufen wird. Sie sollte in eigenen Klassen generell überschrieben werden, mindestens aber in [Datenklassen / POJOs](../Coding-Lingo.md#datenklasse).

Falls `toString()` für den Typ des Objektes nicht überschrieben ist, wird (wie bei allen entsprechenden Methoden) die `toString()`-Methode der Superklasse (nämlich `Object`) aufgerufen.

Dieser Code ...

```java
public class User {

	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User(" + name + ")";
	}

}

public class Program {

	public static void main(String[] args) {
		User u = new User("Otto Normal");
		System.out.println(u);
	}

}
```

... würde **ohne** überschriebene `toString()`-Methode in der Klasse User **User@4aa298b7** (o.ä.) ausgeben, gibt nun aber stattdessen **User(Otto Normal)** aus. Diese Repräsentation des User-Objektes ist natürlich wesentlich lesbarer.


## Objekt-Identität

Objekt-Identität lässt sich mit dem Vergleichsoperator `==` überprüfen. Das bedeutet, dass der Ausdruck `object1 == object2` dann `true` ist, wenn `object1` und `object2` Referenzen auf **das selbe** Objekt mit **der selben** Speicheradresse sind.

> :warning: **ACHTUNG:** Objekt-Identität ist extrem selten das, was man feststellen möchte! _Fast immer_ ist eine Überprüfung auf Objekt-Gleichheit (siehe unten) der richtige Weg!


## Objekt-Gleichheit

Objekt-Gleichheit wird mit Hilfe der `equals()`-Methode ermittelt. Der Ausdruck `object1.equals(object2)` ist dann `true`, wenn die `equals()`-Methode `true` zurückgibt (na klar!) - und das tut sie nur dann, wenn ihre Implementation die Eigenschaften von `object1` und `object2` als "gleich" bewertet.

Mehr dazu unten, im Abschnitt zu `equals(...)`!


## `equals()`

> :warning: Hier geht es zum Teil um das Überschreiben von Methoden. Um dieses Kapitel gänzlich zu verstehen, solltest du die [Grundlagen der Vererbung](Vererbung-I-Grundlagen.md) bereits kennen!

Die :point_right: [Gleichheit](../Glossar.md#objekt-gleichheit) von Objekten wird **nicht** mit `==` verglichen, sondern mit der `equals()`-Methode (ursprünglich aus `Object`, sollte aber ggf. überschrieben werden!), denn `==` überprüft nicht die semantische Gleichheit von zwei Objekten, sondern bildet lediglich einen _wahren_ Ausdruck, wenn es sich um zwei Referenzen _auf das selbe Objekt_ handelt (:point_right: [Objekt-Identität](../Glossar.md#objekt-identität))!  

Genau wie `toString()`, sollte `equals()` in allen Klassen, von denen es tendenziell viele Instanzen () geben wird, grundsätzlich überschrieben werden (mindestens aber in [Datenklassen / POJOs](../Coding-Lingo.md#datenklasse)).

```java
public class User {

	private String eMail;

	public User(String eMail) {
		this.eMail = eMail;
	}

	public String getEMail() {
		return eMail;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null
			&& obj instanceof User
			&& ((User)obj).getEMail().equals(this.getEMail());
	}

}

public class Program {
	public static void main(String[] args) {
		User u1 = new User("otto@normal.de");
		User u2 = new User("otto@normal.de");
		System.out.println(u1 == u2); // false
		System.out.println(u1.equals(u2)); // true
	}
}
```

Im Beispiel oben gibt die `equals()`-Methode der Klasse `User` nur dann `true` zurück (gleichen sich also zwei `User`-Objekte), wenn das `User`-Objekt, mit dem verglichen werden soll (Parameter `obj`) ...

1) ... nicht `null` ist
2) ... vom Typ `User` ist
3) ... der Wert des Feldes `eMail` dem des aufgerufenen Objektes gleicht (dazu wird einfach die `equals()`-Methode von `String` genutzt!)


> :speech_balloon: **Übrigens:** Man versucht gern mit `"hallo" == "hallo"` zu beweisen, dass sich Strings in Java so nicht vergleichen lassen (aus oben genannten Gründen) und steht dann ziemlich dumm da, wenn der Ausdruck plötzlich doch `true` ergibt. Das liegt an Javas _[string interning](https://stackoverflow.com/questions/10578984/what-is-java-string-interning)_, wodurch "gleiche" Strings intern auf das selbe Objekt (und somit die selbe Speicher-Referenz) reduziert werden, um Arbeitsspeicher zu sparen!


## `hashCode()`

> :warning: Hier geht es zum Teil um das Überschreiben von Methoden. Um dieses Kapitel gänzlich zu verstehen, solltest du die [Grundlagen der Vererbung](Vererbung-I-Grundlagen.md) bereits kennen!

Die Methode `hashCode()` der Klasse `Object` ist eine weitere Methode, die häufig in eigenen Klassen überschrieben werden sollte. Sie gibt einen Hashcode (vom Typ `int`) zurück, der das Objekt repräsentiert, für das `hashCode()` aufgerufen wurde.

Ein Hashcode ist das Ergebnis eines sog. Hashing-Algorithmus und hat das Ziel, Daten oder eben ein Objekt eindeutig zu repräsentieren, d.h. zwei unterschiedliche Objekte solleten auf jeden Fall auch unterschiedliche Hashcodes erzeugen. Diese Hashcodes lassen sich nun miteinander vergleichen, ohne dass man die eigentlichen Daten (oder Objekte) miteinander vergleichen müsste. Das geht im Zweifel viel schneller, da z.B. der Hashcode eines 10 Mio. Zeichen langen Strings genauso kurz ist, wie der eines 10 Zeichen langen Strings - es ist eben ein Integer-Wert!

> :speech_balloon: In Java wird die Methode `hashCode()` vor allem von bestimmten Datenstrukturen (Hashtables wie etwa `HashMap`) dazu genutzt, ein in der Datenstruktur enthaltenes Element besonders schnell zu finden, indem die Hashcodes alles Elemente in einer Art sortiertem Inhaltsverzeichnis angelegt werden.

**Beispiel:** Der folgende Code...

```java
System.out.println("Hallo".hashCode());
System.out.println("Welt!".hashCode());
```

...gibt z.B. folgendes auf der Konsole aus:

```
69490486
83462635
```

Es existieren sehr viele verschiedene :link: [Hashing-Algorithmen](https://de.wikipedia.org/wiki/Hashfunktion) - und nicht alle geben einen Integer aus. Aber sie alle haben das selbe Ziel: Einen relativ kurzen aber eindeutigen Code zu erzeugen (Output), der die übergebenen Daten (Input) repräsentiert.

Es sollte dabei nach Möglichkeit keine "Kollisionen" geben, d.h. zwei unterschiedliche Objekte dürfen nicht den selben Hashcode produzieren. In der Praxis funktioniert das (je nach Algorithmus) besser oder schlechter, aber eine :link: [Kollision](https://en.wikipedia.org/wiki/Collision_(computer_science)) ist **nie** 100%ig ausgeschlossen. Trotzdem kommen Kollisionen bei guten Hashing-Algorithem recht selten vor.

> :speech_balloon: Welcher Hashing-Algorithmus in der Software-Entwicklung wofür genutzt wird, hängt vom Verwendungszweck und somit davon ab, wie groß der Schaden einer Hash-Kollision wäre. Besonders sicher Algorithmen (mit wenigen Kollisionen) sind langsam. Wenn Geschwindigkeit wichtiger ist, nutzt man eher einen schnellen, dafür aber etwas unsaubereren Algorithmus. Javas `hashCode()`-Algorithmus der Klasse `String` nutzt z.B. diese simple Formel: `s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]`. Das geht recht schnell, Kollisionen kommen aber durchaus vor - so haben z.B. die Strings `"Aa"` und `"BB"` den gleichen Hashcode. 🤷


## Der Vertrag zwischen `equals()` und `hashCode()`

Weil die Seminatk dieser beiden Methoden es gebietet und weil `equals()` und `hashCode()` in Java unter anderem von bestimmten Datenstrukturen dazu genutzt wird, um Duplikate zu erkennen, besteht ein "Vertrag" zwischen `equals()` und `hashCode()`. Diesen Vertrag **muss die programmierende Person einhalten**.

Der Vertrag besagt, dass zwei Objekte, die ihrer `equals()`-Methode nach **gleich** sind, auch den gleichen `hashCode()` zurückgeben **müssen**. Andersherum bedeuten identische Hashcodes aber nicht, dass `equals()` auch `true` sein muss, denn es kann ja Kollisionen in der Hashfunktion geben (siehe oben!).

Weiterhin (und das erschließt sich nun eigentlich von selbst) darf `equals()` auf keinen Fall `true` für zwei Objekte mit unterschiedlichem `hashCode()` zurückgeben. Denn es können zwar Kollisionen vorkommen, aber es _kann nicht_ passieren, dass ein Hash-Algorithmus für gleichen Input unterschiedlichen Output liefert!





<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>
