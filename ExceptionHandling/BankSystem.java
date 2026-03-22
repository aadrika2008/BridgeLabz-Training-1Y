package com.gla.ExceptionHandling;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 1000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankSystem { public static void main(String[] args) {
    BankAccount acc = new BankAccount();

    try {
        acc.withdraw(1500); // change for testing
    } catch (InsufficientBalanceException e) {
        System.out.println(e.getMessage());
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
}
