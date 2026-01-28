package io.github.mathew512.Exception;


import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library("Central Library", "Nairobi");

        try {
            // Add books
            Library.Book book1 = new Library.Book("ISBN001", "Java Programming", "James Gosling");
            Library.Book book2 = new Library.Book("ISBN002", "Effective Java", "Joshua Bloch");
            Library.Book book3 = new Library.Book("ISBN003", "Clean Code", "Robert C. Martin");
            lib.addBook(book1);
            lib.addBook(book2);
            lib.addBook(book3);

            // Register members
            Library.LibraryMember member1 = lib.new LibraryMember(1, "Alice");
            lib.registerMember(member1);

            // Display books
            lib.displayBooks();

            // Borrow book
            member1.borrowBook(book1);

            // Try to borrow a missing book
            try {
                Library.Book missingBook = lib.findBookByISBN("ISBN999");
                member1.borrowBook(missingBook);
            } catch (BookNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Try to find a missing member
            try {
                Library.LibraryMember ghost = lib.findMemberById(99);
                ghost.displayBorrowedBooks();
            } catch (MemberNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (DuplicateBookException | DuplicateMemberException e) {
            System.out.println("Setup Error: " + e.getMessage());
        }

        // Interactive search
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a keyword to search for books: ");
        String keyword = scanner.nextLine();
        lib.searchBooks(keyword);
        scanner.close();

        System.out.println("Library demo completed.");
    }
}
