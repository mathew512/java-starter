package io.github.mathew512.Exercise.java_se_010.employee_abstraction;

public class Manager extends Employee {
    private String department;

    public Manager(String name, String id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // Managers get a 15% bonus
    }
    
}
