package com.test.bankAtm;

import java.sql.SQLOutput;

public class Bank extends ATM{

    private double balance;
    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public void withDrawMoney(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrew money "+amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public void showBalance(){
        System.out.println("Current balance is: " + balance);
    }

    public void

}