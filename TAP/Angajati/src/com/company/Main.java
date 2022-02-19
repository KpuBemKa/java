package com.company;

import com.angajat.AngajatCuOra;
import com.angajat.AngajatCuSalariuFix;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try{
            AngajatCuOra teodor = new AngajatCuOra("Adriana", 30);
            teodor.adaugaOre(7);
            teodor.adaugaOre(12);
            teodor.adaugaOre(7);

            AngajatCuOra alexandra = new AngajatCuOra("Alexandra", 45);
            alexandra.adaugaOre(12);
            alexandra.adaugaOre(7);
            alexandra.adaugaOre(12);

            Firma firma = new Firma(new ArrayList<>());
            firma.angajeaza(new AngajatCuSalariuFix("Angela", 6900));
            firma.angajeaza(new AngajatCuSalariuFix("Teodor", 6600));
            firma.angajeaza(teodor);
            firma.angajeaza(alexandra);

            System.out.println("\nSalariul mediu al firmei este: " + firma.salariuMediu() + " MDL");

            System.out.println("\n-==< Angajatii firmei >==-");
            firma.afiseazaAngajatii();
            System.out.println();

            // testarea adaugarii unui angajat existent
            firma.angajeaza(alexandra);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
