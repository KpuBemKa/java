package com.company;

/**
 * @author eu
 * @since 2.0
 * class for aliments
 * */
public class Produs {
    double pret;
    String denumire;

    /**
     * @param pret pretul produsului
     * @param denumire denumirea produsului
     * */
    public Produs(double pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    /**
     * @return String of denumire and pret
     * */
    String getProperties(){
        return denumire + " " + pret + " lei";
    }
}

