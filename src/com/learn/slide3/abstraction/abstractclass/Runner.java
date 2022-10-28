package com.learn.slide3.abstraction.abstractclass;

public class Runner {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Moto(2020, 100);
        vehicles[1] = new Car(2022, 20);
        vehicles[2] = new Car(1999, 25);
        vehicles[3] = new Moto(2022, 125);

        Vehicle max = vehicles[0];
        for (int i = 1; i < 4; i++) {
            if (vehicles[i].getMaxSpeed() > max.getMaxSpeed()) {
                max = vehicles[i];
            }
        }

        if (max instanceof Car) {
            System.out.println("Fastest is car");
        } else {
            System.out.println("Fastest is moto");
        }

        System.out.println(max.getYear() + " " + max.getMaxSpeed());
    }
}
