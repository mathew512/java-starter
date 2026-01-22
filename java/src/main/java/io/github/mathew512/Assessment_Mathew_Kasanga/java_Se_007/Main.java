package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_008;

import io.github.mathew512.oop.BankAccount;

public class Main {
    public static void main(String[] args) {
      
        System.out.println("========Bank Account Operations========");

        // Create BankAccount objects and perform operations
        BankAccount account1 = new BankAccount("123456", "Alice", 1000.0);
        account1.deposit(500.0);
        account1.displayAccountInfo();

        // Withdraw from account
        account1.withdraw(200.0);
        account1.displayAccountInfo();
        BankAccount account2 = new BankAccount("654321", "Bob", 1500.0);
        account2.deposit(300.0);
        account2.displayAccountInfo();
        account2.withdraw(100.0);
        account2.displayAccountInfo();  
    }
}
