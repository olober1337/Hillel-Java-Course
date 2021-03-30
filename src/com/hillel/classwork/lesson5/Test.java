package com.hillel.classwork.lesson5;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String inputWord = scanner.nextLine();

        scanner.close();

        String checker = "Hillel";

        boolean answer = checkInput(checker, inputWord);

        if (answer == true) {
            System.out.println(" Welcome to the course!");
        } else {
            System.out.println(" Welcome " + inputWord);
        }

    }

    public static boolean checkInput(String checker, String input) {

        return checker.equalsIgnoreCase(input);

    }
}
