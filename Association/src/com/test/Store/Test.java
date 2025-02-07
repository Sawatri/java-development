package com.test.Store;

public class Test {
    public static void main(String[] args) {

        MobileStore ms = new MobileStore();

        Mobile m1 = new Mobile();
        m1.setCompanyName("Vivo");
        m1.setPrice(35000);
        m1.setModel("Y30");

        ms.setMobile(m1);

        System.out.println("Company Name: "+ms.getMobile().getCompanyName());
        System.out.println("Price : "+ms.getMobile().getPrice());
        System.out.println("Model : "+ms.getMobile().getModel());




    }
}
