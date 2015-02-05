R2M-CASINO
----------

Målet för denna övning är att skapa en klient och en server för en förenklad
version av Roulette.

Användarna loggar in med email och lösenord. Varje ny användare som loggar in
får en bonus på 500 kronor att spela för. Balansen på kontot sparas på 
servern.

När spelaren har loggat in och autheticerat sig kan han börja spela.
Spelaren får välja en siffra mellan 1 och 35. Sedan väljer han vilket 
belopp han vill spela för. Beloppet kan vara 1, 2, 5, 10 eller 20 kronor.
När användaren trycker på knappen "spela" så skickas ett anrop till 
servern.

Servern slumpar fram ett tal mellan 0 och 35. Om siffran är samma som det
användaren har angett så får användaren 35 gånger sina satsade pengar.
Om siffran är noll så förlorar användaren sina satsade pengar. Servern
returnerar ett svar som innehåller den framslumpade siffran, eventuell 
vinst samt hur mycket användaren har på kontot efter det senaste spelet.

För varje spel ska 1% av satsade pengar sparas i en pott. En slumpgenerator
ger användaren 1 chans på 100 000 att vinna potten. Om användaren vinner
potten skall pengarna i potten sättas in på hans konto (avrundat till 
närmaste heltal). Potten nollställs sedan och börjar fyllas på på nytt.

Om användaren inte har tillräckligt med pengar på kontot för ett spel
så returneras felkoden NOT_ENOUGH_MONEY_IN_ACCOUNT och inga pengar dras
från kontot. Om man inte kan processa spelet så returneras felet 
ERROR_OCCURED och inga pengar dras från kontot. Annars returneras
koden OK.  

Kundens kontoställning skall persisteras och servern skall klara av
en omstart utan att tappa data. Applikationen bör även klara av krascher
och andra problem utan att tappa data. Applikationen skall ha en 
arkitektur som är skalbar och som säkerställer maximal upptid och säkerhet.

Du får själv välja hur informationen skickas från klienten till servern,
men anropet måste gå över nätverket.

Förutom själva applikationen bör dokumentation levereras med följande anvisningar:

* Vald arkitektur
* Installationsanvisningar för ingående komponenter
* Information om hur applikationen skalas
* Information om hur applikationen skall uppgraderas
* Krav på klienterna
* Krav på serverplattformen för att nå målet 1000 samtidiga användare och 10000 spel per sekund

Följande aspekter bör täckas i lösningen:

* Testability
* Scalaablity
* Security
* Installationsbarhet

Spelklienten bör implementera interfacet se.r2m.casino.client.CasinoClient.java. Uppdatera
klassen SwingClient så raden:

	private static CasinoClient casinoClient = new EmptyCasinoClient();

implementerar din klass, tex:

	private static CasinoClient casinoClient = new HenryCasinoClient();

Serverdelen bör implementera interfacet se.r2m.casino.server.RandomGenerator.java
 
Du testar din applikation genom att köra Swing-applikationen som finns i

se.r2m.client.impl.SwingClient

