package com.gmail.com;

public class GmailLogin {
    private String email;
    private int password;
    private int verificationCode;

    public void setEmail(String email){
        this.email = email+"@gmail.com";
    }
    public String getEmail(){
        return this.email;
    }
    public void setPassword(int password){
        this.password = password;
    }
    public int getPassword(){
        return this.password;
    }
    public void setVerificationCode(int verificationCode){
        this.verificationCode = verificationCode;
    }
    public int getVerificationCode(){
        return this.verificationCode;
    }

}
