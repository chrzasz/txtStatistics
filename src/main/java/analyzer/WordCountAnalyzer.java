package analyzer;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  03:30 PM
 */
public class WordCountAnalyzer implements Analyzer {

    int uniqueWordsCount;

    @Override
    public Map<String, Integer> analyze(String text) {

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

        Integer totalWordsCnt = wordsOccurance
                .values()
                .parallelStream()
                .sorted()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Total words count = " + totalWordsCnt);

        List<String> longestWordsList = new ArrayList<>();
//        longestWordsList = wordsOccurance.;



        // fill list sorted by the longest words
        List<String> longestWordsList1 = new ArrayList<>();
        String longest = "";
        for (String key : wordsOccurance.keySet()) {
            if (key.length() > longest.length()) {
                longest = key;
                longestWordsList1.add(key);
            }
        }
        Collections.sort(longestWordsList1);
        longestWordsList1 = longestWordsList1.subList(0,longestWordsList1.size());






        System.out.println("TOP 10 longest words:");
        for (String key : longestWordsList1){
            System.out.print(key + "\t");
        }


        System.out.println("\nLongest word: " + longest);

//        longestWordsList = wordsOccurance
//                .keySet()
//                .parallelStream()
//                .sorted(Comparator.reverseOrder())//
//                .collect(Collectors.toList());

        longestWordsList = wordsOccurance
                .keySet()
                .parallelStream()
                .collect(Collectors.toList());


        if (wordsOccurance.size() > 10) {
            for (int i = 0; i < 10; i++) {
                System.out.print(longestWordsList.get(i) + "\t");
            }
        } else {
            for (int i = 0; i < wordsOccurance.size(); i++) {
                System.out.print(longestWordsList.get(i) + "\t");
            }
        }


        System.out.println("\nlongestWordsList.size: " + longestWordsList.size());

        System.out.println("Max value in MAP = " + wordsOccurance
                .values()
                .parallelStream()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .findFirst()
                .getAsInt()
        );

//        int sum = wordsOccurance.values().stream().mapToInt(Integer::parseInt).sum();

//        System.out.println("WORDS COUNT = "+ sum);


        System.out.println("Unique words [Map] count = " + wordsOccurance.size());

        System.out.println("Max value in MAP = " + maxMap(wordsOccurance));

        Integer val = wordsOccurance.get("kota");
        System.out.println("The Value mapped to Key \"kota\" is -> " + val);

        int cnt = 0;
        for (String key : wordsOccurance.keySet()) {

            cnt++;
//            System.out.println("KEY_" + cnt + " = " + key);

        }


        return wordsOccurance;
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


