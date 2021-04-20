package ru.job4j.ex;

public class Fact {

    public static int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Factorial should be positive.");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 3 is : " + calc( 3));
    }
}
