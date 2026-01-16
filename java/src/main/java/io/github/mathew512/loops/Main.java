package io.github.mathew512.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        whileLoops();
        doWhileLoops();
    }
    static void whileLoops(){

        // show the menu
        // *544//#
        // 1. Tea
         // 2. Mandazi
         // 3. Coffee
         // 4. Exit

         Scanner scanner=new Scanner(System.in);
         int choice;

         boolean showMenu = true;

         while (showMenu){
                System.out.println("Menu:");
                System.out.println("1. Tea");
                System.out.println("2. Mandazi");
                System.out.println("3. Coffee");
                System.out.println("4. Exit");
                System.out.print("Enter your choice:");
    
                choice=scanner.nextInt();
                System.out.println("You selected option:"+choice);
    
                if(choice==4){
                    showMenu=false;
                }else{
                    System.out.println("You selected option:"+choice);
                }
         }
            
         System.out.println("=====whileLoops=====");

         System.out.println("Menu:");
         System.out.println("1. Tea");
         System.out.println("2. Mandazi");
         System.out.println("3. Coffee");
         System.out.println("4. Exit");
         System.out.print("Enter your choice:");

         choice=scanner.nextInt();
         System.out.println("You selected option:"+choice);
        int i=1;
        while(i<=5){
            System.out.println("i:"+i);
            i++;
        }

        scanner.close();
    }
    static void doWhileLoops(){
        // show the menu
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.print("Enter your choice:");

        choice=scanner.nextInt();
        System.out.println("You selected option:"+choice);
        int j=1;
        do{
        System.out.println("=====doWhileLoops=====");
        System.out.println("Menu:");
        System.out.println("1. Tea");
        System.out.println("2. Mandazi");
        System.out.println("3. Coffee");
        System.out.println("4. Exit");
            j++;
        }while(j<=5);
        scanner.close();

    }
}
