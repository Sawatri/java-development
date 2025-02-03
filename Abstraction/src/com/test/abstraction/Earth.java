package com.test.abstraction;

public class Earth extends SolarSystem{

    @Override
    public void orbitalPeriod() {
        System.out.println("The earth one complete orbit around the sun is 365 days");
    }
}
