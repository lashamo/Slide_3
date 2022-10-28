package com.learn.slide3.abstraction.interfaceexample;

public class Runner {

    public static void main(String[] args) {
        IBus iBus = new Bus();
        iBus.go();
        iBus.stop();
        iBus.openDoors();
        iBus.closeDoors();
        iBus.go();
    }
}
