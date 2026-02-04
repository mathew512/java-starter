package io.github.mathew512.Datastructure;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetIteration {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add(null);

        System.out.println("Colors: " + colors);

        // iteration methods
        System.out.println("\n== enhanced for-loop ==");
        for (String color : colors) {
            System.out.println(color);
        }

        // 2. Using Iterator
        System.out.println("\n == Using Iterator == ");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Using forEach with lambda
        System.out.println("\n == Using forEach with lambda == ");
        colors.forEach(color -> System.out.println(color));
    }
    
}
