package io.github.mathew512.LambdaExpressions;

import java.util.List;


public class MethodReferences {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        // 1. Static method reference- Class::staticMethod
        System.out.println("=== Static Method Reference ===");
        names.forEach(System.out::println);

        // 2. Instance method reference -instance::instanceMethod
        String prefix = "Name: ";
        names.forEach(prefix::concat); // Reference to instance method of prefix

        //3. Instance method of arbitrary type -Class:::instanceMethod
        names.forEach(String::toUpperCase); // Reference to instance method of String

        //4. Constructor reference - Class::new
        List<String> upperNames = names.stream()
                .map(String::new) // Equivalent to s -> new String(s)
                .collect(java.util.stream.Collectors.toList());

    }
    
}
