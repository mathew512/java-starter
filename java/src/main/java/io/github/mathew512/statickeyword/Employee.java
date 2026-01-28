package io.github.mathew512.statickeyword;

public class Employee {
    public static final String COMPANY_NAME = "Tech Solutions Inc.";
    
    private String name;
    private int id;
    private static int employeeCount = 0;

    public Employee(String name){
        this.name = name;
        employeeCount++;
        this.id = employeeCount;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public static int getEmployeeCount(){
        return employeeCount;
    }
    
}
