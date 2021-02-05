package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String typeOfSurgery;
    private int amountOfPatients;

    public String getTypeOfSurgery() {
        return this.typeOfSurgery;
    }

    public int getAmountOfPatients() {
        return this.amountOfPatients;
    }
}
