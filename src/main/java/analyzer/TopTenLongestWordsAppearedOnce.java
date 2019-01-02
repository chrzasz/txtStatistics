package analyzer;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Grzegorz Chrzaszczyk on 02-01-2019  01:53 PM
 */
public class TopTenLongestWordsAppearedOnce implements Analyzer {

  private List<String> topTenUniqueLongestWords = new ArrayList<>();

  @Override
  public String toString() {
    return "Top 10 Longest Words Appeared Once:\t" + topTenUniqueLongestWords;
  }

  @Override
  public List<String> analyze(String text) {

    Map<String, Boolean> uniqueWords = new HashMap<String, Boolean>();

    List<String> words = Arrays.asList(text.replaceAll(RegexPatterns.REGEX, " ").toLowerCase().split("\\s+"));

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


    return topTenUniqueLongestWords = topTenUniqueLongestWords
            .stream()
            .distinct()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(10)
            .collect(Collectors.toList());
  }


}
