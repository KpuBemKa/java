package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(new BufferedReader(new FileReader("E:\\dev\\projects\\java\\Laborator4\\Exercitiu9-2\\src\\com\\company\\in.txt")));
        s.useLocale(Locale.US);

        double sum = 0;

        while (s.hasNext()) {
            sum += s.nextDouble();
        }
        s.close();

        System.out.println("Sum of all numbers = " + sum);
    }
}
