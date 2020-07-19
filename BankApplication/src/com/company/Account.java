package com.company;

import java.util.Scanner;

public class Account {
    private double balance;
    private String name,emailAddress,mobileNumber;
    private Scanner scan=new Scanner(System.in);// Scanner input

    public Account(String name, String emailAddress, String mobileNumber) {
        //New account constructor that sets initial balance to 1000
        this.balance = 1000.00;
        this.name = name;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
    }


    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setBalance() {
        System.out.println("Enter initial account balance");
        balance=scan.nextDouble();
        balance=Math.round(this.balance*100)/100.0;
        this.balance = balance;
        scan.close();
    }

    public void setName() {
        System.out.println("Enter account client name");
        String name=scan.nextLine();
        this.name = name;
        scan.close();
    }

    public void setEmailAddress() {
        System.out.println("Enter account email address");
        String emailAddress=scan.nextLine();
        this.emailAddress = emailAddress;
        scan.close();
    }

    public void setMobileNumber() {
        System.out.println("Enter mobile number");
        String mobileNumber=scan.nextLine();
        this.mobileNumber = mobileNumber;
        scan.close();
    }
    public void deposit(){   //adds to balance
        System.out.println("Please enter amount to be deposited");
        double amount=scan.nextDouble();
        this.balance=Math.round((this.balance+amount)*100)/100.0;
        scan.close();
    }
    public void withdraw(){ //Withdraw subtracts the required amount from account and displays insufficient if not enough
        System.out.println("Please enter amount to be withdrawn");
        double amount=scan.nextDouble();
        System.out.println("Amount is "+amount);
        if(amount > this.balance){
            System.out.println(amount+" cannot be withdrawn due to insufficient funds");
        }else{
            this.balance=Math.round((this.balance-amount)*100)/100.0;
            System.out.println(amount+ " has been deducted from your account "+
                    "balance is now "+this.balance);
        }
        scan.close();
    }

    public void resetAccount(){ //resets all account details to null
        this.balance = 0;
        this.name = null;
        this.emailAddress = null;
        this.mobileNumber = null;
        System.out.println("Account has been reset to null");
    }
}