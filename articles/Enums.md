# Enums 🧮<!-- omit in toc -->

> 💬 auch: _Enum types_

Ein _Enum_ (kurz für _Enumeration_ - das englische Wort für _Aufzählung_), ist ein spezieller Datentyp, der eine Aufzählung konstanter Werte repräsentiert. Eine Variable vom Typ eines Enum muss als Wert einen der möglichen fordefinierten Werte annehmen, die Teil des Enums sind.

> 💬 Technisch gesehen ist jeder Enum type eine Erweiterung von `java.lang.Enum`. Enums sind also Klassen, die implizit von `Enum` erben!

## Anwendungsfälle

Ein sehr häufiges (weil nachvollziehbares) Beispiel für die Anwendung von Enums sind die Namen der Wochentage. Es gibt keinen vorgefertigten primitiven oder komplexen Datentyp, der den Wertebereich `Montag` bis `Sonntag` elegant abdeckt. Für solche Fälle sind Enums ideal. Wir werden in diesem Artikel mit diesem einfachen Beispiel (Wochentage) arbeiten - generell sind aber alle Anwendungsfälle denkbar, bei denen ein Datentyp mit einer überschaubaren, festen Anzahl von Werten benötigt wird (Monate, Himmelsrichtungen, Grundfarben, Spielkarten, ...).


## Grundlegender Aufbau

Da Enums Klassen sind, die von `java.lang.Enum` erben, ähneln sie gewöhnlichen Klassen: Sie können Felder, Methoden und sogar einen Konstruktor besitzen. Aber sie besitzen eine spezielle 👉 [Syntax](../Glossar.md#syntax), mit der sich "Aufzählungen" von vordefinierten Werten umsetzen lassen.

Der Unterschied zu einer gewöhnlichen Klassendefinition ist zunächst genau diese Aufzählung. Nehmen wir eine Datei `Weekday.java` mit folgendem Inhalt an:

```java
public enum Weekday {
	MON, TUE, WED,
	THU, FRIY, SAT, SUN;
}
```

Es könnte dann folgender Code eine Variable `day` vom Typ `Weekday` (unser Enum type) deklarieren und einen "Wochentag" zuweisen:

```java
Weekday day = Weekday.FRI;
```

Ja, `FRI` ist technisch gesehen eine Konstante des Enums `Weekday`. Tatsächlich sind alle Werte von Enums automatisch `static` und `final`.

Die Ausgabe von...

```java
System.out.println(day);
```

...wäre dann "_FRI_". So weit, so gut. Mit diesem kleinen Enum könnten wir immerhin schon Wochentage vergleichen: Der Ausdruck `Weekday.SUN == Weekday.SUN` hätte den Wert `true`.

Aber Enums können noch viel...


## ...mehr

Nehmen wir einmal an, unser Enum `Weekday` soll auch darüber Bescheid wissen, welcher der Wochentage der wievielte in der Woche ist und wie der volle Name des jeweiligen Tages lautet. Dafür lässt sich dem Enum ein Konstruktor (wie bei einer Klasse) hinzufügen, der dann automatisch von den zur Verfügung stehenden Werten aufgerufen wird. Die dem Konstruktor zu übergebenen Werte stehen wie bei einer Objekt-Initialisierung in Klammern hinter dem jeweiligen Wert. Enum-Konstrutoren sind **immer** implizit `private` - sie werden also ausschließlich in der Definition der möglichen Werte aufgerufen:

```java
public enum Weekday {
	
	MON(1, "Monday"), TUE(2, "Tuesday"), WED(3, "Wednesday"),
	THU(4, "Thursday"), FRI(5, "Friday"), SAT(6, "Saturday"), SUN(7, "Sunday");
	
	private int dayOfWeek;
	private String fullName;
	
	Weekday(int dayOfWeek, String fullName) {
		this.dayOfWeek = dayOfWeek;
		this.fullName = fullName;
	}
}
```

> 💬 Dieses Beispiel geht von den deutschen Wochentagen aus, bei denen Montag als der erste gilt.

So hat jeder `Weekday` einen zugeteilten numerischen Wert. Mit diesem können wir nun genau so umgehen, wie wir es von Instanzvariablen gewohnt sind. Implementieren wir z.B. `toString()` und eine Methode `getWeekDay()`:

```java
public enum Weekday {
	
	MON(1, "Monday"), TUE(2, "Tuesday"), WED(3, "Wednesday"),
	THU(4, "Thursday"), FRI(5, "Friday"), SAT(6, "Saturday"), SUN(7, "Sunday");
	
	private int dayOfWeek;
	private String fullName;
	
	Weekday(int dayOfWeek, String fullName) {
		this.dayOfWeek = dayOfWeek;
		this.fullName = fullName;
	}
	
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	
	@Override
	public String toString() {
		return fullName + ", day number " + dayOfWeek;
	}
}
```

`toString()` von `Weekday.MON` würde nun `Monday, day number 1` zurückgeben usw.

Natürlich ließe sich auch noch viel mehr realisieren - etwa eine Methode, die den zeitlichen Abstand eines Wochentages zum nächsten Wochentag mit dem übergebenen Wert zurückgibt (hier die Methode ohne den ganzen Enum):

```java
// ...

public int daysUntil(Weekday until) {
    return  dayOfWeek < until.dayOfWeek
        ? Math.abs(dayOfWeek - until.dayOfWeek)
        : values().length - Math.abs(dayOfWeek - until.dayOfWeek);
}

// ...
```

Und so gibt `Weekday.FRI.daysUntil(Weekday.MON)` den Wert `3` zurück, usw.



> 🔗 Siehe auch [Enum Types](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)