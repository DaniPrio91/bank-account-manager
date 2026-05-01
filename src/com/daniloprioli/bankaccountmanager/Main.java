package com.daniloprioli.bankaccountmanager;

public class Main {
  public static void main(String[] args) {

    Account a1 = new Account("Danilo", 1000.50);

    System.out.println(a1.getBalance());
    a1.deposit(0);
    System.out.println(a1.getBalance());
    a1.withdraw(45);
    System.out.println(a1.getBalance());
  }

}
