package io.github.mathew512.Datastructure;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        // 1. Union of two sets
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        //union all elements from both sets
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        // 2. Intersection of two sets
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        // 3. Difference of two sets (setA - setB)
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (setA - setB): " + difference);

        //Symmetric Difference elements in either setA or setB but not in both
        Set<Integer> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
    
}
