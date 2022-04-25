package com.sukesh.functional.statik;

public class StaticSuper {
    private static int i=0;
    public static void printRubbish(){
        i++;
        System.out.println("Rubbish from Super" + i );
    }

    public void printMoreRubbish(){
        i++;
        System.out.println("Rubbish from Super" + i );
    }
}
