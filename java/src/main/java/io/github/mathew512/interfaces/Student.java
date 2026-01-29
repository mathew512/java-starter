package io.github.mathew512.interfaces;



public class Student extends Person {
    private String studentId;
    private double gpa;
    
    public Student(String name, int age, String studentId, double gpa) {
        // We'll fix this constructor soon
        super(name, age); // should be the first line
        this.studentId = studentId;
        this.gpa = gpa;

    }
    
    public void study() {
        System.out.println(getName() + " is studying...");
    }
}