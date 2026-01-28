package io.github.mathew512.Exercise.java_se_011.payment_system;

public class BankTransferPayment extends Payment {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(double amount, String paymentDate, String bankAccountNumber) {
        super(amount, paymentDate);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void processPayment() {
        // Simulate processing bank transfer payment
        System.out.println("Processing bank transfer payment of $" + amount + " on " + paymentDate + " to account: " + accountNumber);
    }

    @Override
    public String getPaymentDetails() {
        return "Bank Transfer Payment - Amount: $" + amount + ", Date: " + paymentDate + ", Account Number: " + bankName;
    }
    
}
