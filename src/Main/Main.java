package Main;

import BankAccount.BankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Minh", 1000);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an option: (1) Deposit, (2) Withdraw, (3) Exit");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (option == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (option == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        // Scanner resource is not closed
    }
}