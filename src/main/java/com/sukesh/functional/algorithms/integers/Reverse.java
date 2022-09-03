package com.sukesh.functional.algorithms.integers;

/**
 * Reverses an integer
 * input 1234 should return 4321 ,
 * input -2345 should return -5432
 */
public class Reverse {
    public Integer reverse(Integer input){

        int returnValue = 0;

        while(input !=0) {
            int reminder = input % 10;
            input = input / 10;
            System.out.println(reminder);
            System.out.println(returnValue);
            if(returnValue > Integer.MAX_VALUE/10) {return 0;}
            if(returnValue < Integer.MIN_VALUE/10) {return 0;}
            returnValue = returnValue * 10 + reminder;
        }


        return returnValue;

    }
}
