package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("E:\\dev\\projects\\java\\Laborator4\\Exercitiu2\\src\\com\\company\\input.txt");
        File outputFile = new File("E:\\dev\\projects\\java\\Laborator4\\Exercitiu2\\src\\com\\company\\output.txt");

        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;

        while ((c = in.read()) != -1){
            out.write(c);
        }

        System.out.println("FileReader is used to read a file and FileWriter is used for writing.");

        in.close();
        out.close();
    }
}
