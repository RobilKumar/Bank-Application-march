package com.example.bankapplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        SBI.rateOfInterest= 7;
        HdfcBank.rateOfInterest=6;
        SBI account1= new SBI(100000,"123", "Dev");

        SBI account2= new SBI(200000,"456", "Rakshit");

        HdfcBank account3= new HdfcBank(150000, "789", "Mehran");
         // wrong password
          int balance= account1.checkBalance("124");
          System.out.println(balance);
         // right password
          int balanceCheck= account1.checkBalance("123");
          System.out.println("the balance for account1 is "+balanceCheck);

         // adding money
          String bankMessage= account2.addMoney(50000);
          System.out.println(bankMessage);
          // withdrawing money with wrong password
          String message = account3.withdrawMoney(10000,"123");
          System.out.println(message);
          // withdrawing money with right password
          String message1= account3.withdrawMoney(10000,"789");
          System.out.println(message1);

         // sbi account
          double interest = account1.calculateTotalInterest(20);
          System.out.println("the total interest you will get"+ interest);
          // hdfc account
          double interest1= account3.calculateTotalInterest(20);
           System.out.println("the total interest you will get"+ interest1);

          System.out.println("make it dynamic");

          System.out.println("Welcome to sbhi plese enter the details to create account");

        System.out.println("Enter name: ");

        Scanner sc= new Scanner(System.in);
        String name= sc.next();

        System.out.println("Enter balance :");
        int initialBalance= sc.nextInt();
        System.out.println("Enter password");
        String password= sc.next();


        SBI sbiAccount= new SBI(initialBalance,password,name);
        System.out.println("Enter money and password to add");

    }
}
