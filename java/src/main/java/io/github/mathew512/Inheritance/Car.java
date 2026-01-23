package io.github.mathew512.Inheritance;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors){
        super(brand, year);
        this.doors=doors;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ",Doors :" + doors;
    }

    public void honk(){
        System.out.println("Car honks: Beep Beep");
    }

}
