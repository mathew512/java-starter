package io.github.mathew512.Exercise.java_se_008;

public class StudentWithEncapsulation {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    //Constructor uses setters for validation
    public StudentWithEncapsulation(String studentId, String name, int age, double gpa){
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setGpa(gpa);


    }

    //Getters
    public String getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }

    //setters with validation
    public void setStudentId(String studentId){
        if(studentId !=null && studentId.matches("[A-Za-z0-9]{6}")){
            this.studentId=studentId;
        }else{
            System.out.println("Error: Student Id must be exactly 6 alphanumeric character");
        }

    }

    public void setName(String name){
        if (name !=null && name.trim().length() >=2){
            this.name=name.trim();
        } else {
            System.out.println("Error: Name must be atleast 2 character");
        }
    }
    public void setAge(int age){
        if (age >=16 && age <= 100){
            this.age=age;
        } else {
            System.out.println("Error : the age must between 16 to 100");
        }
    }
    public void setGpa(double gpa){
        if ( gpa >=0.0 && gpa <= 4.0) {
            this.gpa=gpa;
        } else {
            System.out.println("Error: Gpa must be between 0.0 to 4.0");
        }
    }

    //display method
    public void displayInfo(){
        System.out.println("Id:" +studentId);
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Gpa:" +gpa);
    }
}
