package com.hillel.classwork.lesson11;

import java.util.Arrays;

public class RoyalHarbour {

    private String lord;
    private String suzerain[] = new String[4];
    private int loyalty;
    private int defenceOfCastle;
    private String enemyArmy;

    public RoyalHarbour(String lord, String[] suzerain, int loyalty, int defenceOfCastle, String enemyArmy) {
        this.lord = lord;
        this.suzerain = suzerain;
        this.loyalty = loyalty;
        this.defenceOfCastle = defenceOfCastle;
        this.enemyArmy = enemyArmy;
    }

    public String getLord() {
        return lord;
    }

    public void setLord(String lord) {
        this.lord = lord;
    }

    public String[] getSuzerain() {
        return suzerain;
    }

    public void setSuzerain(String[] suzerain) {
        this.suzerain = suzerain;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getDefenceOfCastle() {
        return defenceOfCastle;
    }

    public void setDefenceOfCastle(int defenceOfCastle) {
        this.defenceOfCastle = defenceOfCastle;
    }

    public String getEnemyArmy() {
        return enemyArmy;
    }

    public void setEnemyArmy(String enemyArmy) {
        this.enemyArmy = enemyArmy;
    }

    @Override
    public String toString() {
        return "RoyalHarbour{" +
                "lord='" + lord + '\'' +
                ", suzerain=" + Arrays.toString(suzerain) +
                ", loyalty=" + loyalty +
                ", defenceOfCastle=" + defenceOfCastle +
                ", enemyArmy='" + enemyArmy + '\'' +
                '}';
    }
}
