package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating temp directory...");
        String fileName = "temp";
        File fn = new File(fileName);
        fn.mkdir();

        File subdir1 = new File(fn, "subdir1");
        subdir1.mkdir();
        File subdir2 = new File(fn, "subdir2");
        subdir2.mkdir();

        System.out.println(fileName + " is a " +
                (fn.isFile()? "file." :"directory."));

        if (fn.isDirectory()) {
            String content[] = fn.list();
            System.out.println("The content of this directory:");
            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }

        System.out.println(fileName +
                (fn.exists()? " exists": " does not exist"));
        System.out.println("Deleting temp directory...");
        fn.delete();

    }
}
