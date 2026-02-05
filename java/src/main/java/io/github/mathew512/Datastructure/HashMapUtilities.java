package io.github.mathew512.Datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapUtilities {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        // Adding items to the inventory
        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Orange", 25);
        inventory.put("Grapes", 40);

        System.out.println("Initial Inventory: " + inventory);

        //removing an item
        inventory.remove("Banana");
        System.out.println("After removing Banana: " + inventory);

        //remove only if value matches
        inventory.remove("Orange", 20); // will not remove as value does not match
        inventory.remove("Orange", 25); // will remove as value matches
        System.out.println("After removing Orange: " + inventory);

        //replace value
        inventory.replace("Apple", 60);
        inventory.replace("Grapes", 40, 45); // will replace as value matches
        System.out.println("After replacing values: " + inventory);

        //size and emptiness
        System.out.println("Inventory size: " + inventory.size());
        System.out.println("Is inventory empty? " + inventory.isEmpty());

        //get or default
        int appleCount = inventory.getOrDefault("Apple", 0);
        int mangoCount = inventory.getOrDefault("Mango", 0);
        System.out.println("Apple count: " + appleCount);
        System.out.println("Mango count: " + mangoCount);
    }
    
}
