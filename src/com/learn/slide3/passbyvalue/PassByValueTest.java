package com.learn.slide3.passbyvalue;

public class PassByValueTest {

    public static void main(String[] args) {
        int a = 10;
        method(a);
        System.out.println(a);

        User user = new User();
        user.name = "vinme";
        method2(user);
        System.out.println(user.name);

        method3(user);
        System.out.println(user.name);
    }

    private static void method3(User user) {
        user = new User();
        user.name = "test";
    }

    private static void method2(User x) {
        x.name = "rame";
    }

    private static void method(int x) {
        x = 7;
    }
}
