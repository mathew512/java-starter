package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_010.Assessment2_MathewKasanga_BankSystem;

public class BankApplication {
    public static void main(String[] args) {
        System.out.println("=== Bank System with Bonus Features ===");

        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount("S001", "Mathew", 1000, 0.05);
        CheckingAccount checking = new CheckingAccount("C001", "Kasanga", 500, 300);

        bank.addAccount(savings);
        bank.addAccount(checking);

        bank.displayAccounts();

        try {
            bank.transfer("S001", "C001", 200);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        bank.displayAccounts();

        // Show transaction history
        System.out.println("\nTransaction history for S001:");
        for (String t : savings.getTransactions()) {
            System.out.println(" - " + t);
        }

        System.out.println("\nTransaction history for C001:");
        for (String t : checking.getTransactions()) {
            System.out.println(" - " + t);
        }

        // Save accounts to file
        try {
            bank.saveAccounts("accounts.dat");
            System.out.println("\nAccounts saved to file.");
        } catch (Exception e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }
    }
}
