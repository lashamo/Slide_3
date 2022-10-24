package com.learn.slide3.inheritance.school;

public class Teacher extends Staff {

    private String subject;

    public Teacher() {}

    public Teacher(String username, String password, int salary, String subject) {
        super(username, password, salary);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addMark() {
        System.out.println("You have successfully add mark");
    }
}
