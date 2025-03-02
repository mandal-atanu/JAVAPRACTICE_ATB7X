package java_coding_practice;

import java.util.Arrays;
import java.util.HashMap;

public class countofwordoccuranceinasentence {

    public static void countWordOccurrences(String sentence) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        System.out.println(Arrays.toString(words));

        // Count occurrences
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print word occurrences
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }

    public static void main(String[] args) {
        String sentence = "My name is atanu atanu";
        countWordOccurrences(sentence);
    }
}
