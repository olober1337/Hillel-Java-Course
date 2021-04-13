package com.hillel.classwork.lesson11;

public class Kingdom {

    static int gold = 100000;
    static String nameOfKingdom = "Westeros";
    static boolean isWar = true;
    static int countOfInhabitants = 1000000;

    public static void main(String[] args) {

        String[] suzerain = {"Baratheon", "Starks", "Lanister", "Greyjoy"};

        RoyalHarbour royalHarbour = new RoyalHarbour("Baratheon", suzerain, 30, 40, "Enemy Army");

    }
}
