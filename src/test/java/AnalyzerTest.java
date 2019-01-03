import analyzer.WordCountAnalyzer;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  03:40 PM
 */

public class AnalyzerTest {

    @Test
    public void WordCountTest() {
        WordCountAnalyzer wordCountAnalyzer = new WordCountAnalyzer();
        String test = "Ala has cat ala";
        assertTrue(4 == wordCountAnalyzer.analyze(test));
    }


}
