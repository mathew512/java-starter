package io.github.mathew512.LambdaExpressions;

import java.util.function.*;
import java.util.*;

public class FunctionExample {
    public static void main(String[] args) {
        //Function examples
        Function<String, Integer> stringLength = str -> str.length();
        Function<Integer, String> intToString = Object::toString;

        //Function Composition
        Function<String, Integer> lengthThenString = stringLength.andThen(num -> num * num);
        Function<String, String> StringThenLength = stringLength.andThen(intToString);

        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));
        System.out.println("Square of 5: " + lengthThenString.apply("Hello"));

        //UnaryOperator - same type in and out
        UnaryOperator<String> toUpper = String::toUpperCase;
       

    }
    
}
