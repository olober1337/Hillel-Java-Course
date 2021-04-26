package com.hillel.homework.homework14;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MyMiddleClassForExceptions {

    /*Объект решил создать, чтобы иметь возможность вызвать методы другого класса.
    Создайте еще один класс, у которого будет также три промежуточных метода, которые просто будут вызывать по одному методу первого класса.
    Эти методы не должны обрабатывать возможные  ошибки, а просто пробрасывают  полученную  ошибку  выше.
     */

    MyExceptions myExceptions = new MyExceptions();

    public void ioException() throws IOException {

        myExceptions.firstException();

    }

    public void arithmeticException() throws ArithmeticException {

        myExceptions.secondException();

    }

    public void indexOutOfBoundsException() throws IndexOutOfBoundsException {

        myExceptions.thirdException();

    }
}
