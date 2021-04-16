package com.hillel.homework.homework9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Admin extends User{

    public Admin(String name, String lastName, String email, String password, String sex, String country) {
        super(name, lastName, email, password, sex, country);

    }

    public static void fileDeletionValidOrNot () throws IOException {

        System.out.println("Please check if file contains the entered text. If contains, write : 'contains'");

        Scanner scanner = new Scanner (System.in);
        String fileContainsTheString = scanner.nextLine();
        if (fileContainsTheString.equalsIgnoreCase("Contains")){
            File fileToCheck = new File (pathToFile);
            FileWriter fileWriter = new FileWriter(fileToCheck);
            fileWriter.write("");
            fileWriter.close();
            fileToCheck.delete();
            System.out.println("The file has been deleted");
        } else {
            System.out.println("We've checked and the file does not contain the string :) ");
        }
        scanner.close();
    }
}
