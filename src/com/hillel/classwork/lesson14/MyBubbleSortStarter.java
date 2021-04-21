package com.hillel.classwork.lesson14;

public class MyBubbleSortStarter {

    public static void main(String[] args) {

        MyBubbleSort myBubbleSort = new MyBubbleSort(7);

        myBubbleSort.insert(32);
        myBubbleSort.insert(1);
        myBubbleSort.insert(113);
        myBubbleSort.insert(10321);
        myBubbleSort.insert(0);
        myBubbleSort.insert(100);
        myBubbleSort.insert(5);

        System.out.println("before bubble sort ");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        myBubbleSort.printArray();

        myBubbleSort.myBubbleSorter();

        System.out.println("after bubble sort ");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        myBubbleSort.printArray();
    }
}