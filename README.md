###This is a project analyzing text from file

######txt file import using picocli library and filename as program argument

Napisz program, który wczyta tekst z pliku. (przyklad ksiazki "Pan Tadeusz")
Program przeanalizuje tekst z pliku pt.txt i poda:
* Liczbę słów.
* 10 najbardziej popularnych słów.
* Rozkład częstotliwości liter.
* 10 najdłuższych słów które pojawiły się w tekście tylko raz

Dodatkowo na podstawie rozkładu częstotliwości liter program może
postarać się ocenić w jakim języku został napisany.

Ponadto może porównać własne wyniki z serwisem:

[DetectLanguage.com](DetectLanguage.com)

[validator online](http://ewalidator.pl/generator-numeru-dowodu-osobistego)


Sample console output:
```
CHARACTERS FREQUENCY:
|À|     2.818465458296576E-6
|A|      0.08919033942779514
|Ł|      0.02842140568146267
|B|     0.017807064765517765
|C|      0.04142580530604307
|Ń|    0.0018348210133510708
|D|      0.03384695168868358
|Ą|     0.013511723407073784
|E|      0.07147346555694287
|Ć|     0.005512918436428102
|F|    0.0012147586125258241
|Æ|     5.636930916593152E-6
|G|      0.01446154626651973
|H|      0.01187701344126177
|I|      0.08491190886210094
|É|    1.2119401470675276E-4
|J|     0.020617074827439453
|K|     0.036724604921604384
|L|      0.01965597810616032
|M|      0.03061135334255911
|N|      0.04588179919560996
|O|      0.06652987714309068
|P|       0.0261750887112003
|Q|     5.636930916593152E-6
|R|      0.04454584656837738
|S|      0.04588461766106826
|Ó|      0.00876542757530235
|T|     0.033038052102152465
|U|     0.022206689345918722
|V|     2.818465458296576E-5
|W|     0.044717772961333474
|Ę|     0.015594569380754954
|X|     8.455396374889728E-6
|Y|      0.03865243529507924
|Z|      0.06623393826996954
|Ś|    0.0073139178642796145
|Ź|    0.0011781185615679687
|Ż|     0.010011189307869437

NUMBER OF WORDS: 68367
10 MOST POPULAR WORDS: i, w, się, z, na, nie, jak, a, do, że
10 LONGEST WORDS USED ONLY ONCE: niebezpieczeństwach, najprzykładniejszy, białopiotrowiczowi, nierozstrzygniony, niebezpieczeństwa, białopiotrowiczem, 
najstraszniejsza, najprzywiązańsza, najpiękniejszego, dźwięcznostrunne
```

sample output:
```
C:\Users\admin\IdeaProjects\txtStatistics\build\libs>java -jar txtStatistics-1.0-SNAPSHOT.jar pt.txt -v -V
Version:1.0.0
Analyzing file: C:\Users\admin\IdeaProjects\txtStatistics\build\libs\pt.txt     | OS:Windows 7

---------RESUTLTS---------
Words Count =   68599
Unique Words Count =    13957
Top 10 Longest Words:   [nierozstrzygniony, rzeczypospolitej, najstraszniejsza, najwymowniejsza, rozstrzygnienie, spokojniejszych, rozstrzygnijcie, najkrzykliws
zym, szarozielonawej, najsmaczniejszy]
Top 10 Longest Words Appeared Once:     [nierozstrzygniony, najstraszniejsza, najkrzykliwszym, rozstrzygnienie, najwymowniejsza, rozpierzchniono, rozpierzchnion
e, rozpierzchniony, rozstrzygnijcie, ingrediencyjami]
Char Occurance:
|A|     0.09824527634097546
|B|     0.019614904595441154
|C|     0.04563150803162574
|D|     0.037283220843093476
|E|     0.07872971915726534
|F|     0.0013380854511924809
|G|     0.01592973654308422
|H|     0.013082812276857338
|I|     0.09353248349896592
|J|     0.022710197390891754
|K|     0.04045302419731119
|L|     0.02165152653507565
|M|     0.033719132448733105
|N|     0.05053989109040949
|O|     0.07328423915404747
|P|     0.028832481636256433
|Q|     6.209213230591551E-6
|R|     0.04906830755475895
|S|     0.050542995697024785
|T|     0.03639219874450338
|U|     0.024461195521918975
|V|     3.104606615295776E-5
|W|     0.04925768855829204
|X|     9.313819845887328E-6
|Y|     0.04257657512217399
|Z|     0.07295825545944207
|0|     9.313819845887328E-6
|1|     9.313819845887328E-6
|2|     1.552303307647888E-5
|3|     1.2418426461183103E-5
|4|     6.209213230591551E-6
|5|     6.209213230591551E-6
|6|     3.1046066152957757E-6
|7|     6.209213230591551E-6
|8|     3.104606615295776E-5
|9|     1.8627639691774655E-5
```