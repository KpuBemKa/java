package com.company;

public class PrintStringsThread implements Runnable {

    Thread thread;
    String str1, str2;
    TwoStrings ts;

    public PrintStringsThread() {

    }

    PrintStringsThread(String str1, String str2, TwoStrings ts) {
        this.str1 = str1;
        this.str2 = str2;
        this.ts = ts;

        new Thread(() -> {
            synchronized (ts) {
                TwoStrings.print(this.str1, this.str2);
            }
        }).start();
    }


//
//    // thread2 = new Thread(new PrintStringsThread());
//    new thread(() -> {
//        synchronized (ts) {
//            ts.print("str1", "str2");
//        }
//    }).start();
}
