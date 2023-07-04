package com.sukesh.functional.algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class CheckSumInArray {
    public static void main(String args[]){
        System.out.println("Test");

        int test[] = {1,-1,-1,-1,1};
        int sum = 2;
        boolean result = checkSum(test , sum);
        System.out.println(result);
    }

    private static boolean checkSum(int[] test, int sum) {
        Map<Integer,Integer> reminderMap = new HashMap<>();
        int i = 0;
        for (int value :  test){
            if (reminderMap.containsKey(value)){
                return true;
            }
            int remainder = sum - value;
            reminderMap.put(remainder , i);
            i++;
        }
        return false;
    }


}
