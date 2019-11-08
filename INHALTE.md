# Inhalte
> **Was ist dieses Dokument bzw. was ist es nicht?**  
> Dies ist eine Übersicht über die Inhalte, die im Seminar besprochen werden sollten. Der Sinn dieses Dokumentes ist es *nicht*, Erläuterungen zu allen Inhalten des Seminars bereitzustellen. Dies ist keine Lern-Ressource oder gar "Script" zum Seminar. Ziel ist vielmehr eine möglichst vollständige und semantisch bzw. didaktisch strukturierte Aufstellung aller Themen und Aspekte, ergänzt durch unterstützende Materialien (siehe Ordner `Materialien`), Links zu relevanten, weiterführenden Ressourcen (mit `#` gekennzeichnet), sowie passende Übungs- und Hausaufgaben aus diesem Repository (siehe Ordner `Hausaufgaben`).

- [Inhalte](#inhalte)
  - [Die Programmiersprache Java](#die-programmiersprache-java)
  - [Erste Schritte](#erste-schritte)
    - [Hello World! :rocket:](#hello-world-rocket)
    - [Pakete](#pakete)
    - [Java-Klassenbibliothek](#java-klassenbibliothek)
  - [Eclipse IDE (WIP)](#eclipse-ide-wip)
  - [Primitive Datentypen](#primitive-datentypen)
  - [Variablen](#variablen)
  - [Methoden](#methoden)
  - [Operatoren](#operatoren)
  - [Strings / Zeichenketten](#strings--zeichenketten)
  - [Arrays](#arrays)
  - [Kontrollstrukturen](#kontrollstrukturen)
  - [Fehlerbehandlung](#fehlerbehandlung)
  - [JavaDoc](#javadoc)
  - [Objektorientierte Programmierung (OOP)](#objektorientierte-programmierung-oop)
  - [Klassen-Konzepte](#klassen-konzepte)
    - [Klassenvariablen](#klassenvariablen)
    - [Konstruktoren](#konstruktoren)
    - [Sichtbarkeits-/Zugriffsmodifizierer](#sichtbarkeits-zugriffsmodifizierer)


##  Die Programmiersprache Java
- C-artige, universelle Programmiersprache
- JVM [#](https://de.wikibooks.org/wiki/Java_Standard:_Java_Virtual_Machine)
- Bytecode
- Garbage Collector
- von Grund auf objektorientiert [#](https://de.wikibooks.org/wiki/Java_Standard:_Objektorientierung)
- sehr umfangreiche Standard-Library / Klassenbibliothek

![Java Platform Diagram](Materialien/Java-Platform-Diagram.png)

## Erste Schritte

### Hello World! :rocket:
- Woraus besteht eine **Klasse** mindestens?
- Was ist eine **Methode**?
- **main**-Methode mit "Hello World!"
  - Einstiegspunkt ins Programm
  - Was ist ein String / Zeichenkette (Klasse/Objekt!)?

<details><summary>CODE</summary>

```java
public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello World!"); // ach, was!
      }
}
```
</details>

### Pakete
- Was sind Pakete und wozu sind sie da? [#](https://de.wikibooks.org/wiki/Java_Standard:_Erste_Schritte#Pakete)
- Wie sehen Pakete auf meiner Festplatte aus?
  
### Java-Klassenbibliothek
- Beispiele für häufig verwendete Klassen [#](https://de.wikibooks.org/wiki/Java_Standard:_Erste_Schritte#Klassenbibliothek)
- Paketstruktur der Klassenbibliothek

## Eclipse IDE (WIP)
- Hintergründe [#](https://de.wikibooks.org/wiki/Java_Standard:_Einrichten_der_Programmierumgebung#Eclipse)
- die verschiedenen Views...
- erstes Projekt anlegen
  - was ist alles drin?
- Import / Export von Projekten...
- ...

## Primitive Datentypen
...

## Variablen
...

## Methoden
...

## Operatoren
...

## Strings / Zeichenketten
...

## Arrays
...

## Kontrollstrukturen
...

## Fehlerbehandlung
...

## JavaDoc
...

## Objektorientierte Programmierung (OOP)
- Was ist **OOP**? [#](https://de.wikibooks.org/wiki/Java_Standard:_Objektorientierung_Sinn_und_Zweck)
- Was ist eine **Klasse** (*konzeptuell, im Kontext d. OOP*)?
- Was ist ein **Objekt** (*konzeptuell, im Kontext d. OOP*)?

## Klassen-Konzepte
Welche Konzepte stehen zum Aufbau von Klassen zur Verfügung?
### Klassenvariablen
...
### Konstruktoren
...
### Sichtbarkeits-/Zugriffsmodifizierer
- `private`
- `(default)`
- `protected`
- `public`