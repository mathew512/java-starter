package io.github.mathew512.variablescope;

import java.util.logging.Logger;

public class Main {

    //class variales - defined outside the methods
    public static String config = "Version 1.0";
    private static Logger logger=Logger.getLogger(Main.class.getName());
    public static void main(String[] args){
        
        printVariables();
        System.out.println("App Config: " + config);
        logger.info("Application started with config: " + config);
    }
    public static void printVariables(){
        //local variable - defined inside the method
        int a=20;
        System.out.println("Value of a: " + a);
        String config = "Version 2.0";
        System.out.println("Method Config: " + config);
    }
    public void carInfo(){
        Car car = new Car();
        car.id=11;
        car.model="Toyota";
        car.color="Red";

    }
    void startEngine(){
        Car car = new Car();
        car.id=11;
        car.startEngine();
    }
}
