package io.github.mathew512.interfaces;

// Implementation of ThreePinPlug interface
class Appliance implements ThreePinPlug {

    private String name;

    public Appliance(String name) {
        this.name = name;
    }

    @Override
    public void accessPower() {
        System.out.println(name + " is now connected to power.");
    }

    @Override
    public void printUsage() {
        System.out.println(name + " is consuming electricity.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Create a Person
        Person person = new Person("Alice", 30);
        person.displayInfo();

        // Create a Student
        Student student = new Student("Mathew Kasanga", 22, "STU101", 3.8);
        student.displayInfo();
        student.study();

        // Demonstrate ThreePinPlug interface
        Appliance kettle = new Appliance("Electric Kettle");
        kettle.accessPower();
        kettle.printUsage();
        kettle.checkStatus(); // default method
        ThreePinPlug.printSpecifications(); // static method
    }
}
