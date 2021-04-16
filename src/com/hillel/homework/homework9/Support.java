package com.hillel.homework.homework9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User{

    public Support(String name, String lastName, String email, String password, String sex, String country) {
        super(name, lastName, email, password, sex, country);

    }

    public static boolean isFileContainsString (String toCheck) throws IOException {

        System.out.println("Enter your text for checking please : ");

        FileReader fileReader = new FileReader(pathToFile);
        System.out.println("Text checking started");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            String textLine = scanner.nextLine();
            if (textLine.equals(toCheck)) {
                System.out.println("File contains " + toCheck);
                return true;
            }
        }

        fileReader.close();
        scanner.close();
        System.out.println("File does not contain " + toCheck);
        return false;
    }
}
