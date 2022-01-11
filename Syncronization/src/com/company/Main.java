package com.company;

public class Main {

    public static void main(String[] args) {

        CubbyHole c = new CubbyHole();

        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);

        p1.start();
        c1.start();
        TwoStrings ts = new TwoStrings();
        Thread thread1 = new Thread(new PrintStringsThread());
        thread1.start();


    }
}
