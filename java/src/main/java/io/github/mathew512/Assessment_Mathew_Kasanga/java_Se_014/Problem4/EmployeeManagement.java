package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem4;

// Assessment 3: Mid-Term Practical Test
// Student: Mathew Kasanga
// Problem: 4
// Key Features: Encapsulation, Exception Handling, Corrected OOP Design

public class EmployeeManagement {
    private static String companyName = "Default Company";
    private String employeeName;
    private double salary;

    public EmployeeManagement(String name, double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        this.employeeName = name;
        this.salary = salary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public void displayEmployeeInfo() {
        System.out.println("Company: " + companyName + ", Employee: " + employeeName + ", Salary: " + salary);
    }
}
