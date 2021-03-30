package com.hillel.classwork.lesson2;

public class Arrays {
    public static void main(String[] args) {
        int[][] myMatrixArray = new int[3][3];
        int[][] myMatrixArrayFilled = {{1, 2}, {1, 3}};

        System.out.println(myMatrixArray);
        System.out.println(myMatrixArrayFilled);

        System.out.println(java.util.Arrays.toString(myMatrixArrayFilled));

        System.out.println(java.util.Arrays.deepToString(myMatrixArray));
        System.out.println(java.util.Arrays.deepToString(myMatrixArrayFilled));
    }

    public static boolean toString(char[] myCharArray) {
        return false;
    }
}
