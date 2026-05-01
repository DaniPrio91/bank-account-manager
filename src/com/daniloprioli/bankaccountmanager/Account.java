package com.daniloprioli.bankaccountmanager;

public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

}
