package com.bankaccount.task;

public class TestAccount {
    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
        ac.setBankName("HBL");
        ac.setName("ABC");
        ac.setAccNumber(2165345667098L);
        ac.setAccBalance(1200000f);
        ac.setEmail("abc@gmail.com");

        System.out.println(ac.getBankName());
        System.out.println("Name: "+ac.getName());
        System.out.println("Account Number: "+ac.getAccNumber());
        System.out.println("Account Balance: "+ac.getAccBalance());
        System.out.println("Email Address: "+ac.getEmail());

    }
}
