package io.github.mathew512.Streams;

import java.util.*;
import java.util.stream.*;

public class SortingAndPeeking {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        //1. sorted() - natural order
        List<String> sortedNames = names.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        //2. sorted(Comparator) - custom order
        List<String> reverseSortedNames = names.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        System.out.println("Reverse Sorted Names: " + reverseSortedNames);

        //3. peek() - for debugging
        List<String> peekedNames = names.stream()
            .peek(name -> System.out.println("Processing: " + name))
            .collect(Collectors.toList());
        System.out.println("Peeked Names: " + peekedNames);
    }
    
}
