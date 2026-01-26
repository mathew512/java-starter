package io.github.mathew512.Exercise.java_se_010.payment_system;

public class CreditCardPayment extends Payment {

    private String cardNumber;
    private String expiryDate;

    public CreditCardPayment(double amount, String paymentDate, String cardNumber, String expiryDate) {
        //super(amount, paymentDate);
        super(amount, paymentDate);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " on " + paymentDate);
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card Payment: Card Number = " + cardNumber + ", Expiry Date = " + expiryDate;
    }
}