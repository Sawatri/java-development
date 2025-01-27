package com.test.sports;

public class Test {
    public static void main(String[] args) {
        Sports s = new Basketball();
        s.setPlay("Basketball");
        s.game();
        s = new Football();
        s.setPlay("Football");
        s.game();
        s = new Volleyball();
        s.setPlay("Volleyball");
        s.game();
    }
}
