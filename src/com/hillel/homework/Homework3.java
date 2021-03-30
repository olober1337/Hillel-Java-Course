package com.hillel.homework;

import java.util.Random;

import java.util.Scanner;

public abstract class Homework3 {

    public static void main(String[] args) {

//Task 1

        System.out.println("Введите Ваше имя:");
        Scanner scannerInput = new Scanner(System.in);
        String enteredName = scannerInput.nextLine();

        System.out.println("Введите Вашу фамилию:");
        Scanner scannerInput1 = new Scanner(System.in);
        String enteredSurname = scannerInput.nextLine();

        System.out.println("Укажите сколько Вам полных лет:");
        Scanner scannerInput2 = new Scanner(System.in);
        String enteredNumber = scannerInput.nextLine();

        System.out.println("Введите Вашу почту для регистрации:");
        Scanner scannerInput3 = new Scanner(System.in);
        String enteredEmail = scannerInput.nextLine();

        System.out.println("Напишите несколько слов о себе:");
        Scanner scannerInput4 = new Scanner(System.in);
        String enteredWords = scannerInput.nextLine();

        System.out.println("Добро пожаловать, " + enteredName + enteredSurname);

//Task 2

        Random random = new Random();

        int a = (random.nextInt());
        System.out.println(a);

        int b = (random.nextInt());
        System.out.println(b);

        int c = (random.nextInt());
        System.out.println(c);

        double a1 = (random.nextDouble());
        System.out.println(a1);

        double b1 = (random.nextDouble());
        System.out.println(b1);

        double c1 = (random.nextDouble());
        System.out.println(c1);

        System.out.println(a + b + c + a1 + b1 + c1);

        Lottery();
        MathOperations();
        letsRandomlyGenerateMySalary();
        letsRandomlyGenerateMyDreamSalary();

        System.out.println(Homework3Math1.addition());
        System.out.println(Homework3Math1.subtraction());

        Homework3Math1 multiplication = new Homework3Math1();
        System.out.println(multiplication.multiplication());

        Homework3Math1 division = new Homework3Math1();
        System.out.println(division.division());

//Task 3
    }

    public static void Lottery() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Take a part in our lottery! You win in 99% ! ! ! \n");

        System.out.println("How many people would like to participate?");

        int x = scanner.nextInt();

        Random random = new Random();

        int i = (random.nextInt());

        System.out.println(" And the winner is " + i);

    }
//Task 4

    public static void MathOperations(){

            Random random2 =new Random();

            int i = 2435;
            System.out.println(Math.sqrt(i));

            int i1 = -78654;
            System.out.println(Math.abs(i1));

            int i2 = Math.min(-125, 123);
            int i3 = Math.max(12345, 7854);

            System.out.println(i2);
            System.out.println(i3);

            int i4 = random2.nextInt(1234);
            System.out.println(i4);

            double i5 = -89.124;
            System.out.println(Math.cos(i5));

            float i6 = 3.182f;
            System.out.println(Math.sin(i6));

            double i7 = 73.594945945;
            System.out.println(Math.round(i7));

            float i8 = -89.1342f;
            System.out.println(Math.scalb(i8, 2));

//Task 5
        }

        public static void letsRandomlyGenerateMySalary() {

            Random random3 = new Random();

            int i123 = random3.nextInt(123784) * 10;

            System.out.println("My dream salary is : " + i123 + " per month !!!");

        }

        private static void letsRandomlyGenerateMyDreamSalary() {

            double x123 = Math.random() * 100;

            System.out.println("My dream salary is : " + x123 + " per year !!!");


        }

public static class Homework3Math1 {

    public static int addition() {

        Random random = new Random();

        int x = random.nextInt();

        int y = x + 254 ^ 2;

        return y;

    }

    public static int subtraction() {

        Random random = new Random();

        int x = random.nextInt();

        int y = x - 354 ^ 2;

        return y;

    }

    public int multiplication() {

        Random random = new Random();

        int x = random.nextInt();

        int y = x * 45;

        return y;

    }

    public int division() {

        Random random = new Random();

        int x = random.nextInt();

        int y = x / 150;

        return y;

    }
}
}