package analyzer;

import java.util.ArrayList;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  12:56 PM
 */
public class MultiAnalyzer {

    private final ArrayList<Analyzer> analyzers;

    MultiAnalyzer(ArrayList<Analyzer> analyzers) {
        this.analyzers = analyzers;
    }

    public performAnalyzis(String text) {
        for (Analyzer analizer : analyzers) {
            analizer.analyze(text);
        }
    }


}
