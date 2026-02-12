package io.github.mathew512.Streams;

import java.util.*;
import java.util.stream.*;

public class StreamCreation {

    public static void main(String[] args) {
    //1. From Collections
    List<String> list = Arrays.asList("a", "b", "c");
    Stream<String> listStream = list.stream();

    Set<Integer> set = Set.of(1, 2, 3);
    Stream<Integer> setStream = set.stream();

    //2. From Arrays
    String[] array = {"x", "y", "z"};
    Stream<String> arrayStream = Arrays.stream(array);

    //3. Stream.of()
    Stream<String> ofStream = Stream.of("p", "q", "r");

    //4. Stream.builder()
    Stream<String> builderStream = Stream.<String>builder()
        .add("m")
        .add("n")
        .add("o")
        .build();

    //5. Stream.generate() - infinite stream
    Stream<Double> randomStream = Stream.generate(Math::random);
    Stream<Integer> constantStream = Stream.generate(() -> 42);

    //6. Stream.iterate() - infinite stream
    Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 1);

    //7. Primitives
    IntStream intStream = IntStream.range(0, 10);
    LongStream longStream = LongStream.rangeClosed(1, 5);
    DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);

    System.out.println("Range: " + intStream.boxed().collect(Collectors.toList()));
    System.out.println("Long Range: " + longStream.boxed().collect(Collectors.toList()));
    System.out.println("Double Values: " + doubleStream.boxed().collect(Collectors.toList()));
    }
    
}
