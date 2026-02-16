package io.github.mathew512.Streams;

import java.util.*;
import java.util.stream.*;

public class FindingMatching {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // 1. anyMatch() - true if any element matches
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Has even numbers: " + hasEven);
        
        // 2. allMatch() - true if all elements match
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.println("All positive: " + allPositive);
        
        // 3. noneMatch() - true if no elements match
        boolean noNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("No negative: " + noNegative);
        
        // 4. findFirst() - get first element
        Optional<Integer> firstEven = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .findFirst();
        System.out.println("First even: " + firstEven.orElse(0));
        
        // 5. findAny() - get any element (useful for parallel streams)
        Optional<Integer> anyEven = numbers.stream()
                                         .filter(n -> n % 2 == 0)
                                         .findAny();
        System.out.println("Any even: " + anyEven.orElse(0));
        
        // Practical example
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        boolean hasLongName = names.stream()
                                  .anyMatch(name -> name.length() > 5);
        boolean allStartWithCapital = names.stream()
                                         .allMatch(name -> Character.isUpperCase(name.charAt(0)));
        
        System.out.println("Has long name: " + hasLongName);
        System.out.println("All start with capital: " + allStartWithCapital);
    }
}
