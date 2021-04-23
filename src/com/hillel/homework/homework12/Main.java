package com.hillel.homework.homework12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> myNewList = new ArrayList<>(8);

        addingValuesToTheList(myNewList);
        iteratorOperations(myNewList);

    }

    public static List<Object> addingValuesToTheList (List<Object> myNewList) {

        System.out.println("Adding 6 values to the List :".concat("\n"));

        Walk walk1 = new Walk(1);
        Walk walk2 = new Walk(2);
        Walk walk3 = new Walk(3);
        Walk walk4 = new Walk(4);
        Walk walk5 = new Walk(5);
        Walk walk6 = new Walk(6);

        if (myNewList.isEmpty()) {
            myNewList.add(walk1);
            myNewList.add(walk2);
            myNewList.add(walk3);
            myNewList.add(walk4);
            myNewList.add(walk5);
            myNewList.add(walk6);
        }

        System.out.println(myNewList + "\n");

        System.out.println("Adding 3 values in the beginning :".concat("\n") + myNewList + "\n");

        Run run1 = new Run(1);
        Run run2 = new Run(2);
        Run run3 = new Run(3);

        myNewList.add(0, run1);
        myNewList.add(0, run2);
        myNewList.add(0, run3);


        Ride ride1 = new Ride(1);
        Ride ride2 = new Ride(2);
        Ride ride3 = new Ride(3);

        System.out.println("Replacing the last 3 values :".concat("\n") + myNewList + "\n");

        myNewList.set(6, ride1);
        myNewList.set(7, ride2);
        myNewList.set(8, ride3);

        return myNewList;
    }

    public static List<Object> iteratorOperations (List<Object> myNewList) {

        System.out.println("My list before values removal :".concat("\n") + myNewList + "\n");

        Iterator<Object> iterator = myNewList.iterator();

        int walk = 0;
        int run = 0;
        int ride = 0;

        while (iterator.hasNext()) {
            Object value = iterator.next();
            if (value instanceof Walk) {
                walk++;
                if (walk > 2) {
                    iterator.remove();
                }
            } else if (value instanceof Run) {
                run++;
                if (run > 2) {
                    iterator.remove();
                }
            } else if (value instanceof Ride){
                ride++;
                if (ride > 2) {
                    iterator.remove();
                }
            }
        }

        System.out.println("My list after values removal :".concat("\n") + myNewList + "\n");

        return myNewList;
    }
}
