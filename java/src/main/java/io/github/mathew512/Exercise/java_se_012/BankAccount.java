package io.github.mathew512.Exercise.java_se_012;

public class BankAccount {
    
    // Static members (shared across all accounts)
    private static int totalAccounts = 0;          // Counter for all accounts
    private static double interestRate = 0.05;     // Shared interest rate
    public static final String BANK_NAME = "Tech Bank"; // Constant bank name

    // Instance members (unique to each account)
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        totalAccounts++; // Increment shared counter whenever a new account is created
    }

    // Instance methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    // Getters
    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    // Static methods
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void setInterestRate(double newRate) {
        if (newRate > 0) {
            interestRate = newRate;
        }
    }

    public static double getInterestRate() {
        return interestRate;
    }
}
