package ru.job4j.poly;

public class Autobus implements Transport{

    private int money;

    @Override
    public void passengers(int amount) {
        this.money = amount * 50;
    }

    @Override
    public int refuel(int amount) {
        return amount * 78;
    }

    @Override
    public void move() {
        if (refuel(100) <= money) {
            System.out.println("Поехали!");
        } else {
            System.out.println("Стоим");
        }
    }
}
