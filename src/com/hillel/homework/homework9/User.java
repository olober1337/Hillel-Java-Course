package com.hillel.homework.homework9;

import java.io.*;
import java.util.Scanner;

public class User {

    public static final Scanner myScanner = new Scanner(System.in);

    static String pathToFile = "C:\\Users\\mcram\\Desktop\\Homework9\\myTextFile.txt";

    public static final File newFile = new File(pathToFile);

    private String name;
    private String lastName;
    private String email;
    private String password;
    private String sex;
    private String country;

    public User(String name, String lastName, String email, String password, String sex, String country) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public final void textReader () {

        System.out.println("Enter your text please : ");
        String myText = myScanner.nextLine();
        System.out.println("Your text is : ".concat(myText));

    }

    public void textWriter () throws IOException {

        FileWriter myFileWriter = new FileWriter(pathToFile);
        System.out.println("Enter your text please : ");
        String enteredText = myScanner.nextLine();

        myFileWriter.write(enteredText);
        myFileWriter.close();

        System.out.println("Your text has been written to the file!!!");
    }
}
