package io.github.mathew512.LambdaExpressions;
import java.util.function.*;
public class BuiltInInterfaces {
 public static void main(String[] args) {
    //1. Predicate<T> - takes T, returns boolean
    Predicate<String> isLong = s -> s.length() > 5;
    System.out.println("Is 'Hello' long? " + isLong.test("Hello"));

    //2. Function<T,R> - takes T, returns R
    Function<String, Integer> stringLength = s -> s.length();
    System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

    //3. Consumer<T> - takes T, returns void
    Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
    printUpper.accept("hello world");

    //4. Supplier<T> - takes no args, returns T
    Supplier<Double> randomValue = () -> Math.random();
    System.out.println("Random Value: " + randomValue.get());

    //5. UnaryOperator<T> - takes T, returns T
    UnaryOperator<Integer> square = x -> x * x;
    System.out.println("Square of 5: " + square.apply(5));

    //6. BinaryOperator<T> - takes two T, returns T
    BinaryOperator<Integer> add = (a, b) -> a + b;
    System.out.println("Sum of 3 and 4: " + add.apply(3, 4));

    }
}
