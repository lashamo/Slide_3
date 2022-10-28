package com.learn.slide3.abstraction.abstractclass;

public abstract class Vehicle {

    private int year;

    public Vehicle() {}

    public Vehicle(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract double getMaxSpeed();
}
