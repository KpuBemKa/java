package com.angajat;

import java.util.ArrayList;

/**
 * Clasa pentru angajatii cu salariul orar
 * */
public class AngajatCuOra implements IAngajat{
    private String nume;
    private double salariuOra;
    private ArrayList<Double> oreLucrate = new ArrayList<>();

    /**
     * @param nume
     * @param salariuOra
     * */
    public AngajatCuOra(String nume, double salariuOra) {
        this.nume = nume;
        this.salariuOra = salariuOra;
    }

    /**
     * Metoda de obtinere a numelui angajatului
     * @return Numele angajatului
     * */
    @Override
    public String getNume() {
        return this.nume;
    }

    /**
     * Metoda de obtinere a salariului angajatului
     * @return Salariul angajatului
     * */
    @Override
    public double getSalariu() {
        Double nrDeOre = 0.0;

        for(Double ore : oreLucrate){
            nrDeOre += ore;
        }

        return nrDeOre * salariuOra;
    }

    /**
     * Metoda de a adauga o zi lucratoare
     * @param ore Numarul de ore lucrate intr-o zi
     * */
    public void adaugaOre(double ore){
        if(oreLucrate.size() == 31)
            throw new IndexOutOfBoundsException("Maximum de ore lucrate este 31");

        oreLucrate.add(ore);
    }

    /**
     * Metoda de schimbare a salariului pe ora
     * @param salariuOra Viitorul salariu
     * */
    public void schimbaSalariuPeOra(double salariuOra){
        this.salariuOra = salariuOra;
    }
}
