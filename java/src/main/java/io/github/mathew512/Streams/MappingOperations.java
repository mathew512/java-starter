package io.github.mathew512.Streams;

import java.util.*; 
import java.util.stream.*;

public class MappingOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        //1. map() - convert names to uppercase
        List<String> upperCaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        //2. flatMap() - split names into characters
        List<Character> characters = names.stream()
            .flatMap(name -> name.chars().mapToObj(c -> (char) c))
            .collect(Collectors.toList());
        System.out.println("Characters: " + characters);
    }
    
}
