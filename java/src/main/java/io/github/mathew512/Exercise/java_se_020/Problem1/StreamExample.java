package io.github.mathew512.Exercise.java_se_020.Problem1;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        //from collection
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);

        //from a set
        Set<Integer> nem = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Stream<Integer> numStream = nem.stream();
        numStream.forEach(System.out::println);

        //from a Map
        Map<Integer, String> map = Map.of(1, "One", 2, "Two", 3, "Three");
        Stream<Integer> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();

        keyStream.forEach(key -> System.out.println("Key: " + key));
        valueStream.forEach(value -> System.out.println("Value: " + value));
        Stream<Map.Entry<Integer, String>> entryStream = map.entrySet().stream();
        entryStream.forEach(e -> System.out.println("Entry: " + e.getKey() + " = " + e.getValue()));   
        
        // Arithmetic progression: even numbers
        System.out.println("Even numbers:");
        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(10);
        evenNumbers.forEach(System.out::println);

        // Geometric progression: powers of 2
        System.out.println("Powers of 2:");
        Stream<Integer> powersOfTwo = Stream.iterate(1, n -> n * 2).limit(10);
        powersOfTwo.forEach(System.out::println);

        // Range (exclusive of end)
        System.out.println("Range 1 to 4:");
        IntStream rangeStream = IntStream.range(1, 5); // 1,2,3,4
        rangeStream.forEach(System.out::println);

        // RangeClosed (inclusive of end)
        System.out.println("Range 1 to 5:");
        IntStream rangeClosed = IntStream.rangeClosed(1, 5); // 1,2,3,4,5
        rangeClosed.forEach(System.out::println);

        // Random numbers
        System.out.println("Random numbers:");
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        randomNumbers.forEach(System.out::println);

        // Constant values
        System.out.println("Constant values:");
        Stream<String> helloStream = Stream.generate(() -> "Hello").limit(3);
        helloStream.forEach(System.out::println);

        System.out.println("Multiple streams:");
        Stream<String> stream1 = Stream.of("A", "B");
        Stream<String> stream2 = Stream.of("C", "D");

        Stream<String> combined = Stream.concat(stream1, stream2);
        combined.forEach(System.out::println);




    }
    
}
