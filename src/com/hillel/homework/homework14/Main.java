package com.hillel.homework.homework14;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*Используя методы второго класса(промежуточного), в классе Main реализуйте методы использования следующих конструкций обработки ошибок:
        а) try-catch-finally;
        б) try-catch-catch-finally;
        в) try-catch-catch-catch-finally;
        г) try(with resources)-catch-finally;
        д) try-finally (в каждой конструкции try должны быть вызовы 3х методов промежуточного класса с разными ошибками).*/



        MyMiddleClassForExceptions myMiddleClassForExceptions = new MyMiddleClassForExceptions();

        try {
            myMiddleClassForExceptions.ioException();
            myMiddleClassForExceptions.arithmeticException();
            myMiddleClassForExceptions.indexOutOfBoundsException();
        } catch (IOException e) {
            System.out.println("IOException is caught!");
        } finally {
            System.out.println("First condition is met!");
        }

        try {
            myMiddleClassForExceptions.ioException();
            myMiddleClassForExceptions.arithmeticException();
            myMiddleClassForExceptions.indexOutOfBoundsException();
        } catch (IOException e) {
            System.out.println("IOException is caught!");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is caught!");
        } finally {
            System.out.println("Second condition is met!");
        }

        try {
            myMiddleClassForExceptions.ioException();
            myMiddleClassForExceptions.arithmeticException();
            myMiddleClassForExceptions.indexOutOfBoundsException();
        } catch (IOException e) {
            System.out.println("IOException is caught!");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is caught!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException is caught");
        } finally {
            System.out.println("Third condition is met!");
        }

        try (FileWriter fileWriter = new FileWriter("myFile.txt")) {
            fileWriter.write("This file contains Exceptions!");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException is caught!");
        } finally {
            System.out.println("Fourth condition is met!");
        }

        try {
            myMiddleClassForExceptions.ioException();
            myMiddleClassForExceptions.arithmeticException();
            myMiddleClassForExceptions.indexOutOfBoundsException();
        } finally {
            System.out.println("Fifth condition is met!");
        }
    }
}
