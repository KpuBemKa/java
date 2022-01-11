package com.angajat;

/**
 * Clasa pentru angajatii cu salariul fix
 * */
public class AngajatCuSalariuFix implements IAngajat{
    String nume;
    double salariu;

    /**
     * @param nume Numele angajatului
     * @param salariu Salariul angajatului
     * */
    public AngajatCuSalariuFix(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
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
        return this.salariu;
    }
}
