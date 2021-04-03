package com.hillel.homework.homework8;

import java.sql.SQLOutput;

public class Console {

    private String brand;

    private int weight;

    private String colour;

    private int ratingOnWebsite;

    public Console(){
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand.equalsIgnoreCase("playstation 5")) {
            this.brand = "Playstation 5";
            System.out.println("It's a marvelous choice to buy such a great console !!!");
        } else {
            System.out.println("Well, it's a good one too !!!");
            this.brand = brand;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRatingOnWebsite() {
        return ratingOnWebsite;
    }

    public void setRatingOnWebsite(int ratingOnWebsite) {
        this.ratingOnWebsite = ratingOnWebsite;
    }

    @Override
    public String toString() {
        return "Console{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", ratingOnWebsite=" + ratingOnWebsite +
                '}';
    }
}
