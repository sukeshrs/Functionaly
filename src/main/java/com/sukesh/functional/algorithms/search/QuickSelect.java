package com.sukesh.functional.algorithms.search;

public class QuickSelect {
    /**
     * eg : {1,5,6,7,3,2}
     * Uses divide and conquer to position one of the elements.
     *
     * @param arr - the array with elements
     * @param k   -
     * @return kthLargest - the kth largest element , which is same as (n-k)the smallest element
     */
    public int quickSelect(int[] arr, int k) {
        int length = arr.length;
        int position = length - k;
        int kthLargest = select(arr, 0, length - 1, position);
        return kthLargest;
    }

    private int select(int[] arr, int leftPointer, int rightPointer, int position) {
        int partitionIndex = partition(arr, leftPointer, rightPointer);
        if (position == partitionIndex) {
            return arr[partitionIndex];
        } else if (position < partitionIndex) {
            return select(arr, leftPointer, partitionIndex - 1, position);
        } else {
            return select(arr, partitionIndex + 1, rightPointer, position);
        }
    }

    private int partition(int[] arr, int leftPointer, int rightPointer) {
        int pivot = arr[rightPointer];
        int i = leftPointer;
        for (int j = leftPointer; j < rightPointer; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, rightPointer);
        return i;
    }

    /**
     * swap numbers at position i and j. If I and J are the same , the swap operation will replace the current number
     * with the same number
     *
     * @param arr
     * @param i
     * @param j
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
