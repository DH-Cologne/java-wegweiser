# Objekte II: Repräsentation, Identität, Gleichheit

> :construction: **TODO:**  
> - gründlichere Formulierungen in ganzen Sätzen
> - weitere Inhalte aus der Übersicht in der README!


## toString()

-   gibt eine möglichst sinnvolle textuelle (_String_-) Repräsentation des Objektes zurück, für das es aufgerufen wird
-   sollte in eigenen Klassen generell überschrieben werden, mindestens aber in Datenklassen/POJOs
-   falls `toString()` für den Typ des Objektes nicht überschrieben ist, wird (wie bei allen entsprechenden Methoden) die `toString()`-Methode der Superklasse - nämlich `Object` aufgerufen

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

... würde **ohne** überschriebene `toString()`-Methode in der Klasse User **User@4aa298b7** (o.ä.) ausgeben, gibt nun aber stattdessen **User(Otto Normal)** aus. Diese Repräsentation des User-Objektes ist wesentlich wertvoller.


## Objekt-Identität

> :construction: **TODO:** `==`, ...


## Objekt-Gleichheit

> :construction: **TODO:** Erläutern...


## `equals(...)`

Objekte werden **nicht** mit `==` verglichen, sondern mit `equals()`, denn `==` überprüft nicht die semantische Gleichheit von zwei Objekten, sondern bildet lediglich einen _wahren_ Ausdruck, wenn es sich um zwei Referenzen _auf das selbe Objekt_ handelt!  
Genau wie `toString()`, sollte `equals()` grundsätzlich überschrieben werden (mindestens in Datenklassen / POJOs).

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


<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>


## `hashCode()`

> :construction: **TODO**


## Der Vertrag zwischen `equals(...)` und `hashCode()`

> :construction: **TODO**