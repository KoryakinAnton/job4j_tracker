package ru.job4j.poly;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " делает би-бип");
    }

    @Override
    public void time() {
        System.out.println(" 6 часов.");
    }

}
