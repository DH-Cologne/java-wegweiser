# Variablen 🏷️<!-- omit in toc -->

Eine Variable dient dazu, Werte oder Objekte zu speichern und sie über einen _Bezeichner_, den _Variablennamen_ referenzierbar (oder auch: _ansprechbar_) zu machen. Technisch gesehen hat eine Variable in Java entweder einen [primitiven Wert](Datentypen.md#primitive-datentypen) oder hält die Adresse eines [Objektes](OOP-Einfuehrung.md) bereit.

- [Typsicherheit](#typsicherheit)
- [Deklaration und Zuweisung](#deklaration-und-zuweisung)
- [Arten von Variablen](#arten-von-variablen)
  - [Lokale Variablen](#lokale-variablen)
  - [Parameter / Argumente](#parameter--argumente)
  - [Instanzvariablen](#instanzvariablen)
  - [Klassenvariablen](#klassenvariablen)


> ⚠️ _Variablennamen_ werden in Java [per Konvention](Naming-Conventions.md) immer im [_lowerCamelCase_](Naming-Conventions.md#variablen) geschrieben (es sei denn es handelt sich um [Konstanten](Final.md), dann werden sie im [UPPERCASE_MIT_UNTERSTRICHEN](Naming-Conventions.md#variablen) geschrieben)!


## Typsicherheit

> 💬 **eng.:** type safety

Java ist eine _stark typisierte_ (oder auch _streng typisierte_) Sprache. Das bedeutet, dass alle Variablen in Java **einen bestimmten Datentyp** haben und sich dieser **nicht ändern** kann. Dieser Umstand gewährleistet _Typsicherheit_, d.h. man kann sich darauf verlassen, dass das Objekt (oder der Wert), auf den eine Variable verweist, den Datentyp der entsprechenden Variable besitzt.

> 💬 Das geht auch anders: Sprachen wie Python, JavaScript oder PHP sind nicht- oder lose typisiert - der Datentyp einer Variable kann sich dort ändern bzw. ist nicht festgelegt.


## Deklaration und Zuweisung

Als **Deklaration** einer Variable bezeichnet man den Vorgang des Festlegens von Datentyp und Variablenname. Dies geschieht grundsätzlich in der genannten Reihenfolge, also erst der Datentyp, dann der Variablenname:

```java
String userName
```

Das Beispiel zeigt die Deklaration einer `int`-Variable mit dem Namen `age`. Als alleinstehende Anweisung etwa würde sie (wie jede Anweisung) mit einem `;` abschließen:

```java
int age;
```
Die Deklaration einer Variable kann aber in unterschiedlichen Kontexten stattfinden (siehe [Arten von Variablen](#arten-von-variablen)).

Die explizite **Zuweisung** eines Wertes zu einer Variablen geschieht grundsätzlich mit dem _Zuweisungsoperator_: `=`

```java
int age;
age = 21;
```

Oder als **ein** Statement / Anweisung:

```java
int age = 21;
```

Die Variable repräsentiert dann (innerhalb ihres Gültigkeitsbereiches) stets ihren Wert:

```java
int age = 21;
int sameAge = age; // ist nun auch 21
```

Eine Variable kann allerdings auch auf anderem Wege einen Wert erhalten (siehe [Arten von Variablen](#arten-von-variablen)).


## Arten von Variablen


### Lokale Variablen

Als lokale Variablen werden Variablen bezeichnet, die innerhalb eines Methodenkörpers deklariert werden. Genau wie bei Parametern / Argumenten entspricht ihr [Gültigkeitsbereich](https://de.wikipedia.org/wiki/Variable_(Programmierung)#Scope) dem Methodenkörper und sie existieren nur während der Ausführung der Methode. Im folgenden Beispiel ist `fullName` eine lokale Variable:

``` java
public void combineNames(String firstName, String lastName){
    String fullName = firstName + " " + lastName;
    System.out.println("The full name is " + fullName);
}
```

> 💬 In diesem Beispiel besteht von außerhalb der Methode `combineNames()` kein Zugriff auf die Variable `fullName`! Diese Variable existiert nur während der Ausführung der Methode!


### Parameter / Argumente

Ein Methoden-Parameter oder -Argument ist eine Variable, die einen an eine Methode übergebenen Wert referenziert. Ihr [Gültigkeitsbereich](https://de.wikipedia.org/wiki/Variable_(Programmierung)#Scope) ist der gesamte Methodenkörper. Im folgenden Beispiel ist `name` ein Parameter bzw. Argument:

``` java
public void sayName(String name){
    System.out.println("The name is " + name);
}
```

> 💬 In diesem Beispiel besteht von außerhalb der Methode `sayName()` kein Zugriff auf die Variable `name`, die ein Parameter dieser Methode ist. Diese Variablen existieren nur während der Ausführung der Methode!


### Instanzvariablen

> ⚠️ Dieser Abschnitt setzt Kenntnisse zu [objektorientierter Programmierung](../README.md#objektorientierte-programmierung-oop) voraus.

> 💬 engl.: _instance variables / (non-static) member variables_

Instanzvariablen sind mit einem Objekt (also einer Instanz einer Klasse) verknüpft. Sie werden im Klassenkörper deklariert und sind nicht statisch, also nicht mit `static` markiert und können auch nicht aus einem statischen Kontext heraus angesprochen werden. Der [Gültigkeitsbereich](https://de.wikipedia.org/wiki/Variable_(Programmierung)#Scope) einer Instanzvariable entspricht dem gesamten Klassenkörper, bzw. (bei Verwendung außerhalb der Klasse bei Instanzvariablen die nicht `private` sind) dem Gültigkeitsbereich der Referenz auf die Instanz.

``` java
public class User {
    private String userName; // eine Instanzvariable

    // ...
}
```


### Klassenvariablen

> ⚠️ Dieser Abschnitt setzt Kenntnisse zu [objektorientierter Programmierung](../README.md#objektorientierte-programmierung-oop) voraus.

> 💬 engl.: _class variables_

Klassenvariablen (oder: _statische Variablen_) sind an die Klasse gebunden, in der sie deklariert werden. Sie werden mit dem Schlüsselwort `static` als "statisch" markiert, d.h. dass ihr Wert in allen Instanzen der Klasse **immer der selbe** ist und dass auf sie **ohne eine Instanz der Klasse zugegriffen werden kann** (sofern dies nicht durch den [Zugriffsmodfizierer](Objekte-I-Initialisierung-Members-Zugriff.md#sichtbarkeits-zugriffsmodifizierer) verhindert wird).

``` java
public class ImageLoader {
    public static String imagesPath; // eine Klassenvariable

    // ...
}
```

Das folgende Beispiel zeigt den Zugriff auf die oben definierte statische Variable `imagesPath`. Wichtig: Die Variable muss dafür natürlich vom aufrufenden Code aus [sichtbar](Objekte-I-Initialisierung-Members-Zugriff.md#zugriffs-sichtbarkeitsmodifizierer) sein (hier: `public`):

``` java
String imgPath = ImageLoader.imagesPath;
```




