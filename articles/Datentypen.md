# Datentypen :1234:

## Primitive Datentypen

-   `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
-   Welche **default values** haben diese Datentypen?

![primitive types overview](/assets/images/primitive-data-types.png)
Grafik: [#](/assets/images/primitive-data-types.png), Quelle [#](https://de.wikibooks.org/wiki/Java_Standard)


## Komplexe Datentypen

- Alle Klassen sind komplexe Datentypen
- Arrays sind komplexe Datentypen


## Wrapper-Klassen

(oder engl.: _wrapper classes_)

Zu allen primitiven Datentypen bietet die _Java Class Library_ passende Wrapper-Klassen an. Diese halten Werte vom entsprechenden Datentyp, bieten aber auch nützliche Methoden an.  
Es gibt somit zu jedem primitiven Datentyp einen entsprechenden komplexen Datentyp. Instanzen dieser Wrapper-Klassen werden mit einer abgekürzten Sytax erzeugt (`Integer i = 42;` - also ohne `new`-Operator):

```java
Integer i = 42;
System.out.println("i hat den Wert " + i + ".");
System.out.println("Der Maximal-Wert für einen "
        + "Integer ist: " + Integer.MAX_VALUE);
```

Ausgabe:
```
i hat den Wert 42.
Der Maximal-Wert für einen Integer ist: 2147483647
```