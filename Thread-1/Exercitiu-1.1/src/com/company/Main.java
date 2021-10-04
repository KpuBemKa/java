package com.company;

public class Main {

    public static void main(String[] args) {

        // Create object instance of a class that is subclass of Thread class
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread pnt1 =
                new PrintNameThread("A");

        // Start the thread by invoking start() method
        System.out.println("Calling start() method of " + pnt1.getName() + " thread");
        pnt1.start();

        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread pnt2 =
                new PrintNameThread("B");
        System.out.println("Calling start() method of " + pnt2.getName() + " thread");
        pnt2.start();

        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread pnt3 =
                new PrintNameThread("C");
        System.out.println("Calling start() method of " + pnt3.getName() + " thread");
        pnt3.start();

        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread pnt4 =
                new PrintNameThread("MyOwn");
        System.out.println("Calling start() method of " + pnt4.getName() + " thread");
        pnt4.start();
    }
}
