Memory Spel

-doel van het spel: bijpassende kaarten vinden

-Memory:
 start: kaarten worden getoond aan de gebruiker, na X aantal seconden draaien de kaarten om en worden ze geschud.
 	(kaarten zijn geschud en staan met de achterkant naar boven.)
 midden: Speler kan kaarten aanklikken en ze zo omdraaien, elk kaart kan 1x geklikt worden in een beurt en je krijgt max 2 keuzes.
	   Beurt/keuze is niet voorbij indien speler zelfde kaart aanklikt en dit levert niets op als ze reeds al omgedraaid is.
	   indien 2 kaarten gekozen bekijkt spel de kaart, als ze hetzelfde zijn blijven ze omgedraaid en kan speler verder met zijn keuze.
	   De vorige processen worden hierbij steeds herhaald, de al omgedraaide (correcte) paren blijven voortaan omgedraaid en kan men niet meer selecteren.
	   Als de kaarten niet hetzelfde zijn draaien alleen de gekozen paar terug om en de vorige processen worden herhaald.
 einde:	Spel eindigt alleen wanneer alle paren onthuld zijn of het spel gesloten word.

MVP-componenten:
Model: de klassen die de staat van het spel bijhoudt, inclusief de kaarten, hun status (omgedraaid
of niet), en het controleren op overeenkomende kaarten. Het bevat ook de spellogica en past de staat van het spel aan indien acties ondernomen worden.

View: het grafische gedeelte van het spel, inclusief de weergave van de kaarten en spelinformatie.

Presenter: vormt een brug tussen model en view

Spelfunctionaliteit
Toon een raster van kaarten met hun achterkant naar boven.
Wanneer een speler op een kaart klikt, draait deze om en toont deze de afbeelding op de voorkant.
Spelers moeten kaarten omdraaien en proberen bijpassende kaarten te vinden. Als twee
omgedraaide kaarten hetzelfde patroon hebben, blijven ze open. Als ze niet overeenkomen, draaien ze weer om.
Bied feedback aan de spelers, zoals het aantal pogingen en een timer.
Het spel is voltooid wanneer alle kaarten zijn gevonden.
Voeg een scorebord toe om de beste tijden bij te houden.

Functies te implementeren:
een timer 
Scorebord die tijd bijhoud
geluidseffecten voor interactiviteit
Difficulty - aantal kaarten en afbeeldingen
pogingen counter (clicked aantal (op kaarten))
Startbord - Clicked functie - timer - scorebord -
