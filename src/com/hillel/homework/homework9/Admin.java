package com.hillel.homework.homework9;

import java.io.FileNotFoundException;
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

        FileReader fileReader = new FileReader(pathToFile);
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

    public static String fileDeletionValidOrNot(boolean fileContainsString) {

        System.out.println("Please check if file contains the entered text. If contains, write : 'contains'");

        Scanner newScanner = new Scanner(System.in);

        String checkEnteredText = newScanner.nextLine();

        if (checkEnteredText.equalsIgnoreCase("contains")){
            newFile.delete();
            System.out.println("The file has been deleted");
            return "The file has been deleted";
        } else {
            System.out.println("We've checked and the file does not contain the string :) ");
            return "We've checked and the file does not contain the string :)";
        }
    }
}
