# Programmbibliotheken<!-- omit in toc -->


## Was ist eine Programmbibliothek?

Eine [Programmbibliothek](../Glossar.md#programmbibliothek) ist eine Sammlung von Klassen (bzw. auch Interfaces etc.), die dazu gedacht sind, in anderen Programmen wiederverwendet zu werden. Auf diese Weise muss ein\*e Entwickler\*in komplexe Konzepte nicht jedes mal neu erfinden und umsetzen, sondern kann [auf vorhandene Lösungen zurückgreifen](https://en.wikipedia.org/wiki/Reinventing_the_wheel), die im besten Fall von Spezialist\*innen entwickelt und von tausenden Programmierer\*innen genutzt und getestet werden.


## Die Java Class Library

Erinnern wir uns zur Orientierung noch einmal daran, dass wir von Anfang an bereits eine Programmbibliothek benutzen: Die [Java Class Library](https://en.wikipedia.org/wiki/Java_Class_Library). Sie ist Bestandteil des [JDK](Die-Programmiersprache-Java.md#jdk) und steht damit in jedem Java-Programm zur Verfügung. Sie umfasst [zahlreiche Klassen](https://docs.oracle.com/en/java/javase/11/docs/api/allclasses.html) (...), die zum Schreiben von Java-Programmen entweder grundlegend (siehe Paket `java.lang` in der Grafik unten) oder mit hoher Wahrscheinlichkeit nützlich sind.

![Java Standard Library Diagram](../assets/images/java-std-lib.gif)  
Quelle: [www.mathcs.emory.edu](https://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/04/java-lib.html)

Das Paket `java.lang` enthält Klassen (...), die so grundlegend für die Java-Programmierung sind, dass es automatisch zum [Classpath](https://de.wikipedia.org/wiki/Klassenpfad) eines Java-Programms gehört. Klassen (...) aus `java.lang` müssen deshalb auch nicht mit dem `import` statement importiert werden.

```java
/*
* Weder für "System", noch für "Math"
* ist ein Import notwendig!
*/

System.out.println(Math.random());
```

Alle weiteren Bestandteile der _JCL_ stehen nach Bedarf zur Verfügung, müssen also ggf. importiert werden.


## Externe Programmbibliotheken

> 🚧 **TODO**


## Build (Management) Tools

> 🚧 **TODO**


### Maven

> 🚧 **TODO**