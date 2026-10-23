# Boffo Addon

Meteor-Client-Addon für Minecraft 1.21.11 (Fabric). Enthält nur eine Funktion: einen Relog-Zähler.

## Benutzung
- Im Meteor-Modulmenü gibt es die Spalte **Boffo Addon** mit dem Modul **Relogs**. Modul an = Anzeige sichtbar, Modul aus = Anzeige weg.
- Die Anzeige ist ein HUD-Element. Einmalig hinzufügen: HUD → Edit → Rechtsklick auf leere Stelle → Boffo Addon → Relog Counter. Dort per Drag & Drop verschieben.
- Einstellungen des Elements (Linksklick darauf im Editor): `design` (Normal, Card, Bar, Badge, Outline), `scale`, Farben, Schatten, Überschrift.
- Relogs werden pro Server gezählt. Der erste Join auf einen Server zählt nicht, jeder weitere schon. Auf einem neuen Server beginnt der Zähler bei 0.
- Befehle: `.relogs` (Stand), `.relogs reset` (aktueller Server), `.relogs reset all` (alle Server).
- Beim Schließen des Spiels sind alle Zähler wieder bei 0.

## Bauen
Mit GitHub Actions (.github/workflows/build.yml): Repository hochladen, unter Actions den Build abwarten, Artifact `boffo-addon` herunterladen.
