package org.example;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BankSystem {
    private static final ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("=== Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.println("Enter choice (1-5): ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                   createAccount();
                   break;
                case 2:
                    viewAllAccounts();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    deposit();
                    break;
                case 5:
                    withdraw();
                    break;
                case 6:
                    System.out.println("");
            }
        } while (choice != 6);
        }

        private static void createAccount(){
            System.out.print("Enter account number: ");
            String accNum = input.next();
            System.out.print("Enter account holder name: ");
            String accName = input.next();
            System.out.print("Enter initial deposit amount: ");
            double deposit = input.nextDouble();
            bankAccounts.add(new BankAccount(accNum, accName, deposit));
            System.out.print("Account created successfully!");
        }

        private static void viewAllAccounts(){
            System.out.println("=== Bank Accounts ===");
            if (bankAccounts.isEmpty()){
                System.out.println("No accounts to display");
            }
            else {
                for (BankAccount account: bankAccounts){
                    System.out.println(account);
                }
            }
        }

        private static void checkBalance(){
            System.out.print("Enter account number: ");
            String num = input.nextLine();

            BankAccount account = findAccount(num);
            if (account != null) {
                System.out.println("Current balance: " + account.getAccountBalance());
            } else {
                System.out.println("Account not found.");
            }

        }

        private static void deposit(){
            System.out.print("Enter account number: ");
            String num = input.nextLine();

            BankAccount account = findAccount(num);
            if (account != null) {
                System.out.print("Enter deposit amount: ");
                double amount = input.nextDouble();
                account.depositMoney(amount);
            } else {
                System.out.println("Account not found.");
            }
        }

        private static void withdraw(){
            System.out.print("Enter account number: ");
            String num = input.nextLine();

            BankAccount account = findAccount(num);
            if (account != null) {
                System.out.print("Enter withdrawal amount: ");
                double amount = input.nextDouble();
                account.withdrawMoney(amount);
            } else {
                System.out.print("Account not found.");
            }
        }

        private static BankAccount findAccount(String number){
            for (BankAccount account : bankAccounts){
                if (account.getAccountNumber().equals(number)){
                    return account;
                }
            }
            return null;
        }

}
