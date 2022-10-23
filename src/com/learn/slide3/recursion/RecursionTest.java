package com.learn.slide3.recursion;

public class RecursionTest {

    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(20));

        System.out.println(pow(4, 3));
    }

    private static long pow(int x, int n) {
        if (n == 1) {
            return x;
        }

        return pow(x, n - 1) * x;
    }

    private static int getFibonacciNumber(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
}
