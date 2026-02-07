package io.github.mathew512.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicIterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        //Get iterator
        Iterator<String> iterator = fruits.iterator();

        //Traverse using iterator
        System.out.println(" === Iterator Traversal ===");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Fruits: " + fruit);
        }

        //Safe removal during iteration
        iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                iterator.remove(); // Safe removal using iterator
            }
        }
        System.out.println("After removal: " + fruits);

    }
    
}
