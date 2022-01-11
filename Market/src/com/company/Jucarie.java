package com.company;

/**
 * @author eu
 * @since 2.0
 * class for aliments
 * */
public class Jucarie extends Produs {
    int varstaMinima;
    TVA pretTVA = () -> TVA.procentProdus * this.pret + pret;

    /**
     * @param pret pretul jucariei
     * @param denumire denumirea jucariei
     * @param varstaMinima varsta minima pentru folosirea jucariei
     * */
    public Jucarie(double pret, String denumire, int varstaMinima) {
        super(pret, denumire);
        this.varstaMinima = varstaMinima;
    }

    /**
     * @return String of denumire, pret, varsta minima and pret with TVA
     * */
    String getProperties() {
        return super.getProperties() + " " + varstaMinima + " ani " + pretTVA.getPretTVA() + " lei";
    }
}

