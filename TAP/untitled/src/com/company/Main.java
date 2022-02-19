package com.company;

import java.io.*;

public class Main {

    read() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        char[] message = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};

        public RandomAccessFile(File file, String mode);

        String t;
        t.length();
        message[t];

        try (RandomAccessFile file = new RandomAccessFile("src/com/company/file.dat", "rw")) {
            for (char letter : message) {
                file.writeChar(letter);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        write(1);
    }

    static void write(int b){
        int a = b;
    }

    void write(byte[] b)

    void write(byte[] b, int off, int len)

    void writeBoolean(boolean v)

    void writeByte(int v)

    void writeBytes(String s)

    void writeChar(int v)

    void writeChars(String s)

    void writeDouble(double v)

    void writeFloat(float v)

    void writeInt(int v)

    void writeLong(long v)

    void writeShort(int v)

    void writeUTF(String str)

}
