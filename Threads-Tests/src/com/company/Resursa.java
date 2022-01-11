package com.company;

import java.util.ArrayList;

public class Resursa {
    private int[] tablou;
    private int nrElement = 0;
    private int iP = 0;
    private int iS = 0;

    public Resursa(int n) {
        tablou = new int[n];
    }

    public synchronized void Pune(int v){
        while(nrElement == tablou.length){
            try{
                wait();
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }

        iP = (iP + 1) % tablou.length;
        tablou[iP] = v;
        nrElement++;
        notifyAll();
    }

    public synchronized int Scoate(){
        while(nrElement == 0){
            try{
                wait();
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }

        iS = (iS + 1) % tablou.length;
        nrElement--;
        notifyAll();
        return tablou[iS];
    }
}
