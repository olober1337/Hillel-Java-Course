package com.hillel.homework.homework6;

import org.jetbrains.annotations.NotNull;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class JavaPoetry {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\mcram\\Desktop\\Java Poetry\\Java Poetry.txt";

        Path pathToFile = Paths.get(path);

        if (!Files.exists(pathToFile.getParent()))
            Files.createDirectories(pathToFile.getParent());

        javaPoetry(path);
        stringReader(path);
        fileHasBeenWritten(path);
    }

    public static void javaPoetry(String path) throws IOException {

        FileWriter javaPoetry = new FileWriter(path, false);

        javaPoetry.write("Ви знаєте, як липа шелестить\n" +
                "у місячні весняні ночі?\n" +
                "\n" +
                "Кохана спить, кохана спить,\n" +
                "Піди збуди, цілуй їй очі.\n" +
                "Кохана спить…\n" +
                "\n" +
                "Ви чули ж бо: так липа шелестить.\n" +
                "\n" +
                "Ви знаєте, як сплять старі гаї?\n" +
                "Вони все бачать крізь тумани.\n" +
                "\n" +
                "Ось місяць, зорі, солов'ї…\n" +
                "\"Я твій\" — десь чують дідугани,\n" +
                "А солов'ї!..\n" +
                "\n" +
                "Та ви вже знаєте, як сплять гаї!" + "\n");

        javaPoetry.close();

    }

    private static void fileHasBeenWritten (String path) {

        boolean fileHasBeenWritten = path.isEmpty();
        System.out.println("The file Java Poetry is empty : " + fileHasBeenWritten + "\n");
        System.out.println("File has been successfully created and written");

    }

    private static void stringReader(String path) throws IOException {

        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
        }
        scanner.close();
        fileReader.close();
    }
}
