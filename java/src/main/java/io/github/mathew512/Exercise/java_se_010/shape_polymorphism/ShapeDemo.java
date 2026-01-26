package io.github.mathew512.Exercise.java_se_010.shape_polymorphism;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape [] shapes={
            new Circle("Red", true, 5.0),
            new Rectangle("Blue", false, 4.0, 6.0),
            new Triangle("Green", true, 3.0, 4.0)
        };
        for(Shape s : shapes){
            System.out.println(s);
            System.out.printf("Area: " + s.getArea());
            System.out.printf("Perimeter: " + s.getPerimeter());
            System.out.println("----------------------- ");
        }

    }
}
