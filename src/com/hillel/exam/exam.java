package com.hillel.exam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exam {



    /*есть файл который содержит какие-то строчки. ввести 5 строчки в файл с консоли и записать в другой файл
    * после этого создать третий фал который содержит строчки первого и второго и удалить первый*/

    public static void main(String[] args) throws IOException {

        File newFile1 = new File("newFile1.txt");
        FileWriter newFileWriter1 = new FileWriter(newFile1);
        newFileWriter1.write("Hello!" + "\n");
        newFileWriter1.write("Nice to meet you!" + "\n");
        newFileWriter1.write("Goodbye!");
        newFileWriter1.close();

        File newFile2 = new File("newFile2.txt");
        FileWriter newFileWriter2 = new FileWriter(newFile2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first line : ");
        newFileWriter2.write(scanner.nextLine());
        System.out.println("Enter second line : ");
        newFileWriter2.write(scanner.nextLine());
        System.out.println("Enter third line : ");
        newFileWriter2.write(scanner.nextLine());
        newFileWriter2.close();
        scanner.close();
        System.out.println("Thank you!");

        File newFile3 = new File("newFile3.txt");
        FileWriter newFileWriter3 = new FileWriter(newFile3);

        FileReader newFileReader1 = new FileReader(newFile1);
        Scanner scanner1 = new Scanner(newFileReader1);
        while (scanner1.hasNextLine()) {
            newFileWriter3.write(String.valueOf(newFile3));
        }
        newFileReader1.close();
        scanner1.close();

        FileReader newFileReader2 = new FileReader(newFile2);
        Scanner scanner2 = new Scanner(newFileReader2);
        while (scanner2.hasNextLine()) {
            newFileWriter3.write(String.valueOf(newFile3));
        }
        newFileReader2.close();
        scanner2.close();

        newFileWriter3.close();

        newFile1.delete();

    }
}
