package ru.job4j.poly;

public interface Transport {

    int passengers(int amount);

    int refuel(int amount);

    boolean move();
}
