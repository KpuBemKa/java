package com.company;

import com.strategii.CautaCNP;
import com.strategii.CautaParcareaIlegala;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IAmenda> amenzi = new ArrayList<>();

        amenzi.add(new ParcareaIlegala("1031274456709"));
        amenzi.add(new DistrugereaBunului("1031274456709", 50));
        amenzi.add(new AruncareaGunoiului("8433223017079", 3));
        amenzi.add(new ParcareaIlegala("6522208781284"));

        GestiuneAmenzi gestiuneAmenzi = new GestiuneAmenzi(amenzi);

        gestiuneAmenzi.insertAmenda(new AruncareaGunoiului("6522208781284", 1));
        System.out.println("Suma amenzilor cetateanului este: " + gestiuneAmenzi.valoare(new CautaCNP("1031274456709")) + " RON");
        System.out.println("Suma amenzilor de parcari ilegale este: " + gestiuneAmenzi.valoare(new CautaParcareaIlegala()) + " RON");
    }
}
