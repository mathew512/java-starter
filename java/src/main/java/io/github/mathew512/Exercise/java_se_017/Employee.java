package io.github.mathew512.Exercise.java_se_017;

public class Employee implements Comparable<Employee> {
    private String department, name;
    private double salary;

    public Employee(String department, String name, double salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        int deptCompare = this.department.compareTo(other.department);
        if (deptCompare != 0) return deptCompare;

        int salaryCompare = Double.compare(this.salary, other.salary);
        if (salaryCompare != 0) return salaryCompare;

        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return department + " - " + name + " ($" + salary + ")";
    }
}
