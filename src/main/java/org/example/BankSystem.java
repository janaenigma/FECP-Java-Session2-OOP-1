package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    private static ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        //String returnToMenu = input.next().toLowerCase();
        //do {
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
                case 2:
                    viewAllAccounts();
                case 3:
                case 4:
//                    System.out.println("Enter amount: ");
//                    double deposit = input.nextDouble();
//                    bankAcc.depositMoney(deposit);
                case 5:
                case 6:
            }
       // } while (returnToMenu != "no");
        }

        private static void createAccount(){
            System.out.println("Enter account number: ");
            String accNum = input.next();
            System.out.println("Enter account holder name: ");
            String accName = input.next();
            System.out.println("Enter initial deposit amount: ");
            double deposit = input.nextDouble();
            bankAccounts.add(new BankAccount(accNum, accName, deposit));
            System.out.println("Account created successfully!");
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

        private void checkBalance(){
            System.out.println("Enter account number: ");
            String num = input.nextLine();

           // BankAccount account = findAcco
        }

        private void



}
