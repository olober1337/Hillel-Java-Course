package com.hillel.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {

//Реализовать ввод имени (string) с консоли, выполнить проверку имени на равенство к слову Hillel. если равно - "добро пожаловать на курс + имя", если нет - "дoбро пожаловать + имя"
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        String correct = "Hillel";

        if (name.equals(correct)) {
            System.out.println(" Welcome to the course! " + name);
        } else {
            System.out.println(" Welcome " + name);
        }

        task2();
        task3();
    }

    public static void task2() {

//Ввести с клавиатуры 5 чисел. Реализовать их вывод на консоль одной строчкой в отдельном методе. В логике использовать циклы и массивы.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five digits : ");

        int[] anotherArray = new int[5];
        for (int i = 0; i < 5; i++) {
            anotherArray[i] = input.nextInt();
        }

        printArray(anotherArray);
    }

    public static void printArray(int[] oneMoreArray) {

        System.out.println((Arrays.toString(oneMoreArray)));

    }

    public static void task3 () {

//Ввести с клавиатуры трехзначное число, только с помощью математических операторов разбить его на три цифры и вывести в консоль (т.е. если число 123, вывести 1,2,3)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three-digit number please: ");

        int digit = input.nextInt();

        int a = digit / 100;
        int b = digit % 100 / 10;
        int c = digit % 10;

        System.out.println(a + "," + b + "," + c);
    }
}