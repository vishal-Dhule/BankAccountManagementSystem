package Bank_Account_Management_System;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account1 = new SavingsAccount("SA123", "VISHAL", 1000.0, 2.5);
        BankAccount account2 = new CurrentAccount("CA456", "ABHI", 2000.0, 500.0);

        try {
            System.out.println("Account 1: Savings Account");
            account1.deposit(500);
            account1.withdraw(300);
            ((SavingsAccount) account1).addInterest();
            account1.displayAccountDetails();

            System.out.println("\nAccount 2: Current Account");
            account2.deposit(1000);
            account2.withdraw(2700);
            account2.displayAccountDetails();
            
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
