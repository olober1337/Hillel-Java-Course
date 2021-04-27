package com.hillel.homework.homework14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyExceptions {

    /*Здесь решил прописать логику вызова ошибки, чтобы самому понимать почему и из-за чего она вызывается.
    Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3 разные “проверяемые”(checked) ошибки.
    Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально)*/

    public void firstException() throws IOException {

        FileWriter myFileWriter = new FileWriter("myTextFile.txt");
        myFileWriter.write("Hello World!");
        myFileWriter.close();

    }

    public void secondException() {

        try {
            int num1 = 20;
            int num2 = 0;
            int result = num1/num2;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by zero!");
        }

    }

    public void thirdException() {

        try {
            List<Integer> newList = new ArrayList<>(5);
            newList.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array Index is out of Bounds!");

        }
    }
}
