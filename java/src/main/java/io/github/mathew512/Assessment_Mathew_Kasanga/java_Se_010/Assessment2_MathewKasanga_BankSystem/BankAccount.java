package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_010.Assessment2_MathewKasanga_BankSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount implements Serializable {
    private String accountNumber;
    private String accountHolder;
    protected double balance; // protected for child access
    private List<String> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        recordTransaction("Account created with balance: " + balance);
    }

    public String getAccountNumber() { 
        return accountNumber;
    }
    public String getAccountHolder() { 
        return accountHolder; 
    }
    public double getBalance() { 
        return balance; 
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
        recordTransaction("Deposited: " + amount);
    }

    public abstract void withdraw(double amount) throws Exception;

    public void recordTransaction(String detail) {
        transactions.add(detail);
    }

    public List<String> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return String.format("Account[%s, Holder=%s, Balance=%.2f]", accountNumber, accountHolder, balance);
    }
}
