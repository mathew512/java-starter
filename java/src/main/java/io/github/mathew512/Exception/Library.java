package io.github.mathew512.Exception;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Library {
    private String name;
    private String location;
    private List<LibraryMember> members;
    private static List<Book> books = new ArrayList<>();

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        this.members = new ArrayList<>();
    }

    // --- Static Nested Class: Book ---
    public static class Book {
        private String isbn;
        private String title;
        private String author;
        private boolean isAvailable;
        private LocalDate dueDate;

        public Book(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public void borrow() {
            if (isAvailable) {
                isAvailable = false;
                dueDate = LocalDate.now().plusDays(14);
            }
        }

        public void returnBook() {
            isAvailable = true;
            dueDate = null;
        }

        public boolean isAvailable() { return isAvailable; }
        public boolean isOverdue() { return !isAvailable && LocalDate.now().isAfter(dueDate); }

        public void displayInfo() {
            System.out.println("Book: " + title + " by " + author +
                               " (ISBN: " + isbn + ") - " +
                               (isAvailable ? "Available" : "Borrowed, Due: " + dueDate));
        }
    }

    // --- Inner Class: LibraryMember ---
    public class LibraryMember {
        private int memberId;
        private String name;
        private List<Book> borrowedBooks;

        public LibraryMember(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
            this.borrowedBooks = new ArrayList<>();
        }

        public void borrowBook(Book book) {
            if (book.isAvailable()) {
                book.borrow();
                borrowedBooks.add(book);
                System.out.println(name + " borrowed " + book.title);
            } else {
                System.out.println("Sorry, " + book.title + " is not available.");
            }
        }

        public void returnBook(Book book) {
            if (borrowedBooks.remove(book)) {
                book.returnBook();
                System.out.println(name + " returned " + book.title);
            } else {
                System.out.println(name + " does not have " + book.title);
            }
        }

        public void displayBorrowedBooks() {
            System.out.println("Member: " + name + " (ID: " + memberId + ")");
            for (Book book : borrowedBooks) {
                book.displayInfo();
            }
        }
    }

    // --- Library Management Methods ---
    public void addBook(Book book) throws DuplicateBookException {
        for (Book b : books) {
            if (b.isbn.equals(book.isbn)) {
                throw new DuplicateBookException(book.isbn);
            }
        }
        books.add(book);
    }

    public void registerMember(LibraryMember member) throws DuplicateMemberException {
        for (LibraryMember m : members) {
            if (m.memberId == member.memberId) {
                throw new DuplicateMemberException(member.memberId);
            }
        }
        members.add(member);
    }

    public void displayBooks() {
        System.out.println("Library: " + name + " at " + location);
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public Book findBookByISBN(String isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException(isbn);
    }

    public LibraryMember findMemberById(int id) throws MemberNotFoundException {
        for (LibraryMember member : members) {
            if (member.memberId == id) {
                return member;
            }
        }
        throw new MemberNotFoundException(id);
    }

    // --- NEW METHODS ADDED ---
    public void searchBooks(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Book book : books) {
            if (book.title.toLowerCase().contains(keyword.toLowerCase()) ||
                book.author.toLowerCase().contains(keyword.toLowerCase())) {
                book.displayInfo();
            }
        }
    }

    public void generateReport() {
        System.out.println("=== Library Report ===");
        System.out.println("Library: " + name + " at " + location);
        System.out.println("Total Books: " + books.size());
        long borrowedCount = books.stream().filter(b -> !b.isAvailable()).count();
        System.out.println("Borrowed Books: " + borrowedCount);
        System.out.println("Available Books: " + (books.size() - borrowedCount));
    }
}
