package io.github.mathew512.Exercise.java_se_020.Problem2;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;
    String department;

    Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + age + ", " + department + ")";
    }
}

public class StreamPractice {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", 30, "HR"),
            new Employee("Bob", 25, "IT"),
            new Employee("Charlie", 35, "Finance"),
            new Employee("David", 28, "IT"),
            new Employee("Eve", 40, "Finance")
        );

        List<String> result = employees.stream()
            // 1. Filter: only IT department and age > 26
            .filter(e -> e.department.equals("IT"))
            .filter(e -> e.age > 26)
            .peek(e -> System.out.println("After filter: " + e))

            // 2. Map: transform to uppercase names
            .map(e -> e.name.toUpperCase())
            .peek(name -> System.out.println("After map: " + name))

            // 3. FlatMap: split names into characters
            .flatMap(name -> Arrays.stream(name.split("")))
            .peek(ch -> System.out.println("After flatMap: " + ch))

            // 4. Sort: by character alphabetically, then reverse
            .sorted(Comparator.reverseOrder())

            // 5. Collect final result
            .collect(Collectors.toList());

        System.out.println("Final Result: " + result);
    }
}

