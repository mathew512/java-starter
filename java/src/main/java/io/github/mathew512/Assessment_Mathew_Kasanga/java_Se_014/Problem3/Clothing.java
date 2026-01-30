package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem3;

public class Clothing extends Product {
    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price, int stockQuantity, String size, String material, String color) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20; // 20% discount
    }

    @Override
    public String getProductType() {
        return "Clothing";
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: " + size + ", Material: " + material + ", Color: " + color);
    }
}
