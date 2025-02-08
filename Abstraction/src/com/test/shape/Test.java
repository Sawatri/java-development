package com.test.shape;

public class Test {
    public static void main(String [] args){
        Shape s = new Circle();
        s.draw();

        s= new Square();
        s.draw();

        s = new Triangle();
        s.draw();

    }
}
