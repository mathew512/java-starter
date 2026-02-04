package io.github.mathew512.Datastructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //creating HashSets
        Set<String> names = new HashSet<>();
        Set<Integer> numbers = new HashSet<>(20); // initial capacity
        Set<Double> scores = new HashSet<>(30, 0.7f); // initial capacity and load factor

        //adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // duplicate, will not be added

        System.out.println("Names: " + names);
        System.out.println("Size:" + names.size());
        System.out.println("Contains Bob? " + names.contains("Bob"));

    }
    
}
