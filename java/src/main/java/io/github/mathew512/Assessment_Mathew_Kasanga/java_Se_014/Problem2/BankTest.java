package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_014.Problem2;

public class BankTest {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
            BankAccount account2 = new BankAccount("ACC002", "Bob", 500);

            account1.deposit(-100); // InvalidTransactionException
            account1.withdraw(2000); // InsufficientFundsException
            account1.transfer("INVALID", 100); // AccountNotFoundException

        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed");
        }
    }
}
