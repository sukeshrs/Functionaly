package com.sukesh.functional.designPatterns;

public class ThreadSafeSingleton {
    private volatile static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {

    }

    public static ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }
}
