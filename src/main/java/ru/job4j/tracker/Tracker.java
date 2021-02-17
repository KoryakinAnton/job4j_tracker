package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[size];
        int sizeWithoutNull = 0;
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                itemsWithoutNull[sizeWithoutNull] = items[index];
                sizeWithoutNull++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, sizeWithoutNull);
    }

    public Item[] findByName(String key){
        Item[] namesKey = new Item[size];
        int sizeOfNames = 0;
        for (int index = 0; index < size; index++) {
            String tmp = items[index].getName();
            if (tmp.equals(key)) {
                namesKey[sizeOfNames] = items[index];
                sizeOfNames++;
            }
        }
        return Arrays.copyOf(namesKey, sizeOfNames);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}