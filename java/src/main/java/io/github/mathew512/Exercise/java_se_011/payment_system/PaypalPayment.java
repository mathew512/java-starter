package io.github.mathew512.Exercise.java_se_011.payment_system;

public class PaypalPayment extends Payment {
    private String email;

    public PaypalPayment(double amount, String paymentDate, String email) {
        super(amount, paymentDate);
        this.email = email;
    }

    @Override
    public void processPayment() {
        // Simulate processing PayPal payment
        System.out.println("Processing PayPal payment of $" + amount + " on " + paymentDate + " for PayPal ID: " + email);
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Payment - Amount: $" + amount + ", Date: " + paymentDate + ", PayPal ID: " + email;
    }
    
}
