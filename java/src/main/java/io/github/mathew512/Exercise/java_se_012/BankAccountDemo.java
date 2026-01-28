package io.github.mathew512.Exercise.java_se_012;

public class BankAccountDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to " + BankAccount.BANK_NAME);

        // Create accounts
        BankAccount acc1 = new BankAccount(1001, "Alice", 500.0);
        BankAccount acc2 = new BankAccount(1002, "Bob", 1000.0);

        // Deposit and withdraw
        acc1.deposit(200);
        acc2.withdraw(300);

        // Apply interest
        acc1.applyInterest();
        acc2.applyInterest();

        // Display balances
        System.out.println(acc1.getAccountHolder() + " Balance: $" + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + " Balance: $" + acc2.getBalance());

        // Static members
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Current Interest Rate: " + BankAccount.getInterestRate());
    }
}
/* -  Static counter (totalAccounts) increments for every new account.

 - Static constant (BANK_NAME) is shared and immutable.

 - Shared interest rate can be updated for all accounts.

 - Encapsulation ensures deposits/withdrawals are safe. */