package io.github.Userinput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double balance = 0.0; 

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter deposit amount: "); 
       double depositAmount = scanner.nextDouble(); 

       System.out.print("Enter withdraw amount: ");
       int withdrawAmount = scanner.nextInt(); 

        scanner.nextLine(); // Consume leftover newline

        System.out.print("Enter your name: ");   
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        System.out.println("Customer name: " + name);
        System.out.println("Customer age: " + age);

        System.out.println("Deposit amount: " + depositAmount);
        System.out.println("Withdraw amount: " + withdrawAmount); 

        scanner.close();
    }
}
