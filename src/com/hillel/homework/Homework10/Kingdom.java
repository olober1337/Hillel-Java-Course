package com.hillel.homework.Homework10;

public abstract class Kingdom extends Calradia {

    private String lordName;
    private int moneyInTreasury;

    public Kingdom(String name, int armyAmount, String lordName, int moneyInTreasury) {
        super(name, armyAmount);
        this.lordName = lordName;
        this.moneyInTreasury = moneyInTreasury;
    }

    public String getLordName() {
        return lordName;
    }

    public void setLordName(String lordName) {
        this.lordName = lordName;
    }

    public int getMoneyInTreasury() {
        return moneyInTreasury;
    }

    public void setMoneyInTreasury(int moneyInTreasury) {
        this.moneyInTreasury = moneyInTreasury;
    }

    @Override
    public void gatherArmy() {
        super.gatherArmy();
    }

    public void attackEnemy() {
        System.out.println(getName()+"army is attacking");
    }

    @Override
    public String toString() {
        return "Kingdom{" +
                "lordName='" + lordName + '\'' +
                ", moneyInTreasury=" + moneyInTreasury +
                '}';
    }
}
