package com.company;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author eu
 * @since 2.0
 * class for aliments
 * */
public class Main {

    public static void main(String[] args) {
        ArrayList<Aliment> alimente = new ArrayList<>();
        alimente.add(new Aliment(22.95, "Lays", 536));
        alimente.add(new Aliment(13.80, "Coca-Cola", 372));

        ArrayList<Jucarie> jucarii = new ArrayList<>();
        jucarii.add(new Jucarie(30, "Spinner", 3));
        jucarii.add(new Jucarie(390, "Pop it", 0));

        ArrayList<Calculator> calculatoare = new ArrayList<>();
        calculatoare.add(new Calculator(65999, "Ryzen B550 MATX", "Peugeot Systems"));
        calculatoare.add(new Calculator(12999, "OMEN 30L", "HP"));

        System.out.println("-======< Produsele >======-");
        System.out.println(alimente.get(0).getProperties());
        System.out.println(alimente.get(1).getProperties());
        System.out.println(jucarii.get(0).getProperties());
        System.out.println(jucarii.get(1).getProperties());
        System.out.println(calculatoare.get(0).getProperties());
        System.out.println(calculatoare.get(1).getProperties());

        alimente.sort(Comparator.comparingInt((Aliment a) -> a.calorii));
        jucarii.sort(Comparator.comparingInt((Jucarie a) -> a.varstaMinima));
        calculatoare.sort(Comparator.comparing((Calculator c) -> c.producator));

        System.out.println("\n\n-======< Produsele sortate >======-");
        System.out.println(alimente.get(0).getProperties());
        System.out.println(alimente.get(1).getProperties());
        System.out.println(jucarii.get(0).getProperties());
        System.out.println(jucarii.get(1).getProperties());
        System.out.println(calculatoare.get(0).getProperties());
        System.out.println(calculatoare.get(1).getProperties());
    }
}

