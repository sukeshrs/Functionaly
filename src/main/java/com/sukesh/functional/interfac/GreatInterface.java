package com.sukesh.functional.interfac;

public interface GreatInterface {

    default void  add(){
        System.out.println("Whats going on here");
    };

    static void staticAdd(){
        System.out.println("Hello from static add");
    }
}
