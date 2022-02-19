package com.company;

public class Aliment extends Produs {
    int calorii;

    public Aliment(double pret, String denumire, int calorii) {
        super(pret, denumire);
        this.calorii = calorii;
    }

    String getProperties() {
        return super.getProperties() + " " + calorii + " calorii";
    }

}
