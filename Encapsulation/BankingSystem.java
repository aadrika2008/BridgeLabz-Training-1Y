package com.gla.Encapsulation;
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract Class
abstract class BankAccount implements Loanable {
    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters (Encapsulation)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Display
    public void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("--------------------------");
    }
}

// Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate = 4.0;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    private double interestRate = 2.0;

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(101, "Aadrika", 20000);
        BankAccount acc2 = new CurrentAccount(102, "Rahul", 8000);

        acc1.deposit(5000);
        acc2.withdraw(2000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayDetails();

            if (acc.calculateLoanEligibility()) {
                acc.applyForLoan(10000);
            } else {
                System.out.println("Loan not eligible");
            }
        }
    }
}


