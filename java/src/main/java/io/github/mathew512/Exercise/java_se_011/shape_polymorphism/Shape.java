package io.github.mathew512.Exercise.java_se_011.shape_polymorphism;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // Abstract method to calculate area
    public abstract double getArea();
    // Abstract method to calculate perimeter
    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
    
}
