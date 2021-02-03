package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String song = "Песня не найдена";
        if (position == 1) {
            song = "Пусть бегут неуклюже";
        } else if (position == 2) {
            song = "Спокойной ночи";
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox radio = new Jukebox();
        radio.music(1);
        radio.music(2);
        radio.music(3);
    }
}
