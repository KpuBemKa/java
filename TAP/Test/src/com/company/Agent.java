package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Agent extends Thread{
    Coada coada;
    String numeAgent;

    public Agent(Coada coada, String numeAgent) {
        this.coada = coada;
        this.numeAgent = numeAgent;
    }

    public void run(){
        ArrayList<Bon> bonuri = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/com/company/in.txt"));

            String st;
            while ((st = br.readLine()) != null) {
                String[] splited = st.split("\\s+");

                if(Objects.equals(splited[0], numeAgent)){
                    bonuri.add(new Bon(splited[0], Integer.parseInt(splited[1])));
                }
            }

            br.close();

            for(Bon bon : bonuri){
                coada.add(bon);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
