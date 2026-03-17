package com.gla.ClassesObject.level2;

public class BankAccount {public int accountNumber;        // Public
    protected String accountHolder;  // Protected
    private double balance;          // Private

    // Public method to set balance
    public void setBalance(double amount) {
        balance = amount;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);   // Accessible
        System.out.println("Account Holder: " + accountHolder);   // Accessible
        System.out.println("Balance: " + getBalance());           // Access via method
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        sa.accountNumber = 123456;
        sa.accountHolder = "Aadrika";
        sa.setBalance(15000);

        sa.displayDetails();
    }
}
