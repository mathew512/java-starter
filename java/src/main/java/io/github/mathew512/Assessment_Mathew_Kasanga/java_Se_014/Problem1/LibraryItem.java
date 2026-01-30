package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem1;

// Assessment 3: Mid-Term Practical Test
// Student: Mathew Kasanga
// Problem: 1
// Key Features: Inheritance, Encapsulation, Polymorphism


public class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " checked out.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " returned.");
    }

    public void displayDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}
