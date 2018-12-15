import analyzer.WordCountAnalyzer;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  03:40 PM
 */

public class WordCountAnalyzerTest {

    @Test
    public void analyzeTest() {
        WordCountAnalyzer wordCountAnalyzer = new WordCountAnalyzer();
        String test = "Ala has cat ala";
        Map<String, Integer> mapValues = new HashMap<>();
        mapValues.put("ala",2);
        mapValues.put("has",1);
        mapValues.put("cat",1);
        assertEquals(mapValues, wordCountAnalyzer.analyze(test));
    }


}
