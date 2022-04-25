package com.sukesh.functional.threads;

import java.util.LinkedList;
import java.util.List;

public class BlockinggQueue<T> {
    private List<T> queue = new LinkedList<T>();

    private int limit = 3;

    public synchronized void put(T item){
        while(queue.size() == limit){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(queue.isEmpty()){
            notifyAll();
        }
        queue.add(item);
    }

    public synchronized  T take(){
        while(queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        if(queue.size() == limit) {
            notifyAll();
        }

        return queue.remove(0);
    }

}
