package com.company;

public class Producator extends Thread{
    private Resursa resursa;
    private int nrValori;

    public Producator(Resursa resursa, int nrValori) {
        this.resursa = resursa;
        this.nrValori = nrValori;
    }

    public void run(){
        for(int i = 0; i < nrValori; i++){
            resursa.Pune(i);
            System.out.println("Producator: Am pus valoarea: " + i);
        }
    }
}
