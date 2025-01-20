package com.test.car;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setCompanyName("Toyota");
        c1.setVehicleName("Yaris");
        c1.setModel(2024);
        c1.setPrice("70 lac");

        Car c2 = new Car();
        c2.setCompanyName("Honda");
        c2.setVehicleName("Civic");
        c2.setModel(2024);
        c2.setPrice("86 lac");

        System.out.println(c1.getCompanyName());
        System.out.println(c1.getVehicleName());
        System.out.println(c1.getModel());
        System.out.println(c1.getPrice());

        System.out.println(c2.getCompanyName());
        System.out.println(c2.getVehicleName());
        System.out.println(c2.getModel());
        System.out.println(c2.getPrice());

    }
}
