package com.learn.slide3.inheritance.school;

public class Staff extends User {

    private int salary;

    public Staff() {}

    public Staff(int salary) {
        this.salary = salary;
    }

    public Staff(String username, String password, int salary) {
        super(username, password);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
