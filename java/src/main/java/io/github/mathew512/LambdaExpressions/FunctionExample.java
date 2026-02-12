package io.github.mathew512.LambdaExpressions;

import java.util.function.*;
import java.util.*;

public class FunctionExample {
    public static void main(String[] args) {
        //Function examples
        Function<String, Integer> stringLength = str -> str.length();
        Function<Integer, Integer> intToString = Object::toString;

        //Function Composition
        Function<String, Integer> lengthThenString = stringLength.andThen(num -> num * num);
        Function<Integer, Integer> StringThenLength = intToString.compose(stringLength);

        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));
        System.out.println("Square of 5: " + lengthThenString.apply("Hello"));

        //UnaryOperator - same type in and out
        UnaryOperator<Integer> toUpper = String::toUpperCase;
       

    }
    
}
