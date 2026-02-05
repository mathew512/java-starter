package io.github.mathew512.Datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapPerformance {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        // Adding 100,000 entries to the HashMap
        for (int i = 0; i < 100000; i++) {
            hashMap.put(i, "Value" + i);
        }

        // Measure time taken to retrieve a value
        long startTime = System.nanoTime();
        String value = hashMap.get(99999);
        long endTime = System.nanoTime();
        System.out.println("Retrieved value: " + value);
        System.out.println("Time taken to retrieve: " + (endTime - startTime) + " nanoseconds");

        // Measure time taken to check for a key
        startTime = System.nanoTime();
        boolean containsKey = hashMap.containsKey(50000);
        endTime = System.nanoTime();
        System.out.println("Contains key 50000? " + containsKey);
        System.out.println("Time taken to check key: " + (endTime - startTime) + " nanoseconds");
    }
    
}
