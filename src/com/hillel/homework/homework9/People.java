package com.hillel.homework.homework9;

import java.io.IOException;

public class People {

    public static void main(String[] args) throws IOException {

        User user = new User("Oliver", "Wayne", "oliver.wayne@gmail.com", "123", "male", "USA");
        Support support = new Support("Martha", "Smith", "martha.smith@gmail.com", "321", "female", "Canada");
        Admin admin = new Admin("James", "Blaskovitz", "test@gmail.com", "213", "male", "Ukraine");

        System.out.println("Class User is running now");
        checkingUsers(user);
        System.out.println("Class Support is running now");
        checkingUsers(support);
        System.out.println("Class Admin is running now");
        checkingUsers(admin);

        User.myScanner.close();
    }


    private static void checkingUsers (User user) throws IOException {

        if (user instanceof Support){
            Support.isFileContainsString(((Support) user).checkingStringInFile());
        } else if (user instanceof Admin) {
            Admin.fileDeletionValidOrNot(Admin.isFileContainsString(((Admin) user).checkingStringInFile()));
        } else if (user != null) {
            user.textReader();
            user.textWriter();
        }
    }
}
