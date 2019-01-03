package analyzer;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.*;
import static java.util.stream.Collectors.toMap;

/**
 * Created by Grzegorz Chrzaszczyk on 02-01-2019  09:15 PM
 */
public class TopTenMostPopularWords implements Analyzer {

  private List<String> mostPopularWords = new ArrayList<>();

  @Override
  public String toString() {
    return "10 MOST POPULAR WORDS:\t" + mostPopularWords;
  }

  @Override
  public List<String> analyze(String text) {

    Map<String, Integer> wordsOccurance = new HashMap<>();

    List<String> words = Arrays.asList(text.replaceAll(RegexPatterns.CUSTOM, " ")
            .toLowerCase()
            .split(RegexPatterns.WHITE_SPACES));
    for (String word : words) {
      //Get the character
      Integer cnt = wordsOccurance.get(word);
      if (cnt == null) {
        wordsOccurance.put(word, 1);
      } else {
        wordsOccurance.put(word, cnt + 1);
      }
    }
//    System.out.println("map before sorting: " + wordsOccurance);

    // let's sort this map by values first
    Map<String, Integer> sorted = wordsOccurance
            .entrySet()
            .stream()
            //sort this map by values
//            .sorted(comparingByValue())
            //sort this map in decreasing order of value
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .collect(
                    toMap(e -> e.getKey(),e -> e.getValue(), (e1, e2) -> e2,
                            LinkedHashMap::new));

//    System.out.println("map after sorting by values: " + sorted);
    mostPopularWords = sorted
            .keySet()
            .parallelStream()
            .distinct()
            .limit(10)
            .collect(Collectors.toList());
    return mostPopularWords;
  }
}
