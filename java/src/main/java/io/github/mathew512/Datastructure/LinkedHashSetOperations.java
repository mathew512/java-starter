package io.github.mathew512.Datastructure;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetOperations {

    public static void main(String[] args) {
        Set<String> animals = new LinkedHashSet<>();

        // 1. Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Lion");

        System.out.println("Animals after addition:" + animals);

        // access first element (not direct, but via iteration)
        String firstAnimal = animals.iterator().next();
        System.out.println("First animal: " + firstAnimal);

        //removing elements maintains order of remaining elements
        animals.remove("Cat");
        System.out.println("Animals after removing Cat:" + animals);

        //addin new elements adds to the end
        animals.add("Giraffe");
        System.out.println("Animals after adding Giraffe:" + animals);

        //Performance comparison
        long startTime = System.nanoTime();
        animals.contains("Elephant");
        long endTime = System.nanoTime();
        System.out.println("Contains check time:" + (endTime - startTime) + " ns");
    }
    
}
