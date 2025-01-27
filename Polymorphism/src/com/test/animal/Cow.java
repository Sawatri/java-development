package com.test.animal;

public class Cow extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Cow makes sound "+super.getSound());
    }
}
