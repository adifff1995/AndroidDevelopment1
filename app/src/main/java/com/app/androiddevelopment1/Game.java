package com.app.androiddevelopment1;

public class Game {
    private String name;
    private String type;
    private String rate;
    private int image;

    public Game(String name, String type, String rate, int image) {
        this.name = name;
        this.type = type;
        this.rate = rate;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
