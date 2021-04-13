package com.hillel.classwork.lesson11;

import java.util.Random;

public class Lord {

    private String lordName;
    private int life = 100;
    private boolean loyalty;

    public Lord(String lordName, int life) {
        this.loyalty = randomLoyalty();
        this.lordName = lordName;
        this.life = life;
    }

    public String getLordName() {
        return lordName;
    }

    public void setLordName(String lordName) {
        this.lordName = lordName;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isLoyalty() {
        return loyalty;
    }

    public void setLoyalty(boolean loyalty) {
        this.loyalty = loyalty;
    }

    private boolean randomLoyalty() {

        Random myRandom = new Random(100);
        int a = myRandom.nextInt();

        if (a > 50) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lord{" +
                "lordName='" + lordName + '\'' +
                ", life=" + life +
                ", loyalty=" + loyalty +
                '}';
    }
}
