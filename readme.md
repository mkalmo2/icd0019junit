Üksuste testimine (Unit Testing)

1. Kopeerige kataloog src/junit enda reposse (icd0019) kataloogi src/junit.
   
    Veenduge, et kood kompileerub.
    
    Kui valite Idea-s Build menüüst -> Rebuild project peaks tulema teade 
    "Compilation completed successfully ..."

2. Ülesande eesmärgiks on läbi proovida, kuidas käitub Javas == operaator.

   NB! Selle ülesande koodis näitab Idea mitmeid hoiatusi.
       Tavaliselt me sellisel kujul asju ei kirjuta aga selle ülesande
       mõte on uurida mõnede konstruktsioonide käitumist.
   
   Failis EqualityExamples.java on näited erinevate == operaatori kasutamise 
   juhtude kohta. Arvake iga näite juures mida trükitakse, käivitage kood ja 
   veenduge, et saate aru, miks selline tulemus tuli.

3. Selle ülesande mõte on aru saada üksustestide võrdlemise meetodi assertThat()
   käitumisest. Selleks teeme ise sellest lihtsa versiooni.

   Failis MyAssertEqualsTests.java on mõned testid, mis kasutavad 
   myAssertEquals() meetodit avaldiste võrdlemiseks. myAssertEquals() on
   ülelaetud (overloaded) meetod, millest on kolm erinevat versiooni.
   Milline meetod valitakse sõltub väljakutsel kasutatud argumentidest.

   Üks meetoditest on teie eest valmis tehtud. Kirjutage selle näite põhjal 
   ka teised lõpuni.
   
   Java konstruktsioon 
      
      ```throw new AssertionError("some message");```
   
   on erindi viskamine, mis on analoogiline allolevale Püütoni koodile
   
      ```raise Exception('some message')```
   
   Erinditest on edaspidises loengus põhjalikumalt juttu aga lühidalt 
   tähendab see programmis tahtlikult vea tekitamist.

4. Failis AssertTests.java on mõned näited üksustestides (unit test) kasutatavatest
   võrdlemise meetoditest. Ülesande eesmärk on tundma õppida nende käitumist, 
   et vältida võimalikke ootamatusi.

   Arvake, kas test õnnestub või mitte. Kui arvate, et test ebaõnnestub,
   siis arvake, millise veateate see võiks printida. Käivitage test
   ja veenduge, et saate aru, millest selline käitumine.
   
5. Kirjutage testid ja kood meetodile isSpecial().

   Kood läheb faili Code.java ja testid faili MainTests.java.

   Arv on eriline, kui ta jagub üheteistkümnega või kui ta on kuni kolme 
   võrra suurem, et üheteistkümnega jaguda.
   
   Kirjutage testid järgmistele juhtudele:
   
      ```Code.isSpecial(0)``` - tõene  
      ```Code.isSpecial(1)``` - tõene  
      ```Code.isSpecial(2)``` - tõene  
      ```Code.isSpecial(3)``` - tõene  
      ```Code.isSpecial(4)``` - väär  
   
      ```Code.isSpecial(11)``` - tõene  
      ```Code.isSpecial(15)``` - väär  
   
      ```Code.isSpecial(36)``` - tõene  
      ```Code.isSpecial(37)``` - väär  

   Kontrollimaks, kas number jagub mingi arvuga on % operaator.

   2 % 11 on 2 (jääk on 2 ehk ei jagu)
   
   11 % 11 on 0 (jääk on 0 ehk jagub täpselt)
   
   12 % 11 on 1 (jääk on 1 ehk ei jagu)

6. Kopeerige varasemate ülesannete juurest meetodi mode() lahendus faili Code.java.

   Kirjutage sellele meetodile test(id).

   Vajalikud on järgmised testid:
   
     ```null``` annab ```null```<br>
     ```""``` annab ```null```<br>
     ```"abcb"``` annab ```'b'```<br>
   ```"cbbc"``` annab ```'c'```<br>

   Viimane juht ütleb, et kui on kaks sama palju esinevat sümbolit, siis 
   peaks valima selle, milline sümbol esimesena esines. Kui teie senine 
   lahendus on teistsugune, siis peaksite selle ära muutma.

   Muutke oma lahendust nii, et sümbolite lugemine oleks eraldi meetodis
   getCharacterCount(). Kirjutage testid ka sellele alammeetodile.
  
7. Kirjutage testid ja kood failis Code.java olevale meetodile longestStreak().

   longestStreak() võtab sisse string tüüpi muutuja ja ütleb, kui pikk on 
   kõige pikem kõrvuti olevate samade sümbolite jada.
   
   Vajalikud on järgmised testid:
   
     ```""``` annab ```0```<br>
     ```"a"``` annab ```1```<br>
     ```"abbcccaaaad"``` annab ```4```<br>
     ```"abbcccaaaa"``` annab ```4```<br>
   
   Kuidas stringist sümboleid saada:
   
     ```char character = "abc".charAt(0);```

     või

     ```char[] characters = "abc".toCharArray();```
     
8. Kirjutage kood failis Code.java olevale meetodile removeDuplicates().
   
   removeDuplicates() võtab sisse täisarvude (int) massiivi ja tagastab 
   uue massiivi.
   
   Kui sisendis on mõni element mitmekordselt (ei pea olema järjest), 
   siis on väljundist kordused eemaldatud.
   
   ```new int[] {1, 1}``` annab ```new int[] {1}```<br>
   ```new int[] {1, 2, 1, 3, 2}``` annab ```new int[] {1, 2, 3}```
   
   NB! List-i, Set-i või muid dünaamilisi kollektsioone ei tohi kasutada. 
      Peate läbi saama ainult massiividega. 
   
      Olemasolevaid funktsioone nagu Arrays.copyOf() ei tohi ka seekord 
      kasutada. Kirjutage vastav loogika ise.
   
   Mõned vihjed

    - Kasulik võiks olla abifunktsioon, mis ütleb, kas massiiv sisaldab 
      mingit elementi.
    - null väärtust võib kasutada puuduvate väärtuste tähistamiseks.
    - Loengus oli näide selle kohta, kuidas massiivi ruumi juurde saada.
      Ruumi vähendamine käib analoogiliselt.
     
9. Kirjutage meetod sumIgnoringDuplicates(), mis tagastab sisse antud
   massiivi elementide summa. Kui mõni element on mitmekordselt, siis
   teist korda seda summasse ei panda.
   
   ```new int[] {1, 1}``` annab vastuse ```1```<br>
   ```new int[] {1, 2, 1, 2}``` annab vastuse ```3```<br>

10. Commit-ige muudatused ja push-ige need Github'i. 
    
    Lisage commit-ile tag ex03.
    
    Veenduge tulemuste lehelt, et tulemus on positiivne.


11. Kui see ülesanne jääb tegemata, siis saate maksimaalse nelja punkti 
    asemel kaks. Seega selle korra ülesanded loetakse esitatuks ka ilma 
    selleta. Kui see jääb tegemata saate lihtsalt kaks punkti vähem.<br>
    
    Kirjutage meetod, mis leiab müügi andmete hulgast need tooted, mille 
    müügitulu on suurem etteantud väärtusest.<br>
    
    Müüdud toodete infot sisestatakse jooksvalt ja igal hetkel saab küsida, 
    millised on seni enim müünud tooted. Ühe müügi kirje, sisaldab toote
    identifikaatorit, hinda ja müüdud kogust.<br>
    
    Meetod removeSalesRecordsFor(<product id>) eemaldab identifikaatori põhjal 
    kõik seni lisatud selle identifikaatoriga tooted.<br>
    
    Meetod getAllRecordsPaged(<pageNumber>, <pageSize>) tagastab kõigi sisestatud 
    kirjetest ühe lõigu (slice). See meetod on vajalik kõigi toodete vaatamiseks
    lehekülgede kaupa.<br>
    
    Klassis TopSalesFinderTests on testid, mis peaks selgitama, kuidas kood käituma peaks.<br>  
    
    Piirangud
      - Dünaamilisi kollektsioone (nt. ArrayList()) kasutada ei tohi.
        Kui arvate, et need on vajalikud, siis kirjutage need ise.
        Test kontrollib, et te ei kasutaks klasse paketist java.util.
        Samuti ei ole lubatud kasutada väliseid teeke.
      - Vahetulemuste jaoks mälu reserveerimine peab toimuma dünaamiliselt.
        Nt. new String[100000] kasutab põhjendamatult palju mälu
        kuna on võimalik, et tegelikult piisaks oluliselt vähemast.
      - Koodis on lubatud kasutada kahte (explicit) cast-i.
      - Klassi SalesRecord ei tohi muuta.
      - Duplikatsiooni võiks vältida.
    
    Aadressil https://github.com/mkalmo2/icd0019app on rakendus, mis illustreerib,
    kuidas loodud koodi praktikas kasutada. Rakenduse kasutamiseks kopeerige
    oma kood icd0019app projekti ja käivitage main() meetod klassis server.Server.
    See käivitab lokaalse veebiserveri aadressil http://localhost:8080.
    Sellelt aadressilt saate läbi brauseri tulemust vaadata.
      
Lahendused (2-7) ja seletused: https://youtu.be/3wGBYnEI-bQ
