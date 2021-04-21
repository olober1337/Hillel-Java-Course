package com.hillel.homework.homework7;

public class Dog {

    private String name;

    private int weight;

    private String breed;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, int weight, String breed) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}