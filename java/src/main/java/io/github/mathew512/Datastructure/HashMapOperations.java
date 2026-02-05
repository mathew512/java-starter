package io.github.mathew512.Datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<>();

        // Adding key-value pairs to the HashMap
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("India", "New Delhi");

        System.out.println("Country Capital Cities: " + capitalCities);

        // Accessing a value using a key
        System.out.println("Capital of France: " + capitalCities.get("France"));
        System.out.println("Capital of India: " + capitalCities.get("India"));

        // Checking if a key exists
        System.out.println("Does the map contain USA? " + capitalCities.containsKey("USA"));
        System.out.println("Does the map contain Germany? " + capitalCities.containsKey("Germany"));

        //updating a value
        capitalCities.put("USA", "Washington D.C. Updated");
        System.out.println("Updated USA Capital: " + capitalCities.get("USA"));

        //put if absent
        capitalCities.putIfAbsent("Germany", "Berlin");
        capitalCities.putIfAbsent("France", "Paris Updated"); // This will not update as France already exists
        System.out.println("After putIfAbsent: " + capitalCities);
    }
    
}
