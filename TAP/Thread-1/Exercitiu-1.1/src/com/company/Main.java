package com.company;

public class Main {
    public static void main(String args[]) {
        MyOwnRunnableClass rn1 = new MyOwnRunnableClass();
        Thread t1 = new Thread(rn1);
        t1.start();

        MyOwnRunnableClass rn2 = new MyOwnRunnableClass();
        Thread t2 = new Thread(rn2);
        t2.start();
    }
}