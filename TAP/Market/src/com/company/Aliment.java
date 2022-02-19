package com.company;

/**
 * @author eu
 * @since 2.0
 * class for aliments
 * */
public class Aliment extends Produs {
    int calorii;

    /**
     * @param pret pretul produsului
     * @param denumire denumirea produsului
     * @param calorii nr. de calorii in produs
     * */
    public Aliment(double pret, String denumire, int calorii) {
        super(pret, denumire);
        this.calorii = calorii;
    }

    /**
     * @author eu
     * @return String of denumire, pret and calorii
     * */
    String getProperties() {
        return super.getProperties() + " " + calorii + " calorii";
    }

}

