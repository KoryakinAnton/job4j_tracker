package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " делает чу-чу чу-чух");
    }

    @Override
    public void time() {
        System.out.println(" 3 часа.");
    }
}
