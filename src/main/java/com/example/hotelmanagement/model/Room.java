package com.example.hotel.model;

public class Room {
    private String type;
    private double price;
    private String imageUrl; // Add this field for image URL

    // Constructors, getters, and setters
    // Constructor
    public Room(String type, double price, String imageUrl) {
        this.type = type;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
