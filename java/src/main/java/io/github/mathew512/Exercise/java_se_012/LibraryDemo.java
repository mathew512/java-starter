package io.github.mathew512.Exercise.java_se_012;

public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library("Central Library", "Nairobi");

        // Add books
        Library.Book book1 = new Library.Book("ISBN001", "Java Programming", "James Gosling");
        Library.Book book2 = new Library.Book("ISBN002", "Effective Java", "Joshua Bloch");
        lib.addBook(book1);
        lib.addBook(book2);

        // Register members
        Library.LibraryMember member1 = lib.new LibraryMember(1, "Alice");
        lib.registerMember(member1);

        // Normal operations
        lib.displayBooks();
        member1.borrowBook(book1);

        // Exception handling demo
        try {
            // Try to borrow a book that doesn’t exist
            Library.Book missingBook = lib.findBookByISBN("ISBN999");
            member1.borrowBook(missingBook);
        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Borrow attempt completed.");
        }

        try {
            // Try to find a non-existent member
            Library.LibraryMember ghost = lib.findMemberById(99);
            ghost.displayBorrowedBooks();
        } catch (MemberNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Generate report
        lib.generateReport();
    }
}
