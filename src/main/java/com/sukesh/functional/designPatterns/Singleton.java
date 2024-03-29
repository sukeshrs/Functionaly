package com.sukesh.functional.designPatterns;

public class Singleton {

    //create an object of SingleObject
    private static volatile Singleton instance = new Singleton();

    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton(){}

    //Get the only object available
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}