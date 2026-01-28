package io.github.mathew512.Exercise.java_se_011.shape_polymorphism;

public class Triangle extends Shape {
    private double base, height;

    public Triangle(String color, boolean filled, double base, double height){
        super(color, filled);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter(){
        // Assuming an equilateral triangle for simplicity
        return 3 * base;
    }

    @Override
    public String toString(){
        return "Triangle[base=" + base + ", height=" + height + ", color=" + color + ", filled=" + filled + "]";
    }
    
}
