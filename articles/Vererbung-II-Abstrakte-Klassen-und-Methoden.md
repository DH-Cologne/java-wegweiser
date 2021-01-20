# Vererbung II: Abstrakte Klassen und Methoden<!-- omit in toc -->


## Abstrakte Klassen

Abstrakte Klassen können und sollen nicht direkt instanziiert werden - es lassen sich also keine Objekte mittels `new MyClass()` o.ä. erzeugen. Der Grund dafür ist, dass abstrakte Klassen lediglich nicht- oder teilweise implementierte Vorlagen für andere (erweiternde Sub-)Klassen sind.

Dieses Konzept kommt dann zum Einsatz, wenn sich mehrere Klassen gemeinsame Eigenschaften und Fähigkeiten teilen und also eine gemeinsame Superklasse brauchen, diese für sich genommen aber noch keine sinnvollen/brauchbaren Objekte beschreibt (siehe Beispiel unten!).

Das Schlüsselwort `abstract` macht eine Klasse zu einer abstrakten Klasse:

```java
/*
 * Diese abstrakte Klasse kann NICHT
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
  private booelan isManned;
	// Rocket-Erweiterung von Vehicle ...
}
```

Direkte Instanzen von `Vehicle` wären unsinnig (zu unspezifisch). In diesem Beispiel ist deshalb `Vehicle` eine Abstraktion von `Rocket`. Andersherum ist `Rocket` eine Konkretisierung von `Vehicle`. Dies wird mit `abstract` in der Signatur von `Vehicle` markiert.

`abstract` in der Klassen-Signatur alleine sorgt also außschließlich dafür, dass die Klasse nicht direkt instanziiert werden kann, sondern zuerst durch eine andere Klasse erweitert werden muss!


## Abstrakte Methoden

Eine abstrakte Methode ist eine **nicht-implementierte** Methode. Sie wird nur in Form einer Methoden-Signatur mit dem Schlüsselwort `abstract` markiert (das Statement muss mit `;` abgeschlossen werden!):

```java
public abstract class Vehicle {

  private float currentSpeed;
  private boolean flying;
  private String name;

  // abstrakte Methoden besitzen keinen
  // Methoden-Körper!
  public abstract void move();

}
```

In diesem Beispiel besitzt die abstrakte Klasse `Vehicle` eine abstrakte Methode `move()`. Nicht jedes "Gefährt" bewegt sich auf gleiche Weise - und so muss die Fortbewegung eben für jedes Gefährt einzeln implementiert werden (das ist natürlich nur ein veranschaulichendes Beispiel!).

> 👩‍🏫 Abstrakte Methoden **können nur in abstrakten Klassen stehen** (logisch!) und müssen dann in den erweiternden Klassen implementiert werden!  
> Ausnahme von der Regel: Die erweiternde Klasse ist ebenfalls eine abstrakte Klasse. Dann kann die Methode natürlich abstrakt (und unimplementiert) bleiben.

Und hier wird die abstrakte Klasse `Vehicle` durch die (konkrete) Klasse `Rocket` erweitert (mit implementierter `move()`-Methode):

```java
public class Rocket extends Vehicle {

  private boolean isManned;

  @Override
  public void accellerate(){
    currentSpeed += accelleration * (inSpace ? 2 : 1);
  }

}
```

> 👉 Die `@Override`-Annotation wird hier genau wie beim 🔭[Überschreiben von Methoden](Vererbung-I-Grundlagen.md#überschreiben-von-methoden) verwendet!