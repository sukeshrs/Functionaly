package com.sukesh.functional.algorithms.string;

import ch.qos.logback.core.util.StringCollectionUtil;

public class ReverseWordsInAString {
    public String reverseWordsInAString(String a) {

        String[] wordsArray = a.split("[ \\t]");
        System.out.println(wordsArray);
        if(a.isEmpty()){
           return  "";
        }
        int len = wordsArray.length;
        int middle = len/2;
        int lastIndex = len-1;
        for(int i=0; i<middle ; i++){
            String temp = wordsArray[i];
            wordsArray[i] = wordsArray[lastIndex-i];
            wordsArray[lastIndex-i] = temp;
        }
        System.out.println(wordsArray);
        return String.join(" ",wordsArray);
    }
}
