package com.hillel.homework.homework8;

public class Furniture {

    private String overallRatingOfTheFurniture;

    private int price;

    private long shopPhoneNumber;

    private int weight;

    private double rating;

    private int distanceToTheShop;

    private int deliveryDate;

    private long courierPhoneNumber;

    private int howManyWasPurchased;

    public Furniture() {
    }

    public Furniture(String overallRatingOfTheFurniture) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
    }

    public Furniture(String overallRatingOfTheFurniture, int price) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
        this.price = price;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
        this.price = price;
        this.shopPhoneNumber = shopPhoneNumber;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
        this.price = price;
        this.shopPhoneNumber = shopPhoneNumber;
        this.weight = weight;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
        this.price = price;
        this.shopPhoneNumber = shopPhoneNumber;
        this.weight = weight;
        this.rating = rating;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating, int distanceToTheShop) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
        this.price = price;
        this.shopPhoneNumber = shopPhoneNumber;
        this.weight = weight;
        this.rating = rating;
        this.distanceToTheShop = distanceToTheShop;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating, int distanceToTheShop, int deliveryDate) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
        this.price = price;
        this.shopPhoneNumber = shopPhoneNumber;
        this.weight = weight;
        this.rating = rating;
        this.distanceToTheShop = distanceToTheShop;
        this.deliveryDate = deliveryDate;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating, int distanceToTheShop, int deliveryDate, long courierPhoneNumber) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
        this.price = price;
        this.shopPhoneNumber = shopPhoneNumber;
        this.weight = weight;
        this.rating = rating;
        this.distanceToTheShop = distanceToTheShop;
        this.deliveryDate = deliveryDate;
        this.courierPhoneNumber = courierPhoneNumber;
    }

    public Furniture(String overallRatingOfTheFurniture, int price, long shopPhoneNumber, int weight, double rating, int distanceToTheShop, int deliveryDate, long courierPhoneNumber, int howManyWasPurchased) {
        this.overallRatingOfTheFurniture = overallRatingOfTheFurniture;
        this.price = price;
        this.shopPhoneNumber = shopPhoneNumber;
        this.weight = weight;
        this.rating = rating;
        this.distanceToTheShop = distanceToTheShop;
        this.deliveryDate = deliveryDate;
        this.courierPhoneNumber = courierPhoneNumber;
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

    public int getDistanceToTheShop() {
        return distanceToTheShop;
    }

    public void setDistanceToTheShop(int distanceToTheShop) {
        this.distanceToTheShop = distanceToTheShop;
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
