package com.hillel.homework.homework13;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        List<Class1> newList1 = new LinkedList<>();
        List<Class2> newList2 = new LinkedList<>();
        List<Class3> newList3 = new LinkedList<>();

        wildcards(newList3, newList1);

    }

    public static void wildcards (List<? extends Class3> list1, List<? super Class1> list2) {



    }
}
