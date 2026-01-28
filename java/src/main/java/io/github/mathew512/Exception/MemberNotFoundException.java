package io.github.mathew512.Exception;


public class MemberNotFoundException extends LibraryException {
    public MemberNotFoundException(int id) {
        super("Member with ID " + id + " not found.");
    }
}

