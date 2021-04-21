package com.hillel.homework.homework10;

public final class Archers extends Units implements Ammunition, Armor, Rest {

    private String archersOfKingdom;
    private int loyalty;

    public Archers(String levelOfTraining, int amountOfTroops, String nameOfUnit, int moraleLevel, String archersOfKingdom, int loyalty) {
        super(levelOfTraining, amountOfTroops, nameOfUnit, moraleLevel);
        this.archersOfKingdom = archersOfKingdom;
        this.loyalty = loyalty;
    }

    public String getArchersOfKingdom() {
        return archersOfKingdom;
    }

    public void setArchersOfKingdom(String archersOfKingdom) {
        this.archersOfKingdom = archersOfKingdom;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    @Override
    public void march() {
        super.march();
        System.out.println(getNameOfUnit()+" are marching!!!");
    }

    @Override
    public void sing() {
        super.sing();
        System.out.println("The archers started singning a war song!!!");
    }

    public void shoot() {
        System.out.println("The archers are shooting the enemy troops!!!");
    }

    @Override
    public String toString() {
        return "Archers{" +
                "archersOfKingdom='" + archersOfKingdom + '\'' +
                ", loyalty=" + loyalty +
                '}';
    }

    @Override
    public void putOn() {

    }

    @Override
    public void putOff() {

    }

    @Override
    public void putOnArmor() {

    }

    @Override
    public void putOffArmor() {

    }

    @Override
    public void rest() {
        Rest.super.rest();
    }

    @Override
    public void entertainment() {
        Rest.super.entertainment();
    }
}
