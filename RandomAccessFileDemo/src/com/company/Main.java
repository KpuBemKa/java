package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) {
        char[] message = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        byte [] newMessage = {'E', 'a', 'r', 't', 'h'};

        try {
            RandomAccessFile file = new RandomAccessFile("src/com/company/in.txt", "rw");

            for(char letter : message){
                file.write(letter);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
