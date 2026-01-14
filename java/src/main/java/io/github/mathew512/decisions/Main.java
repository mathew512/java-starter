package io.github.mathew512.decisions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int minAge = 18;
        gradingSystem();
        //id registration
        
        System.out.print("Enter your age: ");
        //scanner.nextLine(); //consume newline
        int age=scanner.nextInt();
        scanner.nextLine(); //consume newline

        if (age>=minAge){
            //proceed with registration
             //consume newline
            
            System.out.println("Enter your name: ");
            String name=scanner.nextLine();

            System.out.print("Enter your Location:");
            String location = scanner.nextLine();

            //proceed other processing

            System.out.println("You are now registered:" +name + " from " + location);

            System.out.println("You are eligible for ID registration");
        } 
        else{
            System.out.println("You are not eligible for ID registration");
        }
        System.out.println("After registration check");
       
        scanner.close();
    }
    public static void gradingSystem(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if(score>=70){
            System.out.println("You have passed");
        } else if (score>=50) {
            System.out.println("You have to retake the exam");
        } else {
            System.out.println("You have failed");
        }
    }
    private static void identification(){

    }
    private static void switchSystem(){

        //order processing PLACED, IN PROGRESS, SHIPMENT
        String orderStatus="PLACED";
        switch (orderStatus){
            case "PLACED":
                System.out.println("Your order has been placed");
                break;
            case "IN PROGRESS":
                System.out.println("Your order is being processed");
                break;
            case "SHIPMENT":
                System.out.println("Your order is out for delivery");
                break;
            default:
                System.out.println("Unknown order status");
                break;
        }
        
        String response="01";
        switch (response){
            case "1":
            case "01":
                System.out.println("Do not Honor");
                break;
            case "2":
            case "09":
                System.out.println("No Merchant");
                break;
            default:
                System.out.println("Invalid option selected");
                break;
        }

    }
}
