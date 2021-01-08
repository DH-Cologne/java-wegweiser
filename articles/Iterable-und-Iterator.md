# `Iterable` und `Iterator`<!-- omit in toc -->

- [Was sind `Iterable` und `Iterator`?](#was-sind-iterable-und-iterator)
- [Beispiel](#beispiel)
- [Bezug zur for-each-Schleife](#bezug-zur-for-each-schleife)
- [Die optionale Methode `remove()`](#die-optionale-methode-remove)


## Was sind `Iterable` und `Iterator`?

Es handelt sich hierbei um zwei Interfaces, die zur Standard-Bibliothek von Java gehören. Ihre Semantik lässt sich sehr gut so formulieren:

Implementiert eine Datenstruktur das Interface `Iterable`, dann ist sie (im Sinne dieses Interfaces) "iterierbar", d.h. man kann - unabhängig von der internen Funktionsweise der Datenstruktur (!) - über ihre Elemente iterieren. `Iterable` gibt eine einizge Methode vor, nämlich `iterator()`, die eine Instanz des für die Datenstruktur implementierten `Iterator` zum Iterieren über die Elemente zurückgibt.

Beide Interfaces, `Iterable` und `Iterator` arbeiten jeweils mit [Generics](Generics.md), um den Typ der verarbeiteten Elemente festzulegen (siehe Beispiel unten).


## Beispiel

Nehmen wir als Beispiel eine generische Datenstruktur `List`, die intern ihre Elemente in einem Array verwaltet (die genaue Implementation lassen wir weg - es geht hier nur um die Anwendung von `Iterable` und `Iterator`):

```java
import java.util.Iterator;

public class List<T> implements Iterable<T> {
	
	private T[] elements;

	@Override
	public Iterator<T> iterator() {
		//TODO
		return null;
	}

}
```

Das Beispiel lässt im Moment auch noch die Implementation der Methode `iterator()` außen vor, zeigt aber bereits das Verhältnis der beiden Interfaces: Ein `Iterable<T>` besitzt eine Methode `iterator()`, die einen `Iterator<T>` zurückgibt.

Aber was ist nun ein `Iterator`? Das ist eigentlich ganz einfach: Ein `Iterator` ist ein Objekt, das uns drei hilfreiche Methoden anbietet:

- `boolean hasNext()` - _Hat die Datenstruktur ein weiteres Element?_
- `T next()` - _Gib mir das nächste Element der Datenstruktur!_
- `remove()` (**optional!**) - _Entferne das letzte durch `next()` zurückgegebene Element!_ (siehe Abschnitt zu `remove()` unten!)

Die Implementation der beiden ersten (unbedingt nötigen) Methoden könnte für unser Beispiel von oben etwa so aussehen (für den Überblick noch mal im vollständigen Kontext):

```java
import java.util.Iterator;

public class List<T> implements Iterable<T> {
	
	private T[] elements;

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>(){

			private int pos = 0;
			
			@Override
			public boolean hasNext() {
				return pos < elements.length;
			}

			@Override
			public T next() {
				return elements[pos++];
			}
		};
	}
}
```

Im Ergebnis ermöglicht die korrekte Implementation von `Iterable` also die Benutzung eines passenden `Iterator`-Objekts, das uns - unabhängig von der Funktionsweise der Datenstruktur - über ihre Elemente iterieren lässt.


## Bezug zur for-each-Schleife

Aber nicht nur **uns** ermöglichen diese Interfaces dieses generische Iterieren! Auch ein wichtiges Sprach-Feature von Java ist nur für `Iterable`s (und Arrays) verfügbar: Die [for-each-Schleife](Schleifen.md#for-each-schleife). Diese Variation der `for`-Schleife benötigt ein solches Interface, um unabhängig von der Implementation der Datenstruktur ihren Dienst tun zu können.

Angewendet auf unser Beispiel von oben könnte man etwa über eine `List<String>` dann folgendermaßen iterieren:

```java
for (String element : list){
    System.out.println("Aktuelles Element: " + element);
}
```

Im Hintergrund ändert der Compiler diesen (sehr schönen und lesbaren) Code nämlich zu diesem hier:

```java
Iterator<String> iter = list.iterator();
while (iter.hasNext()){
    String element = iter.next();
    System.out.println("Aktuelles Element: " + element);
}
```


## Die optionale Methode `remove()`

Normalerweise lassen sich beim Iterieren über eine Datenstruktur keine Elemente aus dieser entfernen. Dies würde (bzw. _sollte_) eine [`ConcurrentModificationException`](https://docs.oracle.com/javase/8/docs/api/java/util/ConcurrentModificationException.html) auslösen, weil nicht sichergestellt werden kann, dass der iterierende Code mit der veränderten Datenstruktur umgehen kann.

Das Interface `Iterator` enthält jedoch eine [`default`-Methode](Vererbung-III-Interfaces.md#default-methoden) `remove()`, mit der man genau dies tun kann - sofern sie denn implementiert ist. Die [`default`-Implementation](https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html#remove--) von `remove()` wirft nämlich einfach nur eine `UnsupportedOperationException` (Methode ist nicht implementiert!). Möchte man seinem `Iterator` allerdings eine funktionierende `remove()`-Methode schenken, sollte man sich bei der Implementierung genau nach der [Javadoc](Javadoc.md)-Dokumentation von `remove()` richten (die stellt nämlich einige Anforderungen!):

> `default void remove()`
> 
> Removes from the underlying collection the last element returned by this iterator (optional operation). This method can be called only once per call to `next()`. The behavior of an iterator is unspecified if the underlying collection is modified while the iteration is in progress in any way other than by calling this method.
> 
> **Implementation Requirements:**
> 
> The `default` implementation throws an instance of `UnsupportedOperationException` and performs no other action.
> 
> **Throws:**
> 
> `UnsupportedOperationException` - if the remove operation is not supported by this iterator  
> `IllegalStateException` - if the next method has not yet been called, or the remove method has already been called after the last call to the next method

Quelle: [Offizielle Dokumentation von `Iterator`](https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html#remove--)

Eine Implementation von `remove()` für unsere Beispiel-Struktur von oben könnte z.B. so aussehen (es mussten einige Dinge am bestehenden Code geändert werden, siehe Erläuterungen unten!):

```java
import java.util.Iterator;

public class List<T> implements Iterable<T> {
	
	private T[] elements;

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>(){
			
			private int pos = -1;
			private boolean elementRemoved = false;
			
			@Override
			public boolean hasNext() {
				return pos < elements.length;
			}

			@Override
			public T next() {
				elementRemoved = false;
				return elements[++pos];
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public void remove() {
				/*
				 * Prüfen, ob next() noch nie aufgerufen wurde ODER ob remove()
				 * seit dem letzten next() bereits aufgerufen wurde (wie es in
				 * der Dokumentation vorgegeben ist) - in einem dieser Fälle:
				 * IllegalStateException werfen!
				 */
				if (pos < 0 || elementRemoved) {
					throw new IllegalStateException("You have to call next() "
							+ "before calling remove() at least once!");
				}
				
				// temporäres "neues" Array anlegen
				final Object[] temp = new Object[elements.length];

				// Elemente kopieren (außer das gelöschte)
				for (int i = 0; i < temp.length; i++)
					temp[i] = elements[i >= pos ? i + 1 : i];

				// neues Array zuweisen
				elements = (T[]) temp;

				// merken, dass wir etwas entfernt haben
				elementRemoved = true;
			}
		};
	}
}
```

Für diese Implementation von `remove()` mussten ein paar Kleinigkeiten am Code geändert werden: Der initiale Wert von `pos` ist nun `-1`, damit wir nachvollziehen können, ob `next()` wenigstens einmal aufgerufen wurde. Außerdem muss `remove()` prüfen, ob gerade eben (nach dem letzten `next()`-Aufruf) schon ein Element mit `remove()` entfernt wurde. Dazu haben wir eine weitere Instanzvariable `elementRemoved` eingeführt, die an den richtigen Stellen entsprechend gesetzt wird.

> **Anmerkung zur Annotation `@SuppressWarnings`:** Hier unterdrücken wir eine Warnung des Compilers, denn es wird am Ende der Methode zu einem generischen Array gecastet - eine Operation, die vom Compiler nicht auf Korrektheit geprüft werden kann.