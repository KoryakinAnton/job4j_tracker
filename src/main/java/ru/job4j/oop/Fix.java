package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String text) {
        this.desc = text;
    }

    public static void main(String[] args) {
        String sol = "I fix it";
        Fix item = new Fix(sol);
        System.out.println(item.desc);
    }
}
