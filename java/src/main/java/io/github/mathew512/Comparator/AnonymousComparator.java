package io.github.mathew512.Comparator;

import java.util.*;

public class AnonymousComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22, 3.5));
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 29, 3.6));

        //Aonymous comparator class for sorting by name length
        Comparator<Student> nameLengthComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getName().length(), s2.getName().length());
            }
        };

        Collections.sort(students, nameLengthComparator);
        System.out.println("=== Sorted by Name Length ===");
        students.forEach(System.out::println);

        //Another anonymous comparator for revrse natural order
        Comparator<Student> reverseNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        };

        Collections.sort(students, reverseNameComparator);
        System.out.println("\n=== Sorted by Name in Reverse Order ===");
        students.forEach(System.out::println);
    }
    
}
