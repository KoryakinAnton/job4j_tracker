package ru.job4j.inheritance;

public class Project extends Programmer{
    private int idProject;


    public Project(String name, String surname, String education, int birthday, int idProject) {
        super(name, surname, education, birthday);
        this.idProject = idProject;
    }
}
