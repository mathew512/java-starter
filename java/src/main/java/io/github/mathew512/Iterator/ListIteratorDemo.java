package io.github.mathew512.Iterator;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        animals.add("Horse");
        animals.add("Cow");

        //ListIterator allows bidirectional traversal and modification
        ListIterator<String> listIterator = animals.listIterator();

        System.out.println("=== Forward Traversal ===");
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String animal = listIterator.next();
            System.out.println("Index: " + index + ", Animal: " + animal);
    }

        System.out.println("\n=== Backward Traversal ===");
        while (listIterator.hasPrevious()) {
            int index = listIterator.previousIndex();
            String animal = listIterator.previous();
            System.out.println("Index: " + index + ", Animal: " + animal);
        }

        //Modify list during iteration
        System.out.println("\n=== Modifying List During Iteration ===");
        listIterator = animals.listIterator();
        while (listIterator.hasNext()) {
            String animal = listIterator.next();
            if (animal.equals("Rabbit")) {
                listIterator.set("Hare"); // Modify current element
            }
            if (animal.equals("Horse")) {
                listIterator.add("Pony"); // Add new element after current
            }
        }
        System.out.println("After modification: " + animals);
    }
    
}
