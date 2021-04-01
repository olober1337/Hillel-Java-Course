package com.hillel.classwork.lesson7;

import java.util.Random;

public class Coronavirus {

    private final int RESEARCH_LIMIT_INDEX = 100;

    private boolean isCureResearched;

    private String coronavirusType;

//false by default
    private boolean isCuredAndDestroyed;

    public Coronavirus(String coronavirusType) {
        this.coronavirusType = coronavirusType;
    }

    public String getCoronavirusType() {
        return coronavirusType;
    }

    public void setCoronavirusType(String coronavirusType) {
        this.coronavirusType = coronavirusType;
    }

    public boolean isCuredAndDestroyed() {
        return isCuredAndDestroyed;
    }

    public void setCuredAndDestroyed(boolean curedAndDestroyed) {
        isCuredAndDestroyed = curedAndDestroyed;
    }

    public void attack(Human human) {
        if(human.getHealth() > 0 && (isCuredAndDestroyed == false)) {
            int damage = getRandomInt(0, human.getHealth());
            human.setHealth(damage);
        }

        System.out.println("coronavirus attacked human ".concat(human.getName()));
        System.out.println("human health status :" + human.getHealth());

    }

    private int getRandomInt (int min, int max) {
        Random randomHealthDamage = new Random();
        return randomHealthDamage.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "coronavirusType='" + coronavirusType + '\'' +
                ", isCuredAndDestroyed=" + isCuredAndDestroyed +
                '}';
    }

    public void scientistImpactToDefeatCoronavirus (int covidResearchIndex) {
        boolean isDefeated = covidResearchIndex >= RESEARCH_LIMIT_INDEX;

        if (isDefeated) {
            System.out.println("HHHHHHEEEEYYYYYY COVID DEFEATED !!!!!!");
            this.setCuredAndDestroyed(true);
        } else {
            System.out.println("HHHHHHEEEEYYYYYY NOT DEFEATED YET!!!!!! STILL WAIT FOR RESEARCH, STATUS : " + covidResearchIndex);
        }

    }
}
