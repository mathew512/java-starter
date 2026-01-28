package io.github.mathew512.Exercise.java_se_011.shape_polymorphism;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle[radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }
    
}
