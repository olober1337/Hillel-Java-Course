package com.hillel.classwork.lesson10;

public class FinalClass {

    private final String A;
    private final int B;

    public FinalClass() {
        this.A = "0";
        this.B = 0;
    }

    public FinalClass(String a, int b) {
        this();
        System.out.println("It is not possible to initialize final class fields");
    }
}
