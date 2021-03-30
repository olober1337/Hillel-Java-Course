package com.hillel.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner enterDigit = new Scanner(System.in);

        System.out.println("Enter first digit");
        int Digit1 = enterDigit.nextInt();

        System.out.println("Enter second digit");
        int Digit2 = enterDigit.nextInt();

        System.out.println("Enter third digit");
        int Digit3 = enterDigit.nextInt();

        System.out.println("Enter fourth digit");
        int Digit4 = enterDigit.nextInt();

        System.out.println("Enter fifth digit");
        int Digit5 = enterDigit.nextInt();

        enterDigit.close();

        printArrayDigit(Digit1, Digit2, Digit3, Digit4, Digit5);

    }

    public static void printArrayDigit(int Digit1, int Digit2, int Digit3, int Digit4, int Digit5) {

        int[] intArray = new int[5];

        intArray [0] = 1;
        intArray [1] = 2;
        intArray [2] = 3;
        intArray [3] = 4;
        intArray [4] = 5;

        System.out.println(intArray.toString());
        System.out.println(java.util.Arrays.toString(intArray));

    }
}
