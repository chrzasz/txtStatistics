package analyzer;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Grzegorz Chrzaszczyk on 02-01-2019  10:25 AM
 */
public class UniqueWordCountAnalyzer implements Analyzer {

  private int uniqueWordsCount;

  @Override
  public String toString() {
    return "Unique Words Count =\t" + uniqueWordsCount;
  }

  @Override
  public Integer analyze(String text) {

    String[] words = text.replaceAll("[0-9]|[«…»—–/\"'.,!?;:*+<>(){}\\[\\]\\+\\-]", " ").toLowerCase().split("\\s+");

    Map<String, Integer> wordsOccurance = new HashMap<>();

    for (String word : words) {
      //Get the character
      Integer cnt = wordsOccurance.get(word);
      if (cnt == null) {
        wordsOccurance.put(word, 1);
      } else {
        wordsOccurance.put(word, cnt + 1);
      }
    }

   uniqueWordsCount = wordsOccurance.size();

    return uniqueWordsCount;
  }
}
