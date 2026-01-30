package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem1;

// Assessment 3: Mid-Term Practical Test
// Student: Mathew Kasanga
// Problem: 1
// Key Features: Inheritance, Encapsulation, Polymorphism


public class Book extends LibraryItem {
    private String isbn;
    private String genre;

    public Book(String itemId, String title, String author, String isbn, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("ISBN: " + isbn + ", Genre: " + genre);
    }
}

