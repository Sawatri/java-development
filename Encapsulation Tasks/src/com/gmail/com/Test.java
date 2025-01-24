package com.gmail.com;

public class Test {
    public static void main(String[] args){
        GmailLogin ge = new GmailLogin();
        ge.setEmail("ABC");
        ge.setPassword(123456);
        ge.setVerificationCode(2908);

        System.out.println(ge.getEmail());
        System.out.println(ge.getPassword());
        System.out.println(ge.getVerificationCode());

    }
}
