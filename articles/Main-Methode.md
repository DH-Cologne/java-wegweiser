# `main`-Methode<!-- omit in toc -->

Jede Java-Anwendung, die lauffähig sein soll (also keine Library o.ä. ist), muss eine main-Methode besitzen. Sie ist der Einstiegspunkt für die Ausführung des Java-Programmes. Von hier aus wird - durch das Erzeugen von Objekten und Aufrufen von Methoden - die Funktionalität des gesamten Programmes in Gang gesetzt. Ein Java-Programm _kann_ auch mehrere `main`-Methoden haben, allerdings muss dann bei der Ausführung des Programms die gewünschte `main`-Methode angegeben werden.


Der Aufbau einer `main`-Methode sieht **immer** folgendermaßen aus:

```java
public static void main( String[] args){
  // ... Code in der main-Methode ...
}
```

Bedeutung der einzelnen Schlüsselwörter:

> :warning: Wenn du gerade erst lernst, was eine `main`-Methode ist, dann nimm das Beispiel oben lieber erstmal so hin, wie es ist. Du wirst die Einzelheiten später noch nachvollziehen!

-  **`public`**: Die Methode ist öffentlich, damit von außerhalb der Klasse auf sie zugegriffen werden kann.
-  **`static`**: Es handelt sich um eine statische Methode - es muss keine Instanz der Klasse erzeugt werden, um sie aufzurufen.
- **`void`**: Dies bedeutet, dass die `main`-Methode keinen Rückgabewert besitzt.
- **`main`**: Der Name der Methode
- **`String[] args`**: Dieser Parameter ist ein Array von Strings (bzw. String-_Referenzen_). Diese Strings enthalten die Kommandozeilen-Argumente, mit denen das Programm gestartet wurde.

Quellen:
[#](https://javabeginners.de/Grundlagen/main.php)
[#](http://www.gailer-net.de/tutorials/java3/Notes/chap49B/ch49B_9.html)



