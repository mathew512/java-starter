package io.github.mathew512.Assessment_Mathew_Kasanga.java_Se_010.Assessment2_MathewKasanga_BankSystem;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n=== Bank Account System ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Apply Interest (Savings)");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Account number: ");
                        String sAcc = sc.nextLine();
                        System.out.print("Holder name: ");
                        String sHolder = sc.nextLine();
                        System.out.print("Initial balance: ");
                        double sBal = sc.nextDouble();
                        System.out.print("Interest rate: ");
                        double rate = sc.nextDouble();
                        bank.addAccount(new SavingsAccount(sAcc, sHolder, sBal, rate));
                        System.out.println("Savings account created.");
                        break;

                    case 2:
                        System.out.print("Account number: ");
                        String cAcc = sc.nextLine();
                        System.out.print("Holder name: ");
                        String cHolder = sc.nextLine();
                        System.out.print("Initial balance: ");
                        double cBal = sc.nextDouble();
                        System.out.print("Overdraft limit: ");
                        double limit = sc.nextDouble();
                        bank.addAccount(new CheckingAccount(cAcc, cHolder, cBal, limit));
                        System.out.println("Checking account created.");
                        break;

                    case 3:
                        System.out.print("Account number: ");
                        String dAcc = sc.nextLine();
                        System.out.print("Deposit amount: ");
                        double dAmt = sc.nextDouble();
                        bank.findAccount(dAcc).deposit(dAmt);
                        System.out.println("Deposit successful.");
                        break;

                    case 4:
                        System.out.print("Account number: ");
                        String wAcc = sc.nextLine();
                        System.out.print("Withdraw amount: ");
                        double wAmt = sc.nextDouble();
                        bank.findAccount(wAcc).withdraw(wAmt);
                        System.out.println("Withdrawal successful.");
                        break;

                    case 5:
                        System.out.print("Account number: ");
                        String bAcc = sc.nextLine();
                        System.out.println("Balance: " + bank.findAccount(bAcc).getBalance());
                        break;

                    case 6:
                        bank.applyInterestToSavingsAccounts();
                        System.out.println("Interest applied to all savings accounts.");
                        break;

                    case 7:
                        bank.displayAllAccounts();
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
