# OOP, Klassen und Objekte :building_construction:<!-- omit in toc -->

> :speech_balloon: **OOP** = **O**bjekt**o**rientierte **P**rogrammierung; oder engl.: **O**bject **O**riented **P**rogramming

- [Was ist objektorientierte Programmierung?](#was-ist-objektorientierte-programmierung)
- [Die Konzepte "Klasse" und "Objekt" in der OOP](#die-konzepte-klasse-und-objekt-in-der-oop)


## Was ist objektorientierte Programmierung?

:link: [Objektorientierung](https://de.wikipedia.org/wiki/Objektorientierung) bedeutet, ein System als ein Zusammenspiel von Objekten zu beschreiben. Ein Objekt besteht dabei aus seinen Eigenschaften und Fähigkeiten.

In der :link: [objektorientierten Programmierung](https://de.wikipedia.org/wiki/Objektorientierte_Programmierung) wird diese Sicht auf Systeme als :link: [Programmierparadigma](https://de.wikipedia.org/wiki/Programmierparadigma) angewandt, d.h. ein Programm wird als ein System aus solchen Objekten mit Eigenschaften (:point_right: [Attributen](../Glossar.md#attribut), siehe auch [Variablen](Variablen.md)) und Fähigkeiten ([Methoden](Methoden.md)) modelliert.

Diese Art und Weise ein System zu erfassen ist :link: [gar nicht weit](https://de.wikibooks.org/wiki/Java_Standard:_Objektorientierung_Sinn_und_Zweck) von unserer natürlichen Wahrnehmung der Welt und der Dinge um uns herum entfernt (abgesehen davon, dass ein Computer nie die :link: [Bedeutung](https://de.wikipedia.org/wiki/Sinn_(Philosophie)) eines Objektes verstehen wird).


## Die Konzepte "Klasse" und "Objekt" in der OOP

Um objektorientierte Programmierung zu erlernen, ist es zunächst unerlässlich die Konzepte "Klasse" und "Objekt" sowie deren Verhältnis zueinander zu verstehen. Ein sehr hilfreicher und zugänglicher Vergleich mit Alltagsbezug ist etwa ein Backrezept für einen Kuchen und die daraus gebackenen Kuchen selbst. Nehmen wir einmal das folgende Backrezept an:

```
KUCHEN-REZEPT

Zutaten:
- 200g Margarine
- 400g Mehl
- 150g Zucker
- 5 Eier

Zubereitung:
1) Alle Zutaten vermischen und backen
2) Nach belieben mit Nüssen, Zuckerguss oder beidem dekorieren
```

> :birthday: Bitte nicht nachbacken! Es handelt sich hier um ein ausgedachtes, möglichst kurzes Beispiel. Es wird _kein leckerer Kuchen daraus_ (es fehlt vielleicht etwas Backpulver)!

Da eine größere Festlichkeit ansteht (der Hamster hat Geburtstag o.ä.), müssen wir gleich drei von diesen Kuchen backen. Zum Glück lässt uns das Rezept ein wenig Spielraum bei der Dekoration der Kuchen. Deshalb backen wir das Grundrezept drei mal und dekorieren den ersten Kuchen mit Nüssen, den zweiten mit Zuckerguss und den dritten mit beidem.

Was hier vielleicht etwas banal wirkt, bildet doch sehr gut das Verhältnis zwischen Klassen und Objekten ab: Wir haben gerade aus **einem** Rezept **mehrere** Kuchen gebacken. Die drei Kuchen sind alle so konstruiert worden, wie es das Rezept (als Definition eines solchen Kuchens) vorschreibt. Aber unsere Kuchen haben Eigenschaften, in denen sie sich unterscheiden (die prima Deko nämlich).

Wer hätte es geahnt: In diesem Vergleich ist das Rezept die **_Klasse_** (etwa die Klasse `Cake`) und unsere drei Kuchen sind **_Objekte_** vom Typ `Cake` (oder auch _Instanzen_ der Klasse `Cake`).

Die folgende Grafik veranschaulicht das Verhältnis zwischen "Klasse" und "Objekt" noch einmal an einem anderen Beispiel: Die Klasse "Mitarbeiter" beschreibt ein Objekt vom Typ "Mitarbeiter" mit den Eigenschaften "Name" und "Gehalt" und den Fähigkeiten, diesem Objekt Werte für Name und Gehalt zuzuteilen (hier: `setname()` und `setgehalt()` - zwei Methoden, sogenannte _Setter_).

![Mitarbeiter-Klasse](../assets/images/Employee-Class.png)  
Quelle: [_Wikimedia: Von Binz - Own Creation, CC BY-SA 4.0_](https://commons.wikimedia.org/w/index.php?curid=62707688)

> :speech_balloon: Leider hält sich die Grafik oben nicht an die [Java Naming Conventions](Naming-Conventions.md). Eigentlich müssten die Methodennamen `setName()` und `setGehalt()` lauten 🤦

Was aber nun alles zu einer Klasse gehört und wie man Objekte (also Instanzen von Klassen) erzeugt, ist in den folgenden Kapiteln beschrieben. Natürlich sind auch "Klasse" und "Objekt" nicht die einzigen Konzepte, die in der objektorientierten Programmierung eine wichtige Rolle spielen. Inhalte zu Vererbung, Polymorphie usw. befinden sich ebenfalls in den folgenden Kapiteln.

> :link: Siehe auch [hier](https://www.w3schools.com/java/java_classes.asp).



