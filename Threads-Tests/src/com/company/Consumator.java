package com.company;

public class Consumator extends Thread{
    private Resursa resursa;
    private int nrValori;

    public Consumator(Resursa resursa, int nrValori) {
        this.resursa = resursa;
        this.nrValori = nrValori;
    }

    public void run(){
        for(int i = 0; i < nrValori; i++){
            int j = resursa.Scoate();
            System.out.println("Consumator: Am scos valoarea: " + j);
        }
    }
}
