package commandline;

import analyzer.*;
import picocli.CommandLine.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  01:32 PM
 */
public class CommandLineApp {

  @Parameters(index = "0", description = "File to process.")
  private File file;

  @Option(names = {"-V", "--version"}, versionHelp = true, description = "display version info")
  boolean versionInfoRequested;

  @Option(names = {"-v", "--verbose"}, description = "Be verbose.")
  private boolean verbose = false;

  public void run() throws Exception {

    if (versionInfoRequested) System.out.println("Version:1.0.0");
    if (verbose) System.out.println("Analyzing file: " + file.getAbsolutePath() + "\t| OS:" + System.getProperty("os.name") + "\n");

    String str = readFileAsString(file.getAbsolutePath());

    ArrayList<Analyzer> analyzers = new ArrayList<>();
    analyzers.add(new WordCountAnalyzer());
    analyzers.add(new TopTenMostPopularWords());
    analyzers.add(new UniqueWordCountAnalyzer());
    analyzers.add(new TopTenLongestWords());
    analyzers.add(new TopTenLongestWordsAppearedOnce());
    analyzers.add(new CharOccuranceAnalyzer());

    MultiAnalyzer multiAnalyzer = new MultiAnalyzer(analyzers);
    multiAnalyzer.performAnalyzis(str);
    multiAnalyzer.showResult();

  } //END run()

  public static String readFileAsString(String fileName) throws Exception {

    if (Files.notExists(Paths.get(fileName)))
      return ("File: " + fileName + " not exists");
    String data = "";
    data = new String(Files.readAllBytes(Paths.get(fileName)));
    return data;
  }

}// END CommandLineApp


