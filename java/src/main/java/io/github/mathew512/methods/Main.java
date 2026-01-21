package io.github.mathew512.methods;

public class Main {
    public static void main(String[] args) {
        Mathehelper.displayWelcome();
        Mathehelper.printMessage("Hello Java!", 3);

        int sum = Mathehelper.add(5, 7);
        System.out.println("Sum: " + sum);

        double area = Mathehelper.calculateArea(5.0);
        System.out.println("Area: " + area);

        double result = Mathehelper.divide(10, 2);
        System.out.println("Division: " + result);

        Mathehelper.divide(10, 0); // test divide by zero
    }
}
