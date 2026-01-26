package io.github.mathew512.Exercise.java_se_010.employee_abstraction;

public class Intern extends Employee {
    private String university;

    public Intern(String name, String id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public double calculateBonus() {
        return 500; // Interns get a 5% bonus
    }
}