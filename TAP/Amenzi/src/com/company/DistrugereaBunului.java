package com.company;

public class DistrugereaBunului implements IAmenda{
    String CNP;
    double valoareaBunului;

    public DistrugereaBunului(String CNP, double valoareaBunului) {
        this.CNP = CNP;

        if(valoareaBunului > 0)
            this.valoareaBunului = valoareaBunului;
        else
            throw new IndexOutOfBoundsException("Valoarea bunului poate fi numai mai mare c 0");
    }

    @Override
    public String getCNP() {
        return this.CNP;
    }

    @Override
    public String getTipAmenda() {
        return "Distrugerea bunului";
    }

    @Override
    public double getAmendaCost() {
        return 300 * valoareaBunului;
    }

    @Override
    public void printAmenda() {
        System.out.println(this.CNP + " | " + this.getTipAmenda() + " | " + this.getAmendaCost() + " RON");
    }
}
