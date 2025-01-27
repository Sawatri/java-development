package com.test.animal;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Dog makes sound "+ super.getSound());
    }
}
