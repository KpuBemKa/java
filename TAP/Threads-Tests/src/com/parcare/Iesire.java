package com.parcare;

public class Iesire extends Thread {
    private Paznic paznic;
    private int nrDeIntrari;

    public Iesire(Paznic paznic, int nrDeIntrari) {
        this.paznic = paznic;
        this.nrDeIntrari = nrDeIntrari;
    }

    public void run() {
        for (int i = 0; i < nrDeIntrari * 10; i++) {
            try {
                int masinaId = paznic.Iese();
                System.out.println("Iesire: A iesit masina " + masinaId);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
