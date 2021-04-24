package com.hillel.homework.homework13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task1 {

    public static Scanner answer = new Scanner(System.in);

    public static String pathName = "C:\\Users\\mcram\\Desktop\\Homework12\\myTextFile.txt";

    public static HashMap<String, String> myHashMap = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {

        questionsAndAnswers(myHashMap);

    }

    public static void questionsAndAnswers (HashMap<String, String> myHashMap) throws IOException {

        String key_1 = "Enter your name please :";
        System.out.println(key_1);
        String answer1 = answer.nextLine().concat("\n");

        String key_2 = "How are you feeling today? :";
        System.out.println(key_2);
        String answer2 = answer.nextLine().concat("\n");

        String key_3 = "Have you smiled today? :";
        System.out.println(key_3);
        String answer3 = answer.nextLine().concat("\n");

        String key_4 = "What is your country of residence? :";
        System.out.println(key_4);
        String answer4 = answer.nextLine();

        myHashMap.put(key_1, answer1);
        myHashMap.put(key_2, answer2);
        myHashMap.put(key_3, answer3);
        myHashMap.put(key_4, answer4);

        answer.close();

        File myTextFile = new File(pathName);

        FileWriter hashMapFileWriter = new FileWriter(myTextFile);

        hashMapFileWriter.write(String.valueOf(myHashMap));

        System.out.println("The parameters have been written to the file!!!");

        hashMapFileWriter.close();

    }

}