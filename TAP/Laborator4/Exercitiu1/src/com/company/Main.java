package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("E:\\dev\\projects\\java\\Laborator4\\Exercitiu1\\src\\com\\company\\farrago.txt");
        File outputFile = new File("E:\\dev\\projects\\java\\Laborator4\\Exercitiu1\\src\\com\\company\\outagain.txt");

        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);
        int c;

        while ((c = in.read()) != -1){
            out.write(c);
        }

        in.close();
        out.close();
    }
}
