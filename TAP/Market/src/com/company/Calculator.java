package com.company;

/**
 * @author eu
 * @since 2.0
 * class for aliments
 * */
public class Calculator extends Produs {
    String producator;
    TVA pretTVA = () -> TVA.procentIT * this.pret + pret;

    /**
     * @param pret pretul calculatorului
     * @param denumire denumirea calculatorului
     * @param producator producatorul calculatorului
     * */
    public Calculator(double pret, String denumire, String producator) {
        super(pret, denumire);
        this.producator = producator;
    }

    /**
     * @return String of denumire, pret, producator and pret with TVA
     * */
    String getProperties() {
        return super.getProperties() + " " + producator + " " + pretTVA.getPretTVA() + " lei";
    }
}

