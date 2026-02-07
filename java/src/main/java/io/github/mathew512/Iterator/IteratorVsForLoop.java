package io.github.mathew512.Iterator;

import java.util.*;

public class IteratorVsForLoop {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow");

        //Enhanced for loop
        System.out.println("=== Enhanced For Loop ===");
        for (String color : colors) {
            System.out.println("Color: " + color);

            //cannot remove elements here - will throw ConcurrentModificationException
            //if (color.equals("Green")) {
            //    colors.remove(color); // This will cause an error
        }

        //iterator with safe removal
        System.out.println("\n=== Iterator with Safe Removal ===");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println("Color: " + color);
            if (color.equals("Green")) {
                iterator.remove(); // Safe removal using iterator
            }
        }
        System.out.println("After removal: " + colors);
    }
}
