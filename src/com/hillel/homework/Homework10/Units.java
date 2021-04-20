package com.hillel.homework.Homework10;

public abstract class Units extends Troops {

    private String nameOfUnit;
    private int moraleLevel;

    public Units(String levelOfTraining, int amountOfTroops, String nameOfUnit, int moraleLevel) {
        super(levelOfTraining, amountOfTroops);
        this.nameOfUnit = nameOfUnit;
        this.moraleLevel = moraleLevel;
    }

    public String getNameOfUnit() {
        return nameOfUnit;
    }

    public void setNameOfUnit(String nameOfUnit) {
        this.nameOfUnit = nameOfUnit;
    }

    public int getMoraleLevel() {
        return moraleLevel;
    }

    public void setMoraleLevel(int moraleLevel) {
        this.moraleLevel = moraleLevel;
    }

    @Override
    public void march() {
        super.march();
        System.out.println("The units are marching!!!");
    }

    public void sing() {
        System.out.println("The units started singing a war song!!!");
    }

    @Override
    public String toString() {
        return "Units{" +
                "nameOfUnit='" + nameOfUnit + '\'' +
                ", moraleLevel=" + moraleLevel +
                '}';
    }
}
