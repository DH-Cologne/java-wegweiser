# Rekursion 😵<!-- omit in toc -->

Besser als bei Wikipedia wird die Definition nicht - deshalb an dieser Stelle ein Zitat:

> _Als **Rekursion** (lateinisch recurrere ‚zurücklaufen‘) bezeichnet man den abstrakten Vorgang, dass Regeln auf ein Produkt, das sie selbst erzeugt haben, von neuem angewandt werden._ &mdash; [Wikipedia](https://de.wikipedia.org/wiki/Rekursion)

Beim Programmieren findet Rekursion zum Beispiel dann statt, wenn eine Methode sich selbst aufruft. Vorsichtig sollte man natürlich mit potenziellen 👉 [Endlosschleifen](../Glossar.md#endlosschleife) sein - es muss immer irgendwann einen Zustand geben, in dem die Rekursion "fertig" ist.

Ein klassisches Standard-Beispiel ist eine Methode zur Errechnung der [Fakultät](https://de.wikipedia.org/wiki/Fakult%C3%A4t_(Mathematik)) einer Zahl. Mathematisch definiert sich die Fakultät einer (natürlichen) Zahl _n_ (also `n!`) als das Produkt _aller_ natürlichen Zahlen von `1` bis `n` (also der Zahl selbst):

```java
public int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```

Oder noch kürzer:

```java
public int factorial(int n) {
    return (n == 0) ? 1 : (n * factorial(n - 1));
}
```

Dieses Beispiel zeigt auf sehr einfache Weise, worum es geht: Die Methode ruft sich selbst auf. Generell bietet sich eine Rekursion unter Umständen dann an, wenn ein und dieselbe Operation auf mehrere "gleichartige" Elemente angewandt werden soll. Im Beispiel oben ist es eben die Multiplikation der Zahl mit der Fakultät der nächst kleineren Zahl. Der Abbruch erfolgt dann, wenn `n` den Wert `0` erreicht, denn `0!` ist immer `1` (das ist so festgelegt).

Andere typische Anwendungsbeispiele für Rekursion sind die Errechnung der [Fibonacci-Zahlen](https://de.wikipedia.org/wiki/Fibonacci-Folge) oder das Durchsuchen (o.ä.) von Ordnern, deren Unterordnern, deren Unterordnern usw.  
Die Funktionsweise von rekursiven Methoden zu verstehen ist anfangs nicht ganz einfach. Eine sehr gute Übung es, eine Methode zu implementieren, die alle Dateien eines Ordners auflistet (auch jene aus allen Unterordnern) und den Ablauf dieser Methode genau nachzuvollziehen.

![Rekursion](../assets/images/recursion.webp)  
> _Quelle: [#](https://konczakowski.tumblr.com/post/170961987185), konczakowski_

> 🔗 Sehr gute Informationen zum Thema Rekursion findest du [hier](Rekursion.md)!





