# :ab: Strings

(auch: *Zeichenketten*)

`String` ist eine Klasse in Java. Ein Objekt vom Typ `String` repräsentiert eine Zeichenkette - also eine Sequenz von Symbolen.


## Erzeugen von Strings ...

### ... mit dem `new`-Operator
Da ein String ein Objekt, also eine Instanz der Klasse `String` ist, lässt er sich wie alle anderen Objekte mit dem `new`-Operator erzeugen:

``` java
String s = new String();
```

Dies ist aber unsinnig, da es einen leeren String erzeugt. Da Strings **unveränderlich** sind (_siehe unten!_), bleibt dieser String leer!

> Die Klasse `String` bietet auch noch andere Konstruktoren an, deren Nutzen im Zusammenhang mit der Unveränderlichkeit von Strings (siehe unten!) deutlicher werden sollte!

### ... mit String-Literals
Da es eine Möglichkeit braucht, eine Zeichenkette auch direkt im Quelltext zu notieren, kann man ihren Inhalt in Anführungszeichen setzen, um so ein neues String-Objekt mit dem gewünschten Inhalt zu erzeugen:

``` java
String name = "El Duderino";
```


## Verkettung von Strings

Strings lassen sich mit Hilfe des `+`-Operators verketten. Das gilt sowohl für Referenzen auf String Objekte, als auch für String-Literals und sogar beides gemischt (Achtung, sinnleeres Beispiel!):

``` java
String s1 = "Hello";
String s2 = "!";
String s3 = s1 + " World " + s2;
```

Das `+` wird im Kontext von String-Verkettungen automatisch vom Rechenoperator zum String-Verkettungs-Operator. Man sollte also vorsichtig sein, in welchem Kontext man es verwendet:

``` java
System.out.println( "Die Zahl ist " + 4 );
System.out.println( "Die Zahl ist " + 4 + 1 );
System.out.println( "Die Zahl ist " + (4 + 1) );
```

Hier wäre die Ausgabe auf der Konsole wie folgt:

```
Die Zahl ist 4
Die Zahl ist 41
Die Zahl ist 5
```

## Unveränderlichkeit von Strings
Die Klasse `String` ist eine Abstraktion dessen, was in Java wirklich hinter einer Zeichenkette steckt: Ein Array aus `char`-Werten. Und weil Arrays in ihrer Größe unveränderlich sind, sind auch Strings unveränderlich.  
Was im Code wie das Ändern eines bestehenden Strings aussieht ...

``` java
String name = "Raul";
name = name + " Duke";
```

... sorgt in Wirklichkeit dafür dass ein **neues** `String`-Objekt erzeugt und der Variable `name` zugewiesen wird! Diese Operation kostet relativ viel Rechenleistung. Es mag bei einer einzelnen String-Verkettung noch nicht auffallen, aber es ist nicht zu empfehlen (und wirklich *bad practice*), String-Verkettungen in Schleifen vorzunehmen - etwa beim zeilenweise Einlesen einer Datei. Um dieses Problem zu lösen, gibt es die Klasse `StringBuilder`, die mittels Pufferung die Verkettung von Strings enorm beschleunigt!


## Spezial-Zeichen

(oder: _special characters_)

Es gibt einige Zeichen, die sich ohne eine spezielle Syntax nicht in String-Literals unterbringen ließen, wie etwa Zeilenumbrüche oder die doppelten Anführungszeichen (die ja dazu da sind, ein String-Literal zu begrezen!). Um diese Zeichen doch benutzen zu können, müssen sie mit einem vorangestellten `\` maskiert (in diesem Fall engl: _escaped_) werden.  
Es folgt eine Liste dieser Spezial-Zeichen:

Zeichen | Bedeutung
--- | ---
`\'` | Einfache Anführungszeichen
`\"` | Doppelte Anführungszeichen
`\\` | Backslash
`\t` | Tab
`\b` | Backspace
`\n` | Newline / Zeilenumbruch
`\r` | Carriage return / Zeilenumbruch
`\f` | Formfeed
`\u0123` | Das Unicode-Zeichen für `0123`

So gibt diese Anweisung ...

``` java
System.out.println( "Hallo,\n\t\"liebe\"\nWelt!" );
```

... folgendes auf der Konsole aus:

```
Hallo,
	"liebe"
Welt!
```

> :warning: **Achtung:** Da der Backslash `\` die funktion der Maskierung erfüllt, muss er selbst maskiert werden, wenn er als Zeichen im String auftauchen soll. Also so: `"\\"`. Wenn nun der String `\\` lauten soll, dann wäre das String-Literal dazu `"\\\\"`, usw. 