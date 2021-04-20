package com.hillel.homework.Homework10;

public class MountAndBlade {

    public static void main(String[] args) {

        //Home Task:

        //Имея представления об обычных классах, абстрактных классах и интерфейсах необходимо создать следующие реализации:
        //Создайте  2 цепочки классов(из примера в  классе: “Animal <- Cat <- Persian” / “People <- Employee <- FireMan”),только придумать свои классы. Условия:

        //а). Всего классов для каждой цепочки должно быть 5;
        //б). Один главный класс, второй -  наследуется от главного, и еще 3 класса, которые наследуются от второго;
        //в). Главный класс и второй класс наследник должен быть “без возможности создавать экземпляр  класса”(подумайте какими именно должны быть классы?)
        //г). В каждом класса должно быть минимум по 2 характеристики и по 1 методу(дополнительному);
        //д). Для каждого класса реализуйте все необходимые методы для работы, зная пройденные принципы ООП;
        //е). Финальные 3 класса-наследника в каждой цепочке должны быть “не наследуемые”;

        //Создайте 5 интерфейсов со следующими условиями:

        //а). Должно быть 2 пары, один интерфейс наследуется от другого и 1 отдельный интерфейс;
        //б). У каждого из 5 интерфейсов определите 2 заданных метода;
        //в). Одна цепочка классов должна имплементировать одну связку интерфейсов, а вторая цепочка классов должна имплементировать другую связку интерфейсов и  оставшийся отдельный интерфейс;
        //В классе Main создайте экземпляры всех классов и интерфейсов, запишите значения характеристик там где возможно и вызовите все реализованные дополнительные методы в них.

        KhadjitKaganate khadjitKaganate = new KhadjitKaganate("Khadjit Kaganate", 10000, "Sanjar Khan", 25000, "Halmar", 50);
        Rhodok rhodok = new Rhodok("Kingdom of Rhodok", 15000, "King Graveth", 50000, "Veluca", 40);
        Swadia swadia = new Swadia("Kingdom of Swadia", 20000, "King Harlus", 60000, "Praven", 70);

        Archers archers = new Archers("medium", 500, "Bolgar", 45, "Khadjit Kaganate", 45);
        Infantry infantry = new Infantry("high", 1000, "King Harlus division", 60, "Kingdom of Rhodok", 70);
        Cavalry cavalry = new Cavalry("very high", 2000, "King Graveth", 80, "Kingdom of Swadia", 100);

        System.out.println("Welcome, Khadjit Kaganate!!! \n");
        khadjitKaganate.gatherArmy();
        khadjitKaganate.attackEnemy();
        khadjitKaganate.improveCastle();
        khadjitKaganate.buildHabitats();
        khadjitKaganate.startMarketSale();
        khadjitKaganate.habitat();
        khadjitKaganate.clothes();
        System.out.println("\n");

        System.out.println("Welcome, Kingdom of Rhodok!!! \n");
        rhodok.gatherArmy();
        rhodok.attackEnemy();
        rhodok.startTheFeast();
        rhodok.buildHabitats();
        rhodok.startMarketSale();
        rhodok.habitat();
        rhodok.clothes();
        System.out.println("\n");

        System.out.println("Welcome, Kingdom of Swadia!!! \n");
        swadia.gatherArmy();
        swadia.attackEnemy();
        swadia.trainInfantry();
        swadia.buildHabitats();
        swadia.startMarketSale();
        swadia.habitat();
        swadia.clothes();
        System.out.println("\n");

        System.out.println("Here come our brave archers!!! \n");
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

        System.out.println("Here come our brave cavalry!!! \n");
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

        System.out.println("Here come our brave infantry!!! \n");
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
