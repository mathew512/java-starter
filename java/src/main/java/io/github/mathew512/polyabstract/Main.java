package io.github.mathew512.polyabstract;

public class Main {

    public static void main(String[] args) {

        MathOperations mo = new MathOperations();
        System.out.println(mo.add(5, 3));
        System.out.println(mo.subtract(5, 3));
        System.out.println(mo.multiply(5, 3));
        System.out.println(mo.divide(5, 3));

        Cat cat =new Cat("Whiskers");
        Dog dog = new Dog("Buddy");

       // Dog dog = new Dog("Buddy");
        //Cat cat = new Cat("Whiskers");

        Animal animal1 = dog; // Upcasting
        Animal animal2 = cat; // Upcasting

        animal1.makeSound(); // Outputs: Dog barks
        animal2.makeSound(); // Outputs: Cat meows

        Main main = new Main();
        main.printInfo(dog);
        main.printInfo(cat);
    }
    

    public void printInfo(Animal animal){
        //System.out.println("Animal Name: " + animal.getName());
        animal.makeSound();
    }
}