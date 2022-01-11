package com.parcare;

import java.util.Random;

public class Intrare extends Thread {
    private int idIntrare;
    private Paznic paznic;

    public Intrare(Paznic paznic, int idIntrare) {
        this.paznic = paznic;
        this.idIntrare = idIntrare;
    }

    public void run() {
        for (int i = idIntrare * 10; i < (idIntrare + 1) * 10; i++) {
            try {
                paznic.Intra(i);
                System.out.println("Intrarea " + idIntrare + ": Am parcat masina " + i);
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
