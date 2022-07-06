package com.sukesh.functional.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class KthLargest {
    /**
     * The method returns the index of the kth largest element based on position
     * @param array
     * @param k
     * @return
     */
    public int findLargest(int[] array, int k) {
        Arrays.sort(array);
        int length = array.length;
        int index = length - k;
        return array[index];
    }

    /**
     * The method returns the index of the kth largest element based on value
     * @param array
     * @param k
     * @return
     */
    public int findLargestAndDistinct(int[] array, int k) {
        int[] sorted = Arrays.stream(array).distinct().toArray();
        Arrays.sort(sorted);
        int length = sorted.length;
        int index = length - k;
        return sorted[index];
    }


   // i = 1 , j = 1
   // 1,2,2,3,4,4,5,6,7
}
