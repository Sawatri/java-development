package com.test.animal;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat makes sound "+ super.getSound());
    }
}
