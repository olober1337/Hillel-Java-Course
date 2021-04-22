package com.hillel.homework.homework12;

public class Walk {

    private int value;

    public Walk(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void walk() {
        System.out.println("I'm walking!");
    }

    @Override
    public String toString() {
        return "Walk{" +
                "value=" + value +
                '}';
    }
}
