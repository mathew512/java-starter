package io.github.mathew512.Streams;

import java.util.*;
import java.util.stream.*;


public class CollectionOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 1. colect() - accumulate into collections
        List<String> list = names.stream()
                            .filter(n -> n.startsWith("A"))
                            .collect(Collectors.toList());
        Set<String> set = names.stream()
                                .collect(Collectors.toSet());
        // 2. toArray() - convert to array
        String[] array = names.stream().toArray(String[]::new);

        //3. Collectors utilities
        Map<Integer, List<String>> byLength = names.stream()
                                                    .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length:" + byLength);

        String joined = names.stream()
                            .collect(Collectors.joining(","));
        
        System.out.println("joined:" + joined);

        Map<Boolean, List<String>> partitioned = names.stream()
                                                    .collect(Collectors.partitioningBy(n -> n.startsWith("A")));
        
        System.out.println("Partitioned by A:" +partitioned);
    }
    
}
