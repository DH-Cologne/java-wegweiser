# Schleifen :ribbon:


Schleifen wiederholen die Ausführung eines Blockes von Anweisungen in Abhängigkeit von bestimmten Voraussetzungen.
In Java gibt es vier verschiedene Formen von Schleifen.

---

## `while`

#### Syntax:
    
    while(Bedingung) {
        //Anweisung
    }

Bei jedem Durchlauf der `while`-Schleife wird zunächst eine ___Bedingung___ mit einem Rückgabewert vom Datentyp `boolean` überprüft. Gibt diese `true` zurück, wird die ___Anweisung___ ausgeführt. Wird die Bedingung nicht erfüllt, gibt also `false` zurück, wird die Schleife abgebrochen. Mit der while-Schleife kann eine Anweisung beliebig oft ausgeführt werden, ohne im Vorfeld die Anzahl der Durchläufe festzulegen.

hier ein Beispiel:

     int zahl = 100;
     
     while(zahl >= 0) {
        System.out.println(zahl);
        zahl -= 10;
     }
>hier wird in Zehnerschritten von 100 bis 0 runtergezählt

---

## `do-while`

#### Syntax:

    do {
        //Anweisung
    } while(Bedingung);

Die `do-while`-Schleife funktioniert ähnlich wie die `while`-Schleife. Allerdings wird hier immer erst die Anweisung ausgeführt und dann die Bedingung überprüft. Die Anweisung wird also immer mindestens einmal ausgeführt, auch wenn die Bedingung `false` ist.

hier ein Beispiel:

    int zahl = 100;
    
    do {
        System.out.println(zahl);
        zahl -= 10;
    } while(zahl >= 0);
>hier wird bis -10 runtergezählt, da die Bedingung erst nach der Anweisung überprüft wird

---

## `for`

#### Syntax:

    for(startwert;Bedingung;Iteration) {
        //Anweisung
    }
    
Die `for`Schleife iteriert über einen Laufindex.  
- Der ___Startwert___ legt fest, mit welchem Wert die Schleife anfangen soll, zu zählen.  
- Die ___Bedingung___  wird vor jedem Durchlauf geprüft, wenn sie `true` ist, wird die Anweisung ausgeführt.   
Sobald die ___Bedingung___ `false` ist, wird die Schleife unterbrochen.   
- Die ___Iteration___ aktualisiert den _Startwert_ und wird immer nach der _Anweisung_ ausgeführt.

Die `for`-Schleife wird also durch einen Zähler gesteuert.  
Außerdem ist bereits zu Beginn der Schleife festgelegt, wie oft sie ausgeführt wird.

Hier ein einfaches Beispiel:

    for(int i = 0; i<=10; i++) {
        System.out.println(i);
    }
>hier werden alle Zahlen von 0 bis einschleßlich 10 auf der Konsole ausgegeben

---

## `forEach`

Eine `forEach`-Schleife läuft über eine [___Collection___](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Collections-Framework.md) und gibt den Wert jedes Elementes zurück. 

Syntax:

    for(Typ e : collection ) {
        //Anweisung
    }
    
 `e` dient als Referenz zum Wert des jeweiligen Elements der Collection.
 
 Hier ein einfaches Beispiel:
 
    ArrayList<String> words = new ArrayList<>();
        words.add("a"),
        words.add("b");
        words.add("c");
		
    for(String s:words) {
	System.out.println(s);
    }
>hier werden die Elemente der ArrayList [a, b, c] auf der Konsole ausgegeben

---

## Keywords

Es gibt zwei nützliche Schlüsselwörter, `continue` und `break` die im Anweisungblock der Schleifen verwendet werden können.

#### `continue`

Durch `continue` wird der Rest der Anweisung übersprungen und mit dem nächsten Durchlauf begonnen.

    for(int i=0; 1<=10; i++) {
        if(i==5)continue;
        System.out.println(i);
    }
>hier wird der Durchlauf bei i==5 beendet, ohne i auf der Konsole auszugeben

#### `break`

Durch `break` wird die Schleife unterbrochen. Damit können zusätzlich Abbruchbedingungen formuliert werden.

    for(int i=0; 1<=10; i++) {
        if(i==5)break;
        System.out.println(i);
    }
>hier wird die Schleife bei i==5 unterbrochen, auf der Konsole werden nur 0 bis 4 ausgegeben.

---

## Worauf Du achten musst :collision:

#### Endlosschleife :cyclone:

Endlosschleifen sind genau das, wonach es klingt, Schleifen ohne Ende. Das heißt, dass die Bedingung der Schleife nicht `false` wird. Um das zu vermeiden, kannst Du ein paar Sachen überprüfen:
- ist die Bedingung der Schleife richtig formuliert?
- Wurden alle Variablen initialisiert?
- bei `while` oder `do-while`: Sorgt eine Anweisung innerhalb der Schleife dafür, dass die Bedingung false wird?


<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>
