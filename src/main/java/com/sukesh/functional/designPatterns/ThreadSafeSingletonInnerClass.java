package com.sukesh.functional.designPatterns;

public class ThreadSafeSingletonInnerClass {
    private  ThreadSafeSingletonInnerClass(){

    }

    private static class ThreadSafeSingletonInnerClassSingleton {
        private static final ThreadSafeSingletonInnerClass INSTANCE = new ThreadSafeSingletonInnerClass();
    }

    public static ThreadSafeSingletonInnerClass getInstance() {
        return ThreadSafeSingletonInnerClassSingleton.INSTANCE;
    }
}
