package io.github.mathew512.methods;

public class Mathehelper {

    public static void displayWelcome() {
        System.out.println("======METHODS======");
        System.out.println("Enjoy learning Java!");
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) a / b;
    }
}
