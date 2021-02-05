package ru.job4j.inheritance;

public class Doctor extends Profession{
    private String hospitalName;
    private int yearsOfWork;

    public String getHospitalName() {
        return this.hospitalName;
    }

    public int getYearsOfWork() {
        return this.yearsOfWork;
    }
}
