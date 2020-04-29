# `main`-Methode

## Funktion
Jede Java-Anwendung muss eine main-Methode besitzen. Aber nur eine. Sie ist der Einstiegspunkt für die Ausführung des Java-Projektes.
Von hier aus werden die Funktionen aller Klassen des Java-Projektes gestartet.

## Aufbau

Die Signatur der main-Methode sieht so aus:

```java
public static void main( String[] args)
```

```java
public 
``` 
Sie ist öffentlich, damit von außerhalb der Klasse auf sie zugegriffen werden kann.

```java
static
```
Sie ist statisch da bevor sie aufgerufen wird kein Objekt der Klasse gebildet werden muss, um sie auszuführen.

```java
void
```
Dies bedeutet, dass die main-Methode keinen Rückgabewert besitzt.

```java 
main
```
Das ist der Name der Methode, den kennen wir ja schon...

```java
String[] args
```
Dieser Parameter ist ein Array von Stringreferenzen, das die main-Methode besitzt. Dieses Array wird vom Java System konstruiert, kurz bevor main() die Kontrolle bekommt. Die Elemente des Arrays verweisen auf Strings, die die Argumente der Kommandozeile enthalten, mit denen das Programm gestartet wurde. 



Quellen:
[#](https://javabeginners.de/Grundlagen/main.php)
[#](http://www.gailer-net.de/tutorials/java3/Notes/chap49B/ch49B_9.html)


<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>
