package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public int passengers(int amount) {
        return 0;
    }

    @Override
    public int refuel(int amount) {
        return amount * 56;
    }

    @Override
    public boolean move() {
        boolean rsl = false;
        if (refuel(100) == 5600) {
            rsl = true;
        }
        return rsl;
    }
}
