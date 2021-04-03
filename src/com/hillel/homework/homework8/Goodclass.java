package com.hillel.homework.homework8;

public class Goodclass {

// Создайте класс с 3 параметрами final.
// Создайте в нем конструктор по-умолчанию и конструктор со всеми параметрами.
// Создайте для всех полей getter и setter.

    private final String brand = "Playstation 5";

    private final int price = 600;

    private final int maximumWaitingTime = 3;

    public Goodclass() {
    }

    /* Здесь невозможно создать конструктор со всеми параметрами так как мы определили, что все три параметра имеют метод final.
    Метод final обозначает, что параметры неизменны (immutable).
    Также, невозможно задать для введенных параметров setter, так как мы уже обозначили все данные параметров вначале.
    Мы можем только лишь обозначить getter для того, чтобы получить значения из класса goodclass в нашем основном классе "house".
    */

//    public goodclass(String brand, int price, int maximumWaitingTime) {
//        this.brand = brand;
//        this.price = price;
//        this.maximumWaitingTime = maximumWaitingTime;
//    }

    public String getBrand() {
        return brand;
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    public int getPrice() {
        return price;
    }

//    public void setPrice(int price) {
//        this.price = price;
//    }

    public int getMaximumWaitingTime() {
        return maximumWaitingTime;
    }

//    public void setMaximumWaitingTime(String maximumWaitingTime) {
//        this.maximumWaitingTime = maximumWaitingTime;
//    }

}
