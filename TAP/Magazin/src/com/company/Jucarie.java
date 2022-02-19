package com.company;

public class Jucarie extends Produs {
    int varstaMinima;
    TVA pretTVA = () -> TVA.procentProdus * this.pret + pret;

    public Jucarie(double pret, String denumire, int varstaMinima) {
        super(pret, denumire);
        this.varstaMinima = varstaMinima;
    }

    String getProperties() {
        return super.getProperties() + " " + varstaMinima + " ani " + pretTVA.getPretTVA() + " lei";
    }
}
