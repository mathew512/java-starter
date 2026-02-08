package io.github.mathew512.Exercise.java_se_017;
import java.util.*;

public class CollectionFilter {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove(); // remove odd numbers
            }
        }
        return numbers;
    }

    public static List<String> filterShortStrings(List<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() < 3) {
                iterator.remove();
            }
        }
        return strings;
    }

    public static List<Student> filterLowGrades(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getGrade().compareTo("C") < 0) {
                iterator.remove();
            }
        }
        return students;
    }

    // Demo main method
    public static void main(String[] args) {
        // Example 1: Even numbers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("Original numbers: " + numbers);
        System.out.println("Filtered even numbers: " + filterEvenNumbers(numbers));

        // Example 2: Short strings
        List<String> words = new ArrayList<>(Arrays.asList("Hi","Java","AI","Go","C"));
        System.out.println("\nOriginal strings: " + words);
        System.out.println("Filtered strings (length >= 3): " + filterShortStrings(words));

        // Example 3: Students with grades
        List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Alice","A"),
            new Student("Bob","B"),
            new Student("Charlie","D"),
            new Student("Diana","C")
        ));
        System.out.println("\nOriginal students: " + students);
        System.out.println("Filtered students (grade >= C): " + filterLowGrades(students));
    }
}

// Simple Student class for demo
class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() { return grade; }

    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}
