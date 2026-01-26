package io.github.mathew512.Exercise.java_se_010.employee_abstraction;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    public double calculateBonus() {
        return salary * 0.10; // Developers get a 10% bonus
    }
}
