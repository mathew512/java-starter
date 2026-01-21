package io.github.mathew512.methods;

public class TemperatureConveter {

    //convert celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //convert fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    //overloaded method: celsius to Fahrenheit
    public static double celsiusToFahrenheit(int celsius) {
        return (celsius * 9/5) + 32;
    }

    //print conversion table from 0 to 100 celsius
    public static void printCelsiusToFahrenheitTable() {
        System.out.println("Celsius to Fahrenheit Conversion Table:");
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%d\t%.2f%n", celsius, fahrenheit);
        }
    }
    public static void main(String[] args){
        //test conversions
        System.out.println("20 Celsius to Fahrenheit: " + celsiusToFahrenheit(20));
        System.out.println("68 Fahrenheit to Celsius: " + fahrenheitToCelsius(68));

        //print table
        printCelsiusToFahrenheitTable();
    }
}
