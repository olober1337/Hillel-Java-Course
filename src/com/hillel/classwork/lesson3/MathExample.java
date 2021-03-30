package com.hillel.classwork.lesson3;

import java.util.Random;

public class MathExample {

    public static void main(String[] args){
//
//
//        int minDigit = Math.min(100, 45);
//
//        int maxDigit = Math.max(4, 19);
//
//        System.out.println(" min digit value is :" + minDigit);
//
//        System.out.println(" min digit value is :" + maxDigit);
//
//        System.out.println(maxDigit + " min digit value is :");
//
//        double randomDigit = Math.random();
//
//        System.out.println(randomDigit);

        Random randomVariable = new Random(2L);

        int boundedRandomDigit = randomVariable.nextInt(6);

        System.out.println(randomVariable.nextInt(6));
    }
}
