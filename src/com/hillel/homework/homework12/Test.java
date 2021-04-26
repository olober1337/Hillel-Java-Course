package com.hillel.homework.homework12;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            List<Integer> newList = new ArrayList<>(5);
            newList.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array Index is out of Bounds!");

        }
    }

}
