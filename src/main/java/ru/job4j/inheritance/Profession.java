package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getEducation(){
        return this.education;
    }

    public int getBirthday(){
        return this.birthday;
    }
}