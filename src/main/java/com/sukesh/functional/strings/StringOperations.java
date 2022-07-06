package com.sukesh.functional.strings;

public class StringOperations {
    public static void main(String[] args){
        String s = "III";
        StringBuilder b = new StringBuilder(s);
        b.replace(0,1,"");
       // System.out.println(b);
        b.replace(0,1,"");
        b.replace(0,1,"");
        System.out.println(b);
    }
}
