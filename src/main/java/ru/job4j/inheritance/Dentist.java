package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean shakyHands;

    public Dentist(String name, String surname, String education, int birthday, String hospitalName, int yearsOfWork, boolean shakyHands) {
        super(name, surname, education, birthday, hospitalName, yearsOfWork);
        this.shakyHands = shakyHands;
    }

    public boolean getShakyHands() {
        return this.shakyHands;
    }
}
