package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem1;

// Assessment 3: Mid-Term Practical Test
// Student: Mathew Kasanga
// Problem: 1
// Key Features: Inheritance, Encapsulation, Polymorphism


public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publicationDate;

    public Magazine(String itemId, String title, String author, int issueNumber, String publicationDate) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue: " + issueNumber + ", Date: " + publicationDate);
    }
}

