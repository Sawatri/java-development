package com.test.machine;

public class Test {
    public static void main(String[] args) {
        WashingMachine m1 = new WashingMachine();
        m1.setCompanyName("Dawlance");
        m1.setCapacity("20kg");
        m1.setPrice(90000);

        WashingMachine m2 = new WashingMachine();
        m2.setCompanyName("Haier");
        m2.setCapacity("15kg");
        m2.setPrice(50000);

        System.out.println(m1.getCompanyName());
        System.out.println(m1.getCapacity());
        System.out.println(m1.getPrice());

        System.out.println(m2.getCompanyName());
        System.out.println(m2.getCapacity());
        System.out.println(m2.getPrice());

    }
}
