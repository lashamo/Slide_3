package com.learn.slide3.polymorhism.overloading;

public class Summer {

    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public String add(String a, String b, String c) {
        return a + b + c;
    }
}
