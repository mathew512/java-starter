package io.github.mathew512.Datastructure;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        
        // compare HashSet vs LinkedHashSet

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Mango");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        //iteration preserves insertion order
        System.out.println("\n == LinkedHashSet Iteration == ");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
    
}
