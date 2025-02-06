package com.test.abstraction;

public abstract class SolarSystem {
    private String temp;
    private int diameter;

    public abstract void orbitalPeriod();

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void display() {
        System.out.println("Diameter = " + diameter);
        System.out.println("Temperature = " + temp);
    }
}
