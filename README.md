# WebProgRecursion

### Oppgave 1: Tårnet i Hanoi (Tower of Hanoi)
Tårnet i Hanoi er et matematisk puslespill som innvolverer å flytte et tårn av ringer fra en stav til en annen stav.
Hvis du ikke er kjent med dette puslsespillet kan du prøve å løse det selv:

https://www.transum.org/Maths/Investigation/Tower_Of_Hanoi/Default.asp?Level=1

Løsningen for dette er rimelig komplisert for standard løkker, men ganske enkel med rekursjon.

Løsningen for dette problemet kan beskrives slik, der vi skal flytte n ringer mellom stav 1, 2, og 3:

Flytt (n-1) ringer fra stav 1 til stav 2, ved å bruke stav 3 som en midlertidig stabel.
Flytt den siste ringen (den største) fra stav 1 til stav 3.
Flytt (n-1) staver fra stav 2 og stav 3, ved å bruke stav 1 som en midlertidig stabel.
Basetilfellet er når n er lik 1, da kan vi flytte ringen til sin destinasjonsring.
Koden der stegene som kreves for å løse puslespillet skal skrives på server og returnere svarene til klient
som videre skriver det ut til bruker.

### Oppgave 2: Fakultet
Fakultet er en matematisk operasjon som blant annet brukes mye innen kombinatorikk. Fakultet er definert slik:
n! = n * (n - 1) * (n - 2) * ... * 1. Et eksempel: 4! = 1 * 2 * 3 * 4 = 24. Bruk formelen til å løse ett gitt tall
fakultet. Klient skal ta inn gitt tall fra bruker og sende det til server. Videre skal serveren utføre beregningen og
returnerer svaret tilbake til klient som viser det til bruker. Resultatet øker eksponentielt veldig raskt, så anbefaler
å bruke datatypen long fremfor int på server.

