package com.hillel.homework.homework4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

//Вывести на экран числа от 1 до 10 используя while.

        int a = 1;

        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();

    }

    public static void Task2() {

//Вывести на экран числа от 1 до 10 используя for.

        int a = 1;

        for (int b = 1; b <= 10; b++) {
            System.out.println(b);
        }
    }

    public static void Task3() {

//Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать while.

        int a = 110;

        while (a > 0) {
            a = a - 10;
            System.out.println(a);
        }
    }

    public static void Task4() {

//Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать for.

        int a = 110;

        for (int i = 0; i < a; ) {
            a = a - 10;
            System.out.println(a);
        }
    }

    public static void Task5() {

//Дано 10 чисел (возможно массив). Напечатайте наибольшее из них в консоль, используя циклические и условные операторы.

        int[] digit = {16424, 96655, 97934, 26458, 25790, 23118, 307, 88177, 73534, 48206};

        int maxDigit = digit[0];

        for (int i = 0; i < digit.length; i++) {
            if (digit[i] > maxDigit) {
                maxDigit = digit[i];
            }
        }

        System.out.println("Max digit is : " + maxDigit);
    }

    public static void Task6() {

//Дано 10 чисел (возможно массив). Напечатайте наименьшее из них в консоль, используя циклические и условные операторы.

        int[] digits = {321, 911, 808, 581, 940, 544, 381, 956, 678, 785};

        int minDigit = digits[0];

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < minDigit) {
                minDigit = digits[i];
            }
        }

        System.out.println("Min digit is : " + minDigit);
    }

    public static void Task7() {

//Создайте массив из 10 чисел от 1 до 10. В одном из циклических операторов пройдетесь по нему и выведете следующие сообщения
//о Если четное - “{число} - это четно число”
//о Если не четное - “{число} - это число не четное”
//Пример:
//1 - не четное число
//2- четное число
//3     - не четное число

        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int a = digits[0];

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 0) {
                System.out.println(i + " - это четное число!");
            } else {
                System.out.println(i + " - это не четное число!");
            }
        }
    }

    public static void Task8() {

//Предположим что у нас есть сайт, где ограничено посещение пользователей от 18 до 50 лет. Необходимо написать программу, которая будет запрашивать год Вашего рождения и выдавать следующие ответы:
//“Вход строго с 18 лет” (Если пользователю меньше 18 лет);
//
//“Добро пожаловать” (Если возраст от 18 до 50 лет);
//
//“Вам будет не интересно на этом сайте(Если больше 50);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст: ");
        int enteredAge = scanner.nextInt();
        scanner.close();

        if (enteredAge < 18) {
            System.out.println("Вход строго с 18 лет!");
        }
        else if (enteredAge > 18 && enteredAge <= 50) {
            System.out.println("Добро пожаловать!");
        }
        else {
            System.out.println("Вам будет не интересно на этом сайте");
        }
    }
}
