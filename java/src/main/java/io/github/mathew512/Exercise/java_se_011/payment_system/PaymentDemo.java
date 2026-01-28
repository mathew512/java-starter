package io.github.mathew512.Exercise.java_se_011.payment_system;

public class PaymentDemo {

    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(150.00, "2024-10-01", "1234-5678-9012-3456", "12/26"),
            new PaypalPayment(75.50, "2024-10-02", "user@example.com"),
            new BankTransferPayment(200.00, "2024-10-03", "987654321")
        };

        for (Payment p : payments) {
            p.validateAmount();
            p.processPayment();
            System.out.println("Details: " + p.getPaymentDetails());
            System.out.println("---------------------------");
        }
    }
}
