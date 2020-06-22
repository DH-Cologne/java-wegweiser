# Objekte II: Repräsentation, Identität, Gleichheit

> :construction: **TODO:**  
> - gründlichere Formulierungen in ganzen Sätzen
> - weitere Inhalte aus der Übersicht in der README!

- [Objekte II: Repräsentation, Identität, Gleichheit](#objekte-ii-repräsentation-identität-gleichheit)
	- [toString()](#tostring)
	- [Objekt-Identität](#objekt-identität)
	- [Objekt-Gleichheit](#objekt-gleichheit)
	- [`equals(...)`](#equals)
	- [`hashCode()`](#hashcode)
	- [Der Vertrag zwischen `equals(...)` und `hashCode()`](#der-vertrag-zwischen-equals-und-hashcode)

## toString()

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

Objekt-Identität lässt sich mit dem Vergleichsoperator `==` feststellen. Das bedeutet, dass der Ausdruck `object1 == object2` dann `true` ist, wenn `object1` und `object2` Referenzen auf **das selbe** Objekt mit **der selben** Speicheradresse sind.

> :warning: Objekt-Identität ist selten das, was man feststellen möchte! Fast immer ist eine Überprüfung auf Objekt-Gleichheit (siehe unten) die richtige Lösung.


## Objekt-Gleichheit

Objekt-Gleichheit wird mit Hilfe der `equals()`-Methode ermittelt. Der Ausdruck `object1.equals(object2)` ist dann `true`, wenn die `equals()`-Methode `true` zurückgibt (na klar!) - und das tut sie nur dann, wenn ihre Implementation die Eigenschaften von `object1` und `object2` als "gleich" bewertet.

Mehr dazu unten, im Abschnitt zu `equals(...)`!


## `equals(...)`

Die Gleichheit von Objekten wird **nicht** mit `==` verglichen, sondern mit `equals()`, denn `==` überprüft nicht die semantische Gleichheit von zwei Objekten, sondern bildet lediglich einen _wahren_ Ausdruck, wenn es sich um zwei Referenzen _auf das selbe Objekt_ handelt (Objekt-Identität)!  

Genau wie `toString()`, sollte `equals()` grundsätzlich überschrieben werden (mindestens aber in [Datenklassen / POJOs](../Coding-Lingo.md#datenklasse)).

> **(!) Achtung:**  
> Man versucht gern mit `"hallo" == "hallo"` zu beweisen, dass sich Strings in Java so nicht vergleichen lassen (aus oben genannten Gründen) und steht dann ziemlich dumm da, wenn der Ausdruck plötzlich doch `true` ergibt. Das liegt an Javas _[string interning](https://stackoverflow.com/questions/10578984/what-is-java-string-interning)_, wodurch identische Strings intern auf das selbe Objekt (und somit die selbe Speicher-Referenz) reduziert werden!

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


## `hashCode()`

> :construction: **TODO**


## Der Vertrag zwischen `equals(...)` und `hashCode()`

> :construction: **TODO**







<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>
