package com.test.pens;

public class Test {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.setCompanyName("Dollar");
        p1.setColor("Red, Blue, Black, Green");
        p1.setPrice(20);

        Pens p2 = new Pens();
        p2.setCompanyName("Signature");
        p2.setColor("Red, Blue, Black, Green");
        p2.setPrice(15);

        System.out.println(p1.getCompanyName());
        System.out.println(p1.getColor());
        System.out.println(p1.getPrice());
        
        System.out.println(p2.getCompanyName());
        System.out.println(p2.getColor());
        System.out.println(p2.getPrice());
    }
}
