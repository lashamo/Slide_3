package com.learn.slide3.inheritance.school;

public class Student extends User {

    private int[] marks = new int[1000];

    public Student() {}

    public Student(String username, String password) {
        super(username, password);
    }

    public int[] getMarks() {
        return marks;
    }

    public void goToSchool() {
        System.out.println("You have successfully went to school");
    }
}
