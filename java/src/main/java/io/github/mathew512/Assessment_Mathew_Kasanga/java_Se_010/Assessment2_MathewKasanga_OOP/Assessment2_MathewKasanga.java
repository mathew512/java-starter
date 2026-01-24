package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_010.Assessment2_MathewKasanga_OOP;

/*
 * Assessment 2: OOP Concepts Quiz
 * Student: Mathew Kasanga
 * Date: January 2026
 *
 * Solutions for Problems 1–5
 */

public class Assessment2_MathewKasanga {

    // ============================
    // Problem 1: Class Design and Encapsulation
    // ============================
    static class Book {
        private String title;
        private String author;
        private String isbn;
        private double price;
        private boolean isAvailable;

        public Book(String title, String author, String isbn, double price) {
            setTitle(title);
            setAuthor(author);
            setIsbn(isbn);
            setPrice(price);
            this.isAvailable = true;
        }

        public String getTitle() { return title; }
        public void setTitle(String title) {
            if (title == null || title.isEmpty()) throw new IllegalArgumentException("Title cannot be empty");
            this.title = title;
        }

        public String getAuthor() { return author; }
        public void setAuthor(String author) {
            if (author == null || author.isEmpty()) throw new IllegalArgumentException("Author cannot be empty");
            this.author = author;
        }

        public String getIsbn() { return isbn; }
        public void setIsbn(String isbn) {
            if (isbn.length() != 13) throw new IllegalArgumentException("ISBN must be 13 digits");
            this.isbn = isbn;
        }

        public double getPrice() { return price; }
        public void setPrice(double price) {
            if (price < 0) throw new IllegalArgumentException("Price must be non-negative");
            this.price = price;
        }

        public boolean isAvailable() { return isAvailable; }

        public void borrowBook() {
            if (!isAvailable) System.out.println("Book already borrowed.");
            else isAvailable = false;
        }

        public void returnBook() { isAvailable = true; }

        @Override
        public String toString() {
            return String.format("Book[%s by %s, ISBN=%s, Price=%.2f, Available=%b]",
                    title, author, isbn, price, isAvailable);
        }
    }

    // ============================
    // Problem 2: Inheritance Hierarchy
    // ============================
    static class Employee {
        private String name;
        private String id;
        private double salary;

        public Employee(String name, String id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public double getSalary() { return salary; }
        public double calculateBonus() { return salary * 0.05; }

        public void displayInfo() {
            System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
        }
    }

    static class Manager extends Employee {
        private String department;

        public Manager(String name, String id, double salary, String department) {
            super(name, id, salary);
            this.department = department;
        }

        @Override
        public double calculateBonus() { 
            return getSalary() * 0.15;
         } // 15%

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Department: " + department);
        }
    }

    static class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, String id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        @Override
        public double calculateBonus() { 
            return getSalary() * 0.10; 
        } // 10%

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Programming Language: " + programmingLanguage);
        }
    }

    // ============================
    // Problem 3: Method Overloading and Overriding
    // ============================
    static class Calculator {
        public int add(int a, int b) { return a + b; }
        public double add(double a, double b) { return a + b; }
        public int add(int a, int b, int c) { return a + b + c; }
        public String add(String a, String b) { return a + b; }
    }

    static class ScientificCalculator extends Calculator {
        @Override
        public int add(int a, int b) {
            System.out.println("ScientificCalculator: adding two integers");
            return super.add(a, b);
        }

        public double power(double base, double exponent) { return Math.pow(base, exponent); }
        public double squareRoot(double num) { return Math.sqrt(num); }
    }

    // ============================
    // Problem 4: Bank Account Inheritance
    // ============================
    static class BankAccount {
        private String accountNumber;
        private String accountHolder;
        protected double balance;

        public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        public void deposit(double amount) { balance += amount; }
        public void withdraw(double amount) {
            if (amount <= balance) balance -= amount;
            else System.out.println("Insufficient funds.");
        }
        public double getBalance() { return balance; }

        @Override
        public String toString() {
            return String.format("Account[%s, Holder=%s, Balance=%.2f]", accountNumber, accountHolder, balance);
        }
    }

    static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
            super(accountNumber, accountHolder, initialBalance);
            this.interestRate = interestRate;
        }

        @Override
        public void withdraw(double amount) {
            if (balance - amount >= 100) balance -= amount;
            else System.out.println("Minimum balance of $100 required.");
        }

        public void applyInterest() { balance += balance * interestRate; }
    }

    static class CheckingAccount extends BankAccount {
        private double overdraftLimit;

        public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
            super(accountNumber, accountHolder, initialBalance);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= balance + overdraftLimit) balance -= amount;
            else System.out.println("Overdraft limit exceeded.");
        }
    }

    // ============================
    // Problem 5: Conceptual Questions
    // ============================
    /*
     * 1. Method Overloading vs Overriding:
     *    - Overloading: same method name, different parameters, same class.
     *    - Overriding: child class redefines parent method with same signature.
     *
     * 2. Why fields should be private:
     *    - Ensures encapsulation, prevents invalid data, improves maintainability.
     *
     * 3. When to use 'super':
     *    - To call parent constructors or methods inside child classes.
     *
     * 4. Purpose of @Override:
     *    - Ensures correct overriding, prevents signature mistakes.
     *
     * 5. How encapsulation improves maintainability:
     *    - Centralizes validation logic, prevents misuse, makes future changes easier.
     */

    // ============================
    // Main Method (Demo)
    // ============================
    public static void main(String[] args) {
        System.out.println("=== Problem 1: Book Encapsulation ===");
        Book book = new Book("Java Basics", "Mathew Kasanga", "1234567890123", 50.0);
        System.out.println(book);

        System.out.println("\n=== Problem 2: Employee Inheritance ===");
        Manager mgr = new Manager("Alice", "M001", 5000, "IT");
        mgr.displayInfo();
        System.out.println("Bonus: " + mgr.calculateBonus());

        Developer dev = new Developer("Bob", "D001", 4000, "Java");
        dev.displayInfo();
        System.out.println("Bonus: " + dev.calculateBonus());

        System.out.println("\n=== Problem 3: Calculator Overloading/Overriding ===");
        ScientificCalculator calc = new ScientificCalculator();
        System.out.println("Add int: " + calc.add(2, 3));
        System.out.println("Add double: " + calc.add(2.5, 3.5));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));
        System.out.println("Add strings: " + calc.add("Hello", "World"));
        System.out.println("Power: " + calc.power(2, 3));
        System.out.println("SquareRoot: " + calc.squareRoot(16));

        System.out.println("\n=== Problem 4: Bank Account Inheritance ===");
        SavingsAccount sa = new SavingsAccount("S001", "Mathew", 1000, 0.05);
        sa.withdraw(950); // should fail due to min balance
        sa.applyInterest();
        System.out.println(sa);

        CheckingAccount ca = new CheckingAccount("C001", "Kasanga", 500, 200);
        ca.withdraw(600); // overdraft allowed
        System.out.println(ca);

        
        System.out.println("\n=== Problem 5: Conceptual Questions ===");
        System.out.println("1. Method Overloading vs Overriding:");
        System.out.println("   - Overloading: same method name, different parameters, same class.");
        System.out.println("   - Overriding: child class redefines parent method with same signature.");

        System.out.println("2. Why fields should be private:");
        System.out.println("   - Ensures encapsulation, prevents invalid data, improves maintainability.");

        System.out.println("3. When to use 'super':");
        System.out.println("   - To call parent constructors or methods inside child classes.");

        System.out.println("4. Purpose of @Override:");
        System.out.println("   - Ensures correct overriding, prevents signature mistakes.");

        System.out.println("5. How encapsulation improves maintainability:");
        System.out.println("   - Centralizes validation logic, prevents misuse, makes future changes easier.");
    }
}

