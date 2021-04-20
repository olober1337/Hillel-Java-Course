package com.hillel.homework.Homework10;

public class MountAndBlade {

    public static void main(String[] args) {

        KhadjitKaganate khadjitKaganate = new KhadjitKaganate("Khadjit Kaganate", 10000, "Sanjar Khan", 25000, "Halmar", 50);
        Rhodok rhodok = new Rhodok("Kingdom of Rhodok", 15000, "King Graveth", 50000, "Veluca", 40);
        Swadia swadia = new Swadia("Kingdom of Swadia", 20000, "King Harlus", 60000, "Praven", 70);

        Archers archers = new Archers("medium", 500, "Bolgar", 45, "Khadjit Kaganate", 45);
        Infantry infantry = new Infantry("high", 1000, "King Harlus division", 60, "Kingdom of Rhodok", 70);
        Cavalry cavalry = new Cavalry("very high", 2000, "King Graveth", 80, "Kingdom of Swadia", 100);

        System.out.println(khadjitKaganate + "\n");
        khadjitKaganate.gatherArmy();
        khadjitKaganate.attackEnemy();
        khadjitKaganate.improveCastle();
        khadjitKaganate.buildHabitats();
        khadjitKaganate.startMarketSale();
        khadjitKaganate.habitat();
        khadjitKaganate.clothes();
        System.out.println("\n");

        System.out.println(rhodok + "\n");
        rhodok.gatherArmy();
        rhodok.attackEnemy();
        rhodok.startTheFeast();
        rhodok.buildHabitats();
        rhodok.startMarketSale();
        rhodok.habitat();
        rhodok.clothes();
        System.out.println("\n");

        System.out.println(swadia + "\n");
        swadia.gatherArmy();
        swadia.attackEnemy();
        swadia.trainInfantry();
        swadia.buildHabitats();
        swadia.startMarketSale();
        swadia.habitat();
        swadia.clothes();
        System.out.println("\n");

        System.out.println(archers);
        archers.march();
        archers.sing();
        archers.shoot();
        archers.putOn();
        archers.putOnArmor();
        archers.putOff();
        archers.putOffArmor();
        archers.rest();
        archers.entertainment();
        System.out.println("\n");

        System.out.println(cavalry);
        cavalry.march();
        cavalry.sing();
        cavalry.attackEnemy();
        cavalry.putOn();
        cavalry.putOnArmor();
        cavalry.putOff();
        cavalry.putOffArmor();
        cavalry.rest();
        cavalry.entertainment();
        System.out.println("\n");

        System.out.println(infantry);
        infantry.march();
        infantry.sing();
        infantry.retreat();
        infantry.putOn();
        infantry.putOnArmor();
        infantry.putOff();
        infantry.putOffArmor();
        infantry.rest();
        infantry.entertainment();
        System.out.println("\n");

    }
}
