package io.github.mathew512.Comparator;

import java.util.*;

public class MultipleFieldSorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22, 3.5));
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 29, 3.6));
        students.add(new Student("Bob", 21, 3.6)); // Same name, different age

        //traditional way - multiple comparators
        Comparator<Student> byNameThenAge = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int nameCompare = s1.getName().compareTo(s2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                } else {
                    return Integer.compare(s1.getAge(), s2.getAge());
                }
               
            }
        };

        Collections.sort(students, byNameThenAge);
        System.out.println("=== Sorted by Name, then Age ===");
        students.forEach(System.out::println);

        //Modern way - using Comparator composition
        Comparator<Student> modernMultiField = Comparator.comparing(Student::getName)
                                                   .thenComparing(Student::getAge)
                                                   .thenComparing(Student::getGpa);
        Collections.sort(students, modernMultiField);
        System.out.println("\n=== Sorted by Name, then Age, then GPA ===");
        students.forEach(System.out::println);

        //Modern way - using Comparator composition
        Comparator<Student> mixedOrder = Comparator.comparing(Student::getName)
                                                   .thenComparing(Student::getAge)
                                                   .thenComparing(Student::getGpa).reversed();
        Collections.sort(students, mixedOrder);
        System.out.println("\n=== Sorted by Name, then Age, then GPA (reversed) ===");
        students.forEach(System.out::println);
    
    }

}
