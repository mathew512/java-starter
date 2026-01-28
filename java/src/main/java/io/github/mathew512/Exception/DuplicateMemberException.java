package io.github.mathew512.Exception;


public class DuplicateMemberException extends LibraryException {
    public DuplicateMemberException(int id) {
        super("Duplicate member with ID: " + id);
    }
}
