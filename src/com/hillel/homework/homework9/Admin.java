package com.hillel.homework.homework9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Admin extends User{

    public Admin(String name, String lastName, String email, String password, String sex, String country) {
        super(name, lastName, email, password, sex, country);

    }

    public String checkingStringInFile () {

        System.out.println("Type the text to check in file : ");
        return myScanner.nextLine();

    }

    public static boolean isFileContainsString (String toCheck) throws IOException {

        FileReader fileReader = new FileReader(newFile);
        Scanner fileScanner = new Scanner(fileReader);

        while (fileScanner.hasNextLine()) {
            String textLine = fileScanner.nextLine();
            if (textLine.equals(toCheck)) {
                System.out.println("File contains " + toCheck);
                return true;
            }
        }
        fileReader.close();
        fileScanner.close();
        System.out.println("File does not contain " + toCheck);
        return false;
    }

    public static void fileDeletionValidOrNot(boolean isFileContainsString) throws IOException {

        System.out.println("Please check if file contains the entered text. If contains, write : 'contains'");
        String checkEnteredText = myScanner.nextLine();

        if (checkEnteredText.equalsIgnoreCase("contains")) {
            FileWriter fileWriter = new FileWriter(newFile);
            fileWriter.write("");
            fileWriter.close();
            System.out.println("Your file has been successfully deleted!");
        } else {
            System.out.println("We've checked carefully and your file does not contain the string you've entered :)");
        }

    }
}
