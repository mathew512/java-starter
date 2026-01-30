package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem2;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Registry of accounts
    private static Map<String, BankAccount> accounts = new HashMap<>();

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (balance < 0) {
            throw new InvalidTransactionException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        accounts.put(accountNumber, this);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println(accountHolder + " deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println(accountHolder + " withdrew " + amount + ". New balance: " + balance);
    }

    public void transfer(String toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Transfer amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for transfer. Current balance: " + balance);
        }
        BankAccount recipient = accounts.get(toAccount);
        if (recipient == null) {
            throw new AccountNotFoundException("Account " + toAccount + " not found");
        }
        balance -= amount;
        recipient.balance += amount;
        System.out.println("Transferred " + amount + " from " + accountHolder + " to " + recipient.accountHolder);
    }
}
