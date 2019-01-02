package analyzer;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

/**
 * Created by Grzegorz Chrzaszczyk on 02-01-2019  04:21 PM
 */
public class ProcessData {

  // https://www.oracle.com/technetwork/articles/java/architect-streams-pt2-2227132.html

  private static String[] arrayOfWords = {"Java", "Magazine", "is", "the", "best", "is", "is"};
  private static Set<String> set = new HashSet<>();

  public static void main(String[] args) {


    //mozna od razu streama:
//    Stream<String> words = Stream.of("Java", "Magazine", "is", "the", "best");
    //albo converse:
    Stream<String> words = Arrays.stream(arrayOfWords);

    Map<String, Long> letterToCount = words
            .map(w -> w.split("")) //"\\s+" - for words
            .flatMap(Arrays::stream)
            .collect(groupingBy(identity(), counting()));

    System.out.println(letterToCount);


    String s = "Today is the happiest day of my life";
    String[] word = s.split(" ");
    String rts = " ";
    List<String> lst = new ArrayList<>();
    for (int i = 0; i < word.length; i++) {
      lst.add(word[i]);
      if (word[i].length() >= rts.length()) {
        rts = word[i];

      }
    }
    System.out.print(rts + "\t");
    System.out.println(rts.length());

    lst.forEach(System.out::println);
    System.out.println(Arrays.toString(lst.toArray()));

    System.out.println(lst.stream().distinct().sorted().findFirst().toString());


    Pair<String, Integer> maxWordPair = Arrays.stream(s.split(" "))
            .map(str -> new Pair<>(str, str.length()))
            .max(Comparator.comparingInt(Pair::getValue))
            .orElse(new Pair<>("Error", -1));
    System.out.println(String.format("Max Word is [%s] and the length is [%d]", maxWordPair.getKey(), maxWordPair.getValue()));

  }


}