package io.github.mathew512.Exercise.java_se_010.employee_abstraction;

public class EmployementDemo {

    public static void main(String[] args) {

        Employee[] employees = {
            new Manager("Alice", "M001", 75000, "IT"),
            new Developer("Bob", "D001", 65000, "Java"),
            new Intern("Charlie", "I001", 35000, "University of XYZ")
        };
        double totalBonus = 0;
        for (Employee emp : employees) {
            emp.displayInfo();
            double bonus = emp.calculateBonus();
            System.out.println("Bonus: $" + bonus);
            totalBonus += bonus;
            System.out.println("-----------------------");
        }
        System.out.println("Total Bonuses: $" + totalBonus);
    }
}