package com.company;

public class Main {

    public static void main(String[] args) {
        Coada coada = new Coada();

        Agent agent1 = new Agent(coada, "Agent1");
        Agent agent2 = new Agent(coada, "Agent2");
        Casier casier = new Casier(coada);

        agent1.start();
        agent2.start();
        casier.start();
    }
}
