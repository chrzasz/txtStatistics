package analyzer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Grzegorz Chrzaszczyk on 31-12-2018  02:17 PM
 */
public class TopTenLongestWords implements Analyzer {
  @Override
  public List<String> analyze(String text) {
    String regexPattern = "[\n?!/,;: .-]+";

    List<String> stringList = Arrays.asList(text.toLowerCase().split(regexPattern));
    return stringList.stream()
            .distinct()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(10)
            .collect(Collectors.toList());
  }
}
