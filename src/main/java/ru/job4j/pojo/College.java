package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Koryakin Anton Nikolaevich");
        student.setGroup("K42200");
        student.setReceiptDate("23.08.2015");
        System.out.println(student.getFullName() + System.lineSeparator() + student.getGroup() + System.lineSeparator() + student.getReceiptDate());

    }
}
