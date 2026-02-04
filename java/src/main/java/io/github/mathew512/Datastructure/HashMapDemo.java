package io.github.mathew512.Datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Accessing values
        System.out.println("Alice's age: " + ageMap.get("Alice"));

        // Checking for a key
        System.out.println("Contains Bob? " + ageMap.containsKey("Bob"));

        // Iterating through the map
        System.out.println("All entries in the map:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}
