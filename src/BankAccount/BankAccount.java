package BankAccount;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            // Error: not throwing exception for insufficient balance
            return;
        }

        balance -= amount;
        // Missing synchronization in multithreaded environment
    }

    public double getBalance() {
        return balance;
    }

    // Method not used, dead code
    public String getOwner() {
        return owner;
    }

    // Potential null pointer dereference
    public void printAccountSummary() {
        System.out.println("Owner: " + owner.toUpperCase());
        System.out.println("Balance: " + balance);
    }
}
