package com.sukesh.functional.algorithms;

import java.util.stream.IntStream;

public class IntArrayOperations {

    /**
     * Time Complexity : O(N) - Have to go through all entries in array to find the maximum in an array
     * @param a
     * @return
     */
    public int findMaximum(int[] a){
        int max = 0;
        long startTime = System.nanoTime();;
        for(int i=0; i< a.length ;i++){
            max = a[i] > max ? a[i] : max;
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return max;
    }

    /**
     * Time Complexity : O(N) - Have to go through all entries in array to find the maximum in an array
     * @param a
     * @return
     */
    public int findMaximumIntStream(int[] a){
        long startTime = System.nanoTime();
        int max = IntStream.of(a).max().getAsInt();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        return max;
    }

    public int findMinimum(int[] ints) {
        int min = ints[0];
        for(int i = 0 ; i< ints.length ; i ++){
            min = ints[i] < min ? ints[i] : min;
        }
        return min;
    }

    /**
     * example input : 1,2,3,3,4,5,5,5,6
     * example output : 1,2,3,4,5,6
     * @param intArray
     * @return
     */
    public int[] removeDuplicates(int[] intArray){
        for(int i = 0; i < intArray.length - 1; i++){
            intArray[i] = intArray[i+1];
        }
        return intArray;
    }
}
