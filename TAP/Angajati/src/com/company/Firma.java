package com.company;

import com.angajat.IAngajat;

import javax.management.InstanceAlreadyExistsException;
import java.util.ArrayList;

/**
 * Clasa pentru gestionarea angajatilor
 * */
public class Firma {
    private ArrayList<IAngajat> angajati;

    /**
     * @param angajati ArrayList cu angajatii firmei
     * */
    public Firma(ArrayList<IAngajat> angajati) {
        this.angajati = angajati;
    }

    /**
     * Metoda de adaugare unui nou angajat in firma
     * @param angajat Angajatul ce trebuie angajat
     * @throws IndexOutOfBoundsException Daca lista de angajati deja este plina
     * @throws InstanceAlreadyExistsException Daca persoana deja este angajata
     * */
    public void angajeaza(IAngajat angajat) throws InstanceAlreadyExistsException {
        if(angajati.size() == 1024)
            throw new IndexOutOfBoundsException("Numarul maxim de angajati este 1024");

        for(IAngajat a : angajati){
            if(a.getNume().equals(angajat.getNume()))
                throw new InstanceAlreadyExistsException("Angajatul " + angajat.getNume() + " este deja angajat");
        }

        angajati.add(angajat);
        System.out.println("Persoana " + angajat.getNume() + " a fost angajata cu succes");
    }

    /**
     * Metoda de calculare a salariului mediu
     * @return Salariul mediu al firmei
     * */
    public double salariuMediu(){
        double salariuTotal = 0.0;

        for(IAngajat a : angajati){
            salariuTotal += a.getSalariu();
        }

        return salariuTotal/angajati.size();
    }

    /**
     * Metoda de afisare a tuturor angajatilor
     * */
    public void afiseazaAngajatii(){
        for(IAngajat a : angajati){
            System.out.println(a.getNume() + " | " + a.getSalariu() + " MDL");
        }
    }
}
