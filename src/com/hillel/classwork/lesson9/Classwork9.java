package com.hillel.classwork.lesson9;

import java.sql.SQLOutput;

public class Classwork9 {

    public static void main(String[] args) {

        Animal animal = new Animal("myAnimal", 5);

        WildAnimal wildAnimal = new WildAnimal("myWildAnimal", 7);

        Cat cat = new Cat("myCat", 10);

        Dog dog = new Dog("myDog", 15);

        if (cat instanceof Animal) {
            System.out.println("cat is child of Animal");
            Animal castedCatAnimal = cat;
            castedCatAnimal.getAnimalSound();
        }

        if (dog instanceof Animal) {
            System.out.println("dog is child of Animal");
            Animal castedDogAnimal = dog;
            dog.getAnimalSound();
        }

        if (wildAnimal instanceof Animal) {
            System.out.println("wildAnimal is child of Animal");
            Animal castedWildAnimalToAnimal = wildAnimal;
            castedWildAnimalToAnimal.getAnimalSound();
        }
//        if (cat instanceof Dog) {
//            System.out.println("cat is child of Dog");
//        }

//        System.out.println(animal);
//
//        animal.getAnimalSound();
//
//        Animal catAnimal = cat;
//
//        System.out.println(catAnimal);
//
//        Animal myWildAnimal = wildAnimal;
//
//        System.out.println(myWildAnimal);
//
//        WildAnimal myAnimalFromWildAnimal = (WildAnimal) animal;
//
//        WildAnimal wildAnimal2 = new WildAnimal("myWildAnimal", 1);
//
//        boolean isAnimalChildOfWildAnimal = animal instanceof WildAnimal;
//
//        boolean isCatChildOfAnimal = cat instanceof Animal;

//        if (isAnimalChildOfWildAnimal) {
//            WildAnimal myAnimalFromWildAnimal = (WildAnimal) animal;
//        }
//
//        if (isCatChildOfAnimal) {
//            Animal animal2 = cat;
//        }

//        System.out.println(wildAnimal);

//        cat.getAnimalSound();
//        System.out.println(cat);
//        cat.setAge(11);
//        System.out.println(cat);
//
//
//        Dog dog = new Dog("myDog", 15);
//
//        dog.getAnimalSound();
//        System.out.println(dog);
//        dog.setAge(16);
//        System.out.println(dog);
//
//        System.out.println("now parent class Animal");
//
//        System.out.println(animal);
//
//        cat.play();
//        cat.play();
//        cat.play();
//        cat.play();
//        cat.play();
    }


}
