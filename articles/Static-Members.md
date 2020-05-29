# Static Members

> :construction: **TODO:**  
> - gründlichere Formulierungen in ganzen Sätzen
> - weitere Inhalte aus der Übersicht in der README!


## `static`

`static` bedeutet _"an die Klasse gebunden"_ im Gegensatz zu _"an das Objekt gebunden"_. Dies hat je nach Kontext, in dem das Schlüsselwort `static` verwendet wird, unterschiedliche Auswirkungen ...


## Klassenvariablen

> :speech_balloon: Engl.: _static member variables_

-   auch _Klassenvariablen_ genannt
-   sind **ohne** Instanz der Klasse zugreifbar (sofern sie sichtbar sind!)
-   haben klassenweit - also in jeder Instanz der Klasse - immer den selben Wert

> :construction: **TODO:** ausarbeiten...

**Beispiel für _Klassenvariablen_:**

```java
public class User {

  private static String displayString;

  public User(){
    // default displayString setzen
    this.displayString = "User";
  }

  public void setDisplayString(String displayString){
    this.displayString = displayString;
  }

  public String getDisplayString(){
    return this.displayString;
  }

}


public class Application {

  public static void main(String[] args){
    User userOne = new User();
    User userTwo = new User();
    // displayString für userOne ändern
    userOne.setDisplayString("Benutzer");
    // gibt "Benutzer" aus (erwartbar)
    System.out.println(userOne.getDisplayString());
    // gibt ebenfalls "Benutzer" aus, weil das Feld statisch ist!
    System.out.println(userTwo.getDisplayString());
  }

}
```


## Statische Methoden

> :speech_balloon: Engl.: _static methods_

-   sind **ohne** Instanz der Klasse zugreifbar (sofern sie sichtbar sind!).
-   In _statischen Methoden_ kann **nicht** auf nicht-statische Variablen und Methoden zugegriffen werden, da diese (anders als die statische Methode) an Instanzen der Klasse gebunden sind (die im statischen Kontext nunmal nicht existieren).

> :construction: **TODO:** ausarbeiten...

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
    // Wenn es sie/ihn gibt, dann diese ID (statische Methode
    // wird ohne User-Objekt aufgerufen!):
    System.out.println(User.generateUserID(someMailAddress));
  }

}
```