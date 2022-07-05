package com.sukesh.functional.algorithms.search;

/**
 * eg odd {1,2,3,4,5,6,7,8,9}
 * eg even {3,4,5,6,7,8}
 */
public class BinarySearch {
    public int search(int[] arr, int i) {
        int position = binarySearch(arr , i , 0 , arr.length -1);
        return position;
    }

    private int binarySearch(int[] arr, int input , int left , int right) {
        int middle = (left + right)/2;
        if(input == arr[middle]){
            return middle;
        }
        if(left <right) {
            if (input < arr[middle]) {
                return binarySearch(arr, input, left, middle - 1);
            } else {
                return binarySearch(arr, input, middle + 1, right);
            }
        } else{
            return -1;
        }
    }
}
