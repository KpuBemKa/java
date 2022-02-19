package com.company;

public class Main {

    public static void main(String args[]) {

        String a0, a1, a2;

        if (args.length != 3){
            a0 = "E:\\dev\\projects\\java\\Laborator4\\Exercitiu3\\src\\com\\company\\words.txt";
            a1 = "E:\\dev\\projects\\java\\Laborator4\\Exercitiu3\\src\\com\\company\\wordsOut.txt";
            a2 = "3";
        } else{
            a0 = args[0];
            a1 = args[1];
            a2 = args[2];
        }

        SimpleEncryption se = new SimpleEncryption();
        se.encrypt(a0, a1, Integer.parseInt(a2));

        System.out.println("Displaying encrypted words from words.txt...");
        se.viewFileContent(a1);

    }
}
