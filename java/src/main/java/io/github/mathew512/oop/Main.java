package io.github.mathew512.oop;

import java.util.ArrayList;

public class Main {


    
    public static void main(String[] args) {

        System.out.println("========Student Information========");
        // Create Student objects and display their information
        Student s1 = new Student("Alice", 20, "A");
        s1.displayInfo();
        Student s2 = new Student("Bob", 22, "B");
        s2.displayInfo();
        Student s3 = new Student("Charlie", 19, "C");
        s3.displayInfo();
        Student s4 = new Student("Diana", 21, "A+");
        s4.displayInfo();

        System.out.println("========Bank Account Operations========");

        // Create BankAccount objects and perform operations
        BankAccount account1 = new BankAccount("123456", "Alice", 1000.0);
        account1.deposit(500.0);
        account1.displayAccountInfo();

        // Withdraw from account
        account1.withdraw(200.0);
        account1.displayAccountInfo();
        BankAccount account2 = new BankAccount("654321", "Bob", 1500.0);
        account2.deposit(300.0);
        account2.displayAccountInfo();
        account2.withdraw(100.0);
        account2.displayAccountInfo();

        //rectangle calculations
        System.out.println("========Rectangle Calculations========");
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(4.0, 5.0);
        Rectangle rect3 = new Rectangle(3.0);

        rect1.displayInfo();
        System.out.println("------------------------------");
        rect2.displayInfo();
        System.out.println("------------------------------");
        rect3.displayInfo();

        System.out.println("========Student Management System========");
        StudentManager manager = new StudentManager();
        //student 1
        StudentRecord st1 = new StudentRecord("Eve", 20, "101");
        st1.addGrade(3.0);
        st1.addGrade(4.0);

        //student 2
        StudentRecord st2 = new StudentRecord("Frank", 21, "102");
        st2.addGrade(2.0);
        st2.addGrade(4.0);

        //student 3 preloaded grades
        StudentRecord st3 = new StudentRecord("Grace", 22, "100");
        st3.addGrade(4.0);
        st3.addGrade(4.0);

        ArrayList<Double>grades=new ArrayList<>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(4.0);
        StudentRecord student4 = new StudentRecord("Hank", 23, "104",grades);

        manager.addStudent(st1);
        manager.addStudent(st2);
        manager.addStudent(st3);
        manager.addStudent(student4);

        System.out.println("========ALL STUDENTS=========");
        manager.displayAllStudents();

        System.out.println("=======Search by ID=========");
        StudentRecord found =manager.findStudentById("102");
        if (found !=null) {
            System.out.println("Student found:");
            found.displayInfo();
            
        } else{
            System.out.println("Student not found");
        }
        //Display student information
       // st1.displayInfo();
        //System.out.println("------------------------------");
        //st2.displayInfo();
       // System.out.println("------------------------------");
        //st3.displayInfo();
        //System.out.println("------------------------------");
        //student4.displayInfo();
    }
}
