# Benötigte Software :woman_technologist:<!-- omit in toc -->

Für die Arbeit im Seminar und in den Übungen benötigen wir ein [JDK](Die-Programmiersprache-Java.md#jdk) und eine [IDE](Eclipse-IDE.md#was-ist-eine-ide). Was das genau ist, wird in den verlinkten Artikeln erklärt. Hier geht es zunächst nur darum, den richtigen Download zu finden und die Programme zu installieren!


## Java Development Kit (JDK) :coffee:

Wir benötigen ein JDK der Version 11, passend für dein Betriebssystem. Wegen der [Umstellung des Lizenzmodells von Oracle im Jahr 2019](https://www.oracle.com/technetwork/java/javase/overview/oracle-jdk-faqs.html) sollten wir **unbedingt** ein **OpenJDK** (und nicht das volle JDK von der Oracle-Seite) benutzen:

| Betriebssystem | Download OpenJDK 11 |
| --- | --- |
| Windows | Für Windows empfiehlt sich der Download des **OpenJDK 11 (LTS)** des Projektes [AdoptOpenJDK](https://adoptopenjdk.net), je nach OS-Architektur in der 64-bit oder 32-bit-Variante (x86). :warning: Bitte darauf achten, nicht die **JRE**, sondern tatsächlich das **JDK** herunterzuladen! |
| MacOS | Hier gilt das selbe wie bei Windows: Das Projekt [AdoptOpenJDK](https://adoptopenjdk.net) stellt für MacOS ein **OpenJDK 11 (LTS)** bereit. :warning: Bitte darauf achten, nicht die **JRE**, sondern tatsächlich das **JDK** herunterzuladen! |
| Linux | Falls du ein aktuelles Ubuntu-System (>=18.04) benutzt, kannst du das OpenJDK 11 einfach über folgenden Terminalbefehl installieren: `sudo apt install openjdk-11-jdk openjdk-11-doc openjdk-11-jre-headless openjdk-11-source`. Für andere Linux-Distributionen könnte es ähnliche fertige Pakete geben. Ansonsten gilt (wie auch bei Windows oder MacOS) die Empfehlung der Seite von [AdoptOpenJDK](https://adoptopenjdk.net) |


## Eclipse IDE :waning_crescent_moon:

Für den Download der Entwicklungsumgebung _Eclipse_ (die wir im Seminar nutzen) benutzt man am besten die aktuelle Version der **Eclipse IDE for Java Developers** von [dieser Seite](https://www.eclipse.org/downloads/packages/).

> :warning: Bitte beachte, dass die Eclipse IDE zunächst mal ein "portables" Programm ist, d.h. der Download ist ein Archiv, welches das fertig ausführbare Programm enthält. Es gibt keine Installation - du musst dich selbst entscheiden, wohin du das Programm entpackst und musst selbst (falls gewünscht) Verknüpfungen anlegen.  
> Fall du lieber einen Installer hättest, der das alles für dich erledigt, kein Problem: Nutze den Link von oben, dort gibt es ganz oben auf der Seite auch einen Installer zum Download, der dann während der Installation das von dir gewünschte Paket herunterlädt (hier bitte wiederum _Eclipse IDE for Java Developers_ auswählen!).

> :speech_balloon: **Natürlich ist die Wahl der IDE freigestellt.** Es kann gerne auch mit _IntelliJ IDEA_, _Netbeans_, dem _Windows Notepad_ oder _vim_ programmiert werden - allerdings werden sich die Beispiele im Seminar immer auf Eclipse beziehen.

> :speech_balloon: **Einzelheiten** zur Unterscheidung der IDEs und den Funktionen von Eclipse sind außerdem im Artikel zur [Eclipse IDE](Eclipse-IDE.md) zu finden!






<!-- Dieses HTML-Snippet sollte am Ende jeder Seite stehen! -->
<div class="top-link">
    <a href="#" title="Zum Anfang scrollen!">Top :balloon:</a>
    <br/>
    <a href="https://dh-cologne.github.io/java-wegweiser#inhalt-book" title="Zurück zur Übersicht!">Inhalt :book:</a>
</div>