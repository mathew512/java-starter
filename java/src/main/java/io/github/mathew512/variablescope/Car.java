package io.github.mathew512.variablescope;

public class Car {
    //instance varibles -> defined outside methods but inside class
    public int id;
    public String model;
    public String color;
    
    public void startEngine(){
        System.out.println("Engine started for car ID: " + id);
    }
}
