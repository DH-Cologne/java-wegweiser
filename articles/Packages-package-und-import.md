
# Packages, `package` und `import` :package:<!-- omit in toc -->

- [Was sind Packages?](#was-sind-packages)
- [Wie sehen Packages auf meiner Festplatte aus?](#wie-sehen-packages-auf-meiner-festplatte-aus)
- [Auszeichnen des Paket-Pfades einer Klasse mit `package`](#auszeichnen-des-paket-pfades-einer-klasse-mit-package)
- [Importieren von Paketen und Klassen mit `import`](#importieren-von-paketen-und-klassen-mit-import)

## Was sind Packages?

**Packages** (oder dt.: _Pakete_) sind ein einfaches System, in dem zusammengehörende Java-Klassen*** organisiert sind. So lässt sich an einem **Paket-Pfad** üblicherweise ablesen, zu welcher Software eine Klasse gehört und ggf. von welchem Anbieter sie stammt. Auf diese Weise dienen Packages dazu, jede Klasse (also den Code eines Programms) eindeutig identifizierbar zu machen, sodass es in den Unmengen von verfügbaren Programmbibliotheken nicht zu Verwechslungen kommt. So lässt sich im Quellcode jede Klasse eindeutig ansprechen oder importieren!  
Die Art und Weise, wie Klassen in Packages organisiert sind, wird übrigens als _Paket-Struktur_ bezeichnet.

> :speech_balloon: **\*\*\*** Klassen sind die Einheiten, aus denen der Code eines Java-Programms besteht. Mehr dazu im Kapitel zu Objektorientierung!

**Beispiel:** Eine Klasse `AudioPlayer`, die Audio-Dateien abspielen kann, gehört zu einer Open-Source-Software namens _MediaGenius_ (frei erfunden). _MediaGenius_ kann, sagen wir mal, Medien-Dateien abspielen und wird über die Website _mediagenius.org_ angeboten. Sehr wahrscheinlich würde der Paket-Pfad unserer Klasse `AudioPlayer` dann folgendermaßen lauten: `org.mediagenius.audio.AudioPlayer`  
Somit wäre klar zu erkennen, zu welchem Projekt diese Klasse gehört und zu welcher "Unterkategorie" innerhalb des Projektes sie zugewiesen ist.


## Wie sehen Packages auf meiner Festplatte aus?

Auf Dateisystemen ist eine Paket-Struktur als einfache Ordner-Struktur abgebildet. Unser Beispiel von oben könnte dann auf der Festplatte etwa so aussehen (stark vereinfacht!):

```
org
|
└───mediagenius
    |
    └───audio
    |   | AudioPlayer.java
    |   | AudioEncoder.java
    |   | ...
    |
    └───video
    |   | IrgendwasMitVideo.java
    |   | ...
    |
    └───...
```


## Auszeichnen des Paket-Pfades einer Klasse mit `package`

Das Schlüsselwort `package` im Quellcode einer Java-Klasse gibt an, zu welchem Package die Klasse gehört. Der Quellcode der `AudioPlayer`-Klasse aus dem Beispiel könnte in etwa so aussehen (verkürzt!):

``` java
package org.mediagenius.audio;

public class AudioPlayer {
    // Quellcode der Klasse ...
}
```


## Importieren von Paketen und Klassen mit `import`

Auch die Java Class Library ist in Packages organisiert. Wenn ein Java-Programm eine bestimmte Klasse aus einem bestimmen Paket benutzen soll, dann muss diese Klasse an der entsprechenden Stelle im Code genau angesprochen werden können. Damit nun nicht überall, wo die Klasse `AudioPlayer` (um bei unserem Beispiel zu bleiben) in einer anderen Klasse benutzt wird, jedes mal der ganze Paket-Pfad geschrieben werden muss (`org.mediagenius.audio.AudioPlayer`), können vor dem Code einer Klasse in ihrer `.java`-Datei die benötigten anderen Klassen importiert werden. So müssen sie im Quelltext nicht mehr mit dem ganzen Paket-Pfad, sondern nur noch mit ihrem Klassen-Namen angesprochen werden.

**Beispiel** _ohne_ `import`:
``` java
package de.unikoeln.java;

public class IrgendwasMitAudio {
    public static void main(String[] args) {
        // ein Objekt vom Typ AudioPlayer erzeugen
        org.mediagenius.audio.AudioPlayer player = new org.mediagenius.audio.AudioPlayer();

        // ...
    }
}
```

... da das sehr unübersichtlich wäre, importiert man die benötigte Klasse mit `import`:

**Beispiel** _mit_ `import`:
``` java
package de.unikoeln.java;

import mediagenius.audio.AudioPlayer;

public class IrgendwasMitAudio {
    public static void main(String[] args) {
        // ein Objekt vom Typ AudioPlayer erzeugen
        AudioPlayer player = new AudioPlayer();

        // ...
    }
}
```

> :point_right: Mit dem Tastatur-Shortcut `Strg`+`Shift`+`O` fügt Eclipse automatisch alle fehlenden Imports ein. Falls es Uneindeutigkeiten gibt, wird man nach dem richtigen Import gefragt.


<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>