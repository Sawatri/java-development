package com.calculator.java;

public class TestCalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setAdd(2+8);
        calc.setSub(10-7);
        calc.setMul(4*6);
        calc.setDiv(8/3f);
        System.out.println(calc.getAdd());
        System.out.println(calc.getSub());
        System.out.println(calc.getMul());
        System.out.println(calc.getDiv());
    }
}
