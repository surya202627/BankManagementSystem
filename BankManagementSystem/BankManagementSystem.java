package BankManagementSystem;

import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (account == null) {

                        System.out.print("Enter Account Number: ");
                        int accNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Account Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Initial Deposit: ");
                        double balance = sc.nextDouble();

                        account = new BankAccount(accNo, name, balance);

                        System.out.println("Account created successfully.");

                    } else {
                        System.out.println("Account already exists.");
                    }
                    break;

                case 2:
                    if (account != null) {

                        System.out.print("Enter Deposit Amount: ");
                        double deposit = sc.nextDouble();

                        account.deposit(deposit);

                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;

                case 3:
                    if (account != null) {

                        System.out.print("Enter Withdrawal Amount: ");
                        double withdraw = sc.nextDouble();

                        account.withdraw(withdraw);

                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;

                case 5:
                    if (account != null) {
                        account.displayAccount();
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Bank Management System.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
