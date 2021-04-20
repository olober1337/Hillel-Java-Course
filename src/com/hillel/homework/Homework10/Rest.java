package com.hillel.homework.Homework10;

public interface Rest {

    default void rest () {
        System.out.println("The army needs rest to attack well!!!");
    }

    default void entertainment () {
        System.out.println("The army needs to be entertained to keep the good morale!!!");
    }
}
