# Vergleichen und Sortieren :bento:

## Sortier-Algorithmen

> :construction: **TODO:**
> Es sollen hier keine Sortier-Algorithmen im Detail besprochen werden. Aber es soll klar werden, was ein Sortieralgorithmus ist und dass es unterschiedliche (und unterschiedlich leistungsfähige) Algorithmen gibt. Außerdem wäre wichtig, welche Algorithmen in der _JCL_ warum eingesetzt werden (z.B. in `Collections.sort()`).

> :speech_balloon: **Übrigens:** Hier findest du eine Seite mit sehr schönen [Visualisierungen verschiedener Sortier-Algorithmen](https://www.toptal.com/developers/sorting-algorithms)

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

Das obige Beispiel implementiert `compareTo()` so, dass bei einer Sortierung von `User`-Objekten alphabetisch nach der EMail-Adresse sortiert würde. Dafür wird ganz einfach die `compareTo()`-Methode der Klasse String genutzt.  
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

> :construction: **TODO:** ...


## Sortieren mit Mitteln des Collections-Framework

> :construction: **TODO:** ...


<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>