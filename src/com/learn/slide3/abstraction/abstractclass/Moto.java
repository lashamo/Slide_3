package com.learn.slide3.abstraction.abstractclass;

public class Moto extends Vehicle {

    private double weight;

    public Moto() {}

    public Moto(int year, double weight) {
        super(year);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getMaxSpeed() {
        return getYear() * getYear() / weight;
    }
}
