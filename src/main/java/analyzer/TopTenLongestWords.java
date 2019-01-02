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

  private List<String> topTenLongestWords;

  @Override
  public String toString() {
    return "Top 10 Longest Words:\t" + topTenLongestWords;
  }

  @Override
  public List<String> analyze(String text) {

    String[] words = text.replaceAll("[0-9]|[«…»—–/\"'.,!?;:*+<>(){}\\[\\]\\+\\-]", " ").toLowerCase().split("\\s+");

    List<String> tempLst = List.of(words);

    topTenLongestWords = tempLst
            .stream()
            .distinct()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(10)
            .collect(Collectors.toList());

    return topTenLongestWords;

  }
}
