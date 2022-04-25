package com.sukesh.functional.interfac;

public interface AwesomeInterface {
    default void  put(){
        System.out.println("Hellow How are you");
    };

    static void staticPut(){
        System.out.println("Hwlloe from static put");
    }
}
