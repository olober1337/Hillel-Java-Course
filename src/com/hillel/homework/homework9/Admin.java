package com.hillel.homework.homework9;

import java.io.File;
import java.io.FileReader;
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
        System.out.println("File does not contain " + toCheck);
        return false;
    }

    public static void fileDeletionValidOrNot(boolean isFileContainsString) {

        System.out.println("Please check if file contains the entered text. If contains, write : 'contains'");
        String checkEnteredText = myScanner.nextLine();
        myScanner.close();

        if (isFileContainsString == checkEnteredText.equalsIgnoreCase("contains")) {
            newFile.delete();
            System.out.println("The file has been deleted");
        } else {
            System.out.println("We've checked and the file does not contain the string :) ");
        }
    }
}
