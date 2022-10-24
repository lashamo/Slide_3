package com.learn.slide3.inheritance.school;

public class Runner {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("teacher009", "pass", 75_000, "Math");
        teacher.login();
        teacher.addMark();

        Student student = new Student("student846", "pass");
        student.login();
        student.goToSchool();

        User user = new Student("student846", "pass");
        user.login();

        Student st = (Student) user;
        st.goToSchool();
    }
}
