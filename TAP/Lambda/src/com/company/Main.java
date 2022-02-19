package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": RunnableTest");

        // Runnable anonim
        Runnable task1 = new Runnable(){

            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        };
        // Transmiterea Runnable la crearea thread-ului
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });


        // Lambda Runnable
        Runnable task2 = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        };

        Thread thread2 = new Thread(task1);

        thread1.start();
        thread2.start();
        new Thread(task2).start();
        new Thread(() ->
                System.out.println(Thread.currentThread().getName() + " is running")
        ).start();
    }
}
