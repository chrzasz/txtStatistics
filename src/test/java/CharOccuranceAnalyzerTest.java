import analyzer.CharOccuranceAnalyzer;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Grzegorz Chrzaszczyk on 15-12-2018  10:22 PM
 */
public class CharOccuranceAnalyzerTest {
    @Test
    public void charOccuranceAnalyzerTest() {
        CharOccuranceAnalyzer charOccuranceAnalyzer = new CharOccuranceAnalyzer();
        String test = "Ala";
        Map<Character, Double> mapValues = new HashMap<>();
        mapValues.put('A',(double)2/3);
        mapValues.put('L',(double)1/3L);
        assertEquals(mapValues, charOccuranceAnalyzer.analyze(test));
    }
}
