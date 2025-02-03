package com.test.abstraction;

public class Test {
    public static void main(String[] args) {
        SolarSystem s = new Earth();
        s.setDiameter(12742);
        s.setTemp("-89C to 57C");
        s.display();
        s.orbitalPeriod();

        s = new Venus();
        s.setDiameter(12104);
        s.setTemp("462C");
        s.display();
        s.orbitalPeriod();

        s = new Jupiter();
        s.setDiameter(142984);
        s.setTemp("-150C");
        s.display();
        s.orbitalPeriod();
    }
}
