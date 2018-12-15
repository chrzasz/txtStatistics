package analyzer;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  03:30 PM
 */
public class WordCountAnalyzer implements Analyzer {

    int uniqueWordsCount;

    @Override
    public Map<String,Integer> analyze(String text) {

        Map<String, Integer> stringOccurances = new HashMap<>();

        String[] words = text.replaceAll("[.,!?;:(){}*+-]", " ").toLowerCase().split("\\s+");

        for (String word : words) {
            //Get the character
            Integer integer = stringOccurances.get(word);
            if (integer == null) {
                stringOccurances.put(word, 1);
            } else {
                stringOccurances.put(word, integer + 1);
            }
        }


        System.out.println("Unique words [Map] count = " + stringOccurances.size());

        System.out.println("Max value in MAP = " + maxMap(stringOccurances));

        Integer val = stringOccurances.get("kota");
        System.out.println("The Value mapped to Key \"kota\" is -> " + val);

        int cnt = 0;
        for (String key : stringOccurances.keySet()) {

            cnt++;
            System.out.println("KEY_" + cnt + " = "+ key);

        }



        return stringOccurances;
    }


    public <K, V extends Comparable<V>> V maxMap(Map<K, V> map) {
        Map.Entry<K, V> maxEntry = null;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getValue();
    }


}


