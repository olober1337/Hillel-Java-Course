package com.hillel.homework;

import java.util.Scanner;

public class ExtraPoints {

    public static void main(String[] args) {

//  Необходимо вывести на экран таблицу умножения на 3:

        int a = 3;
        for (int b = 1; b <= 10; b++) {
            int c = a * b;
                System.out.println(a + "x" + b + "=" + c);
        }

//  Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
//  Например:
//  если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.
//  если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15.

        System.out.println("Please enter a positive number :".concat("\n"));

        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int sum = 0;
        for (int e = 1; e <= d; e++) {
            sum = sum + e;
        }
        System.out.println("Here is the sum of all numbers : " + sum);
    }
}
