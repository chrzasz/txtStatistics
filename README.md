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
:+1: