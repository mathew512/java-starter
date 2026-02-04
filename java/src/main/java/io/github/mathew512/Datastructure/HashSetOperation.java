package io.github.mathew512.Datastructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetOperation {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("After additions:" + fruits);

        // 2. Checking existence
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 3. Removing an element
        fruits.remove("Cherry");
        System.out.println("After removal of Cherry:" + fruits);

        // 4. Size of the HashSet
        System.out.println("Size: " + fruits.size());
        System.out.println("Is Empty? " + fruits.isEmpty());

        // 5. Clearing all
        fruits.clear();
        System.out.println("After clearing " + fruits);
        System.out.println("Is Empty after clearing? " + fruits.isEmpty());

    }
    
}
