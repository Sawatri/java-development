package com.test.animal;

public class Lion extends Animal {

    @Override
    public void makeSound() {

        System.out.println("Lion makes sound "+ super.getSound());
    }
}
