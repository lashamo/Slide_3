package com.learn.slide3.encapsulation.box;

public class Box {

    private double width;

    private double length;

    private double height;

    public final String providerCompany = "Test provider";

    public Box() {
    }

    public Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return width * length * height;
    }

    public double capacity(double r) {
        return volume() * r;
    }

    public void printInfo() {
        System.out.println("ყუთის პარამეტრებია: " + width + "X" + length + "X" + height);
        System.out.println("ყუთის მოცულობაა: " + volume());
    }
}
