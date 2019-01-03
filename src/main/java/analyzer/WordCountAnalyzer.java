package analyzer;

import java.util.*;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  03:30 PM
 */
public class WordCountAnalyzer implements Analyzer {

  private int wordsCount;

  @Override
  public String toString() {
    return ("NUMBER OF WORDS:\t" + wordsCount);
  }

  @Override
  public Integer analyze(String text) {

    Map<String, Integer> wordsOccurance = new HashMap<>();

    String[] words = text.replaceAll(RegexPatterns.CUSTOM, " ")
            .toLowerCase()
            .split(RegexPatterns.WHITE_SPACES);

    for (String word : words) {
      //Get the character
      Integer cnt = wordsOccurance.get(word);
      if (cnt == null) {
        wordsOccurance.put(word, 1);
      } else {
        wordsOccurance.put(word, cnt + 1);
      }
    }

    wordsCount = wordsOccurance
            .values()
            .parallelStream()
            .mapToInt(Integer::intValue)
            .sum();

    return wordsCount;
  }
}


