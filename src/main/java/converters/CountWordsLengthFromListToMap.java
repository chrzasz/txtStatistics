package converters;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

/**
 * Created by Grzegorz Chrzaszczyk on 03-01-2019  10:57 PM
 */
public class CountWordsLengthFromListToMap {

  private Map<String, Integer> myMap = new LinkedHashMap<>();

  @Override
  public String toString() {
    return "map: " + myMap;
  }

  /*
  Collectors.toMap() function accepts a merge function to decide what to do in case of the
  duplicate key. If you use that version, instead of throwing an exception, Collector will
  use that merge function to resolve a conflict.
  In the following example, I have used that version and instructed to use the first object
  in case of the duplicate key, the lambda expression (e1, e2) -> e1 is suggesting that.
   */

  public Map<String, Integer> convert(List<String> list) {

    return myMap = list
            .stream()
            .collect(toMap(Function.identity(),
                    String::length, (e1, e2) -> e1,
                    LinkedHashMap::new));
  }

  public Map<String, Integer> sortByKey(Map<String, Integer> map) {
    Map<String, Integer> sorted = new HashMap<>();
    return sorted = map
            .entrySet()
            .stream()
            .sorted(comparingByKey())
            // in decreasing order of keys:
//            .sorted((Map.Entry.<String, Integer> comparingByKey().reversed()))
            .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                    (e1, e2) -> e2, LinkedHashMap::new));
  }

  public Map<String, Integer> sortByValue(Map<String, Integer> map) {
    Map<String, Integer> sorted = new HashMap<>();
    return sorted = map
            .entrySet()
            .stream()
//            .sorted(Map.Entry.<String, Integer> comparingByValue())
            // in decreasing order of keys:
            .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
            .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                    (e1, e2) -> e1, LinkedHashMap::new));
  }




}
