package com.learn.slide3.encapsulation.team;

public class Team {

    private static final int FOOTBALLERS_MAX_SIZE = 100;

    private String name;

    private int footballersNumber;
    private Footballer[] footballers;

    public Team() {}

    public Team(String name) {
        this.name = name;
        footballers = new Footballer[FOOTBALLERS_MAX_SIZE];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFootballer(Footballer footballer) {
        footballers[footballersNumber] = footballer;
        footballersNumber++;
    }

    public void printInfo() {
        System.out.println("Team name: " + name);
        System.out.println("Footballers list");
        for (int i = 0; i < footballersNumber; i++) {
            footballers[i].printInfo();
        }
    }

    public int getGoalsSummedAmount() {
        int sum = 0;
        for (int i = 0; i < footballersNumber; i++) {
            sum = sum + footballers[i].getGoals();
        }
        return sum;
    }
}
