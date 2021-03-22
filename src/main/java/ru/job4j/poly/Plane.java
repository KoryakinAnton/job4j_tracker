package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " делает вжууух");
    }

    @Override
    public void time() {
        System.out.println(" 1 час.");
    }
}
