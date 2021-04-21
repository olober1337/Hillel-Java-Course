package com.hillel.homework.homework10;

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
    }

    public void sing() {
    }

    @Override
    public String toString() {
        return "Units{" +
                "nameOfUnit='" + nameOfUnit + '\'' +
                ", moraleLevel=" + moraleLevel +
                '}';
    }
}
