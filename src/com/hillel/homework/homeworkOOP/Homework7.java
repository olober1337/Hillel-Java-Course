package com.hillel.homework.homeworkOOP;

public class Homework7 {

    public static void main(String[] args) {

        Cat cat = new Cat();

//        Невозможно обратиться к параметру напрямую из-за того, что в классе Cat и Dog они обозначены как private а не public
//        Если же поменять доступ на public, то всё сработает

//        cat.name = "Oliver";
//        System.out.println(cat.name);
//
//        cat.weight = 3;
//        System.out.println(cat.weight);
//
//        cat.breed = "Abyssinian";
//        System.out.println(cat.breed.concat("\n"));

        cat.setName("Buben");
        System.out.println(cat.getName());

        cat.setWeight(4);
        System.out.println(cat.getWeight());

        cat.setBreed("British Shorthaired");
        System.out.println(cat.getBreed().concat("\n"));

        Dog dog = new Dog();

//        dog.name = "Sheldon";
//        System.out.println(dog.name);
//
//        dog.weight = 6;
//        System.out.println(dog.weight);
//
//        dog.breed = "French Bulldog";
//        System.out.println(dog.breed.concat("\n"));

        dog.setName("Charlie");
        System.out.println(dog.getName());

        dog.setWeight(20);
        System.out.println(dog.getWeight());

        dog.setBreed("Labrador Retriever");
        System.out.println(dog.getBreed());

//      Можно также использовать метод toString() чтобы улучшить код
    }
}
