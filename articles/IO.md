# Input / Output (I/O) ⏩<!-- omit in toc -->

> 🚧 **TODO:** Alles...

- [Streams](#streams)
- [Buffering](#buffering)
- [Reader und Writer](#reader-und-writer)
- [Objekt-Serialisierung](#objekt-serialisierung)
- [Scanner](#scanner)
- [User-Input über Stdin via Scanner](#user-input-über-stdin-via-scanner)

## Streams

-   ...

## Buffering

-   ...

## Reader und Writer

-   ...

## Objekt-Serialisierung

-   ...
-   `Serializable`

## Scanner

...

## User-Input über Stdin via Scanner

Die Klasse `Scanner` kann außerdem dazu genutzt werden, um auf einfache Weise User-Input über 👉 [Stdin](../Glossar.md#stdin) (_Standard Input_) zu erhalten. Dazu wird das Java-Objekt, das diesen Datenstrom repräsentiert (`System.in`) als Parameter an den Konstruktor der `Scanner`-Klasse übergeben. Diese bietet eine sehr komfortable Abstraktion für solche textbasierten Datenströme:

```java
Scanner in = new Scanner(System.in);
String input = in.nextLine();
System.out.println("User hat eingegeben: " + input);
in.close();
```

In einem größeren Zusammenhang könnte das etwa so aussehen:

```java
import java.util.Scanner;

class ReadingStdin {  

  public static void main(String args[]) { 
    Scanner in = new Scanner(System.in);
    String input = null;
    
    do {
        // noch kein Input vorhanden?
        if (input != null){
            // wurde "exit" oder "EXIT" eingegeben?
            if (input.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            // reagieren
            System.out.println("You just typed: \"" + input + "\"\n");
        }
        // Aufforderung zur Eingabe
        System.out.print("Type something here: ");
    } while ((input = in.nextLine()) != null);
    
    // Scanner muss wieder geschlossen werden!
    in.close();
  } 
  
}
```

Das Ergebnis sieht dann so aus:

```
Type something here: Hello
You just typed: "Hello"

Type something here: World
You just typed: "World"

Type something here: █
```

