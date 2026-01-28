package io.github.mathew512.Exercise.java_se_011.employee_abstraction;

public abstract class Employee {

    protected String name;
    protected String id;
    protected double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Abstract method to calculate bonus
    public abstract double calculateBonus();

    //Concrete method to display employee details
    public void displayInfo() {
        System.out.println("Name=" + name + ", ID=" + id + ", Salary=" + salary );
    }
    
}
