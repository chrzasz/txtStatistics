package analyzer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Grzegorz Chrzaszczyk on 31-12-2018  02:17 PM
 */
public class TopTenLongestWords implements Analyzer {

  private List<String> longestWords;

  @Override
  public String toString() {
    return "10 LONGEST WORDS:\t" + longestWords;
  }

  @Override
  public List<String> analyze(String text) {

    String[] words = text.replaceAll(RegexPatterns.CUSTOM, " ")
            .toLowerCase()
            .split(RegexPatterns.WHITE_SPACES);

    longestWords = List.of(words)
            .stream()
            .distinct()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(10)
            .collect(Collectors.toList());

    return longestWords;
  }
}
