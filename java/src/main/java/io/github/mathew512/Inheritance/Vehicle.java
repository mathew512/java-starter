package io.github.mathew512.Inheritance;

public class Vehicle {
    private String brand;
    private int year;

    //constructor
    public Vehicle(String brand){
        this.brand=brand;
        this.year=year;
    }

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void start(){
        System.out.println(brand + "Vehicle starting...");

    }
    public void stop(){
        System.out.println(brand +"Vehicle stopping...");
    }
    public String getInfo(){
        return "Brand" + brand + ", Year :"+ year;
    }
}
