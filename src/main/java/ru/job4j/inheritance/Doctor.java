package ru.job4j.inheritance;

public class Doctor extends Profession{
    private String hospitalName;
    private int yearsOfWork;

    public Doctor(String name, String surname, String education, int birthday, String hospitalName, int yearsOfWork) {
        super(name, surname, education, birthday);
        this.hospitalName = hospitalName;
        this.yearsOfWork = yearsOfWork;
    }

    public String getHospitalName() {
        return this.hospitalName;
    }

    public int getYearsOfWork() {
        return this.yearsOfWork;
    }
}
