package com.hillel.homework.homework8;

public class House {
    public static void main(String[] args) {

//      Здесь я решил не создавать пустые конструкторы(кроме как в console), так как это ухудшило бы код.
//      Поэтому были созданы конструкторы со всеми параметрами и, также, метод toString.

        Chair chair = new Chair("Chair Master", 10, "black", 5);
        System.out.println(chair);

        Console console = new Console("Playstation 5", 5, "white", 10);
        System.out.println(console);

        Table table = new Table("ComforTable", 7, "white", 8);
        System.out.println(table);

        Sofa sofa = new Sofa("IKEA", 30, "beige", 10);
        System.out.println(sofa);

        TV tv = new TV("Samsung", 5, "blue", 9);
        System.out.println(tv);
    }
}
