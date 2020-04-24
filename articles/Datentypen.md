# Datentypen :1234:

## Primitive Datentypen

> :construction: **TODO:** Erläuterungen

| Datentyp | Größe | Default-Wert | Beschreibung |
| --- | --- | --- | --- |
| **`byte`** | 1 Byte | `0` | Speichert ganze Zahlen zwischen `-128` und `127` |
| **`short`** | 2 Bytes | `0` | Speichert ganze Zahlen zwischen `-32.768` und `32.767` |
| **`int`** | 4 Bytes | `0` | Speichert ganze Zahlen zwischen `-2.147.483.648` und `2.147.483.647` |
| **`long`** | 8 Bytes | `0` | Speichert ganze Zahlen zwischen `-9.223.372.036.854.775.808` und `9.223.372.036.854.775.807` |
| **`float`** | 4 Bytes | `0.0` | Speichert Fließkommazahlen mit 6 bis 7 Stellen |
| **`double`** | 8 Bytes | `0.0` | Speichert Fließkommazahlen mit bis zu 15 Stellen |
| **`boolean`** | 1 Bit | `false` | Speichert Wahrheitswerte (`true` oder `false`) |
| **`char`** | 2 Bytes | `0` / _null_-Character | Speichert einzelne Symbole/Zeichen oder [ASCII](https://de.wikipedia.org/wiki/American_Standard_Code_for_Information_Interchange)-Werte |


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


<!-- Dieser Link sollte am Ende der Datei stehen! -->
<a class="top-link" href="#">:arrow_up:</a>