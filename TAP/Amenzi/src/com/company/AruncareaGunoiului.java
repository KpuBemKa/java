package com.company;

public class AruncareaGunoiului implements IAmenda{
    String CNP;
    int factorZonal;

    AruncareaGunoiului(String CNP, int factorZonal) {
        this.CNP = CNP;

        if (factorZonal >= 1 && factorZonal <= 4) {
            this.factorZonal = factorZonal;
        } else {
            throw new IndexOutOfBoundsException("Factorul zonal poate fi in limitele [1; 4]");
        }
    }

    @Override
    public String getCNP() {
        return this.CNP;
    }

    @Override
    public String getTipAmenda() {
        return "Aruncarea gunoiului";
    }

    @Override
    public double getAmendaCost() {
        return 200 * factorZonal;
    }

    @Override
    public void printAmenda() {
        System.out.println(this.CNP + " | " + this.getTipAmenda() + " | " + this.getAmendaCost() + " RON");
    }
}
