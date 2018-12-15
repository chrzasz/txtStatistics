package commandline;

import analyzer.Analyzer;
import analyzer.MultiAnalyzer;
import analyzer.WordCountAnalyzer;
import picocli.CommandLine.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  01:32 PM
 */
public class CommandLineApp {

    @Option(names = {"-V", "--version"}, versionHelp = true, description = "display version info")
    boolean versionInfoRequested;

    @Option(names = {"-v", "--verbose"}, description = "Be verbose.")
    private boolean verbose = false;

    @Parameters(index = "0", description = "File to process.")
    private File file;

    public void run() throws Exception {

        if (versionInfoRequested) System.out.println("Version:1.0.0");
        if (verbose) System.out.println("(verbose)");

        System.out.println("\nAnalyzing file: " + file.getAbsolutePath() + " |OS:" + System.getProperty("os.name") + "\n");

        WordCountAnalyzer wc = new WordCountAnalyzer();
        String str = readFileAsString(file.getAbsolutePath());


        System.out.println("1.Unique words [Map]: " + wc.analyze(str) + "\n\n\n");







        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int linesCount = 0;
        int wordsCount = 0;
        List<String> strings = new ArrayList();
        while ((st = br.readLine()) != null) {
            if (verbose) System.out.println(st);
            strings.add(st);
            linesCount++;
            String[] wordsInLine = st.replaceAll("[.,!?;:(){}*+-]", " ").toLowerCase().split("\\s+");
            wordsCount += wordsInLine.length;
        }

        System.out.println("Words count = " + wordsCount);


        strings
                .stream();
//                .forEach(System.out::println);

//        strings.forEach(System.out::println);


//        InputStream targetStream = new FileInputStream(file);

//        ArrayList<Analyzer> analyzers = new ArrayList<>();
//        analyzers.add(new WordCountAnalyzer());
//        //..
//        MultiAnalyzer multi = new MultiAnalyzer(analyzers);


    } //END run()

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }


}// END CommandLineApp


