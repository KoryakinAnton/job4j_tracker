package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String typeOfSurgery;
    private int amountOfPatients;

    public Surgeon(String name, String surname, String education, int birthday, String hospitalName, int yearsOfWork, String typeOfSurgery, int amountOfPatients) {
        super(name, surname, education, birthday, hospitalName, yearsOfWork);
        this.typeOfSurgery = typeOfSurgery;
        this.amountOfPatients = amountOfPatients;
    }

    public String getTypeOfSurgery() {
        return this.typeOfSurgery;
    }

    public int getAmountOfPatients() {
        return this.amountOfPatients;
    }
}
