package com.sukesh.functional.threads;

import java.util.stream.IntStream;

public class ThreadInNewStyle {
    public static void main(String[] args) {
        BlockinggQueue<String> queue = new BlockinggQueue<>();
        Thread thread1 = new Thread(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            IntStream.iterate(0,n -> n+3);
            queue.put("Test");
            System.out.println("Hello" + Thread.currentThread().getName() + queue);
        });
        Thread thread2 =  new Thread(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            IntStream.iterate(0,n -> n+3);
            queue.put("Test");
            System.out.println("Hello" + Thread.currentThread().getName() + queue);
        });
        Thread thread3 =  new Thread(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            IntStream.iterate(0,n -> n+3);
            queue.put("Test");
            System.out.println("Hello" + Thread.currentThread().getName() + queue);
        });
        Thread thread4 =  new Thread(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            IntStream.iterate(0,n -> n+3);
            queue.put("Test");
            System.out.println("Hello" + Thread.currentThread().getName() + queue);
        });
        Thread thread5 =  new Thread(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            IntStream.iterate(0,n -> n+3);
            queue.put("Test");
            System.out.println("Hello" + Thread.currentThread().getName() + queue);
        });
        Thread thread6 =  new Thread(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            IntStream.iterate(0,n -> n+3);
            queue.put("Test");
            System.out.println("Hello" + Thread.currentThread().getName() + queue);
        });

        System.out.println("Phhaaa : " + Thread.currentThread().getName());
        thread1.start();
        thread2.setDaemon(true);
        thread2.start();
        thread1.interrupt();



        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        System.out.println(thread3.getState());
        System.out.println(thread4.getState());
        System.out.println(thread5.getState());
        System.out.println(thread6.getState());

    }
}
