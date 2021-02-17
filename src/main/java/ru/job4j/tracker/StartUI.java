package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("Anton");
        tracker.add(item);
        Item consoleItem = tracker.findById(1);
        System.out.println(consoleItem.getId() + " - " + consoleItem.getName());
    }
}
