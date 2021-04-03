package com.hillel.homework.homework8;

public class Furniture {

    private String overallRatingOfTheFurniture;

    private int price;

    private long shopPhoneNumber;

    private int weight;

    private double rating;

    private int distanceToTheShopInKm;

    private int deliveryDate;

    private long courierPhoneNumber;

    private int howManyWasPurchased;

    public Furniture() {
    }

    public Furniture(String overallRatingOfTheFurniture) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
    }

    public Furniture(String overallRatingOfTheFurniture, int price) {
        this("8 out of 10");
        this.price = price;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber) {
        this("8 out of 10", 100000);
        this.shopPhoneNumber = shopPhoneNumber;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight) {
        this("8 out of 10", 100000, 934563213);
        this.weight = weight;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating) {
        this("8 out of 10", 100000, 934563213, 100);
        this.rating = rating;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating, int distanceToTheShopInKm) {
        this("8 out of 10", 100000, 934563213, 100, 8.13);
        this.distanceToTheShopInKm = distanceToTheShopInKm;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating, int distanceToTheShop, int deliveryDate) {
        this("8 out of 10", 100000, 934563213, 100, 8.13, 20);
        this.deliveryDate = deliveryDate;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating, int distanceToTheShop, int deliveryDate, long courierPhoneNumber) {
        this("8 out of 10", 100000, 934563213, 100, 8.13, 20, 25);
        this.courierPhoneNumber = courierPhoneNumber;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating, int distanceToTheShop, int deliveryDate, long courierPhoneNumber, int howManyWasPurchased) {
        this("8 out of 10", 100000, 934563213, 100, 8.13, 20, 25, 964512789);
        this.howManyWasPurchased = howManyWasPurchased;
    }

    public String getOverallRatingOfTheFurniture() {
        return overallRatingOfTheFurniture;
    }

    public void setOverallRatingOfTheFurniture(String overallRatingOfTheFurniture) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    public void setShopPhoneNumber(long shopPhoneNumber) {
        this.shopPhoneNumber = shopPhoneNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDistanceToTheShopInKm() {
        return distanceToTheShopInKm;
    }

    public void setDistanceToTheShopInKm(int distanceToTheShopInKm) {
        this.distanceToTheShopInKm = distanceToTheShopInKm;
    }

    public int getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(int deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public long getCourierPhoneNumber() {
        return courierPhoneNumber;
    }

    public void setCourierPhoneNumber(long courierPhoneNumber) {
        this.courierPhoneNumber = courierPhoneNumber;
    }

    public int getHowManyWasPurchased() {
        return howManyWasPurchased;
    }

    public void setHowManyWasPurchased(int howManyWasPurchased) {
        this.howManyWasPurchased = howManyWasPurchased;
    }
}
