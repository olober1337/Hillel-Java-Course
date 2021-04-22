package com.hillel.homework.homework12;

public class Run {

    private int value;

    public Run(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void run() {
        System.out.println("I'm running!");
    }

    @Override
    public String toString() {
        return "Run{" +
                "value=" + value +
                '}';
    }
}
