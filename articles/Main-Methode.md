# `main`-Methode


## Funktion

Jede Java-Anwendung, die lauffähig sein soll (also keine Library o.ä. ist), muss eine main-Methode besitzen. Sie ist der Einstiegspunkt für die Ausführung des Java-Programmes. Von hier aus wird - durch das Erzeugen von Objekten und Aufrufen von Methoden - die Funktionalität des gesamten Programmes in Gang gesetzt. Ein Java-Programm _kann_ auch mehrere `main`-Methoden haben, allerdings muss dann bei der Ausführung des Programms die gewünschte `main`-Methode angegeben werden.


## Aufbau

Die Signatur der `main`-Methode sieht so aus:

```java
public static void main( String[] args){
  // ... Code in der main-Methode ...
}
```

Die einzelnen Schlüsselwörter bedeuten Folgendes:

-  **`public`**: Die Methode ist öffentlich, damit von außerhalb der Klasse auf sie zugegriffen werden kann.
-  **`static`**: Sie ist statisch - es muss keine Instanz der Klasse erzeugt werden, um sie aufzurufen.
- **`void`**: Dies bedeutet, dass die `main`-Methode keinen Rückgabewert besitzt.
- **`main`**: Das ist der Name der Methode, den kennen wir ja schon...
- **`String[] args`**: Dieser Parameter ist ein Array von Strings (bzw. String-_Referenzen_). Diese Strings enthalten die Kommandozeilen-Argumente, mit denen das Programm gestartet wurde.

Quellen:
[#](https://javabeginners.de/Grundlagen/main.php)
[#](http://www.gailer-net.de/tutorials/java3/Notes/chap49B/ch49B_9.html)


<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>
