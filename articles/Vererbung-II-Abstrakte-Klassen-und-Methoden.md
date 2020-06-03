# Vererbung II: Abstrakte Klassen und Methoden

-   Abstrakte Klassen können und sollen nicht direkt instanziiert werden, da sie lediglich (teilweise implementierte) Vorlagen für ihre Subklassen sind.
-   Das Schlüsselwort `abstract` macht eine Klasse zu einer abstrakten Klasse.
-   Eine abstrakte Klasse _kann_ abstrakte Methoden enthalten, muss dies aber nicht.
-   Abstrakte Klassen werden benötigt, wenn sich mehrere Klassen gemeinsame Eigenschaften und Fähigkeiten teilen (also eine Superklasse brauchen), diese gemeinsamen Eigenschaften und Fähigkeiten aber noch keine sinnvolle/brauchbare Klasse ergeben, von der man Instanzen erzeugen können sollte.

```java
/*
 * Diese abstrakte Klasse kann nicht
 * direkt instanziiert werden (mit new Vehicle())
 */
public abstract class Vehicle {
  private float speed;
  private boolean flying;
  private String name;
	// ...
}

/*
 * Diese Klasse erweitert die abstrakte Klasse
 * Vehicle und kann instanziiert werden.
 */
public class Rocket extends Vehicle {
  private double maxFuel;
	// Rocket-Erweiterung von Vehicle ...
}
```

In diesem Beispiel ist `Vehicle` eine Abstraktion von `Rocket`. Andersherum ist `Rocket` eine Konkretisierung von `Vehicle`.

Abstrakte Methoden müssen in der erweiternden (erbenden) Klasse implementiert werden:

```java
public abstract class Vehicle {

  private float currentSpeed;
  private float accelleration;
  private boolean flying;
  private String name;

  // abstrakte Methoden besitzen keinen
  // Methoden-Körper!
  public abstract void accellerate();
}

public class Rocket extends Vehicle {

  private boolean inSpace;

  @Override
  public void accellerate(){
    currentSpeed += accelleration * (inSpace ? 2 : 1);
  }

}
```

**Ausnahme:** Die erweiternde/erbende Klasse ist selbst auch eine abstrakte Klasse. In diesem Fall kann sie die geerbte abstakte Methode ebenfalls als abstrakte Methode "weitergeben"!



<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>