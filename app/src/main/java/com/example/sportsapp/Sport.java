package com.example.sportsapp;

public class Sport {

    String sportName;
    int sportImg;

    public Sport(String sportName, int sportImg) {
        this.sportName = sportName;
        this.sportImg = sportImg;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int getSportImg() {
        return sportImg;
    }

    public void setSportImg(int sportImg) {
        this.sportImg = sportImg;
    }
}