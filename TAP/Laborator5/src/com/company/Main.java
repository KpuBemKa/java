package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        File file = new File("src/com/company/" + args[args.length-1]);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();

        String line;
        while((line=br.readLine())!=null)
        {
            sb.append(line);
            sb.append(" ");
        }
        fr.close();

        System.out.print("Secventa de caractere cautata: ");
        String word = reader.readLine();

        List<String> words = Arrays.asList(sb.toString().split(" "));

        if(words.contains(word)){
            System.out.println("Cuvantul " + word + " a fost gasit in fisier");
        }else{
            System.out.println("Cuvantul " + word + " nu a fost gasit in fisier");
        }
    }
}
