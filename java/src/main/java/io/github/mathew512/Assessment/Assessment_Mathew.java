public class Assessment_Mathew {  

    import java.util.Scanner;

    public static void main(String[] args) {
        System.out.println("====Problem 1====" );
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

        System.out.println("====Problem 2====" );

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

        System.out.println("====Problem 3====" );

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

        System.out.println("====Problem 4====" );

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

        System.out.println("====Problem 5====" );

        int rows = 5;
        //outer loop for each row
        for (int i = 1; i <= rows; i++) {
            //inner loop for spaces
            for (int j = 1; j<=1; j++){
                System.out.print("*");
            }
    }

    System.out.println(); // print a blank line for better readability
    System.out.println("====Console Calculator====" );
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
        // Display menu
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");

        int choice = scanner.nextInt();

        // Exit condition
        if (choice == 5) {
            running = false;
            System.out.println("Exiting the calculator. Goodbye!");
            continue;
        }

        // Get two numbers from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

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
        //ask if user wants to perform another calculation
        System.out.print("Do you want to perform another calculation? (yes/no): ");
        Char again = scanner.next().charAt(0);
        if (again != 'y' && again != 'Y') {
            running = false;
            System.out.println("Exiting the calculator. Goodbye!");
        }
    }
    scanner.close();
}