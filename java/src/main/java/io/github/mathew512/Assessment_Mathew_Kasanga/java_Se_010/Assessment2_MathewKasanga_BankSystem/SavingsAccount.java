package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_010.Assessment2_MathewKasanga_BankSystem;

import io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_010.Assessment2_MathewKasanga_BankSystem.exceptions.MinimumBalanceException;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws MinimumBalanceException {
        if (balance - amount < 100) {
            throw new MinimumBalanceException("Minimum balance of $100 required");
        }
        balance -= amount;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    @Override
    public String toString(){
        return String.format("SavingsAccount[%s, Interest = %.2f%%]",super.toString(), interestRate* 100);
    }
}
