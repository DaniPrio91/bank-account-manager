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
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("invalid deposit");
        }
    }

    public void prelievo(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

}
