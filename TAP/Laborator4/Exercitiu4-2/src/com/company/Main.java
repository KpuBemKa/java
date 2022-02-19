package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Adler32 inChecker = new Adler32();
        Adler32 outChecker = new Adler32();
        CheckedDataInput in = null;
        CheckedDataOutput out = null;

        try {
            in = new CheckedDataInput(
                    new DataInputStream(
                            new FileInputStream("E:\\dev\\projects\\java\\Laborator4\\Exercitiu4-2\\src\\com\\company\\in.txt")),
                    (Checksum) inChecker);
            out = new CheckedDataOutput(
                    new DataOutputStream(
                            new FileOutputStream("E:\\dev\\projects\\java\\Laborator4\\Exercitiu4-2\\src\\com\\company\\out.txt")),
                    (Checksum) outChecker);
        } catch (IOException e) {
            System.err.println("CheckedIOTest: " + e);
            System.exit(-1);
        }

        boolean EOF = false;

        while (!EOF) {
            try {
                int c = in.readByte();
                out.write(c);
            } catch (EOFException e) {
                EOF = true;
            }
        }

        System.out.println("Input stream check sum: " +
                in.getChecksum().getValue());
        System.out.println("Output stream check sum: " +
                out.getChecksum().getValue());
    }
}