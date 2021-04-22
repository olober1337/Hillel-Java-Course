package com.hillel.homework.homework12;

public class Ride {

    private int value;

    public Ride(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void ride() {
        System.out.println("I'm riding!");
    }

    @Override
    public String toString() {
        return "Ride{" +
                "value=" + value +
                '}';
    }
}
