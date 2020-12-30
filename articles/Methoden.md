# Methoden 🗜️<!-- omit in toc -->

- [Definition](#definition)
- [Aufbau](#aufbau)
- [`return`](#return)
- [Überladen von Methoden](#überladen-von-methoden)
- [Java ist immer (!) pass by value](#java-ist-immer--pass-by-value)


## Definition

Zunächst muss an dieser Stelle geklärt werden, was _Funktionen_ sind: _Funktionen_ sind Code-Blöcke, die einen Namen tragen und über diesen "aufgerufen" (engl.: _call_) werden können. Über Parameter können einer Funktion Daten übergeben werden, die sie verarbeiten (oder nutzen) soll. Optional kann eine Funktion nach ihrer Ausführung auch Daten "zurückgeben" (engl.: _return_).

Eine **Methode** ist eine _Funktion_, die an ein Objekt (nicht-statisch) oder eine Klasse (statisch) gebunden ist. Dadurch hat eine Methode Zugriff auf die Eigenschaften und Fähigkeiten eines Objektes (nicht-statisch) oder einer Klasse (statisch).  
Da in Java **alles** in Klassen passiert - Java ist [fast](https://de.wikipedia.org/wiki/Java_(Programmiersprache)#Objektorientierung) völlig objektorientiert - gibt es in Java **nur Methoden** bzw. alle Funktionen in Java **sind Methoden**.

> 💬 Eine gute Diskussion dieser Unterscheidung findet sich in dieser [SO-Frage](https://de.wikipedia.org/wiki/Java_(Programmiersprache)#Objektorientierung)!


## Aufbau

Eine Instanz-Methode (also nicht-statische Methode) hat den folgenden Aufbau:

```java
public String greet(String name){
    return "Good day, " + name + "!";
}
```

Der Reihe nach gelesen ist ...

1. ... `public` ein Sichtbarkeits- oder Zugriffsmodifizierer (es könnte auch `private`, `protected` oder keiner sein).
2. ...`String` der Rückgabetyp der Methode (`void` würde markieren, dass diese Methode keinen Rückgabety hat).
3. ... `greet` der Name der Methode. Methoden werden in Java **immer** kleingeschrieben (im [lowerCamelCase](https://de.wikipedia.org/wiki/Binnenmajuskel#Programmiersprachen))!
4. ... `String` der Datentyp des einzigen Parameters der Methode.
5. ... `name` der Name der Variable, mit der der Parameter innerhalb der Methode referenziert werden kann.
6. ... `return` das Schlüsselwort, welches die Methode beendet und die Rückgabe festlegt. 

Aufrufen ließe sich diese Methode z.B. so:

```java
System.out.println("Foo: " + greet("Bar"));
System.out.println("Bar: " + greet("Foo"));
```

Ein (zugegeben) etwas verspieltes, aber auch freundliches Beispiel - es erzeugt die folgende Ausgabe:

```
Foo: Good day, Bar!
Bar: Good day, Foo!
```


## `return`

Das Schlüsselwort `return` (zu sehen im obigen Beispiel) hat zwei Aufgaben: Zum einen beendet es sofort die Methode (es muss nicht am Ende der Methode stehen und es kann auch mehrere `return`-Statements geben!). Zum anderen legt es fest, was genau die Methode zurückgibt. In Methoden mit einem Rückgabetyp folgt auf ein `return` immer die Rückgabe (siehe Beispiel oben).

Daraus folgt, dass eine Methode **mit** Rückgabetyp auch ein (oder mehrere) `return`-Statement(s) besitzen **muss**. Eine Methode **ohne** Rückgabetyp _kann_ zum frühzeitigen Beenden der Methode ein (oder mehrere) `return`-Statements (dann ohne Rückgabe) besitzen.


## Überladen von Methoden

Es kann in der selben Klasse mehrere Methoden mit dem selben Namen geben - allerdings nur, wenn sich diese Methoden in der Anzahl oder dem Datentyp ihrer Parameter unterscheiden:

```java
public void something(int number){
    // ... Code in der Methode ...
}

public void something(float number){
    // ... Code in der Methode ...
}

public void something(int number1, int number2){
    // ... Code in der Methode ...
}
```

Dies wird vor allem dann genutzt, wenn eine (eigentlich einzelne) Methode Parameter unterschiedlichen Typs verarbeiten können soll. Meist ruft dann (nach einer Umwandlung oder Verarbeitung der Parameter) die eine Methode eine andere gleichnamige Methode auf.

> 💬 Das Überladen ist auch bei [Konstruktoren](Konstruktoren.md) möglich (und sogar sehr üblich!).


## Java ist immer (!) pass by value

> ⚠️ Dieser Abschnitt ist wahrscheinlich noch etwas überfordernd, wenn du gerade erst lernst, wie Methoden funktionieren. Lass dich davon nicht einschüchtern! Die beschriebenen Konzepte sind anfangs nicht ganz leicht zu verstehen, aber sie werden dir bald einleuchten 💡 💪

> 🔗 Diese [Antwort auf StackOverflow](https://stackoverflow.com/a/40523/7399631) erklärt das Problem ebenfalls sehr schön!

Es gibt in verschiedenen Programmiersprachen unterschiedliche Ansätze, wie Parameter an Methoden übergeben werden. Man unterscheidet hier [**_pass by value_**]([sdasd](https://de.wikipedia.org/wiki/Wertparameter)) (oder auch _"call by value"_, dt.: Übergabe/Aufruf mittels Wert) und [**_pass by reference_**]([dsfsdf](https://de.wikipedia.org/wiki/Referenzparameter)) (oder auch _"call by reference"_, dt.: Übergabe/Aufruf mittels Referenz).

Im Falle von **_pass by value_** werden Methodenparameter direkt als Wert übergeben und nicht als Referenz auf einen Wert. Dies hat zur Folge, dass innerhalb der Methode **mit einer Kopie des übergebenen Wertes** gearbeitet wird. Das folgende Beispiel soll das verdeutlichen:

```java
private int addFive(int number) {
    number = number + 5;
    return number;
}
```

Wird diese Methode an anderer Stelle folgendermaßen aufgerufen ...

```java
int x = 2;
int y = addFive(x);
System.out.println("x == " + x);
System.out.println("y == " + y);
```

... dann führt das zu der Ausgabe ...

```
x == 2
y == 7
```

... und es gilt eben **nicht** `x == 7`, denn obwohl (augenscheinlich) `x` an die Methode übergeben wurde, wurde eben nur eine Kopie des von `x` referenzierten Wertes übergeben!

Würde es sich bei der Übergabe von Methodenparametern in Java nun um **_pass by reference_** handeln (zur Erinnerung: Das tut es nicht!), dann hätte `x` nach dem Aufruf `addFive(x)` den Wert `7`, denn innerhalb der Methode würde die Referenz auf ein und die selbe Speicherstelle verwendet werden.

❗ ❗ ❗  **SO WEIT, SO WENIG ÜBERRASCHEND! ABER...** ❗ ❗ ❗

Der oben beschriebene Sachverhalt ist einleuchtend, aber dennoch kommt gerade bei **Java** immer sehr viel **Verwirrung** um _pass by value_ oder _pass by reference_ auf, wenn es nicht um **primitive**, sondern **komplexe** Methodenparameter geht. Denn wenn die Methode ...

```java
private Marble changeColorToRed(Marble m) {
    m.setColor("red");
    return m;
}
```

... folgendermaßen aufgerufen wird ...

```java
Marble marble1 = new Marble();
marble1.setColor("green");
Marble marble2 = changeColorToRed(marble1);

System.out.println("Marble 1 is " + marble1.getColor());
System.out.println("Marble 2 is " + marble2.getColor());
```

... dann ergibt das die Ausgabe ...

```
Marble 1 is red
Marble 2 is red
```

Es wurde hier anscheinend also wirklich das von der Variable `marble1` referenzierte Objekt verändert. Oder nicht?

**Ja, es wurde genau dieses Objekt verändert, aber** das bedeutet **nicht**, dass Java bei komplexen Methodenparametern plötzlich _pass by reference_ verwendet!

> 👩‍🏫 Die Übergabe von Methodenparametern in Java erfolgt **immer mittels _pass by value_** (oder, wenn man unbedingt will, mittels [call by sharing](https://en.wikipedia.org/wiki/Evaluation_strategy#Call_by_sharing))!

Aber wie kommt es dann zur oben beschriebenen Ausgabe? Das liegt daran, dass in Java eine **Referenz** auf ein Objekt **ein Wert ist**, nämlich die Adresse des Objektes im Arbeitsspeicher. Diese Adresse ist der **Wert**, der als Methodenparameter mittels **_pass by value_** übergeben wird!

👉 Und das lässt sich auch beweisen: Verändert man die Methode `changeColorToRed()` von oben so, dass innerhalb der Methode der Variable des Methodenparameters **ein neues Objekt zugewiesen wird** ...

```java
private Marble changeColorToRed(Marble m) {
    m = new Marble();
    m.setColor("red");
    return m;
}
```

Dann lautet die Konsolenausgabe nach dem selben Aufruf wie oben ...

```
Marble 1 is green
Marble 2 is red
```

... denn es wird die Farbe eines völlig anderen `Marble`-Objektes verändert! Würde Java für die Übergabe komplexer Methodenparameter _pass by reference_ nutzen, dann würden `marble1` und `marble2` nach dem Aufruf von `changeColorToRed()` noch immer auf das selbe Objekt verweisen, nämlich die `Marble`-Instanz mit der Farbe `red`.

Stattdessen gibt es nun zwei Variablen, die als Werte **zwei unterschiedliche Adressen** von **zwei unterschiedlichen Objekten** besitzen!

Zur weiteren Erläuterung: Ein User hat auf die [oben verlinkte SO-Antwort](https://stackoverflow.com/a/40523/7399631) einen Kommentar mit einem sehr erhellenden Vergleich gegeben (leicht umformatiert):

> My attempt at a good way to visualize object passing: Imagine a balloon. Calling a [function] is like tieing a second string to the balloon and handing the line to the [function]. `parameter = new Balloon()` will cut that string and create a new balloon (but this has no effect on the original balloon). `parameter.pop()` will still pop it though because it follows the string to the same, original balloon. Java is pass by value, but the value passed is not deep, it is at the highest level, i.e. a primitive or a pointer. Don't confuse that with a deep pass-by-value where the object is entirely cloned and passed.  
> [– dhackner Oct 20 '10 at 16:38](https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value#comment4258345_40523)

Besonders schön ist hier die Erwähnung des Schlüsselwortes **pointer**, denn mit [denen](https://de.wikipedia.org/wiki/Zeiger_(Informatik)) kommt man in Java normalerweise nicht wirklich in Berührung (anders als etwa in C++), aber **es gibt sie auch in Java** - und es lohnt sich offensichtlich auch hier, sie zu verstehen!




