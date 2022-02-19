package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Casier extends Thread{
    Coada coada;

    Casier(Coada coada){
        this.coada = coada;
    }

    public void run(){
        try {
            FileWriter writer = new FileWriter("src/com/company/out.txt");

            for (int i = 0; i < 4; i++){
                try {
                    Bon bon = coada.get();
                    writer.write(bon.numeAgent + " " + bon.suprafata + " " + bon.suprafata * 25 + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
