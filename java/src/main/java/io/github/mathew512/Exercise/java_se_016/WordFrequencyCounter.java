package io.github.mathew512.Exercise.java_se_016;

    import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String input = "hello world hello java world programming";
        
        // Normalize text
        input = input.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        
        // Split into words
        String[] words = input.split("\\s+");
        
        // Count frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Display results
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Find most frequent word(s)
        int maxFreq = Collections.max(wordCount.values());
        System.out.println("\nMost frequent words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == maxFreq) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
            }
        }
    }
}

    

