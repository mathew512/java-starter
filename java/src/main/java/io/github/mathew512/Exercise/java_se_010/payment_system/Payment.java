package io.github.mathew512.Exercise.java_se_010.payment_system;

public abstract class Payment {
    protected double amount;
    protected String paymentDate;

    public Payment(double amount, String paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    //Concrete method
    public void validateAmount() {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
    }

    //Abstract method
    public abstract void processPayment();
    public abstract String getPaymentDetails();
    
}
