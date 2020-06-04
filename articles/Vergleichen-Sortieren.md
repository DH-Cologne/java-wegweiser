# Vergleichen und Sortieren :bento:


## Sortier-Algorithmen

> :construction: **TODO:**
> Es sollen hier keine Sortier-Algorithmen im Detail besprochen werden. Aber es soll klar werden, was ein Sortieralgorithmus ist und dass es unterschiedliche (und unterschiedlich leistungsfähige) Algorithmen gibt.

> :link: Einige sehr gute Erläuterungen zu einzelnen Sortieralgorithmen findest du [hier](https://stackabuse.com/sorting-algorithms-in-java).

> :link: Hier findest du eine Seite mit sehr schönen [Visualisierungen verschiedener Sortier-Algorithmen](https://www.toptal.com/developers/sorting-algorithms)


## Sortieren mit Mitteln des Collections Framework

Das _Collections Framework_ bietet eine einfache Möglichkeit, Listen zu sortieren. Listen sind die einzige Art von Collection, die unabhängig von der Implementation immer eine Ordnung haben (sollten) - somit bietet sich eine Liste für eine Sortierung natürlich an:

```java
//Liste erstellen, Lieblingswörter hinzufügen
List<String> myFavoriteWords = new ArrayList<String>();
myFavoriteWords.add("Faszinationstoleranz");
myFavoriteWords.add("Kein-Erlebnis-Urlub");
myFavoriteWords.add("merkwürdig");
myFavoriteWords.add("abwegig");
myFavoriteWords.add("Rauschgift");
myFavoriteWords.add("Sachverhalt");

//Liste sortieren
Collections.sort(myFavoriteWords);

//Liste ausgeben
System.out.println(myFavoriteWords);
```

Das Beispiel oben erzeugt folgende Ausgabe:

```
[Faszinationstoleranz, Kein-Erlebnis-Urlub, Rauschgift, Sachverhalt, abwegig, merkwürdig]
```

Also die Liste im sortierten Zustand - und zwar alphabetisch (wobei hier Großbuchstaben vor allen Kleinbuchstaben einsortiert werden). Aber wer entscheidet das? Was ist, wenn ich meine Strings nach Länge sortieren möchte? Und was passiert, wenn ich keine `List<String>` sondern eine `List<User>`oder `List<Animal>` habe?  
Diese Fragen klären die folgenden Abschnitte...

> :speech_balloon: In Java wurden in den Methoden `Arrays.sort()` und `Collections.sort()` lange die Algorithmen [_Mergesort_](https://de.wikipedia.org/wiki/Mergesort) und [_Quicksort_](https://de.wikipedia.org/wiki/Quicksort) [genutzt](https://stackoverflow.com/questions/32334319/why-does-collections-sort-use-mergesort-but-arrays-sort-does-not?noredirect=1). [In neueren Versionen](https://bugs.java.com/bugdatabase/view_bug.do?bug_id=6804124) (ab Java 7) nutzen beide Methoden stattdessen [_Timsort_](https://de.wikipedia.org/wiki/Timsort). 


## Das Interface `Comparable`

Damit überhaupt an eine _Sortierung_\* gedacht werden kann, muss zunächst ein verlässlicher _Vergleich_\*\* zwischen den zu sortierenden Elementen gemacht werden können:

> **\*** Sortierung: `[4, 1, 7, 2]` wird zu `[1, 2, 4, 7]`
> 
... funktioniert nur, wenn folgendes klar ist:

> **\*\*** Vergleich: `4` ist größer als `1`

Bei _primitiven Datentypen_ ergibt sich meist eine _natürliche Sortierung_. So gilt eben etwa `1 < 4`, aber auch `'a' < 'd'` (denn ein `char` ist nur ein Mapping auf einen numerischen Wert). Und wie ist es bei `boolean`? `false` scheint wohl kleiner zu sein als `true`, denn

```java
List<Boolean> b = new ArrayList<Boolean>();
b.addAll(Arrays.asList(new Boolean[]{true,false,true,false}));
Collections.sort(b);
System.out.println(b);
```

ergibt `[false, false, true, true]` (nicht unbedingt überraschend).

Auch bei _Strings_ ergibt sich durch die alphabetische Reihenfolge eine natürliche Sortierung, die in Java bereits berücksichtigt ist. Aber spätestens beim Vergleichen von komplexeren Objekten ist es vorbei mit natürlicher Sortierung: Ist das eine Objekt vom Typ `User` nun kleiner oder größer als das andere?

**Beispiel:** Model-Klasse `User`:

```java
public class User {
	
	private String mail;
	private long lastLoginTimestamp;
	
	public User(String mail, long lastLoginTimestamp) {
		super();
		this.mail = mail;
		this.lastLoginTimestamp = lastLoginTimestamp;
	}
	
	/*
	 * Es folgen Getter und Setter
	 * für die Felder "mail" und "lastLoginTimestamp"
	 * sowie etwaige weitere Methoden...
	 */

}
```

Um das Problem zu lösen, dass es keine natürliche Sortierung für solche Objekte gibt, kann die entsprechende Klasse das Interface [`Comparable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) implementieren. Es schreibt nur eine Methode `compareTo()` vor, die einen `int`-Wert zurückgibt. Ist dieser Wert kleiner/gleich/größer als `0`, dann ist das Objekt, dessen `compareTo()`-Methode aufgerufen wurde, kleiner/gleich/größer als das Objekt, mit dem verglichen wurde. Mit Generics wird festgelegt, mit Objekten welchen Typs die Instanzen der Klasse (hier: mit anderen `User`-Objekten) verglichen werden können:

```java
public class User implements Comparable<User> {
	
	private String mail;
	private long lastLoginTimestamp;
	
	public User(String mail, long lastLoginTimestamp) {
		super();
		this.mail = mail;
		this.lastLoginTimestamp = lastLoginTimestamp;
	}

	@Override
	public int compareTo(User o) {
		return this.mail.compareTo(o.getMail());
	}
	
	/*
	 * Es folgen Getter und Setter
	 * für die Felder "mail" und "lastLoginTimestamp"
	 * sowie etwaige weitere Methoden...
	 */

}
```

Das obige Beispiel implementiert `compareTo()` so, dass bei einer Sortierung von `User`-Objekten alphabetisch nach der EMail-Adresse sortiert würde. Dafür wird ganz einfach die `compareTo()`-Methode der Klasse String genutzt **.  
Eine andere Implementation von `compareTo()`, bei der nach dem Timestamp des letzten Logins verglichen wird (hier ein `long`-Wert), könnte etwa so aussehen:

```java
@Override
public int compareTo(User o) {
	return this.lastLoginTimestamp - o.getLastLoginTimestamp();
}
```

Dadurch würden in einer Sortierung _kleinere_ Werte (also _ältere_ Timestamps) weiter vorne einsortiert. Um dies umzukehren, kehrt man einfach die Rückgabe um: `o.getLastLoginTimestamp() - this.lastLoginTimestamp`.

Natürlich sind auch alle anderen Sortier-Kriterien denkbar!


## Das Interface `Comparator`

Dieser Abschnitt schließt inhaltlich direkt an `Comparable` an: Denn das `Comparable`-Interface ist zwar eine nützliche Schnittstelle zum Vergleichbarmachen von Objekten, aber eben nur für den _einen_ "Standardfall". In komplexeren Anwendungen ist es durchaus üblich etwa eine Tabelle mit Daten (in deren Zeilen jeweils die Daten eines Daten-Objektes dargestellt sind) [mit einem Klick auf den Kopf einer der Spalten nach dem entsprechenden Kriterium zu sortieren](https://books.google.de/books?id=gYysqc06ofkC&lpg=PA137&dq=windows%2095%20explorer%20sortieren&hl=de&pg=PA137#v=onepage&q&f=false).

Für solch eine Funktionalität ist die Implementierung verschiedener Vergleiche notwendig. Mit einer `compareTo(...)`-Methode kommt man in diesem Fall also nicht weiter. Genau dafür gibt es das Interface `Comparator`. Es lagert die Logik für den Vergleich zweier Objekte aus der entsprechenden Klasse aus, sodass dann die Instanzen von `Comparator` (also die _Comparators_) dort, wo sie gebraucht werden, einfach benutzt und nach Belieben ausgetauscht werden können. Dafür erstellt man eine Klasse und implementiert `Comparator`. Die einzige Methode dieses Interfaces ist `compare(T o1, T o2)`, wobei `T` dem Datentyp entspricht, der mit den Generics festgelegt wurde:

```java
public class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}
```

Und fertig ist ein `Comparator`, der Strings nach ihrer Länge vergleicht. Genau so ist es natürlich ein `Comparator` denkbar, der User-Objekte (aus dem vorigen Kapitel) z.B. nach der Domain der Mail-Adressen sortiert:

```java
public class UserMailDomainComparator implements Comparator<User> {
	@Override
	public int compare(User o1, User o2) {
		// Domains aus den Mail-Adressen der beiden User extrahieren,
		// indem das "@" und alles davor entfernt wird...
		String mail1 = o1.getMail().replaceAll("^.*?@", "");
		String mail2 = o2.getMail().replaceAll("^.*?@", "");

		// die Domains einfach mit `compareTo()` vergleichen **
		return mail1.compareTo(mail2);
	}
}
```

Eingesetzt werden kann solch ein `Comparator` dann in z.B. in einer anderen Variante von `Collections.sort()`:

```java
List<User> users = new ArrayList<User>();
users.add(new User("maxi.musterfrau@art3abs1gg.de"));
// ...usw ...

// sortieren
Collections.sort(users, new UserMailDomainComparator());
```

Natürlich sollte man lieber die Referenz auf einen vorher erzeugten `Comparator` übergeben, wenn man diesen mehrmals einsetzen möchte.


-----------------------

> :speech_balloon: Beim programmieren hilft Faulheit sehr oft dabei, den richtigen Weg zu finden!


<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>