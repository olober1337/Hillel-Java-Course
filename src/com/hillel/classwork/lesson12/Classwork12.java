package com.hillel.classwork.lesson12;

import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Classwork12 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>(5);

        myList.add("name1");
        myList.add("name2");
        myList.add("name3");
        myList.add("name4");
        myList.add("name5");

        boolean a = myList.contains("name3");
        boolean b = myList.contains("name9");

//        myList.add(0, "name0");
        System.out.println("just to check");

//        myList.add(0, "updatedData");

        System.out.println("just ot check");

//        myList.remove(1);


        System.out.println(myList);

        String arrayElement_2 = myList.get(2);
        System.out.println(arrayElement_2);


        myList.set(2, "updatedName3");

        System.out.println(myList);

        int myListSize = myList.size();

        myList.set(4, null);

        System.out.println(myList);

        Iterator<String> iterator = myList.iterator();

        while (iterator.hasNext()) {
            String iteratorData2 = (String) iterator.next();
            System.out.println("myList data element : " + iteratorData2);
        }

        for (String e : myList) {
            System.out.println(e);
        }

        List<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("LinkedData1");
        myLinkedList.add("LinkedData2");
        myLinkedList.add("LinkedData3");
        myLinkedList.add("LinkedData4");
        myLinkedList.add("LinkedData5");

        System.out.println(myLinkedList);

        myLinkedList.set(2, "updatedData2");

        int size = myLinkedList.size();

        System.out.println(myLinkedList);


        List<String> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, "1", "2", "3", "4", "5");

        int counter = 1000;
        int starter = 0;
        int starter2 = 0;

        LocalTime localTime = LocalTime.now();
        System.out.println("Array List Started at : " + localTime.toString());

        while (starter < counter) {
            starter++;
            myArrayList.set(3, "updated");
            myArrayList.add(4, String.valueOf(starter));
        }

        LocalTime localTime2 = LocalTime.now();
        System.out.println("Array List Finished at : " + localTime2.toString());

        List<String> myLinkedList2 = new ArrayList<>();
        Collections.addAll(myLinkedList2, "1", "2", "3", "4", "5");


        LocalTime localTime3 = LocalTime.now();
        System.out.println("Linked List Started at : " + localTime3.toString());

        while (starter < counter) {
            starter2++;
            myArrayList.set(3, "updated");
            myLinkedList2.add(4, String.valueOf(starter2));
        }

        LocalTime localTime4 = LocalTime.now();
        System.out.println("Linked List Started at : " + localTime4.toString());



//        Set<String> mySet = new HashSet<>();
//
//        mySet.add("data1");
//        mySet.add("data2");
//        mySet.add("data3");
//        mySet.add("data4");
//
//        System.out.println(mySet);
////        mySet.addAll(myLinkedList2);
//
    }


}
