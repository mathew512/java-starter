package io.github.mathew512.Exercise.java_se_017;

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Java Basics", "Smith", 2020),
            new Book("Advanced Java", "Jones", 2022),
            new Book("Algorithms", "Brown", 2019)
        );
        // Sort books by title then author using Comparator
        books.sort(
            Comparator.comparing(Book::getTitle)
                      .thenComparing(Book::getAuthor)
        );
        System.out.println("Books:");
        books.forEach(System.out::println);

        List<Product> products = Arrays.asList(
            new Product("budget", "Pen", 1.5),
            new Product("premium", "Laptop", 1200),
            new Product("standard", "Chair", 150)
        );
        // Sort products by category, then price, then name using Comparator
        products.sort(
            Comparator.comparing(Product::getCategory)
                      .thenComparing(Product::getPrice)
                      .thenComparing(Product::getName)
        );
        System.out.println("\nProducts:");
        products.forEach(System.out::println);

        List<Employee> employees = Arrays.asList(
            new Employee("IT", "Alice", 5000),
            new Employee("HR", "Bob", 4500),
            new Employee("Finance", "Charlie", 6000)
        );
        // Sort employees by department, then salary, then name using Comparator
        employees.sort(
            Comparator.comparing(Employee::getDepartment)
                      .thenComparing(Employee::getSalary)
                      .thenComparing(Employee::getName)
        );
        System.out.println("\nEmployees:");
        employees.forEach(System.out::println);
    }
}
