package com.sukesh.functional.algorithms;

import java.util.stream.IntStream;

public class Palindrome {
    public static final String EMPTY_STRING = "";
    public boolean isPalindrome(String value) {
        if(value == null || "".equals(value)){
            return false;
        }
        value =  value.replaceAll("\\s+", "").toLowerCase();
        StringBuilder builder = new StringBuilder(value);
        String reverse = builder.reverse().toString();
        return value.equals(reverse);
    }

    public boolean isPalindromeUsingStreams(String value) {
        if(value == null || EMPTY_STRING.equals(value)){
            return false;
        }
        String temp =  value.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = IntStream.range(0, temp.length()/2).noneMatch(index -> temp.charAt(index) != temp.charAt(temp.length() - index -1) );
        return isPalindrome;
    }
}
