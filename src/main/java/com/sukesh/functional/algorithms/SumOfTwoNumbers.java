package com.sukesh.functional.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTwoNumbers {
    //Most trivial , time complexity O(n^2)
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0 ;i<nums.length ;i++){
            for(int j=i+1 ;j<nums.length ;j++){
                if((nums[i] + nums[j]) == target ){
                    System.out.println("Equal");
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] onePass(int[] numbers , int target){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ;i < numbers.length; i++){
            int expected = target - numbers[i];
            if(map.containsKey(expected)){
                return new int[] { map.get(expected) , i};
            }
            map.put(numbers[i] , i);
        }
        return null;
    }

    public List<List<Integer>> twoSumWithAllNumbersReturned(int[] intArray, int value) {
        List<List<Integer>> result = new ArrayList<>();
        Map map = new HashMap();
        for(int i =0 ; i < intArray.length ;i++){
            int difference = value - intArray[i];
            if(map.containsKey(difference)){
                List list = new ArrayList();
                list.add(difference);
                list.add(intArray[i]);
                result.add(list);
            }
            map.put(intArray[i] , i);
        }
        return result;
    }
}
