# Innere und anonyme Klassen

> :construction: **TODO**


## Innere Klassen

> :speech_balloon: eng.: _inner class_ oder auch _nested class_

Als innere Klassen werden Klassen bezeichnet, die innerhalb anderer Klassen definiert sind. Dies wird u.a. dazu genutzt, den Coder besser zu strukturieren: Manchmal ist eine Klasse semantisch so sehr einer anderen Klasse untergeordnet und wäre alleine unbrauchbar, dass sie am besten nicht in einer eigenen Datei steht:

```java
class {
    private String firstName;
    private String lastName;
    private Address address;

    //...

    class Address {
        private String street;
        private String city;

        //...
    }
}
```

In diesem Beispiel wird die Klasse `Address` eventuell sogar niemals außerhalb der Klasse `Customer` genutzt. Das wäre dann eigentlich ein Fall für eine `private` innere Klasse, denn innere Klassen können (anders als normale Klassen) `private` oder auch `protected` sein (siehe auch [Sichtbarkeitsmodifizierer](Objekte-I-Initialisierung-Members-Zugriff.md#zugriffs-sichetbarkeitsmodifizierer)).

Innere Klassen können aber auch "von außerhalb" genutzt werden:

```java
class Outer {
    private String s = "something";

    class Inner {
        public void foo(){
            System.out.println(s);
        }
    }
}
```

Von einer anderen Klasse aus ließe sich nun folgendes tun:

```java
public static void main(String[] args) {
	Outer outer = new Outer();
	Outer.Inner inner = outer.new Inner();
	inner.foo();
}
```

Hier sehen wir gleich mehrere interessante Dinge:
1) Wir benötigen eine Instanz von `Outer`, um eine Instanz von `Inner` erzeugen zu können (es sei denn `Inner` ist `static` - denn auch das ist möglich!).
2) Von `Inner` aus kann auf Attribute und Methoden von `Outer` zugegriffen werden!

Wäre `Inner` eine statische innere Klasse ...

```java
class Outer {
    static class Inner {
        // ...
    }
}
```

... dann wäre der Zugriff auf `Inner` auch ohne eine Instanz von `Outer` möglich (ähnlich wie bei statischen Methoden oder Klassenvariablen):

```java
Outer.Inner inner = new Outer.Inner();
```

> :warning: Natürlich kann eine statische innere Klasse auch nur auf statische :point_right: [Member](../Glossar.md#member) der äußeren Klasse zugreifen!

> :link: Eine hübsche Übersicht zu inneren Klassen (mit praktischen Beispielen und Code zum Ausführen) findet man in [diesem W3Schools-Artikel](https://www.w3schools.com/java/java_inner_classes.asp).


## Anonyme Klassen

Eine anonyme Klasse trägt **keinen Namen** und wird in ein und dem selben Statement **deklariert und instanziiert**. Da in Java jedes Objekt aber eine klare Typ-Zuordnung braucht, muss diese anonyme Klasse entweder eine bestehende Klasse **erweitern** _oder_ ein Interface **implementieren**. Die Syntax ist in beiden Fällen gleich, da weder `extends` noch `implements` verwendet werden.

Nehmen wir folgende Klasse `Foo` an:

```java
public class Foo {
	public void saySomething() {
		System.out.println("foo");
	}
}
```

Indem wir eine anonyme Klasse verwenden, können wir sehr schnell und ohne eine neue `.java` Datei anzulegen eine "Wegwerf"-Erweiterung von `Foo` mit überschriebener Methode `foo()` deklarieren und sofort eine Instanz davon erzeugen:

```java
// Instanz von "Foo" erzeugen
Foo foo = new Foo();

// Instanz von "Bar" (Erweiterung von "Foo") erzeugen
Foo bar = new Foo() {
    @Override
    public void saySomething() {
        System.out.println("bar");
    }
};

foo.saySomething();
bar.saySomething();
```

Die Ausgabe dieses Codes wäre - wenig überraschend:

```
foo
bar
```

Diese anonyme Klasse lässt sich (durch den fehlenden Namen) nur ein einziges mal instanziieren. Es sei denn, die Methode, in der das geschieht, wird mehrmals aufgerufen - aber in diesem Fall ließe sich wohl darüber diskutieren, ob es sich dann nicht eigentlich um einmalige Instanzen unterschiedlicher Klassen mit identischer Deklaration handelt.

> :warning: Wäre `Foo` in diesem Beispiel ein Interface, sähe der Code zur Deklaration der anonymen Klasse (die `Foo` _implementiert_) exakt genauso aus! Anonyme Klassen _erweitern_ oder _implementieren_ Klassen oder Interfaces also **implizit** - je nach dem, worum es sich im Einzelfall handelt.

Ein sehr häufiger Anwendungsfall für anonyme Klassen in Java sind :link: [Listener](https://de.wikipedia.org/wiki/Beobachter_(Entwurfsmuster)) für Buttons (o.ä.) in :point_right: [GUI](../Glossar.md#gui)s, bei denen zum Zeitpunkt der Initialisierung noch schnell die Methode überschrieben werden soll, die ausgeführt wird, wenn das jeweilige Ereignis (Klick o.ä.) eingetreten ist. Das sieht dann z.B. so aus:

```java
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I was clicked!");
    }
});
```

> :link: Eine gute weiterführende Ressource (in englischer Sprache) ist [dieser Artikel](https://www.baeldung.com/java-anonymous-classes).




<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>