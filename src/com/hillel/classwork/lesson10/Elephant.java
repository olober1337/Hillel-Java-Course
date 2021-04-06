package com.hillel.classwork.lesson10;

public class Elephant extends Mammal implements EatBehavior, PlayBehavior{

    private String name;

    public Elephant(String animalType, String name) {
        super(animalType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + "start to move");
    }

    @Override
    public void run() {
        System.out.println(name + "start to run");
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println(name.concat(" start to eat"));
    }

    @Override
    public void play() {
        System.out.println(name.concat(" start to play"));
    }
}
