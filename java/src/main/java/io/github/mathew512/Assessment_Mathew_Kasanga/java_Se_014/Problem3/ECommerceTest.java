package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem3;

public class ECommerceTest {
    public static void main(String[] args) {
        try {
            Product laptop = new Electronics("E001", "Laptop", -999.99, 10, 24, 65); // Invalid price
            laptop.reduceStock(15); // More than available stock
        } catch (InvalidProductException e) {
            System.out.println("Invalid product error: " + e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println("Stock error: " + e.getMessage());
        }

        try {
            Product tshirt = new Clothing("C001", "T-Shirt", 25.0, 5, "M", "Cotton", "Blue");
            tshirt.displayProductInfo();
            System.out.println("Discount: " + tshirt.calculateDiscount());
            tshirt.reduceStock(2);
        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Product book = new Books("B001", "Java Basics", 50.0, 3, "John Doe", "TechPress", "123-4567890123");
            book.displayProductInfo();
            System.out.println("Discount: " + book.calculateDiscount());
            book.reduceStock(4); // should throw OutOfStockException
        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
