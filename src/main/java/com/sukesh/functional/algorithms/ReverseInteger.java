package com.sukesh.functional.algorithms;

public class ReverseInteger {
    public Integer reverse(Integer value) {
        int reverse = 0;
        while(value != 0){
            Integer reminder = value %10;
            value/= 10;
            if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE/10 && reminder >7) return 0;
            if(reverse < Integer.MIN_VALUE/10 || reverse == Integer.MIN_VALUE/10 && reminder < -8) return 0;
            reverse = reverse * 10 + reminder;
        }
        return reverse;
    }

    //Fails if the reversed number overflows integer
    public Integer reverseUsingCharArray(Integer value) {
        char[] array = value.toString().toCharArray();
        char[] reverseArray = new char[array.length];

        for(int i = array.length -1, j=0 ; i >=0 ; i--){
            char c = array[i];
            reverseArray[j] = c;
            j++;
        }
        return Integer.parseInt(new String(reverseArray));
    }

    // Fails on negative integers
    public Integer reverseUsingStringBuilder(Integer value) {
        StringBuilder b = new StringBuilder(value);
        b.append(value);
        return Integer.parseInt(b.reverse().toString());
    }

}
