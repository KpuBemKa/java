package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) {
        char[] message = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        char[] newMessage = { 'E', 'a', 'r', 't', 'h' };
        long positionPointer = 14;
        boolean endOfFile = false;

        try (RandomAccessFile file = new RandomAccessFile("src/com/company/file.txt", "rw")) {
            for(char letter : message){
                file.writeChar(letter);
            }

            file.seek(positionPointer);

            for(char letter : newMessage){
                file.writeChar(letter);
            }

            positionPointer = 0;
            file.seek(positionPointer);

            while (!endOfFile){
                try{
                    System.out.print(file.readChar());
                } catch (IOException ex){
                    endOfFile = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
