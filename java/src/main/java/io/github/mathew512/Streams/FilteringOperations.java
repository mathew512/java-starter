package io.github.mathew512.Streams;

import java.util.*;
import java.util.stream.*;

public class FilteringOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        //1. filter() - filter out names starting with 'A'
        List<String> filteredNames = names.stream()
            .filter(name -> !name.startsWith("A"))
            .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        //2. distinct() - remove duplicates
        List<String> duplicateNames = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
        List<String> distinctNames = duplicateNames.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Distinct Names: " + distinctNames);

        //3. limit() - limit to first 3 names
        List<String> limitedNames = names.stream()
            .limit(3)
            .collect(Collectors.toList());
        System.out.println("Limited Names: " + limitedNames);

        //4. skip() - skip first 2 names
        List<String> skippedNames = names.stream()
            .skip(2)
            .collect(Collectors.toList());
        System.out.println("Skipped Names: " + skippedNames);
    }
    
}
