package com.hillel.homework;

public class Homework6 {

    public static void main(String[] args) {

//Дана строка: “ Hillel is my feature. I will be developer   ”
//Необходимо выполнить следующие действия:

        String newString = "  Hillel is my feature. I will be developer      ";

//Проверить не пустой ли заданный текст

        boolean myNewStringEmptyOrNot = newString.isEmpty();
        System.out.println(myNewStringEmptyOrNot + "\n");

//Вывести длину данного текста

        int myNewStringLength = newString.length();
        System.out.println("My newString length is : " + myNewStringLength + "\n");

//Вывести длину данного текста убрав лишние пробелы вначале и конце текста

        String myNewStringTrimmed = newString.trim();
        System.out.println("My newString length when trimmed is : " + myNewStringTrimmed.length() + "\n");

//Используя команду получения значения из строки по индексу вывести “I”

        char getStringIndex = newString.charAt(4);
        System.out.println("The index is : " + getStringIndex + "\n");

//Используя команду обрезания вывести “developer”

        String myNewStringSub = newString.substring(34, 43);
        System.out.println("The word is : " + myNewStringSub + "\n");

//Добавить в конце строки знак “!”

        String sign = "!";
        String myNewAddedSignString = myNewStringTrimmed;
        myNewAddedSignString = myNewStringTrimmed + sign;
        System.out.println(myNewAddedSignString + "\n");

//Выполните сравнение заданной строки со строкой: “Hillel is my feature. I will be DEVELOPER” так, чтобы в одном случае они были равны, а в другом не равны

        String myNewStringEqual1 = "Hillel is my feature. I will be DEVELOPER";

        boolean myNewStringEquals = myNewStringTrimmed.equals(myNewStringEqual1);
        boolean myNewStringEquals1 = myNewStringTrimmed.equalsIgnoreCase(myNewStringEqual1);

        System.out.println(myNewStringEquals + "\n");
        System.out.println(myNewStringEquals1 + "\n");

//Выведите данную строку в нижнем регистре

        String myNewStringUpperCase = myNewStringTrimmed.toUpperCase();
        System.out.println(myNewStringUpperCase + "\n");

//Выведите данную строку в верхнем регистре

        String myNewStringLowerCase = myNewStringTrimmed.toLowerCase();
        System.out.println(myNewStringLowerCase + "\n");

    }
}

