package io.github.mathew512.Exercise.java_se_008;

public class Main {

    public static void main(String[] args) {
        //student with encapsulation
        System.out.println("=========STUDENT WITH ENCAPSULATION==========");

        //valid input
        StudentWithEncapsulation swe = new StudentWithEncapsulation("AB123C", "Mathew", 24, 4.0);
        swe.displayInfo();

        System.out.println();

        //invalid input
        StudentWithEncapsulation tr = new StudentWithEncapsulation("124AGT", null, 0, 0);
        tr.displayInfo();
        

        //temerature converter
        System.out.println("==========TEMPARATURE CONVERTER============");
        TemperatureConverter temp = new TemperatureConverter(25.0);

        //display initial
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
    