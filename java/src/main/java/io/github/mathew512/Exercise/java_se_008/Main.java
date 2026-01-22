package io.github.mathew512.Exercise.java_se_008;

public class Main {

    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter(25.0);

        temp.displayAllScales();
        System.out.println();

        // Test validation
        temp.setCelsius(-300); // Should show error
        System.out.println();

        // Test conversions
        temp.setFahrenheit(77.0);
        temp.displayAllScales();
        System.out.println();

        temp.setKelvin(300.0);
        temp.displayAllScales();
    }
}
    