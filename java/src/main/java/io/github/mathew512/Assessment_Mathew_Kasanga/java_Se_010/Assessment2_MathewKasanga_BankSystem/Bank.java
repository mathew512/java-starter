package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_010.Assessment2_MathewKasanga_BankSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {

        //Ensure unique account numbers
        for(BankAccount acc: accounts){
            if(acc.getAccountNumber().equals(account.getAccountNumber())){
                throw new IllegalArgumentException("Duplicate account number");
            }
        }
        accounts.add(account);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) return acc;
        }
        return null;
    }

    public void displayAccounts() {
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }
    }

    public double calculateTotalBalance(){
        double total=0;
        for(BankAccount acc : accounts) total +=acc.getBalance();
        return total;
    }

    public void applyInterestToSavingsAccounts(){
        for(BankAccount acc : accounts){
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).applyInterest();
                
            }
        }
    }

    //  Bonus Feature: Transfer between accounts
    public void transfer(String fromAcc, String toAcc, double amount) throws Exception {
        BankAccount from = findAccount(fromAcc);
        BankAccount to = findAccount(toAcc);
        if (from == null || to == null) throw new IllegalArgumentException("Account not found");

        from.withdraw(amount);
        to.deposit(amount);

        from.recordTransaction("Transferred " + amount + " to " + toAcc);
        to.recordTransaction("Received " + amount + " from " + fromAcc);
    }

    //  Bonus Feature: Serialization (save accounts)
    public void saveAccounts(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(accounts);
        }
    }

    //  Bonus Feature: Deserialization (load accounts)
    @SuppressWarnings("unchecked")
    public void loadAccounts(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            accounts = (List<BankAccount>) in.readObject();
        }
    }
    // Add this at the bottom of Bank.java
    public void displayAllAccounts() {
        displayAccounts();
    }

}
