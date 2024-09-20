# SS24-ObjectOrientedProgramming

> A collection of exercises in "Elementary Algorithms and Object Oriented Programming" - 2nd semester bachelor @
> Vorarlberg University of Applied Sciences (FHV)

> [!TIP]
> Die einzelnen Übungen können mithilfe von [GNU/Make](https://www.gnu.org/software/make/) aufgerufen werden.
> Dadurch lassen sich Übungen unabhängig von der verwendeten Entwicklungsumgebung aufrufen, ganz abgesehen davon
> finde ich es angenehmer und übersichtilcher ohne gleich mit „schwerer“ IDE in kleinen angedockten Fenstern zu arbeiten.
>
> zB `make uebung1-1` oder `make uebung1-2`

> [!IMPORTANT]
> Ich habe bei weitem nicht alle Übungen gemacht und bin auch hie und da von der Aufgabe abgewichen. Vor allem dann, wenn ich
> meine, eine kreativere Lösung gefunden zu haben. Etwa, wenn es darum geht, ein ansprechendes User Interface umzusetzen oder
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

```
make uebung1-1 > output.svg
```

![](./docs/uebung1/output.svg)
