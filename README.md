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

my console output:
```
C:\Users\admin\IdeaProjects\txtStatistics\build\libs>java -jar txtStatistics-1.0-SNAPSHOT.jar pt.txt -v -V
Version:1.0.0
Analyzing file: C:\Users\admin\IdeaProjects\txtStatistics\build\libs\pt.txt     | OS:Windows 7

"C:\Program Files\Java\jdk-10.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.2.5\lib\idea_rt.jar=53171:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.2.5\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\admin\IdeaProjects\txtStatistics\out\production\classes;C:\Users\admin\.gradle\caches\modules-2\files-2.1\org.slf4j\slf4j-simple\1.6.4\6998922e7ac5ab307bd51c233776a67da0031298\slf4j-simple-1.6.4.jar;C:\Users\admin\.gradle\caches\modules-2\files-2.1\org.slf4j\slf4j-api\1.7.25\da76ca59f6a57ee3102f8f9bd9cee742973efa8a\slf4j-api-1.7.25.jar;C:\Users\admin\.gradle\caches\modules-2\files-2.1\info.picocli\picocli\3.8.2\ad74665a1b8d10b45e7c4bfa6c709dc3b3d9ca78\picocli-3.8.2.jar Main pt.txt -v -V
Version:1.0.0
Analyzing file: C:\Users\admin\IdeaProjects\txtStatistics\pt.txt	| OS:Windows 7

---------RESUTLTS---------
NUMBER OF WORDS:	68367
NUMBER OF UNIQUE WORDS:	18848
10 MOST POPULAR WORDS:	[i, w, się, z, na, nie, jak, a, do, że]
10 LONGEST WORDS:	[niebezpieczeństwach, białopiotrowiczowi, najprzykładniejszy, niebezpieczeństwem, nierozstrzygniony, białopiotrowiczem, niebezpieczeństwo, niebezpieczeństwa, rzeczypospolitej, najpiękniejszego]
10 LONGEST WORDS USED ONLY ONCE	[niebezpieczeństwach, najprzykładniejszy, białopiotrowiczowi, białopiotrowiczem, niebezpieczeństwa, nierozstrzygniony, najpiękniejszego, dziewięćdziesiąt, dźwięcznostrunne, najstraszniejsza]
Char Occurance:
|À|	2.818465458296576E-6
|Ł|	0.028421405681456832
|A|	0.08919033942782856
|B|	0.01780706476551753
|Ń|	0.0018348210133510836
|C|	0.041425805306042895
|Ą|	0.013511723407074513
|D|	0.03384695168867807
|E|	0.07147346555696382
|Æ|	5.636930916593152E-6
|F|	0.0012147586125258302
|Ć|	0.005512918436428128
|G|	0.014461546266520542
|H|	0.011877013441262355
|É|	1.2119401470675287E-4
|I|	0.08491190886213135
|J|	0.020617074827437732
|K|	0.0367246049216009
|L|	0.019655978106159107
|M|	0.030611353342552116
|N|	0.045881799195612916
|O|	0.06652987714310815
|P|	0.026175088711195647
|Q|	5.636930916593152E-6
|R|	0.0445458465683794
|Ó|	0.008765427575302662
|S|	0.045884617661071214
|T|	0.03303805210214639
|U|	0.022206689345916162
|V|	2.818465458296576E-5
|W|	0.04471777296133561
|X|	8.455396374889728E-6
|Ę|	0.015594569380755865
|Y|	0.038652435295077114
|Ś|	0.007313917864279798
|Z|	0.0662339382699868
|Ź|	0.0011781185615679743
|Ż|	0.010011189307869858

Process finished with exit code 0
