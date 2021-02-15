# Unit Testing mit JUnit<!-- omit in toc -->


## Unit Testing

Eine sehr wichtige und weit verbreitete Strategie, um den Quellcode eines Programms auf Fehler hin zu überprüfen, ist das sog. 🔗[Unit Testing](https://en.wikipedia.org/wiki/Unit_testing). Anders als beim 👉[Debugging](../Glossar.md#debugging), bei dem geziehlt nach der Ursache von auftretenden Fehlern gesucht wird, werden für das Unit Testing mehrere (oft auch sehr viele) sog. _Tests_ programmiert, die jeweils einzelne, funktional in sich geschlossene Bestandteile des Programmes _testen_. Diese Tests werden nun nach jeder größeren Änderung am Quellcode ausgeführt und schlagen dann entweder fehl (_fail_) oder laufen ohne Fehler durch (_pass_). Um diese Tests so aussagekräftig wie möglich zu gestalten, wird normalerweise versucht, eine große Testabdeckung zu erzielen, d.h. Tests für möglichst viele (oder gar alle) Aspekte des Programms zu schreiben. Auf diese Weise können nicht nur Fehler im gerade geänderten Code, sondern auch unerwünschte Nebeneffekte in anderen, auf diesem Code basierenden Programmteilen gefunden werden.

Unit Tests werden für gewöhnlich mit Hilfe entsprechender 🔗[Programmbibliotheken](https://de.wikipedia.org/wiki/Programmbibliothek) (_libraries_) in der selben Programmiersprache geschrieben, in der auch das zu testende Programm geschrieben wird. Das Schreiben von Tests bedeutet natürlich zusätzliche Arbeit und erfordert einige Disziplin, kann aber gerade bei größeren Projekten viele Probleme vermeiden und für eine wesentlich höhere Code-Qualität sorgen.

Eine Methode in der Software-Entwicklung, die den Einsatz von Unit Tests zur Grundlage der Programmierung macht, ist das sog. 🔗[Test Driven Development](https://de.wikipedia.org/wiki/Testgetriebene_Entwicklung), bei dem konsequent **zuerst** die Tests geschrieben werden, die das gewünschte Verhalten einer Programmkomponente definieren, um **danach** den eigentlichen Code zu schreiben, der diese Tests _bestehen_ soll.

> 👩‍🏫 Es gibt neben Unit Tests auch noch weitere Test-Strategien, die auf jeweils anderen Ebenen ansetzen, etwa 🔗[Smoke Testing](https://en.wikipedia.org/wiki/Smoke_testing_(software)) und 🔗[Integration Testing](https://en.wikipedia.org/wiki/Integration_testing).


## JUnit

> ⚠ Dieser Artikel erläutert nicht, wie sich externe Programmbibliotheken (wie JUnit) in ein Java-Programm einbinden lassen. Dieses Theme wird stattdessen [hier](Programmbibliotheken.md) gesondert behandelt!

Eine sehr etablierte (de-facto Standard) Open Source Programmbibliothek für Unit Tests in Java ist 🔗[JUnit](https://junit.org) (gesprochen _[jäi junit]_). Sie bietet alles, was für das Schreiben von Unit Tests in Java nötig ist.

> TODO: Code-Beispiel für Unit Tests mit JUnit

...



> 🔗 [A Guide to JUnit 5](https://www.baeldung.com/junit-5)