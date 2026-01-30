package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem1;

// Assessment 3: Mid-Term Practical Test
// Student: Mathew Kasanga
// Problem: 1
// Key Features: Inheritance, Encapsulation, Polymorphism


public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B001", "Java Programming", "John Doe", "123-4567890123", "Education"),
            new DVD("D001", "Java Tutorial", "Jane Smith", 120, "PG"),
            new Magazine("M001", "Tech Monthly", "Tech Press", 15, "2024-03-01")
        };

        for (LibraryItem item : items) {
            item.displayDetails();
            item.checkout();
            item.returnItem();
            System.out.println(); // spacing between items
        }
    }
}
