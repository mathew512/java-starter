package io.github.mathew512.Exercise.java_se_017;

import java.util.*;

public class AdvancedSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("IT", "Alice", 5000),
            new Employee("HR", "Bob", 4500),
            new Employee("Finance", "Charlie", 6000)
        );

        // Salary descending, then name ascending
        employees.sort(
            Comparator.comparing(Employee::getSalary).reversed()
                      .thenComparing(Employee::getName)

        );
        employees.forEach(System.out::println);

        List<Product> products = Arrays.asList(
            new Product("budget", "Pen", 1.5),
            new Product("premium", "Laptop", 1200),
            new Product("standard", "Chair", 150)
        );

        // Price category, then rating
        products.sort(
            Comparator.comparing(Product::getCategory)
                      .thenComparing(Product::getPrice)
        );
        products.forEach(System.out::println);

        List<Book> books = Arrays.asList(
            new Book("Java Basics", "Smith", 2020),
            new Book("Advanced Java", "Jones", 2022)
        );

        // Publication year (newest first), then title
        books.sort(
            Comparator.comparing(Book::getYear).reversed()
                      .thenComparing(Book::getTitle)
        );
        books.forEach(System.out::println);
    }
}

