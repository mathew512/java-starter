package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem3;

public class Books extends Product {
    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name, double price, int stockQuantity, String author, String publisher, String isbn) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }

    @Override
    public String getProductType() {
        return "Books";
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Author: " + author + ", Publisher: " + publisher + ", ISBN: " + isbn);
    }
}
