package com.hillel.homework.Homework10;

public final class Infantry extends Units implements Ammunition, Armor, Rest{

    private String infantryOfKingdom;
    private int loyalty;

    public Infantry(String levelOfTraining, int amountOfTroops, String nameOfUnit, int moraleLevel, String infantryOfKingdom, int amountOfInfantry) {
        super(levelOfTraining, amountOfTroops, nameOfUnit, moraleLevel);
        this.infantryOfKingdom = infantryOfKingdom;
        this.loyalty = amountOfInfantry;
    }

    public String getInfantryOfKingdom() {
        return infantryOfKingdom;
    }

    public void setInfantryOfKingdom(String infantryOfKingdom) {
        this.infantryOfKingdom = infantryOfKingdom;
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
        System.out.println(getNameOfUnit()+" is marching!!!");
    }

    @Override
    public void sing() {
        super.sing();
        System.out.println("The infantry started singing a war song!!!");
    }

    public void retreat() {
        System.out.println("The infantry is retreating!!!");
    }

    @Override
    public String toString() {
        return "Infantry{" +
                "infantryOfKingdom='" + infantryOfKingdom + '\'' +
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
