package com.hillel.classwork.lesson14;

public class MyCustomException extends Exception {

    @Override
    public String getMessage() {
        return "my custom exception is there!)";
    }
}
