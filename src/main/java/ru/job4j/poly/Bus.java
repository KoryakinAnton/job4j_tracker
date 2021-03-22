package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void passengers(int amount) {
    }

    @Override
    public int refuel(int amount) {
        return amount * 56;
    }

    @Override
    public void move() {
    }
}
