package com.bankaccount.task;

public class BankAccount {
    private String bankName;
    private String name;
    private long accNumber;
    private float accBalance;
    private String email;

    public void setBankName(String bankName) {
        this.bankName = bankName  + " Bank";
    }
    public String getBankName(){
        return this.bankName;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
   public void setAccNumber(long accNumber){
        this.accNumber = accNumber;
   }
   public long getAccNumber(){
        return this.accNumber;
   }
   public void setAccBalance(float accBalance){
        this.accBalance = accBalance;
   }
   public double getAccBalance(){
        return this.accBalance;
   }
   public void setEmail(String email){
        this.email = email;
   }
   public String getEmail(){
        return this.email;
   }

}
