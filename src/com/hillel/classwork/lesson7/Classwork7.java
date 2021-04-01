package com.hillel.classwork.lesson7;

import java.util.Random;

public class Classwork7 {

    static private int covidResearchIndex = 0;

    public static void main(String[] args) {

        Coronavirus covid = new Coronavirus("covid-21");

        Emergency hillel_emergency_service = new Emergency("hillel emergency service", 99);

        Scientist einstein = new Scientist("Einstein");

        Scientist esmeralda = new Scientist("Esmeralda");

        Scientist alfred = new Scientist("Alfred");

        Human vadym = new Human("Vadym", 25, "male", 100);
        System.out.println("vadym object fields values is : " + vadym.toString());

        Human danil = new Human("Danil", 29, "male", 100);
        System.out.println("vlad object fields values is : " + danil.toString());

        Human vika = new Human("Vika", 20, "female", 100);
        System.out.println("vika object fields values is : " + vika.toString());

        System.out.println("FIRST WAVE OF CORONA");
        covid.attack(vadym);
        covid.attack(danil);
        covid.attack(vika);

//        coronaAttack(vadym);
//        coronaAttack(danil);
//        coronaAttack(vika);

        System.out.println("SECOND WAVE OF CORONA");

        covid.attack(vadym);
        covid.attack(danil);
        covid.attack(vika);

//        coronaAttack(vadym);
//        coronaAttack(danil);
//        coronaAttack(vika);

        System.out.println("THIRD WAVE OF CORONA");

        covid.attack(vadym);
        covid.attack(danil);
        covid.attack(vika);

//        coronaAttack(vadym);
//        coronaAttack(danil);
//        coronaAttack(vika);

        System.out.println("FOURTH WAVE OF CORONA");

        covid.attack(vadym);
        covid.attack(danil);
        covid.attack(vika);

//        coronaAttack(vadym);
//        coronaAttack(danil);
//        coronaAttack(vika);
//
//        boolean isAliveVadym = isHumanAlive(vadym);
//        boolean isAliveDanil = isHumanAlive(danil);
//        boolean isAliveVika = isHumanAlive(vika);
//
//        if (!isAliveVadym) {
//            callEmergency(vadym);
//        }
//        if (!isAliveDanil) {
//            callEmergency(danil);
//        }
//        if (!isAliveVika) {
//            callEmergency(vika);
//        }

        hillel_emergency_service.checkIsHumanAliveAndCure(vadym);
        hillel_emergency_service.checkIsHumanAliveAndCure(danil);
        hillel_emergency_service.checkIsHumanAliveAndCure(vika);

        updateResearchIndexByScientist(einstein);
        updateResearchIndexByScientist(esmeralda);
        updateResearchIndexByScientist(alfred);
//
//        covidResearchIndex = covidResearchIndex + einstein.performResearch();
//        covidResearchIndex = covidResearchIndex + esmeralda.performResearch();
//        covidResearchIndex = covidResearchIndex + alfred.performResearch();

        System.out.println("covidResearchIndex now is : " + covidResearchIndex);

        covid.scientistImpactToDefeatCoronavirus(covidResearchIndex);

        System.out.println("FIFTH WAVE OF CORONA");

        covid.attack(vadym);
        covid.attack(danil);
        covid.attack(vika);

//        isCovidDefeated(covid);
    }

//    private static void isCovidDefeated (Coronavirus coronavirus) {
//        boolean isDefeated = covidResearchIndex >= 100;
//
//        if (isDefeated) {
//            System.out.println("HHHHHHEEEEYYYYYY COVID DEFEATED !!!!!!");
//            coronavirus.setCuredAndDestroyed(true);
//        } else {
//            System.out.println("HHHHHHEEEEYYYYYY NOT DEFEATED YET!!!!!! STILL WAIT FOR RESEARCH, STATUS : " + covidResearchIndex);
//        }
//
//    }

    private static void coronaAttack(Human human) {

        if(human.getHealth() > 0) {
            int damage = getRandomInt(0, human.getHealth());
            human.setHealth(damage);
        }

        System.out.println("coronavirus attacked human ".concat(human.getName()));
        System.out.println("human health status :" + human.getHealth());

    }

    private static boolean isHumanAlive(Human human) {
        System.out.println("start checking is human :".concat(human.getName()));

        boolean isAlive = true;

        int humanHealth = human.getHealth();

        if (humanHealth < 1) {
            System.out.println("Human ".concat(human.getName()).concat(" is dead"));
            isAlive = false;

// call emergency by object
        }

        return isAlive;
    }

    private static void callEmergency (Human human) {

        System.out.println("starting emergency service for ".concat(human.getName()));

        int healthUp = getRandomInt(1, 100);
        human.setHealth(healthUp);

        System.out.println(human.getName().concat(" is saved!!! Health now :" + healthUp));
    }

    private static int getRandomInt (int min, int max) {
        Random randomHealthDamage = new Random();
        return randomHealthDamage.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    private static void updateResearchIndexByScientist (Scientist scientist){
        covidResearchIndex = covidResearchIndex + scientist.performResearch();
    }
}

