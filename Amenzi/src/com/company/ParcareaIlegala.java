package com.company;

public class ParcareaIlegala implements IAmenda{
    String CNP;

    ParcareaIlegala(String CNP){
        this.CNP = CNP;
    }

    @Override
    public String getCNP() {
        return this.CNP;
    }

    @Override
    public String getTipAmenda() {
        return "Parcarea ilegala a masinii";
    }

    @Override
    public double getAmendaCost() {
        return 500;
    }

    @Override
    public void printAmenda() {
        System.out.println(this.CNP + " | " + this.getTipAmenda() + " | " + this.getAmendaCost() + " RON");
    }
}
