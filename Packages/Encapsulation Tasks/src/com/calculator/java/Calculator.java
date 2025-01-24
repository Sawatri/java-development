package com.calculator.java;

public class Calculator {
    private int add;
    private int sub;
    private int mul;
    private float div;

    public void setAdd(int add) {
        int a =1;
        int b =1;
        int c = a+b;
        this.add = add + c;
    }
    public int getAdd() {
        return add;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getMul() {
        return mul;
    }

    public void setMul(int mul) {
        this.mul = mul;
    }

    public float getDiv() {
        return div;
    }

    public void setDiv(float div) {
        this.div = div;
    }
}
