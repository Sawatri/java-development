package com.test.bank;

public class Test {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBankName("HBL");

        Employee e = new Employee();
        e.setName("ABC");
        e.setAccNumber(442135622);
        e.setBalance(150000);

        b.setEmployee(e);

        System.out.println("Bank Name: "+b.getBankName());
        System.out.println("Employee Name: "+b.getEmployee().getName());
        System.out.println("Employee Account Number: "+b.getEmployee().getAccNumber());
        System.out.println("Employee Balance: "+b.getEmployee().getBalance());
    }
}
