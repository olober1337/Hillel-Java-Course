package com.hillel.homework.homework14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyExceptions {

    public static void fileException() throws IOException {
        FileWriter myFileWriter = new FileWriter("myTextFile.txt");
        myFileWriter.write("Hello World!");
        myFileWriter.close();
    }

    public static void arithmeticException() {
        try {
            int num1 = 20;
            int num2 = 0;
            int result = num1/num2;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by zero!");
        }
    }

    public static void outOfBoundsException() {
        try {
            List<Integer> newList = new ArrayList<>(5);
            newList.get(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of Bounds!");
        }
    }
}
