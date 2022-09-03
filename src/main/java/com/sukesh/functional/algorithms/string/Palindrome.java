package com.sukesh.functional.algorithms.string;

/**
 * Checks if a passed in String is Palindrome or not.
 */
public class Palindrome {
    public boolean isPalindrome(String input) {
        StringBuilder builder = new StringBuilder(input);
        String reversedString = builder.reverse().toString();
        return input.equals(reversedString);
    }

    /**
     * eg : "123321" , "1234321" ,"9"
     * @param input
     * @return
     */
    public boolean isPalindromeUsingArray(String input){
        if(input == null){return false;}
        if(input.length() ==1) {return true;}
        char[] chars = input.toCharArray();
        int length = chars.length;
        int half = length / 2;
        int rightIndex = length-1;
        for(int i=0 ; i<half;i++){
            if(!(chars[i] == chars[rightIndex])){
                return false;
            }
            --rightIndex;
        }
        return true;
    }
}
