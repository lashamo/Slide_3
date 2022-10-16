package com.learn.slide3.box;

public class Box {

    double width;

    double length;

    double height;

    final String providerCompany = "Test provider";

    Box() {
    }

    Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    double volume() {
        return width * length * height;
    }

    double capacity(double r) {
        return volume() * r;
    }

    void printInfo() {
        System.out.println("ყუთის პარამეტრებია: " + width + "X" + length + "X" + height);
        System.out.println("ყუთის მოცულობაა: " + volume());
    }
}
