# SS24-ObjectOrientedProgramming

> A collection of exercises in "Elementary Algorithms and Object Oriented Programming" - 2nd semester bachelor @
> Vorarlberg University of Applied Sciences (FHV)

> [!TIP]
> Die einzelnen Übungen können mithilfe von [GNU/Make](https://www.gnu.org/software/make/) aufgerufen werden.
> Dadurch lassen sich Übungen unabhängig von der verwendeten Entwicklungsumgebung aufrufen, ganz abgesehen davon
> finde ich es angenehmer und übersichtilcher ohne gleich mit „schwerer“ IDE in kleinen angedockten Fenstern zu
> arbeiten.
>
> zB `make uebung1-1` oder `make uebung1-2`

> [!IMPORTANT]
> Ich habe bei weitem nicht alle Übungen gemacht und bin auch hie und da von der Aufgabe abgewichen. Vor allem dann,
> wenn ich
> meine, eine kreativere Lösung gefunden zu haben. Etwa, wenn es darum geht, ein ansprechendes User Interface umzusetzen
> oder
> etwas mehr auf Interaktion zu setzen.

## Übung 1

### 1. Geometrische Figuren

Implementieren Sie eine Klasse `Rectangle` zur Darstellung zweidimensionaler, achsenparalleler Rechtecke (d.h. sie
können von zwei Punkten aufgespannt werden). Diese Punkte sollen mit Hilfe einer Klasse `Point` dargestellt werden. Die
Koordinaten sind ganzzahlige Werte!

Für die Klasse `Rectangle` sind die folgenden Operationen zu realisieren:

- Erzeugen von Rechtecken, die an beliebigen Positionen stehen können
- Verschieben eines Rechtecks
- Prüfen auf Quadrat-Eigenschaft
- Bestimmen des Umfangs eines Rechtecks
- „Zoomen“ eines Rechtecks: Unter der Angabe von einem Faktor werden sowohl die Länge als auch die Breite vergrößert
  bzw. verkleinert.
- Teilen eines Rechtecks in vier gleich große Rechtecke
- Teilen eines Rechtecks entlang einer der Diagonalen in zwei Dreiecke

#### Rechtecke als SVG

Anstatt einer fiktiven und trostlosen Zustandsbeschreibung von Objekten, habe ich mich für einen einfachen, grafischen
Ansatz entschieden, der die Rechtecke als skalierbare Vektorgrafiken (SVGs) zeichnet. Die `toString` Methode macht
nämlich genau das, ein Objekt als String repräsentieren, oder — in meinem Fall — [als
`<rect>` Element](https://developer.mozilla.org/en-US/docs/Web/SVG/Element/rect) das lediglich als Text auf den `stdout`
ausgegeben wird. Das ganze leite ich dann einfach in meiner `$SHELL` in eine Datei hinein.

```
make uebung1-1 > output.svg
```

Dabei habe ich es mir natürlich nicht nehmen lassen, [das Logo der FHV](https://www.fhv.at/fh/presse/logo-bildmaterial)
mit drei geschickt platzierten Rechtecken auf einem Grid zu veranschaulichen. 🙌

```
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(
                new Point(350, 50),
                new Point(450, 450),
                "black"
        );

        Rectangle r2 = new Rectangle(
                new Point(50, 150),
                new Point(350, 250),
                "black"
        );

        Rectangle r3 = new Rectangle(
                new Point(50, 350),
                new Point(350, 450),
                "black"
        );

        System.out.printf("<svg height='%d' width='%d' xmlns='http://www.w3.org/2000/svg'>%n", 501, 501);
        System.out.println(Main.grid);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("</svg>");
    }
```

![](./docs/uebung1/output.svg)

### 2. Qualitätskontrolle

Prof. Mayar hat vom Schweizer Ministerium für Käse und sonstige Milchprodukte (MfKsM) einen wichtigen
Auftrag erhalten. Er soll ein System zur Qualitätskontrolle von Emmentaler Käse entwickeln. Es geht darum,
die Anzahl der Löcher und den Umfang des größten Loches zu ermitteln.

```
+---------------+
|    **         |
|   *  *    *   |
|   ***    * *  |
|       **  *   |
| *     **      |
+---------------+
```

Anzahl der Löcher: 4

Umfang des größten Loches: 7