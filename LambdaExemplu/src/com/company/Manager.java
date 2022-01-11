package com.company;

import java.util.ArrayList;

public class Manager{
    String nume;
    String prenume;
    int zileLucrate;
    final int nrOre = 10;

    Manager(){

    }

    public Manager(String nume, String prenume, int zileLucrate) {
        this.nume = nume;
        this.prenume = prenume;
        this.zileLucrate = zileLucrate;
    }

    Angajat angajat = () ->
        zileLucrate * Angajat.tarifOrar * nrOre;

    void afisare(ArrayList<Manager> managers){
        for(Manager m : managers){
            System.out.println(m.nume + " " + m.prenume + " " + m.zileLucrate + " " + m.angajat.getSalar());
        }
    }
}
