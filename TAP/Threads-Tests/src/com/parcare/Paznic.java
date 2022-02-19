package com.parcare;

public class Paznic {
    private int nrIntrari;
    private int loculLiber = 0;
    private int[] masini;

    public Paznic(int nrIntrari, int locuriTotale) {
        this.nrIntrari = nrIntrari;
        this.masini = new int[locuriTotale];
    }

    public synchronized void Intra(int masinaId) {
        // parcarea este plina
        while (loculLiber == masini.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        masini[loculLiber] = masinaId;
        loculLiber++;
        notifyAll();
    }

    public synchronized int Iese() {
        while (loculLiber == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        loculLiber--;
        notifyAll();
        return masini[loculLiber];
    }
}
