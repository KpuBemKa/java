package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Manager> managers = new ArrayList<>();

        managers.add(new Manager("Dimitrie", "Blerinca", 4));
        managers.add(new Manager("Sebastian", "Andreescu", 3));
        managers.add(new Manager("Iulian", "Banica", 6));
        new Manager().afisare(managers);
        System.out.println();

        Manager manager = new Manager();
        Afisare afisare = manager::afisare;
        afisare.afisare(managers);
        System.out.println();

        Construct construct = Manager::new;
        Manager anotherManager = construct.construct("A", "B", 3);
        managers.add(anotherManager);
        afisare.afisare(managers);
    }
}
