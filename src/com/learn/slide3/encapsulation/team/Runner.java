package com.learn.slide3.encapsulation.team;

public class Runner {

    public static void main(String[] args) {
        Footballer f1 = new Footballer("Ronaldo", 30);
        Footballer f2 = new Footballer("Messi", 29);
        Footballer f3 = new Footballer("Kvara", 39);

        Team team = new Team("Guria");
        team.addFootballer(f1);
        team.addFootballer(f2);
        team.addFootballer(f3);

        team.printInfo();
        System.out.println("All goals: " + team.getGoalsSummedAmount());
    }
}
