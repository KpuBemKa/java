package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = "dummyname";
        File fn = new File(fileName);
        try {
            fn.createNewFile();
        } catch (IOException e) {

        }
        System.out.println("Name: " + fn.getName());

        if (fn.exists()) {
            System.out.println(fileName + " does exist.");
        }

        if (fn.canRead()) {
            System.out.println(fileName + " is readable.");
        }

        System.out.println(fileName + " is " + fn.length() + " bytes long.");
        System.out.println(fileName + " is last modifed at " +
                new java.util.Date(fn.lastModified()));

        if (fn.canWrite()) {
            System.out.println(fileName + " is writable.");
        } else {
            System.out.println(fileName + " is not writable.");

        }
    }
}