package com.example.bankapplication;

import java.util.UUID;

public class HdfcBank implements BankInterface{

    private int balance;
    private String  accountNo;

    public HdfcBank(int balance, String password, String name) {
        this.accountNo= UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    private String password;

    public String name;
    public   static double  rateOfInterest;


    @Override
    public int checkBalance(String password) {
        if(password==this.password){
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance= balance+money;
        String message=  money+"has been added to bank account "+accountNo;

        return message;

    }

    @Override
    public String withdrawMoney(int money, String password) {
        if(password==this.password){
            if(money>balance){
                return "Insufficient balance";

            }else{
                balance= balance-money;
                return"Money withdrawn succesfully";

            }
        }else{
            return "wrong password";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        // this.password means the current password for the account;
        if(oldPassword==this.password){
            this.password= newPassword;
            return "Password changed successfully";

        }else{
            return "Wrong password";
        }

    }

    @Override
    public double calculateTotalInterest(int year) {
        double interest= balance*rateOfInterest*year/100;
        return interest;
    }
}
