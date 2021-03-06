package com.hillel.homework.homework10;

public final class Rhodok extends Kingdom implements DevelopCity, ImproveHabitats{

    private String capital;
    private int militancy;

    public Rhodok(String name, int armyAmount, String lordName, int moneyInTreasury, String capital, int militancy) {
        super(name, armyAmount, lordName, moneyInTreasury);
        this.capital = capital;
        this.militancy = militancy;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getMilitancy() {
        return militancy;
    }

    public void setMilitancy(int militancy) {
        this.militancy = militancy;
    }

    @Override
    public void gatherArmy() {
        super.gatherArmy();
    }

    @Override
    public void attackEnemy() {
        super.attackEnemy();
    }

    public void startTheFeast() {
        System.out.println("The Kingdom of Rhodok is starting the Feast in Veluca!!!");
    }

    @Override
    public String toString() {
        return "Rhodok{" +
                "capital='" + capital + '\'' +
                ", militancy=" + militancy +
                '}';
    }

    @Override
    public void buildHabitats() {

    }

    @Override
    public void startMarketSale() {

    }

    @Override
    public void habitat() {
        ImproveHabitats.super.habitat();
    }

    @Override
    public void clothes() {
        ImproveHabitats.super.clothes();
    }


}
