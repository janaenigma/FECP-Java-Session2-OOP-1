package org.example;

import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accNum, String accName, double accBalance) {
        this.accountNumber = accNum;
        this.accountHolderName = accName;
        this.accountBalance = accBalance;
    }

    public String getAccountNumber() {
        return  accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    void depositMoney(double amount){
        if (amount <= 0){
            System.out.println("Invalid deposit.");
        }
        else {
            accountBalance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void withdrawMoney(double amount){
        if (amount <= 0){
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > accountBalance){
            System.out.println("Insufficient funds.");
        }
        else {
            accountBalance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public String toString(){
        return "Account[" + accountNumber + "]" + accountHolderName + ": P" + accountBalance;
    }
}
