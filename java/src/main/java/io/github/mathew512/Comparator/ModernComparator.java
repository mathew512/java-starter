package io.github.mathew512.Comparator;

import java.util.*;

public class ModernComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22, 3.5));
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 29, 3.6));

        //Using Comparator.comparing with method reference for sorting by name
        Comparator<Student> byName = Comparator.comparing(Student::getName);
        Collections.sort(students, byName);
        System.out.println("=== Sorted by Name ===");
        students.forEach(System.out::println);

        //Using Comparator.comparing with lambda for sorting by age
        Comparator<Student> byAge = Comparator.comparing(s -> s.getAge());
        Collections.sort(students, byAge);
        System.out.println("\n=== Sorted by Age ===");
        students.forEach(System.out::println);

        //reverse order
        Comparator<Student> byNameReverse = Comparator.comparing(Student::getName).reversed();
        Collections.sort(students, byNameReverse);
        System.out.println("\n=== Sorted by Name in Reverse Order ===");
        students.forEach(System.out::println);
    }
}
