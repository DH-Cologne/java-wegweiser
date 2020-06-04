# Naming Conventions

<!-- > :construction: **TODO:** Alles. -->

Naming Conventions (dt.: _Namenskonvetionen_) machen Programmcode lesbarer und damit verständlicher. Mit der Einhaltung von Konventionen wird es möglich, verschiedene Komponenten - wie [Klassen](Klassen-und-Objekte.md), [Variablen](Variablen.md) oder Konstanten - auf den ersten Blick zu erkennen und zu unterscheiden.

- [Naming Conventions](#naming-conventions)
  - [Packages](#packages)
  - [Klassen](#klassen)
  - [Interfaces](#interfaces)
  - [Methoden](#methoden)
  - [Variablen](#variablen)
  - [Konstanten](#konstanten)
  - [Allgemein](#allgemein)


## Packages
[Packages](Packages.md) werden in lowercase (dt.: _Kleinschreibung_) bennant. Die Top-Level-Domain einer Organisation dient in der Regel als Präfix, gefolgt von der Second-Level-Domain. Weitere Namensbestandteile können durch interne Konventionen festgelegt werden und beschreiben meist eine Aufgliederung in Programme, Abteilungen, Versionen etc. Alle Teile des Namens werden durch Punkte verkettet.

**Beispiele:**
``` java

// top-level-domain.second-level-domain.software.component

package org.mediagenius.audio;

package com.apple.quicktime.v2;

```

## Klassen
[Klassen](Klassen-und-Objekte.md) werden möglichst einfach und beschreibend mit Substantiven bennant. Besteht der Name aus mehreren Substantiven, so wird er in [**CamelCase**](https://en.wikipedia.org/wiki/Camel_case) geschrieben. Jedes Wort wird dabei _großgeschrieben_. Es werden nur außerdem gebräuchliche Abkürzungen verwendet.

**Beispiele:**
``` java

class UpperCamelCase {
    //...
}

class User {
    //...
}

class SpecialUser {
    //...
}

```

## Interfaces
Die Konventionen für Interfaces entsprechen jenen für Klassen. Teilweise wird alternativ ein **ICamelCase** verwendet, um eine Abgrenzung zur Klasse deutlich zu machen.

**Beispiele:**
``` java

interface UpperCamelCase {
    //...
}

interface UserDelegate {
    //...
}

interface IUpperCamelCase {
    //...
}

interface IUserDelegate {
    //...
}

```

## Methoden
[Methoden](Methoden.md) werden mit Verben in **lowerCamelCase** benannt. Der Name beginnt dabei mit einem kleinen Buchstaben. Alle weiteren Bestandteile werden _großgeschrieben_.

**Beispiele:**
``` java

public void applyConfig(){
    // ...
}

getUserData();

```

## Variablen 
[Variablen](Variablen.md) werden in **lowerCamelCase** benannt. Der Name beginnt dabei mit einem kleinen Buchstaben. Alle weiteren Bestandteile werden _großgeschrieben_. Obwohl `_` und `$` am Anfang eines Namens zulässig sind, sollte auf die Verwendung verzichtet werden, da solche Präfixe in Java eher ungebräuchlich sind. Ebenso sollte von der Verwendung kryptischer Bezeichungen oder Namen aus einem Buchstaben abgesehen werden. Ausnahmen stellen sog. Wegwerfvariablen dar - beispielsweise Zähl-Variablen in [Schleifen](Schleifen.md).

**Beispiele:**
``` java

int i; // okay als Zählvariable

int age; // eindeutig

float myCount; // nicht gut: Was wird hier gezählt?

float moneyCount; // schon besser!

```

## Konstanten
Konstanten werden vollständig **UPPERCASE** benannt. Einzelne Worte werden durch einen `_` getrennt. 

**Beispiele:**
``` java

static final String URL = 'https://example.com';

static final int MAX_COUNT = 100;

```

## Allgemein
Code sollte möglichst lesbar und verständlich geschrieben werden. Das erleichtert nicht nur die Entwicklung, sondern auch die spätere Wartung. Im Idealfall lässt der Name einer Methode erkennen, was sie tut. Die Bezeichung einer Variablen sollte Aufschluss darüber geben, welchem Zweck sie dient. 
Grundsätzlich sollten Entitäten simpel, jedoch deskriptiv benannt werden. Im Zweifel sollte man vor einem längeren, dafür aber verständlicheren Namen nicht zurückschrecken. Das ist besonders in Java der Fall! Die Sprache (und ihre Konventionen) gilt deshalb bei manchen als zu [_verbose_](https://en.wikipedia.org/wiki/Verbosity) oder sperrig, es wird dadurch aber eine gute Lesbarkeit erreicht.

> :speech_balloon: Das Buch [Clean Code](CleanCode) beschäftigt sich ausführlich mit Benennungen und Naming Conventions, sodass es sich als Leseempfehlung an dieser Stelle eignet. :books:


---------------

> **Quellen und weitere Informationen:**
> - [https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)  
> - [http://ps.informatik.uni-tuebingen.de/teaching/ss17/se/02-Best-Practices.pdf - S. 15](http://ps.informatik.uni-tuebingen.de/teaching/ss17/se/02-Best-Practices.pdf)  
> - [https://www.oreilly.com/library/view/java-8-pocket/9781491901083/ch01.html](https://www.oreilly.com/library/view/java-8-pocket/9781491901083/ch01.html)  
> - [https://www.geeksforgeeks.org/java-naming-conventions/](https://www.geeksforgeeks.org/java-naming-conventions/)  
> - [https://medium.com/better-programming/string-case-styles-camel-pascal-snake-and-kebab-case-981407998841](https://medium.com/better-programming/string-case-styles-camel-pascal-snake-and-kebab-case-981407998841)
> - [Clean Code: A Handbook of Agile Software Craftsmanship](https://books.google.de/books?id=_i6bDeoCQzsC&printsec=frontcover&hl=de#v=onepage&q&f=false)


<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>
