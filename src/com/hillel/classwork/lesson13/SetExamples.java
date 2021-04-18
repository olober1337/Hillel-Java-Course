package com.hillel.classwork.lesson13;

import java.util.*;

public class SetExamples {

    static SortStudentsByName sortStudentsByName = new SortStudentsByName();

    static Set<String> myHashSet = new HashSet<>();
    static List<Student> myStudentsArrayList = new ArrayList<>();
    static Set<String> myLinkedHashSet = new LinkedHashSet<>();
    static Set<String> myTreeSet = new TreeSet<>();
    static Set<Integer> myIntTreeSet = new TreeSet<>();
    static Set<Student> myStudentTreeSet = new TreeSet<>();

    public static void main(String[] args) {

        String name_1 = "Olga";
        String name_2 = "Vova";
        String name_3 = "Ekaterina";
        String name_4 = "Alexandra";
        String name_5 = "Yana";

        int value_1 = 1;
        int value_2 = 2;
        int value_3 = 3;
        int value_4 = 4;
        int value_5 = 5;

        myHashSet.add(name_1);
        myHashSet.add(name_2);
        myHashSet.add(name_3);
        myHashSet.add(name_4);
        myHashSet.add(name_5);

        System.out.println(myHashSet);
        System.out.println("%%%%%%%%%%%%%%%");

        myLinkedHashSet.add(name_1);
        myLinkedHashSet.add(name_2);
        myLinkedHashSet.add(name_3);
        myLinkedHashSet.add(name_4);
        myLinkedHashSet.add(name_5);

        System.out.println(myLinkedHashSet);
        System.out.println("%%%%%%%%%%%%%%%");

        myTreeSet.add(name_1);
        myTreeSet.add(name_2);
        myTreeSet.add(name_3);
        myTreeSet.add(name_4);
        myTreeSet.add(name_5);

        System.out.println(myTreeSet);
        System.out.println("%%%%%%%%%%%%%%%");

        myIntTreeSet.add(value_3);
        myIntTreeSet.add(value_2);
        myIntTreeSet.add(value_1);
        myIntTreeSet.add(value_4);
        myIntTreeSet.add(value_5);

        System.out.println(myIntTreeSet);
        System.out.println("%%%%%%%%%%%%%%%");

        System.out.println("custom object sorting");

        Student vadym = new Student("Vadym", 18);
        Student olga = new Student("Olga", 19);
        Student evgeniy = new Student("Evgeniy", 20);
        Student yana = new Student("Yana", 21);

//        myStudentTreeSet.add(vadym);
//        myStudentTreeSet.add(olga);
//        myStudentTreeSet.add(evgeniy);

//        System.out.println("unsorted myStudentTreeSet");
//        System.out.println(myStudentTreeSet);
//        System.out.println("%%%%%%%%%%%%%%%");

        myStudentsArrayList.add(yana);
        myStudentsArrayList.add(vadym);
        myStudentsArrayList.add(olga);
        myStudentsArrayList.add(evgeniy);

        System.out.println("unsorted myStudentTreeSet");
        System.out.println(myStudentsArrayList);
        System.out.println("%%%%%%%%%%%%%%%");
//алгоритм красное и черное дерево
        System.out.println("start sorting myStudentArrayList");
        Collections.sort(myStudentsArrayList, sortStudentsByName);
        System.out.println(myStudentsArrayList);
        System.out.println("%%%%%%%%%%%%%%%");
    }
}
