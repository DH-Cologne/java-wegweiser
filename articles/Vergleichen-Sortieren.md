# Vergleichen und Sortieren :bento:

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

Um dieses Problem zu lösen, gibt es das Interface `Comparable`.