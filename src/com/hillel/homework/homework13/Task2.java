package com.hillel.homework.homework13;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        List<Class1> newList1 = new LinkedList<>();
        newList1.add(new Class1());
        List<Class2> newList2 = new LinkedList<>();
        newList2.add(new Class2());
        List<Class3> newList3 = new LinkedList<>();
        newList3.add(new Class3());

        wildcards(newList3, newList1);

    }

    public static void wildcards (List<? extends Class3> list1, List<? super Class1> list2) {

        list2.addAll(list1);

    }
}
