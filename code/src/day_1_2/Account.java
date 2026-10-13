package day_1_2;

public class Account {
    private String accountNumber;
    private double balance;
    private boolean active;

    public Account(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        }
        this.active = true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (!active) {
            throw new IllegalStateException("Account is inactive");
        }
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (!active) {
            throw new IllegalStateException("Account is inactive");
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid amount");
        }
    }
}