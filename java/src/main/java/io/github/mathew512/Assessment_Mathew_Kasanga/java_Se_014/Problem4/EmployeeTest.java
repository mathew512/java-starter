package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem4;

// Assessment 3: Mid-Term Practical Test
// Student: Mathew Kasanga
// Problem: 4
// Key Features: Testing corrected EmployeeManagement class

public class EmployeeTest {
    public static void main(String[] args) {
        try {
            EmployeeManagement emp = new EmployeeManagement("Alice", 5000);
            emp.displayEmployeeInfo();
            System.out.println("Bonus: " + emp.calculateBonus());

            emp.setSalary(-1000); // should throw exception
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
