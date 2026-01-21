package io.github.mathew512.oop;
import java.util.ArrayList;

public class StudentRecord {
    private String name;
    private int age;
    private String id;
    private ArrayList<Double> grades;
    private double gpa;

    //constructor with name and id
    public StudentRecord(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grades = new ArrayList<>();
        this.gpa = 0.0;
    }

    //Constructor with preloaded grades
    public StudentRecord(String name, int age, String id, ArrayList<Double> grades){
        this.name=name;
        this.age=age;
        this.id=id;
        this.grades=grades;
        calculatedGPA();
    }


    //add grade
    public void addGrade(double grade){
        grades.add(grade);
        calculatedGPA();
    }
    
    //calculate GPA
    private void calculatedGPA() {
        if (grades.isEmpty()) {
            gpa = 0.0;
            return;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum +=grade;
        }
        gpa = sum / grades.size();
    }

    //Display info
    public void displayInfo(){
        System.out.println("Student: " + name + ", Age:"+age+ "ID: "+id + ")");
        System.out.println("Grades:" +grades);
        System.out.println("GPA:" + gpa);
    }

    public String getId(){
        return id;
    }
    
}
