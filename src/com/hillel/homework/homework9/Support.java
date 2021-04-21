package com.hillel.homework.homework9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User{

    public Support(String name, String lastName, String email, String password, String sex, String country) {
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
        fileScanner.close();
        fileReader.close();
        System.out.println("File does not contain " + toCheck);
        return false;
    }
}
