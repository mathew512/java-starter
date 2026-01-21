package io.github.mathew512.oop;

public class Car {
    public String make;
    public String model;
    public int year;
    public String color;
    public double price;
    
    public void startEngine() {
        System.out.println("Engine started for " + make + " " + model);
    }
    
    public void detailInfo() {
        System.out.println("Car Details: " + year + " " + color + " " + make + " " + model + ", Price: $" + price);
    }
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2020;
        myCar.color = "Red";
        myCar.price = 24000.00;

        Car car2= new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2019;
        car2.color = "Blue";
        car2.price = 22000.00;
        

        myCar.startEngine();
        myCar.detailInfo();
        car2.startEngine();
        car2.detailInfo();
    }
}
