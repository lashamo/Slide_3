package com.learn.slide3.abstraction.interfaceexample;

public class Bus implements IBus {

    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void openDoors() {
        System.out.println("Open doors");
    }

    @Override
    public void closeDoors() {
        System.out.println("Close doors");
    }
}
