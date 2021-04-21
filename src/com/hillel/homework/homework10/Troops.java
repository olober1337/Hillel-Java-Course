package com.hillel.homework.homework10;

public abstract class Troops {

    private String levelOfTraining;
    private int amountOfTroops;

    public Troops(String levelOfTraining, int amountOfTroops) {
        this.levelOfTraining = levelOfTraining;
        this.amountOfTroops = amountOfTroops;
    }

    public String getLevelOfTraining() {
        return levelOfTraining;
    }

    public void setLevelOfTraining(String levelOfTraining) {
        this.levelOfTraining = levelOfTraining;
    }

    public int getAmountOfTroops() {
        return amountOfTroops;
    }

    public void setAmountOfTroops(int amountOfTroops) {
        this.amountOfTroops = amountOfTroops;
    }

    public void march() {
    }

    @Override
    public String toString() {
        return "Troops{" +
                "levelOfTraining='" + levelOfTraining + '\'' +
                ", amountOfTroops=" + amountOfTroops +
                '}';
    }
}
