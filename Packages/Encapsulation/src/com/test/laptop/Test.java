package com.test.laptop;

public class Test {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setCompanyName("DELL");
        l1.setPrice(104000);
        l1.setColor("Black");
        l1.setGeneration("10th Generation");

        Laptop l2 = new Laptop();
        l2.setCompanyName("HP");
        l2.setPrice(111000);
        l2.setColor("Gray");
        l2.setGeneration("13th Generation");

        System.out.println(l1.getCompanyName());
        System.out.println(l1.getPrice());
        System.out.println(l1.getColor());
        System.out.println(l1.getGeneration());

        System.out.println(l2.getCompanyName());
        System.out.println(l2.getPrice());
        System.out.println(l2.getColor());
        System.out.println(l2.getGeneration());

    }
}
