package io.github.mathew512.oop;

public class Rectangle {
    private double length;
    private double width;

    //default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    //constructor with dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //constructor for square
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    //methods
   
    public double calculateArea() {
        return this.length * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
    public boolean isSquare() {
        return this.length == this.width;
    }

    public void displayInfo(){
        System.out.println("Rectangle Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Is Square: " + isSquare());
    }
    public double getArea() {
         return calculateArea(); 
    }
    public double getPerimeter() {
         return calculatePerimeter(); 
    }

}