package analyzer;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Grzegorz Chrzaszczyk on 02-01-2019  01:53 PM
 */
public class TopTenLongestWordsUsedOnce implements Analyzer {

  private List<String> topTenUniqueLongestWords = new ArrayList<>();

  @Override
  public String toString() {
    return "10 LONGEST WORDS USED ONLY ONCE\t" + topTenUniqueLongestWords;
  }

  @Override
  public List<String> analyze(String text) {

    Map<String, Boolean> uniqueWords = new HashMap<>();

    List<String> words = Arrays.asList(text.replaceAll(RegexPatterns.CUSTOM, " ")
            .toLowerCase()
            .split(RegexPatterns.WHITE_SPACES));

    for (String word : words) {
      if (uniqueWords.containsKey(word)) {
        uniqueWords.put(word, false);
      } else {
        uniqueWords.put(word, true);
      }
    }

    for (Map.Entry<String, Boolean> entry : uniqueWords.entrySet()) {
      if (entry.getValue()) topTenUniqueLongestWords.add(entry.getKey());
    }

    topTenUniqueLongestWords
            .stream()
            .distinct()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(10)
            .collect(Collectors.toList());

    return topTenUniqueLongestWords;
  }
}
