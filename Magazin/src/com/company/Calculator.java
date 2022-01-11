package com.company;

public class Calculator extends Produs {
    String producator;
    TVA pretTVA = () -> TVA.procentIT * this.pret + pret;

    public Calculator(double pret, String denumire, String producator) {
        super(pret, denumire);
        this.producator = producator;
    }

    String getProperties() {
        return super.getProperties() + " " + producator + " " + pretTVA.getPretTVA() + " lei";
    }
}
