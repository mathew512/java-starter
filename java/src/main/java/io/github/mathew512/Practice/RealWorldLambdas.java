package io.github.mathew512.Practice;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class RealWorldLambdas {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85, "CS"),
            new Student("Bob", 92, "Math"),
            new Student("Charlie", 78, "CS"),
            new Student("Diana", 88, "Physics"),
            new Student("Eve", 95, "Math")
        );
        
        // 1. Filtering with Predicate
        Predicate<Student> csMajor = s -> "CS".equals(s.getMajor());
        Predicate<Student> highAchiever = s -> s.getGrade() >= 90;
        
        List<Student> csStudents = filterStudents(students, csMajor);
        List<Student> highAchievers = filterStudents(students, highAchiever);
        
        System.out.println("CS Students: " + csStudents);
        System.out.println("High Achievers: " + highAchievers);
        
        // 2. Transformation with Function
        Function<Student, String> nameExtractor = Student::getName;
        Function<Student, String> gradeCategory = s -> 
            s.getGrade() >= 90 ? "A" : s.getGrade() >= 80 ? "B" : "C";
        
        List<String> names = transformStudents(students, nameExtractor);
        List<String> categories = transformStudents(students, gradeCategory);
        
        System.out.println("Names: " + names);
        System.out.println("Categories: " + categories);
        
        // 3. Processing with Consumer
        Consumer<Student> gradePrinter = s -> 
            System.out.println(s.getName() + ": " + s.getGrade());
        Consumer<Student> honorRollNotifier = s -> {
            if (s.getGrade() >= 90) {
                System.out.println(s.getName() + " made honor roll!");
            }
        };
        
        System.out.println("=== Grades ===");
        processStudents(students, gradePrinter);
        
        System.out.println("=== Honor Roll ===");
        processStudents(students, honorRollNotifier);
        
        // 4. Sorting with Comparator (functional interface)
        Comparator<Student> byGrade = (s1, s2) -> 
            Integer.compare(s2.getGrade(), s1.getGrade()); // Descending
        Comparator<Student> byName = Comparator.comparing(Student::getName);
        
        students.sort(byGrade.thenComparing(byName));
        System.out.println("Sorted by grade then name: " + students);
    }
    
    public static List<Student> filterStudents(List<Student> students, 
                                              Predicate<Student> predicate) {
        return students.stream()
                      .filter(predicate)
                      .collect(Collectors.toList());
    }
    
    public static <T> List<T> transformStudents(List<Student> students, 
                                               Function<Student, T> function) {
        return students.stream()
                      .map(function)
                      .collect(Collectors.toList());
    }
    
    public static void processStudents(List<Student> students, 
                                      Consumer<Student> consumer) {
        students.forEach(consumer);
    }
}
class Student {
    private String name;
    private int grade;
    private String major;
    
    public Student(String name, int grade, String major) {
        this.name = name;
        this.grade = grade;
        this.major = major;
    }
    
    // Getters
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public String getMajor() { return major; }
    
    @Override
    public String toString() {
        return name + "(" + grade + ")";
    }
}