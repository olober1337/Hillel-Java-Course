package com.hillel.homework.homework9;

import java.io.IOException;

public class People {

    public static void main(String[] args) throws IOException {

        User user = new User("Oliver", "Wayne", "oliver.wayne@gmail.com", "123", "male", "USA");
        Support support = new Support("Martha", "Smith", "martha.smith@gmail.com", "321", "female", "Canada");
        Admin admin = new Admin("James", "Blaskovitz", "test@gmail.com", "213", "male", "Ukraine");

        user.textReader();
        user.textWriter();

        if (user instanceof User) {
            System.out.println(user);
        }
        if (support instanceof Support) {
            String  stringChecker = "This string is in File";
            boolean stringIsInFile = Support.isFileContainsString(stringChecker);
            System.out.println(stringIsInFile);
        }
        if (admin instanceof Admin) {
            Admin.fileDeletionValidOrNot();
        }
    }
}
