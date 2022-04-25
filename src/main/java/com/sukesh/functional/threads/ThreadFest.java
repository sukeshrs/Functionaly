package com.sukesh.functional.threads;

public class ThreadFest {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Phhaaa : " + Thread.currentThread().getName());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Phhaaa : " + Thread.currentThread().getName());
            }
        });

        System.out.println("Phhaaa : " + Thread.currentThread().getName());
        thread1.start();
        thread2.start();
    }
}
