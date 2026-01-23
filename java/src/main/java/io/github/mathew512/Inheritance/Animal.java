package io.github.mathew512.Inheritance;

public class Animal {
    private String name;

    public Animal(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void makeSound(){
        System.out.println("Animal Barks");
    }
}
