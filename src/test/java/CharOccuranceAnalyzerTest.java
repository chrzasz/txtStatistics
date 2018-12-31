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
        String test = "Ala has cat ala";
        Map<Character, Integer> mapValues = new HashMap<>();
        mapValues.put('A',1);
        mapValues.put('l',2);
        mapValues.put('a',5);
        assertEquals(mapValues, charOccuranceAnalyzer.analyze(test));
    }
}
