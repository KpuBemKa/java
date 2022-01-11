package com.company;

public class Produs {
    double pret;
    String denumire;

    public Produs(double pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    String getProperties(){
        return denumire + " " + pret + " lei";
    }
}
