package analyzer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Grzegorz Chrzaszczyk on 11-12-2018  10:06 PM
 */
public class CharOccuranceAnalyzer implements Analyzer {

  private Map<Character, Double> occurances = new HashMap<>();

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Iterator<Map.Entry<Character, Double>> iter = occurances.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<Character, Double> entry = iter.next();
      sb.append("|" + entry.getKey() + "|\t");
      sb.append(entry.getValue());
      if (iter.hasNext()) {
        sb.append('\n');
      }
    }
    return "Char Occurance:\n" + sb.toString();
  }

  @Override
  public Map<Character, Double> analyze(String text) {

    String words = text.replaceAll(RegexPatterns.CUSTOM, "").toUpperCase();
    words = words.replaceAll(RegexPatterns.WHITE_SPACES, "");

    char[] characters = words.toCharArray();
    for (char c : characters) {
      occurances.merge(c, (1.0d / words.length()), Double::sum);
    }
    return occurances;
  }


}
