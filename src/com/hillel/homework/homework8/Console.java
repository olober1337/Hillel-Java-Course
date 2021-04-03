package com.hillel.homework.homework8;

public class Console {

    private String brand;

    private int weight;

    private String colour;

    private int ratingOnWebsite;

    public Console() {
    }

    public Console(String brand, int weight, String colour, int ratingOnWebsite) {
        this.brand = brand;
        this.weight = weight;
        this.colour = colour;
        this.ratingOnWebsite = ratingOnWebsite;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.equalsIgnoreCase("Playstation 5")) {
            System.out.println("It's a great choice !!!");
            this.brand = brand;
        } else {
            System.out.println("It's a good one too !!!");
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
