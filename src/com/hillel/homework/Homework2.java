package com.hillel.homework;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

// Task 1
// Повторить конспект по инкременту и декременту.

        int a = 1;
        int b = --a;
        a++;

        System.out.println(a);
        System.out.println(b);

        int c = a;
        int d = a++;
        a--;

        System.out.println(c);
        System.out.println(d);

        int e = ++a;
        int f = e--;

        System.out.println(e);
        System.out.println(f);

        int g = a;
        int h = --g;

        System.out.println(g);
        System.out.println(h);

//Task 2

        byte cat = 123;
        int squirrel = cat;

        short dog = 1234;
        int bat = dog;

        int mouse = 12345;
        float frog = mouse;

        long elephant = 1234567;
        int ant = (int) elephant;

        float zebra = 123.45f;
        char parrot = (char) zebra;

        double bird = 89.1;
        float pig = (float) bird;

        char fish = 45;
        int snake = fish;

        boolean kitten = true;
        boolean puppy = kitten;

        //TODO всегда писать в конце float "f" для определения переменной "float" ибо Java будет думать, что это double

//Task 3

        byte a1 = 123; // -128 до 127
        int a2 = a1;

        String str = Integer.toString(a2);

        long b1 = 124;
        float b2 = b1;

        String str1 = Float.toString(b2);

        int c1 = 246;
        float c2 = c1;

        String str2 = Double.toString(c2);

        float d1 = 12.7f;
        double d2 = d1;

        String str3 = Double.toString(d2);

        float e1 = 24.6f;
        double e2 = e1;

        //TODO всегда писать в конце float "f" для определения переменной "float" ибо Java будет думать, что это double

        String str4 = Double.toString(e2);

        float f1 = 32.7f;
        double f2 = f1;

        String str5 = Double.toString(f2);

        System.out.println(a1 + a2 + b1 + b2 + c1 + c2 + d1 + d2 + e1 + e2 + f1 + f2);

//Task 4

        int[] numbers = {2, 5, 7, 8, 9, 10, 11, 13, 14, 16, 20};

        for (int k = 0; k < numbers.length; k++) {
            if (k % 2 == 0)
                numbers[k] *= 2;
            else numbers[k] /= 2;

            System.out.println(numbers[k]);

        //Пример взят из интернета, так как не могу понять как сделать правильно
        }
        }
}