package com.hillel.homework.homework10;

public final class KhadjitKaganate extends Kingdom implements ImproveHabitats, DevelopCity {

    private String capital;
    private int militancy;

    public KhadjitKaganate(String name, int armyAmount, String lordName, int moneyInTreasury, String capital, int militancy) {
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

    public void improveCastle() {
        System.out.println("Khadjit Kaganate is improving the castle!!!");
    }

    @Override
    public String toString() {
        return "KhadjitKaganate{" +
                "capital='" + capital + '\'' +
                ", militancy=" + militancy +
                '}';
    }

    @Override
    public void buildHabitats() {
        System.out.println("Your citizens are happy to have new habitats!!!");
    }

    @Override
    public void startMarketSale() {
        System.out.println("The market sale has started and the main square is crowded!!!");
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
