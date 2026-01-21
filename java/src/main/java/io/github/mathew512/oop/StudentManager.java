package io.github.mathew512.oop;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<StudentRecord> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(StudentRecord student) {
        students.add(student);
    }

    // Find student by ID
    public StudentRecord findStudentById(String id) {
        for (StudentRecord s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null; // not found
    }

    // Display all students
    public void displayAllStudents() {
        for (StudentRecord s : students) {
            s.displayInfo();
            System.out.println("------------------------------");
        }
    }
}
