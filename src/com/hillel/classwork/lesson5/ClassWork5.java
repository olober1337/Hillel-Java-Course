package com.hillel.classwork.lesson5;

import java.sql.SQLOutput;

public class ClassWork5 {

    public static void main(String[] args) {
// simple ternary java operation
//        int a = 10;
//        int b = 100;
//
//        int x  = (a < b) ? 15 : 30;
//
//        System.out.println(x);

        // switch java operator - is used for int, byte, short, string, char

        int month = 12;

        switch(month)  {
            case 1 :
                System.out.println("This is January");
                break;
            case 2 :
                System.out.println("This is February");
                break;
            case 3:
                System.out.println("This is March");
                break;
            case 4 :
                System.out.println("This is April");
                break;
            default:
                System.out.println("Unknown month!!!");
        }

    }


}
