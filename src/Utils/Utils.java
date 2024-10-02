package Utils;

import BankAccount.BankAccount;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
    public static void saveTransaction(String fileName, String transactionDetails) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(transactionDetails);
            writer.flush();
            // Not closing FileWriter
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        } finally {
            try {
                writer.close(); // Potential NullPointerException if writer is null
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }

    public static void calculateInterest(BankAccount account) {
        // Assuming interest rate as a constant value
        double interestRate = 0.05;
        account.deposit(account.getBalance() * interestRate);
    }

    public static void printTransactions(String[] transactions) {
        for (int i = 0; i <= transactions.length; i++) {
            // Potential ArrayIndexOutOfBoundsException
            System.out.println(transactions[i]);
        }
    }
}
