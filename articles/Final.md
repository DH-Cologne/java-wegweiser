# `final`

> :construction: **TODO:**  
> - gründlichere Formulierungen in ganzen Sätzen


Das Schlüsselwort `final` markiert eine (benannte) Einheit (Variable, Methode oder Klasse), der nur ein einziges mal ein Wert (o.ä.) zugewiesen werden kann. Dies hat in unterschiedlichen Kontexten unterschiedliche Bedeutungen ...


## Finale Variablen

> :construction: **TODO** 

-   primitive: Wert kann nicht geändert werden
-   komplexe: Referenz kann nicht auf anderes Objekt geändert werden, aber Felder des Objektes können geändert werden
-   Unterschied zu z.B. C++ `const`: finale Variablen können auch noch _nach_ der Deklaration einen Wert erhalten, aber eben nur ein mal!

Im folgenden Beispiel kann der Name des Users nur einmal (bei Instanziierung der Klasse bzw. Erzeugung eines Objektes) gesetzt werden. Der Wert kann dann für dieses Objekt nicht mehr geändert werden. Die Instanziierung (Aufruf des Konstruktors) ist _der letzte mögliche Zeitpunkt zum Setzen eines Wertes für dieses finale Klassenattribut!_

```java
public class User {

  private final String name;

  public User(String name){
    this.name = name;
  }

}
```


## Finale Methoden

> :construction: **TODO** 

Finale Methoden können nicht überschrieben werden.

```java
public final void someMethod(){
  // Diese Methode kann in einer erweiternden Klasse nicht überschrieben werden!
}
```


## Finale Klassen

> :construction: **TODO** 

Finale Klassen können nicht erweitert werden.

```java
final class ImmutableClass {
  // Diese Klasse kann nicht erweitert werden!
}
```


## Konstanten in Java

> :construction: **TODO** 

Konstanten (hier: unveränderbare Felder, die _immer_ den selben Wert haben) werden mit `static` _und_ `final` deklariert und befolgen die Naming Conventions:

```java
// könnte auch "public" sein
private static final int THIS_IS_A_PRIVATE_CONSTANT = 2;
```