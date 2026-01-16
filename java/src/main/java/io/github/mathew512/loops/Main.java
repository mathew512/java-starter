package io.github.mathew512.loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        forLoops();
        whileLoops();
        passwordValidation();
        passwordChecker();

        int sum=0;
        int count=0;
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to sum (0 to stop):");
        while(true){
            number = scanner.nextInt();
            if(number==0){
                break;// exit the loop
            }
            if(number<0){
                continue; //skip negative numbers
            }
            sum +=number;
            count++;
        }
        if(number>0){
            double average =(double) sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Count: " + count);
            System.out.println("Average: " + average);
        }
        else{
            System.out.println("No valid numbers were entered.");
        }
        scanner.close();
    }

    static void forLoops(){
        for (int i = 1; i <= 5; i++) {
         System.out.println("i: " + i);
         }

    }
    static void whileLoops(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean showBuses=true;

        while(showBuses){
            System.out.println("====Buses====");
            System.out.println("1. Guardian");
            System.out.println("2. Tahmeed");
            System.out.println("3. ENA Coach");
            System.out.println("4. Mash Poa");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice");

            choice =scanner.nextInt();
            System.out.println("You selected option" + choice);
            if(choice == 5){
                showBuses=false;
            
                System.out.println("Exit:" +choice);
            }
        }
    
    }
    static void passwordValidation(){
        Scanner scanner = new Scanner(System.in);
        String password="";
        boolean validPassword=false;

        while(!validPassword){
            System.out.println("Enter your password (at least 8 characters):");
            password =scanner.nextLine();

            if(password.length()>=8){
                validPassword=true;
                System.out.println("Password accepted.");
            }else{
                System.out.println("Password too short. Please try again.");
            }
        }
        
    }

    static void passwordChecker(){
        String password="secret123";
        String inputPassword="";
        Scanner scanner = new Scanner(System.in);

        while(!inputPassword.equals(password)){
            System.out.println("Enter your password:");
            inputPassword =scanner.nextLine();

            if(inputPassword.equals(password)){
                System.out.println("Incorrect Password. Try again.");
            }
        }
        System.out.println("Access Granted.");
        scanner.close();
    }
}