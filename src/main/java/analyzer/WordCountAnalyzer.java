package analyzer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  03:30 PM
 */
public class WordCountAnalyzer implements Analyzer {

  private int wordsCount;
  private int uniqueWordsCount;

  @Override
  public String toString() {
    return ("Words Count =\t" + wordsCount);
  }

  @Override
  public Integer analyze(String text) {

    Map<String, Integer> wordsOccurance = new HashMap<>();

    String[] words = text.replaceAll("[0-9]|[«…»—–/\"'.,!?;:*+<>(){}\\[\\]\\+\\-]", " ").toLowerCase().split("\\s+");

    for (String word : words) {
      //Get the character
      Integer cnt = wordsOccurance.get(word);
      if (cnt == null) {
        wordsOccurance.put(word, 1);
      } else {
        wordsOccurance.put(word, cnt + 1);
      }
    }

    return wordsCount = wordsOccurance
            .values()
            .parallelStream()
//            .sorted()
            .mapToInt(Integer::intValue)
            .sum();




//    Stream<String> stream = Arrays.stream(words);
//    stream.forEach(s -> addToHashMap(s));
//    wordsCount = wordsMap.values()
//            .stream()
//            .mapToInt(Integer::intValue)
//            .sum();
//    return getWordsCount();


  }





}


