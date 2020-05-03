# Schleifen :ribbon:

> :construction: **TODO:** Alles.

Schleifen wiederholen die Ausführung eines Blockes von Anweisungen in Abhängigkeit von bestimmten Voraussetzungen.

---

## `while`

#### Syntax:
    
    while(Bedingung) {
        //Anweisung
    }

Bei jedem Durchlauf der `while`-Schleife wird zunächst eine ___Bedingung___ mit einem Rückgabewert vom `boolean`-Datentyp überprüft. Gibt diese `true` zurück, wird die ___Anweisung___ ausgeführt. Wird die Bedingung nicht erfüllt, gibt also `false` zurück, wird die Schleife abgebrochen. Mit der while-Schleife kann eine Anweisung beliebig oft ausführen werden, ohne im Vorfeld die Anzahl der Durchläufe festzulegen.


---

## `do-while`

#### Syntax:

    do {
        //Anweisung
    } while(Bedingung);

Die `do-while`-Schleife funktioniert ähnlich wie die `while`-Schleife. Allerdings wird hier immer erst die Anweisung ausgeführt und dann die Bedingung überprüft. Die Anweisung wird also immer mindestens einmal ausgeführt.  


---

## `for`

#### Syntax:

    for(startwert;Bedingung;Iteration) {
        //Anweisung
    }
Die `for`Schleife iteriert über einen Laufindex.  
Der ___Startwert___ legt fest, mit welchem Wert die Schleife anfangen soll, zu zählen.  
Die ___Bedingung___  wird vor jedem Durchlauf geprüft, wenn sie `true` ist, wird die Anweisung ausgeführt.   
Sobald die ___Bedingung___ `false` ist, wird die Schleife unterbrochen.   
Die ___Iteration___ aktualisiert den _Startwert_ und wird immer nach der _Anweisung_ ausgeführt.  
Die `for`-Schleife wird also durch einen Zähler gesteuert.  
Außerdem ist bereits zu Beginn der Schleife festgelegt, wie oft sie ausgeführt wird.

Hier ein einfaches Beispiel:

    for(int i = 0; i<=10; i++) {
     System.out.println(i);
    }

>hier werden alle Zahlen von 0 bis einschleßlich 10 auf der Konsole ausgegeben.


---

## `forEach`

Eine `forEach`-Schleife läuft über eine [___Collection___](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Collections-Framework.md) und gibt den Wert jedes Elementes zurück. 

Syntax:

    for(Typ element : collektion ) {
    // Anweisung, die "element" verwendet
    }

---



## Worauf Du achten musst :collision:

- In einer Schleife sollte stets eine Anweisung ausgeführt werden, die dazu führt, dass die Schleifenbedingung (irgendwann)  wird. Ansonsten wird die Schleife nie beendet, man spricht von einer Endlosschleife. 


<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>
