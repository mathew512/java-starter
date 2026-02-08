package io.github.mathew512.Exercise.java_se_017;

public class Book {
    private String title, author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // ✅ Add getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}
