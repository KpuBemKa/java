package com.company;

import com.parcare.Iesire;
import com.parcare.Intrare;
import com.parcare.Paznic;

public class Main {

    public static void main(String[] args) {
        Paznic paznic = new Paznic(2, 5);
        Intrare intrare1 = new Intrare(paznic, 0);
        Intrare intrare2 = new Intrare(paznic, 1);
        Iesire iesire = new Iesire(paznic, 2);

        intrare1.start();
        intrare2.start();
        iesire.start();
    }
}
