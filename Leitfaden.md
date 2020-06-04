# Leitfaden für Contributions / Beiträge :loudspeaker:

> :construction: **TODO:** Noch unvollständig...

Es gibt eine Liste von Konventionen, die dabei helfen sollen, die Formatierung der Beiträge und den Einsatz von Markdown überall in diesem Repository einheitlich zu halten. Du findest sie gleich dort unten :point_down:

> :speech_balloon: **Es lässt sich über alles reden.** Selbst über diese Konventionen. Wenn du der Meinung bist, dass man hier etwas grundlegend anders machen sollte, dann schlage das sehr gern vor! Nutze dazu bitte das [Issue-System dieses Repositories](../../issues). Falls Issues für dich etwas Neues sind, kannst du [hier](https://guides.github.com/features/issues/) mehr erfahren.

## Lizenzen von eingefügten Grafiken u.ä. :balance_scale:
Du solltest natürlich darauf achten, dass alle Grafiken (und anderen Inhalte), die du in deine Beiträge einfügst, über eine Lizenz verfügen, die dies auch erlaubt!

## Emojis :confused:
Zum Einsatz von [GitHub-Emojis](https://marcomontalbano.github.io/github-emoji/) wird ausdrücklich ermutigt, solange sie zu visueller Orientierung, Lesbarkeit, Verständnis oder Genuss beitragen. Von allzu störenden und verstörenden Emojis sowie unansehnlichen Kombinationen ist jedoch abzulassen!

## Das Inhaltsverzeichnis :book:
Du solltest der bestehenden Formatierung des Inhaltsverzeichnisses folgen. Und ja, das ist eigentlich das Markdown für Inline-Code, aber es macht sich ganz prima für die Schlagworte, weil es der üblichen Darstellung von Tags ähnelt.

## Verweise / Links :link:

### Pfade und Veknüpfungen innerhalb des Repositories
Links zu Dateien in diesem Repository sollten relativ zum verlinkenden Dokument sein, z.B.: `[Ein Dokument im gleichen Ordner](Das-Dokument.md)` oder `![Ein Bild](../assets/images/graphic.png)`.

### ... als vertiefende Ressource
> :link: **Siehe auch:** [GitHub](https://www.github.com) - eine feine Plattform für Git-Repositories

### ... als Quellen-Angabe
> _Quelle: [Github](https://www.github.com)_  

### ... auf Github-URLs unter diesem Repository
... zum Beispiel zum [Issue-System dieses Repositories](../../issues) als absoluten Link:
```
[Issue-System dieses Repositories](https://github.com/DH-Cologne/java-wegweiser/issues)
```


## Hinweise und Bemerkungen
An den entsprechenden Stellen sollten Hinweise und Bemerkungen unterschiedlicher Art entsprechend einheitlich gekennzeichnet sein. Die bisher bestehenden Formen sind hier aufgelistet:

> :warning: **Achtung:** An dieser Stelle besteht die Gefahr einer Verwechslung (oder was auch immer) ...

> :speech_balloon: **Übrigens:** Es gibt an dieser Stelle noch etwas mehr oder weniger interessantes zu sagen...

> :construction: **TODO:** An dieser Stelle fehlt Inhalt XY. Wichtig wäre die Erwähnung von Blah Blah und Dings. Das muss noch gemacht werden!

> :question: **Fraglich:** Lieber erstmal weglassen?


## Links zum Seitenanfang
Jeweils **am Ende jeder `.md`-Datei** sollte folgender Code für einen Link zum Seitenanfang stehen:

```html
<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>
```

Auf der Github-Pages-Seite wird dieser Link dann automatisch mit CSS in der rechten unteren Fenster-Ecke fixiert.

<!-- Dieser Link sollte am Ende jeder Seite stehen! -->
<a class="top-link" href="#" title="Zum Anfang scrollen!">top:balloon:</a>