package io.github.mathew512.Exception;


public class DuplicateBookException extends LibraryException {
    public DuplicateBookException(String isbn) {
        super("Duplicate book with ISBN: " + isbn);
    }
}
