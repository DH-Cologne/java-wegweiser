# Input / Output (I/O) ⏩<!-- omit in toc -->

> 🚧 **TODO:** Alles...

- [Datenströme](#datenströme)
  - [Byte Streams](#byte-streams)
  - [Character Streams](#character-streams)
- [Pufferung / Buffering](#pufferung--buffering)
- [Objekt-Serialisierung](#objekt-serialisierung)
- [Scanner](#scanner)
- [User-Input über Stdin via Scanner](#user-input-über-stdin-via-scanner)


## Datenströme

> eng.: _streams_

> ⚠ Dieser Abschnitt setzt voraus, dass du bereits weißt, was ein [Datenstrom](https://de.wikipedia.org/wiki/Datenstrom) ist. Hier geht es dann um den Umgang mit Datenströmen in Java!

> ⚠ Hier geht es _**nicht**_ um die [Java](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html) [Stream](https://www.baeldung.com/java-8-streams) [API](https://stackoverflow.com/questions/44180101/in-java-what-are-the-advantages-of-streams-over-loops), sondern um Input/Output-Streams, also **Datenströme**!

Die Java Standard-Library bietet zahlreiche Klassen für den Umgang mit Datenströmen an. Diese lassen sich aufteilen in sog. _Byte Streams_ (transportieren Daten in "Portionen" von aufeinander folgenden Bytes, also 8-Bit-Blöcken 🤓) und _Character Streams_ (für textbasierte Daten, transportieren Daten Zeichen für Zeichen).

### Byte Streams

Alle 🔗 [_Byte Stream_](https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html)-Klassen erweitern die Klassen `InputStream` (Datenströme, die "von außen kommen" und von der Anwendung gelesen werden) oder `OutputStream` (Datenströme, in die von der Anwendung geschrieben wird).

Diese abstrakten Klassen `InputStream` und `OutputStream` werden erweitert von unterschiedlichen Spezialisierungen für zahlreiche Daten-Quellen bzw. -Ziele:

- `FileInputStream`/`FileOutputStream` zum Lesen/Schreiben von Dateien
- `ObjectInputStream`/`ObjectOutputStream` für [Objektserialisierung](#objekt-serialisierung)
- ...

Sehen wir uns zum Beispiel den Umgang mit einem `FileOutputStream` an, um einen `String` in eine Datei zu schreiben:

```java
String s = "Ich hab 'ne Schlange im Stiefel!";
File f = new File("test.txt");
FileOutputStream fos = new FileOutputStream(f);
fos.write(s.getBytes());
fos.close();
```

> ⚠ **Anmerkung:** Der Code in diesem Beispiel wirft möglicherweise eine `FileNotFoundException` oder (allgemeiner) eine andere `IOException`. Zugunsten der Übersichtlichkeit ist die [Fehlerbehandlung](Fehlerbehandlung.md) in diesem Beispiel ignoriert worden - natürlich ist diese für solche Operation aber sehr wichtig!

Sehen wir uns die fünf Zeilen Code genauer an:

1. Einen String erzeugen / einer Variable zuweisen
2. Ein 🔗 [`File`](https://www.geeksforgeeks.org/file-class-in-java/)-Objekt erzeugen, welches die Datei _test.txt_ (relativ zum Arbeitsverzeichnis) repräsentiert (diese Datei muss dafür nicht wirklich existieren!)
3. Einen `FileOutputStream` erzeugen und diesem das `File`-Objekt im Konstruktur übergeben (damit bezieht sich unser `FileOutputStream` auf diese Datei!)
4. Den String `s` (als Array `byte[]`) in den Datenstrom `fos`, unseren `FileOutputStream`, schreiben
5. Den Datenstrom wieder schließen

Nun sollte auf der Festplatte im Arbeitsverzeichnis des gerade ausgeführten Programmes eine Datei _test.txt_ mit dem Inhalt "_Ich hab 'ne Schlange im Stiefel!_" liegen.

Analog zu diesem Beispiel funktionieren auch andere _Byte Streams_ in Java!

Eigentlich werden _Byte Streams_ eher dazu verwendet, Daten an andere Programmteile weiterzureichen. Wenn es sich um textuelle Daten (wie in unserem Beispiel) handelt, die als Text im Programm verarbeitet wurden oder werden sollen, sollte man gleich die passendere Stream-Variante wählen: _Character Streams_ (siehe unten)!


### Character Streams

🔗 [_Character Streams_](https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html) transportieren textuelle Daten. Es lohnt sich, textuelle Daten mit speziellen Werkzeugen zu verarbeiten, denn die entsprechenden Klassen (etwa `FileReader` und `FileWriter`) tun dies in 🔗 [Unicode](https://de.wikipedia.org/wiki/Unicode)-kompatibler Form (genauer in 🔗 [UTF-16](https://en.wikipedia.org/wiki/UTF-16)) und transformieren die Daten automatisch in den [lokalen Zeichensatz](https://benohead.com/blog/2013/10/31/java-character-sets-and-encoding/).

Außerdem bieten `FileReader` und `FileWriter` etwas passendere Methoden für das an, was man hier tun will - sehen wir uns, angelehnt an das Beispiel von oben, das Schreiben in eine Datei mittels `FileWriter` an:

```java
String s = "Ich hab 'ne Schlange im Stiefel!";
File f = new File("test.txt");
FileWriter writer = new FileWriter(f);
writer.write(s);
writer.close();
```

Man beachte, wie in der vierten Zeile die Methode `write()` direkt einen `String` annimmt! Die 👉 [API](../Glossar.md#api) unterscheidet sich hier nicht weiter vom Beispiel oben.

> 💬 Eine schlankere Schnittstelle zur Arbeit mit Dateien bietet übrigens die Klasse 🔗 [`Files`](https://www.journaldev.com/17794/java-files-nio-files-class) aus dem Paket 🔗 [`java.nio`](https://jaxenter.de/java-nio-file-zeitgemases-arbeiten-mit-dateien-2581)!


## Pufferung / Buffering

> eng.: _buffering_

... TODO


## Objekt-Serialisierung

... `Serializable` ...  
... TODO


## Scanner

... TODO


## User-Input über Stdin via Scanner

Die Klasse `Scanner` kann außerdem dazu genutzt werden, um auf einfache Weise User-Input über 👉 [Stdin](../Glossar.md#stdin) (_Standard Input_) zu erhalten. Dazu wird das Java-Objekt, das diesen Datenstrom repräsentiert (`System.in`) als Parameter an den Konstruktor der `Scanner`-Klasse übergeben. Diese bietet eine sehr komfortable Schnittstelle für solche textbasierten Datenströme:

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

