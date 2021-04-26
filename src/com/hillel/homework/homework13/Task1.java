package com.hillel.homework.homework13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    /*Задача 1:
    Создайте программу-опросник(Можно  вынести  в  отдельный класс с  необходимым(и) методом(ами)).
    Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
    Введенные данные сохраняются в виде ключ-значение, где ключ - это имя пользователя, а значение это данные в виде тоже ключ-значение(где ключ - это вопрос, а значение - ответ).
    Тип значения ответа на  вопрос указать на  свое усмотрение.После проведенного опроса программа должна записать результат в файл.
     */

    public static Scanner answer = new Scanner(System.in);

    public static String pathName = "C:\\Users\\mcram\\Desktop\\Homework12\\myTextFile.txt";

    public static Map<String, HashMap<String, String>> myLinkedHashMap = new LinkedHashMap<>();
    public static Map<String, String> myLinkedHashMap2 = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {

        questionsAndAnswers(myLinkedHashMap);

    }

    public static void questionsAndAnswers (Map<String, HashMap<String, String>> myLinkedHashMap) throws IOException {

        String question1 = "Enter your name please : ";
        System.out.println(question1);
        String answer1 = answer.nextLine();

        String question2 = "How are you feeling today? : ";
        System.out.println(question2);
        String answer2 = answer.nextLine();

        String question3 = "Have you smiled today? : ";
        System.out.println(question3);
        String answer3 = answer.nextLine();

        String question4 = "What is your country of residence? : ";
        System.out.println(question4);
        String answer4 = answer.nextLine();

        myLinkedHashMap2.put(question2, answer2);
        myLinkedHashMap2.put(question3, answer3);
        myLinkedHashMap2.put(question4, answer4);

        myLinkedHashMap.put(answer1, (HashMap<String, String>) myLinkedHashMap2);

        answer.close();

        File myTextFile = new File(pathName);
        FileWriter hashMapFileWriter = new FileWriter(myTextFile);
        hashMapFileWriter.write(String.valueOf(myLinkedHashMap));
        hashMapFileWriter.close();

        System.out.println("The parameters have been written to the file!!!");

    }
}