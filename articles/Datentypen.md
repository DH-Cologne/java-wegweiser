# Datentypen :1234:<!-- omit in toc -->

- [Primitive Datentypen](#primitive-datentypen)
- [Komplexe Datentypen](#komplexe-datentypen)
- [Wrapper-Klassen](#wrapper-klassen)


## Primitive Datentypen

Die primitiven Datentypen sind das einzige, was Java davon abhält, eine vollkommen objektorientierte Programmiersprache zu sein. Java ist deshalb streng genommen eine _hybride Programmiersprache_.

Durch die Verwendung primitiver Datentypen kann man immer dann Ressourcen (Rechenleistung, Arbeitsspeicher) sparen, wenn man den äquivalenten komplexen Datentyp nicht unbedingt benötigt.

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

> ⚠️ Dieser Absatz greift inhaltlich vor, falls du dich noch nicht mit Klassen und Objekten beschäftigt hast!

Dieser Abschnitt kann sehr kurz gehalten werden: [Klassen](OOP-Klassen-und-Objekte.md) sind komplexe Datentypen - **alle** Klassen. Da [abstrakte Klassen](Vererbung-II-Abstrakte-Klassen-und-Methoden.md) und [Interfaces](Vererbung-III-Interfaces.md) letztendlich auch Typen sind, die nur von Instanzen echter Klassen angenommen werden, sind auch sie komplexe Datentypen.

> 💬 Arrays spielen in Java eine Sonderrolle - auch sie sind ein komplexer Datentyp.


## Wrapper-Klassen

(oder engl.: _wrapper classes_)

Zu allen primitiven Datentypen bietet die _Java Class Library_ passende Wrapper-Klassen an. Diese halten Werte vom entsprechenden Datentyp, bieten aber auch nützliche Methoden an.  
Es gibt somit zu jedem primitiven Datentyp einen entsprechenden komplexen Datentyp. Instanzen dieser Wrapper-Klassen werden mit einer abgekürzten Sytax erzeugt (`Integer i = 42;` - also ohne `new`-Operator):

```java
Integer i = 42;
System.out.println("i hat den Wert " + i + ".");
System.out.println("Der Maximal-Wert für einen "
        + "Integer ist: " + Integer.MAX_VALUE);
System.out.println("1" + 1);
System.out.println(Integer.parseInt("1") + 1);
```

Ausgabe:
```
i hat den Wert 42.
Der Maximal-Wert für einen Integer ist: 2147483647
11
2
```

Diese Wrapper-Klassen benutzt man nur dann, wenn man sie benötigt (wegen der extra Fähigkeiten) oder es muss (siehe 🔭 [Generics](Generics.md)).





