package com.sukesh.functional.algorithms.string;

import java.util.Objects;

public class Reverse {
    public String reverse(String s) {
        if(Objects.isNull(s)){
            return "";
        }
        if(s.length() ==1){
            return s;
        }
        return new StringBuilder(s).reverse().toString();
    }

    public String reverseUsingCharArray(String s) {
        if(Objects.isNull(s)){
            return "";
        }
        if(s.length() ==1){
            return s;
        }
        char[] chars = s.toCharArray();
        char[] newChar =  new char[chars.length];
        int i =0;
        for(int j=chars.length-1 ;j>=0;j--){
            newChar[i] = chars[j];
            i++;
        }
        String returnValue = new String(newChar);
        return returnValue;
    }
}
