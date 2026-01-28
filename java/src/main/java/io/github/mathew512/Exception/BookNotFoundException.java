package io.github.mathew512.Exception;


public class BookNotFoundException extends LibraryException {
    public BookNotFoundException(String isbn) {
        super("Book with ISBN " + isbn + " not found.");
    }
}
