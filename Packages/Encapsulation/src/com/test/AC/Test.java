package com.test.AC;

public class Test {
    public static void main(String[] args) {
        AC  a1 = new AC ();
        a1.setCompanyName("Gree Electric");
        a1.setSize("1.5 Ton");
        a1.setPrice(176594);

        AC a2 = new AC ();
        a2.setCompanyName("Panasonic");
        a2.setSize("2 Ton");
        a2.setPrice(255000);

        System.out.println(a1.getCompanyName());
        System.out.println(a2.getSize());
        System.out.println(a1.getPrice());

        System.out.println(a2.getCompanyName());
        System.out.println(a2.getSize());
        System.out.println(a2.getPrice());

    }
}
