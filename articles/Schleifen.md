# Schleifen :ribbon:



Schleifen wiederholen die Ausführung eines Blockes von Anweisungen in Abhängigkeit von bestimmten Voraussetzungen.


## while
Die `while-Schleife` wiederholt die darauffolgende Anweisung so lange, bis die angegebene Bedingung nicht mehr erfüllt ist. Die Bedingung wird **vor** einem Durchgang der Schleife überprüft.
```java
10
11 while ( Bedingung ) { 
12    Anweisung   
13 };
```
So kann beispielsweise bis 10 gezählt werden:
```java
10 int ichwillzaehlen = 1; 
11
12 while ( ichwillzaehlen <10 ) { 
13    ichwillzaehlen++;   
14 };
```
Hat also die Variable `ichwillzaehlen` einen kleineren Wert als 10, 
wird **`ichwillzaehlen++`** ausgeführt. (Das ist nichts anderes als ichwillzaehlen + 1).  

  



## do-while
Im Gegensatz zur `while-Schleife`, überprüft die `do-while-Schleife` die Bedingung nicht vor, sondern **nach** einem Durchgang. Das wird auch *fußgesteuerte-Schleife* genannt.
 ```java
10                                    //int anzahlzucchini = 5
11 do { Anweisung                     //do {zucchini.kaufen()     //Methode bewirkt anzahlzucchini++    
12    } while ( Bedingung );          //} while( anzahlzucchini < 5)
13                                    // Es wird also immer mindestens eine Zucchini gekauft, auch                                 
                                       //wenn bereits genügend Zucchini im Haus sind.
```
Manchmal möchte man, dass eine Schleife **mindestens einmal** durchlaufen werdern sollte. Dann sollte man sich für eine `do-while-Schleife` entscheiden.  



## for
Die `for-Schleife` ist in der Funktion der `while-Schleife` ähnlich......


## for-each# Schleifen :ribbon:



<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>
