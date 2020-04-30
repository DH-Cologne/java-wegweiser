# Datenstrukturen

> :construction: **TODO:** Ein Artikel über verschiedene Datenstrukturen und wie sie in Java implementiert sind bzw. werden können. 


## Arrays

:point_right: siehe Artikel zu [Arrays](Arrays.md)


## Listen

Eine Liste ist ein abstraktes Konzept einer Datenstruktur, deren Elemente eine stabile Reihenfolge besitzen, mehrfach vorkommen können und keine durch die Definition der Liste beschränkte Anzahl haben.  
Es sollen hier als Beispiel für selbst implementierte Listen-Strukturen die verketteten Listen vorgestellt werden - für die in der _Java Class Library_ verfügbaren Implementationen von Listen, :point_right: siehe Artikel zum [Collections Framework](Collections-Framework.md)!


### (Einfach) Verkettete Listen

> :speech_balloon: Es ist hier die Rede von _einfach verketteten Listen_. Im nächsten Abschnitt werden (darauf aufbauend) _zweifach verkettete Listen_ besprochen.

Bei einer verketteten Liste handelt es sich um eine sehr einfache Datenstruktur, bei der die Daten sogenannten _Knoten_ (engl.: _nodes_) zugeordnet sind. Diese Knoten bilden die eigentliche verkettete Liste (zusammen mit einem Start-Verweis auf den ersten Knoten!).  

Ein einzelner Knoten besteht dabei aus nur zwei Elementen: Dem Datenfeld und einem Verweis (_Referenz_) auf den **nächsten** Knoten (Verkettung!):

![Verkettete Liste](../assets/images/linked-list.png)  
Beispiel: _Verkettete Liste mit Integer-Werten; Löschung eines Knotens_

Somit "kennt" ein Knoten immer nur den von ihm aus nächsten Knoten in der Liste. Soll ein Knoten aus der Liste entfernt werden, muss nur die Referenz auf diesen Knoten (ausgehend vom Knoten davor) auf den **nächsten** Knoten abgeändert werden (siehe Grafik oben).

In Java sähe eine sehr einfache Implementation einer Verketteten Liste (mit Integer-Werten) etwa so aus:

```java
public class Node {

    public int value;
    public Node next;

    public Node (int value){
        this.value = value;
    }

}
```

> :speech_balloon: Auf private Klassenattribute sowie Getter und Setter wurde zugunsten der Übersichtlichkeit hier verzichtet. _Eigentlich_ sollte natürlich beides vorhanden sein!

Aus Instanzen dieser simplen Klasse lässt sich bereits eine verkettete Liste konstruieren:

```java
Node first = new Node(12); // Start-Knoten
first.next = new Node(99); // zweiter Knoten
first.next.next = new Node(37); // dritter Knoten
```

Auch das Entfernen des zweiten Knotens (wie in der Grafik oben) ist wie beschrieben möglich:

```java
first.next = first.next.next;
```

Da nun keine Referenz auf den zweiten Knoten mehr existiert, ist dieser effektiv "entfernt" - d.h. das Objekt wird irgendwann vom [Garbage Collector](https://de.wikipedia.org/wiki/Garbage_Collection) der JVM entsorgt.

Dieses effiziente Entfernen von Elementen ist einer der **Vorteile** von verketteten Listen. Ein weiterer ist die "von Natur aus" unbegrenzte Anzahl von Elementen, denn die Knoten-Objekte sind nicht linear im Speicher abgelegt, sondern können irgendwo verteilt gespeichert sein, solange sie einander referenzieren.

Allerdings werden im obigen Beispiel auch die **Nachteile** von verketteten Listen deutlich: Einzelne Elemente lassen sich **nur über die Referenz vom Vorgänger-Knoten** ansprechen. Soll also ein Knoten mit einem ganz bestimmten Wert (oder etwa der `n`-te Knoten der Liste) gefunden werden, muss linear über die Liste iteriert werden, bis der gesuchte Knoten gefunden ist. Eine sehr teuere Operation!


### Zweifach verkettete Listen

Ausgehend von _einfach verketteten Listen_ (siehe oben!) lassen sich _zweifach verkettete Listen_ als eine konzeptuelle Erweiterung beschreiben, bei der jeder Knoten nicht nur den Folgeknoten, sondern auch den Vorgänger-Knoten referenziert. Somit kann (von jedem Knoten aus) die Liste in beide Richtungen durchlaufen werden:

![Zweifach verkettete Liste](../assets/images/doubly-linked-list.png)  
Beispiel: _Zweifach verkettete Liste mit Integer-Werten_

Eine entsprechende Klasse sähe (wieder vereinfacht ohne private Klassenattribute!) etwa so aus:

```java
public class Node {

    public int value;
    public Node previous;
    public Node next;

    // Konstruktor für Wert, etc. ...
}
```

Dadurch lassen sich bestimmte Operationen einfacher ausführen - etwa das Entfernen eines Knotens mit einem bestimmten Wert, denn der zu entfernende Knoten referenziert selbst die beiden Nachbarknoten, deren Referenzen (auf den zu löschenden Knoten) geändert werden müssen!

## Bäume

### Binärbäume

### Binäre Suchbäume

## Sets / Mengen

## Maps



<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>