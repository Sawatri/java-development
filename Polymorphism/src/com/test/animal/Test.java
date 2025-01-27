package com.test.animal;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setSound("Meow 😺🐈");
        a.makeSound();

        a = new Dog();
        a.setSound("Hau Hau🐶🐶");
        a.makeSound();

        a = new Cow();
        a.setSound("Moo 🐮🐮");
        a.makeSound();

        a = new Lion();
        a.setSound("Roar 🦁🦁");
        a.makeSound();


    }
}
