package io.github.mathew512.statickeyword;

public class Main {

    public static void main(String[] args) {

        System.out.println(Employee.COMPANY_NAME);
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Charlie");

        System.out.println("Employee 1: " + emp1.getName() + ", ID: " + emp1.getId());
        System.out.println("Employee 2: " + emp2.getName() + ", ID: " + emp2.getId());
        System.out.println("Employee 3: " + emp3.getName() + ", ID: " + emp3.getId());

        System.out.println("Total Employees: " + Employee.getEmployeeCount());
        
    }
    
}
