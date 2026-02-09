package io.github.mathew512.LambdaExpressions;
import java.util.*;
public class LambdaSyntax {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 1. Simple lambda - print each name
           System.out.println("=== Printing Names ===");
           names.forEach(name -> System.out.println("Name: " + name));

        // 2. Lambda with multiple parameters - sorting
        System.out.println("\n=== Sorting by Length ===");
        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        names.forEach(System.out::println);

        //3. Lambda with multiple statements
        System.out.println("\n=== Sorting by Last Character ===");
        names.forEach(name ->{
            String processed = name.toUpperCase();
            int length = name.length();
            System.out.println( processed + "(" + length + ")");
        });

        //4. Lambda with return statement
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = new ArrayList<>();
        numbers.forEach(n -> {
            int square = n * n;
            squares.add(square);
        });
        System.out.println("\n=== Squares ===");
        squares.forEach(System.out::println);
    }
}