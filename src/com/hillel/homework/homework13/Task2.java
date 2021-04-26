package com.hillel.homework.homework13;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        List<String> myFirstList = new LinkedList<>();
        List<String> mySecondList = new LinkedList<>();

        List<String> myNewList = new ArrayList<>();
        Set<String> myNewSet = new HashSet<>();
        Map<String, String> myNewMap = new HashMap<>();

        Class2 class2 = new Class2(myNewList, myNewSet, myNewMap);

        myFirstList.add("Hello friend!");
        myFirstList.add("How are you?");
        myFirstList.add("I am glad to hear you are fine!");
        System.out.println(myFirstList);

        mySecondList.add("I am fine!");
        mySecondList.add("What about you?");
        mySecondList.add("Have a marvelous day, sir!");
        System.out.println(mySecondList);

        class2.wildCards(myFirstList, mySecondList);

    }
}
