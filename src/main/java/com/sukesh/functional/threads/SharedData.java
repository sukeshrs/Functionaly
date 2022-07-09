package com.sukesh.functional.threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedData {
    private int data;
    private Lock lock = new ReentrantLock();
    private Semaphore semaphore = new Semaphore(2);

    public int updateData(){
        lock.lock();
        lock.lock();
        try {
            semaphore.tryAcquire();
            data++;
            System.out.println(Thread.currentThread().getName() + ":" + data);
          //  semaphore.release();
        }finally {
            lock.unlock();
            lock.unlock();
        }
        return data;
    }

    public synchronized int getData(){
        return this.data;
    }
}
