package io.github.mathew512.Datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);
        ageMap.put("Diana", 28);

        // iterate over keys
        System.out.println("== KEYS ==");
        for (String key : ageMap.keySet()) {
            System.out.println("Name: " + key);
        }

        // iterate over values
        System.out.println("\n== VALUES ==");
        for (Integer value : ageMap.values()) {
            System.out.println("Age: " + value);
        }

        // iterate over key-value pairs
        System.out.println("\n== KEY-VALUE PAIRS ==");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // using forEach with lambda
        System.out.println("\n== USING forEach ==");
        ageMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
