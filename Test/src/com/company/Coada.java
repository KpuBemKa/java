package com.company;

import java.io.IOException;

public class Coada {
    int lineRead = 0;
    Bon bon;
    private boolean available = false;

    synchronized public void add(Bon bon) throws IOException {
        while(available) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        available = true;
        this.bon = bon;
        notify();
    }

    synchronized public Bon get() throws IOException {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException ignored) { }
        }
        available = false;
        notify();
        return bon;
    }
}
