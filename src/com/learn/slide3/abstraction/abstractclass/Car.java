package com.learn.slide3.abstraction.abstractclass;

public class Car extends Vehicle {

    private int horses;

    public Car() {}

    public Car(int year, int horses) {
        super(year);
        this.horses = horses;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    @Override
    public double getMaxSpeed() {
        return horses * horses * getYear();
    }
}
