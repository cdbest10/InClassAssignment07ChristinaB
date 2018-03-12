package com.example.android.inclassassignment07_christinab;

import java.io.Serializable;

public class Animal implements Serializable{


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    private String animalName;
    private String legs;

    private String moreInfo;
    private boolean hasFur;


    public Animal(String animalName, String legs, String moreInfo, boolean hasFur) {
        this.legs = legs;
        this.animalName = animalName;
        this.moreInfo = moreInfo;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "Animal Type: " + animalName + "\nNumber of Legs: " + legs + "\nHas Fur: " + hasFur + "\nMore Information: " + moreInfo;
    }
}
