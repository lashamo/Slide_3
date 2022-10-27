package com.learn.slide3.polymorhism.overriding;

public class Square extends Figure {

    private double width;

    public Square() {}

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
