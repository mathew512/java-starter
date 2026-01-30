package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem3;

public class Electronics extends Product {
    private int warrantyPeriod; // months
    private int powerConsumption; // watts

    public Electronics(String productId, String name, double price, int stockQuantity, int warrantyPeriod, int powerConsumption) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.warrantyPeriod = warrantyPeriod;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    @Override
    public String getProductType() {
        return "Electronics";
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Warranty: " + warrantyPeriod + " months, Power: " + powerConsumption + "W");
    }
}
