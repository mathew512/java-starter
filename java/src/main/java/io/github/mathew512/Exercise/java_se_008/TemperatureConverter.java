package io.github.mathew512.Exercise.java_se_008;

public class TemperatureConverter {
    private double celsius;

    //constructor uses setter for validation
    public TemperatureConverter(double celsius){
        setCelsius(celsius);
    }

    //getters and setters
    public double getCelsius(){
        return celsius;
    }

    public void setCelsius(double celsius){
        if(celsius >=-273.15){
            this.celsius = celsius;
        } else{
            System.out.println("Error: Temperature cannot be below absolute zero(-273.15)");

        }
    }
    //add calculated properties
    public double getFahrenheit(){
        return(celsius * 9/5) +32;
    }
    public double getKelvin(){
        return celsius + 273.15;
    }

    //conversion method 

    public void setFahrenheit(double fahrenheit){
        setCelsius((fahrenheit-32) * 5/9);
    }
    public void setKelvin(double kelvin){
        setCelsius(kelvin - 273.15);
    }

    //add display method
    public void displayAllScales(){
        System.out.printf("Celsius : %.2f°C%n", celsius);
        System.out.printf("Fahrenheit: %.2f°F%n", getFahrenheit());
        System.out.printf("Kelvin: %.2fK%n", getKelvin());
    }
}
