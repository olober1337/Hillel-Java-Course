package com.hillel.classwork.lesson9;

public class Cat extends Animal{

    private int energy;

    public Cat(String name, int age) {
        super(name, age);
        this.energy = 100;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("cat sound : meow meow");
    }

    public void play() {
        if (energy >0) {
            System.out.println("cat is playing");
            energy = energy - 30;
            System.out.println("cat energy :" + energy);
        } else {
            System.out.println("cat is tired : energy is low level");
        }
    }
}
