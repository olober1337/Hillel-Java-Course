package com.hillel.classwork.lesson9;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void getAnimalSound() {
        System.out.println("dog sound : gav gav");
    }
}
