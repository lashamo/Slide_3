package com.learn.slide3.encapsulation.team;

public class Footballer {

    private String name;

    private int goals;

    public Footballer() {}

    public Footballer(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void printInfo() {
        System.out.println(name + "   " + goals);
    }
}
