package com.company;

import com.strategii.Strategie;

import java.util.ArrayList;

public class GestiuneAmenzi {
    ArrayList<IAmenda> amenzi;

    public GestiuneAmenzi(ArrayList<IAmenda> amenzi) {
        this.amenzi = amenzi;
    }

    void insertAmenda(IAmenda amenda) {
        amenzi.add(amenda);
    }

    double valoare(Strategie strategie) {
        double sumaAmenzi = 0;

        for (IAmenda a : amenzi) {
            if (strategie.conditie(a)) {
                sumaAmenzi += a.getAmendaCost();
            }
        }

        return sumaAmenzi;
    }
}
