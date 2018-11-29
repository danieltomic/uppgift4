package com.company;

public class Bankkonto {
    private String nbr;
    private double balance = 0;

    public void credit(double amount){
        balance = balance + amount;

    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }
}
