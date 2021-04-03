package com.hillel.homework.homework8;

public class Table {

    private String brand;

    private int weight;

    private String colour;

    private int ratingOnWebsite;

    public Table(String brand, int weight, String colour, int ratingOnWebsite) {
        this.brand = brand;
        this.weight = weight;
        this.colour = colour;
        this.ratingOnWebsite = ratingOnWebsite;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        return "Table{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", ratingOnWebsite=" + ratingOnWebsite +
                '}';
    }
}
