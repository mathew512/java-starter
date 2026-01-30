package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem1;

// Assessment 3: Mid-Term Practical Test
// Student: Mathew Kasanga
// Problem: 1
// Key Features: Inheritance, Encapsulation, Polymorphism

public class DVD extends LibraryItem {
    private int duration;
    private String rating;

    public DVD(String itemId, String title, String author, int duration, String rating) {
        super(itemId, title, author);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " mins, Rating: " + rating);
    }
}

