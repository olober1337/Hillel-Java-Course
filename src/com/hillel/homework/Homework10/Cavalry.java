package com.hillel.homework.Homework10;

public final class Cavalry extends Units implements Ammunition, Armor, Rest{

    private String cavalryOfKingdom;
    private int loyalty;

    public Cavalry(String levelOfTraining, int amountOfTroops, String nameOfUnit, int moraleLevel, String cavalryOfKingdom, int loyalty) {
        super(levelOfTraining, amountOfTroops, nameOfUnit, moraleLevel);
        this.cavalryOfKingdom = cavalryOfKingdom;
        this.loyalty = loyalty;
    }

    public String getCavalryOfKingdom() {
        return cavalryOfKingdom;
    }

    public void setCavalryOfKingdom(String cavalryOfKingdom) {
        this.cavalryOfKingdom = cavalryOfKingdom;
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
        System.out.println(getNameOfUnit()+" started marching!!!");
    }

    @Override
    public void sing() {
        super.sing();
        System.out.println("The cavalry started singing a war song!!!");
    }

    public void followTheCommander() {
        System.out.println("The cavalry is following the commander!!!");
    }

    @Override
    public String toString() {
        return "Cavalry{" +
                "cavalryOfKingdom='" + cavalryOfKingdom + '\'' +
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
