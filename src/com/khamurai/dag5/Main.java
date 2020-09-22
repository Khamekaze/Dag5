package com.khamurai.dag5;

public class Main {

    public static void main(String[] args) {
        Dog labbe = new Dog("Hasse", "Labrador");
        Dog pudel = new Dog("Tojje", "Poodle");
        Dog mycat = new Dog("Meowitzer", "Catto");

        labbe.bark();
        pudel.bark();
        mycat.bark();
    }
}
