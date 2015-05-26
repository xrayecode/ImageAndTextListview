package com.codexraye.listviewsample;


public class Car {
    private String make;
    private int year;
    private int iconId;
    private String condition;

    public Car(String make, int year, int iconId, String condition) {
        this.make = make;
        this.year = year;
        this.iconId = iconId;
        this.condition = condition;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getIconId() {
        return iconId;
    }

    public String getCondition() {
        return condition;
    }
}
