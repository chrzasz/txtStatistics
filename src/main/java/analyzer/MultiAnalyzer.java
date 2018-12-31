package analyzer;

import java.util.ArrayList;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  12:56 PM
 */
public class MultiAnalyzer {

  private ArrayList<Analyzer> analyzers;


  public MultiAnalyzer(ArrayList<Analyzer> analyzers) {
    this.analyzers = analyzers;
  }

  public void performAnalyzis(String text) {
    for (Analyzer analizer : analyzers) {
      analizer.analyze(text);
    }
  }

  public void showResult() {
    for (Analyzer analizer : analyzers) {
      System.out.println("Result: " + analizer);
    }

  }




}
