package com.hillel.classwork.lesson10;

public class Classwork10 {

    public static void main(String[] args) {

//        ParentClass parentClass = new ParentClass("Parent");
//
//        ChildClass childClass = new ChildClass("Child");
//
//        parentClass.printSomethingToConsole();
//
//        childClass.printSomethingToConsole();
//
//        parentClass.printSomethingToConsole("test string to print for parent");
//
//        childClass.printSomethingToConsole("test string to print for child");

//        cannot create object from abstract class
//        ParentAbstractClass parentAbstractClass = new ParentAbstractClass();

//        ChildNotAbstractClass childNotAbstractClass = new ChildNotAbstractClass();

        Eagle eagle = new Eagle("bird", "eagle");
        Shark shark = new Shark("fish","shark");
        Elephant elephant = new Elephant("mammal","elephant");

        eagle.fly();
        shark.swim();
        elephant.run();

        eagle.attack();
//        eagle.eat();
        shark.attack();

    }
}
