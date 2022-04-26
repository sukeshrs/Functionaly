package com.sukesh.functional.algorithms;

import java.util.Locale;

public class Palindrome {
    public boolean isPalindrome(String value) {
        if(value == null || "".equals(value)){
            return false;
        }
        value = value.toLowerCase(Locale.ROOT);
        StringBuilder builder = new StringBuilder(value);
        String reverse = builder.reverse().toString();
        return value.equals(reverse);
    }
}
