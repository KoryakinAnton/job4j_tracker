package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("History", 4);
        Book second = new Book("Biology", 45);
        Book third = new Book("Clean code", 1);
        Book fourth = new Book("English", 20);
        Book[] shelf = new Book[4];
        shelf[0] = first;
        shelf[1] = second;
        shelf[2] = third;
        shelf[3] = fourth;
        for (Book sh : shelf) {
            System.out.println(sh.getName() + " - " + sh.getAmount());
        }
        Book tmp = shelf[0];
        shelf[0] = shelf[3];
        shelf[3] = tmp;
        for (Book sh : shelf) {
            System.out.println(sh.getName() + " - " + sh.getAmount());
        }
        for (Book sh : shelf) {
            if (sh.getName().equals("Clean code")) {
                System.out.println(sh.getName() + " - " + sh.getAmount());
            }
        }
    }
}
