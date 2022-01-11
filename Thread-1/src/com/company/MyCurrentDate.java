package com.company;

public class MyCurrentDate implements Runnable{

    Thread thread;

    MyCurrentDate(String threadName){
        thread = new Thread(threadName);
        thread.start();
    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){
            try {
                System.out.println(thread.getName() + ": " + java.time.LocalDateTime.now());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
