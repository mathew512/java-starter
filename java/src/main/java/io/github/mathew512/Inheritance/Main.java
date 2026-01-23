package io.github.mathew512.Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog("Bosco");
        Cat cat = new Cat("Bella");

        dog.makeSound();
        cat.makeSound();

        //Vehicle
        System.out.println("=========VEHICLE=========");

        Vehicle v1 = new Vehicle("Toyota", 2020);
        Vehicle v2 = new Vehicle("Mercedes", 2021);

        //create Car objects
        Car c1 = new Car("BMW", 2020, 4);
        Car c2 = new Car("Mercedes", 2021, 2);

        //outputs more than 4
        v1.start();
        v2.stop();
        System.out.println(v1.getInfo());
        System.out.println(v2.getInfo());

        c1.start();
        c2.honk();
        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());
    }
    
}
