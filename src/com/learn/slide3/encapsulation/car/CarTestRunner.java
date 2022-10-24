package com.learn.slide3.encapsulation.car;

import com.learn.slide3.encapsulation.box.Box;
import com.learn.slide3.encapsulation.box.BoxTestRunner;

public class CarTestRunner {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "BMW";
        car1.color = "Black";
        car1.year = 2022;

        Car car2 = new Car();
        car2.model = "Mercedes";
        car2.color = "white";
        car2.year = 2021;

        Car.numberOfDoors = 4;

        Box box;
        BoxTestRunner boxTestRunner;
    }
}
