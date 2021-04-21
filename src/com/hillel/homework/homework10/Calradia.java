package com.hillel.homework.homework10;

public abstract class Calradia {

    private String name;
    private int armyAmount;

    public Calradia(String name, int armyAmount) {
        this.name = name;
        this.armyAmount = armyAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmyAmount() {
        return armyAmount;
    }

    public void setArmyAmount(int armyAmount) {
        this.armyAmount = armyAmount;
    }

    public void gatherArmy() {
        System.out.println(getName()+" army is gathering");
    }

    @Override
    public String toString() {
        return "Kingdom{" +
                "name='" + name + '\'' +
                ", armyAmount=" + armyAmount +
                '}';
    }
}
