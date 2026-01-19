package io.github.mathew512.Assessment;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Assessment1_Mathew {  

    public static void main(String[] args) {
        System.out.println(" -------------------" );
        System.out.println("|     Problem 1     |" );
        System.out.println(" -------------------" );
        // declare the initial variables 
        int a = 15;
        int b = 4;
        int c = 7;
        // perform arithmetic operations
        int sum = a + b + c;
        int product = a * b * c;
        int expressionResult = (a + b) * c;
        int remainder = a % b;

        // print the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Expression Result: " + expressionResult);
        System.out.println("Remainder of a divided by b: " + remainder);

        System.out.println(" --------------------" );
        System.out.println("|      Problem 2     |" );
        System.out.println(" --------------------" );

        Scanner scanner = new Scanner(System.in);
        // prompt user for score
        System.out.print("Enter Student score (0-100): ");
        int score = scanner.nextInt();

        // validate input and determine grade
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        System.out.println(" --------------------" );
        System.out.println("|      Problem 3     |" );
        System.out.println(" --------------------" );

        //loop from 1 to 20
        for (int i=1; i<=20; i++){
            // check even or odd
            if (i % 2 == 0){
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
            //check if multiple of 5
            if (i % 5 == 0){
                System.out.println(i + " is a multiple of 5");
            }

            System.out.println(); // print a blank line for better readability
        }

        System.out.println(" ------------------" );
        System.out.println("|      Problem 4   |" );
        System.out.println(" ------------------" );

        int number;
        long factorial = 1;

        //step 1: Ask user for input
        System.out.print("Enter a positive integer to calculate its factorial: ");
        number = scanner.nextInt();

        //step 2: validate input using while loop
        while (number<=0){
            System.out.print("Invalid input. Please enter a positive integer: ");
            number = scanner.nextInt();
        }
        //step 3: calculate factorial using for loop
        for (int j=1; j<=number; j++){
            factorial *= j;
        }
        //step 4: display the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        System.out.println(" -------------------------" );
        System.out.println("|        Problem 5        |" );
        System.out.println(" -------------------------" );

        int rows = 5;
        //outer loop for each row
        for (int i = 1; i <= rows; i++) {
            //inner loop for spaces
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); // move to next line after each row
        }

        System.out.println(); // print a blank line for better readability
        System.out.println("\n===================================");
        System.out.println("      SIMPLE CONSOLE CALCULATOR     ");
        System.out.println("===================================\n");

        scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
        // Display menu
        System.out.println("+-----------------------------------+");
        System.out.println("|           Calculator Menu         |");
        System.out.println("+-----------------------------------+");
        System.out.println("|1. Addition                        |");
        System.out.println("|2. Subtraction                     |");
        System.out.println("|3. Multiplication                  |");
        System.out.println("|4. Division                        |");
        System.out.println("|5. Exit                            |");
        System.out.print("Enter your choice (1-5): ");

        //Handle non-numeric menu input
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
            scanner.next(); // clear invalid input
            continue;
        }

        int choice = scanner.nextInt();

        // Exit condition
        if (choice == 5) {
            running = false;
            System.out.println("Exiting the calculator. Goodbye!");
            continue;
        }

        // Validate menu choice
        if (choice < 1 || choice > 5) {
            System.out.println("Invalid choice. Please select a number between 1 and 5.");
            continue;
        }



        // Get two numbers from user with error handling
        double num1=0 , num2=0;
        try{
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter numeric values.");
            scanner.next(); // clear invalid input
            continue;
        }
        double result;

        // Perform the chosen operation
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
        }
        }
     scanner.close();
    }
        
}