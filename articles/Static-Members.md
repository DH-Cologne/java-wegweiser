# Static Members<!-- omit in toc -->

- [`static`](#static)
- [Klassenvariablen](#klassenvariablen)
- [Statische Methoden](#statische-methoden)

> :speech_balloon: **static** &mdash; _deu.: statisch_

## `static`

Die wichtigste Erkenntnis um alles zu verstehen, was mit dem Schlüsselwort `static` zu tun hat, ist folgende:

:woman_teacher: `static` bedeutet _**"an die Klasse gebunden"**_ - im Gegensatz zu _"an das Objekt gebunden"_.

Dies hat je nach dem Kontext, in dem `static` verwendet wird, unterschiedliche Auswirkungen ...


## Klassenvariablen

> :speech_balloon: eng.: _static member variables_, siehe auch [Variablen](Variablen.md)

Klassenvariablen (oder: _statische Variablen_) sind an die Klasse gebunden, in der sie deklariert werden. Genaueres zu Klassenvariablen findet sich im [Abschnitt "Klassenvariablen" des Artikels zu Variablen](Variablen.md#klassenvariablen)!


## Statische Methoden

> :speech_balloon: eng.: _static methods_

Auf statische Methoden kann - genau wie auf Klassenvariablen - **ohne** Instanz der Klasse zugegriffen werden, denn sie sind an die Klasse und nicht an eine Instanz der Klasse (ein Objekt) gebunden. Dabei können auch statische Methoden unterschiedlich [sichtbar](Objekte-I-Initialisierung-Members-Zugriff.md#zugriffs-sichtbarkeitsmodifizierer) sein!

Innerhalb von _statischen Methoden_ kann **nicht** auf nicht-statische Variablen und Methoden (eng.: _non-static members_)) zugegriffen werden, da diese (anders als die statische Methode) an Instanzen der Klasse gebunden sind (die im statischen Kontext nicht existieren).

**Beispiel für _statische Methoden_:**

```java
public class User {
  private String id;
  private String eMail;

  public User(String eMail){
    this.eMail = eMail;
    this.id = User.generateUserID(eMail);
  }

  public static String generateUserID(String userMailAddress){
    return "User" + Math.abs(userMailAddress.hashCode());
  }
}

public class Application {
  public static void main(String[] args){
    String someMailAddress = "this.is.my.email@provider.com";
    // Welche ID hat ein User mit dieser Adresse?
    // Wenn es sie/ihn gibt, dann diese (statische Methode
    // wird ohne User-Objekt aufgerufen!):
    System.out.println(User.generateUserID(someMailAddress));
  }
}
```









<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>