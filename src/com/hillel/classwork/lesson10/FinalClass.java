package com.hillel.classwork.lesson10;

public class FinalClass {

    private final String a;
    private final int b;

//    public FinalClass() {
//    }

    public FinalClass(String a, int b) {
        System.out.println("It is not possible to initialize final class fields");
        this.a = a;
        this.b = b;
    }

}
