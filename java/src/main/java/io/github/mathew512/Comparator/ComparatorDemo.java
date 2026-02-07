package io.github.mathew512.Comparator;

import java.util.*;

// Student class implementing Comparable (for natural order by name)
class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", GPA: " + gpa + ")";
    }

    // Natural ordering: by name
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}

// Comparator for Age
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

// Comparator for GPA (descending)
class GPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa()); // reverse order
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22, 3.5));
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 29, 3.6));

        System.out.println("=== Original Order ===");
        students.forEach(System.out::println);

        // sort by age using comparator
        Collections.sort(students, new AgeComparator());
        System.out.println("\n=== Sorted by Age ===");
        students.forEach(System.out::println);

        // sort by GPA (descending) using comparator
        Collections.sort(students, new GPAComparator());
        System.out.println("\n=== Sorted by GPA (Descending) ===");
        students.forEach(System.out::println);

        // sort by name (natural order - Comparable)
        Collections.sort(students);
        System.out.println("\n=== Sorted by Name (Natural Order) ===");
        students.forEach(System.out::println);
    }
}
