package io.github.mathew512.Exercise.java_se_017;

import java.util.*;

class Product {
    private String category, name;
    private double price;
    public Product(String category, String name, double price) {
        this.category = category; this.name = name; this.price = price;
    }
    public String getCategory() { return category; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    @Override
    public String toString() {
        return category + " - " + name + " ($" + price + ")";
    }
}

class Employee {
    private String department, name;
    private double salary;
    public Employee(String department, String name, double salary) {
        this.department = department; this.name = name; this.salary = salary;
    }
    public String getDepartment() { return department; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    @Override
    public String toString() {
        return department + " - " + name + " ($" + salary + ")";
    }
}

class Book {
    private String title, author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title; this.author = author; this.year = year;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}

public class SortingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample data
        List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("Electronics", "Laptop", 1200),
            new Product("Stationery", "Pen", 2),
            new Product("Furniture", "Chair", 150)
        ));

        List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("IT", "Alice", 5000),
            new Employee("HR", "Bob", 4500),
            new Employee("Finance", "Charlie", 6000)
        ));

        List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("Java Basics", "Smith", 2020),
            new Book("Advanced Java", "Jones", 2022),
            new Book("Algorithms", "Brown", 2019)
        ));

        while (true) {
            System.out.println("\n=== Sorting System Menu ===");
            System.out.println("1. Sort Products");
            System.out.println("2. Sort Employees");
            System.out.println("3. Sort Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Sort Products by:");
                    System.out.println("1. Name");
                    System.out.println("2. Price");
                    System.out.println("3. Category then Price");
                    int pChoice = scanner.nextInt();
                    switch (pChoice) {
                        case 1:
                            products.sort(Comparator.comparing(Product::getName));
                            break;
                        case 2:
                            products.sort(Comparator.comparing(Product::getPrice));
                            break;
                        case 3:
                            products.sort(
                                Comparator.comparing(Product::getCategory)
                                          .thenComparing(Product::getPrice));
                            break;
                    }
                    products.forEach(System.out::println);
                    break;
                }
                case 2: {
                    System.out.println("Sort Employees by:");
                    System.out.println("1. Salary (descending)");
                    System.out.println("2. Department then Name");
                    int eChoice = scanner.nextInt();
                    switch (eChoice) {
                        case 1:
                            employees.sort(
                                Comparator.comparing(Employee::getSalary).reversed());
                            break;
                        case 2:
                            employees.sort(
                                Comparator.comparing(Employee::getDepartment)
                                          .thenComparing(Employee::getName));
                            break;
                    }
                    employees.forEach(System.out::println);
                    break;
                }
                case 3: {
                    System.out.println("Sort Books by:");
                    System.out.println("1. Title");
                    System.out.println("2. Year (newest first)");
                    System.out.println("3. Author then Title");
                    int bChoice = scanner.nextInt();
                    switch (bChoice) {
                        case 1:
                            books.sort(Comparator.comparing(Book::getTitle));
                            break;
                        case 2:
                            books.sort(Comparator.comparing(Book::getYear).reversed());
                            break;
                        case 3:
                            books.sort(
                                Comparator.comparing(Book::getAuthor)
                                          .thenComparing(Book::getTitle));
                            break;
                    }
                    books.forEach(System.out::println);
                    break;
                }
                case 4: {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
