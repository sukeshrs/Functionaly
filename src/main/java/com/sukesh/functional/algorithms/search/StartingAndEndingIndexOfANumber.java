package com.sukesh.functional.algorithms.search;

public class StartingAndEndingIndexOfANumber {
    /**
     * input example {1,2,3,4,5,5,6,7}
     * @param array
     * @param value
     * @return [x,y] - starting and ending index of the number
     */
    public int[] findIndices(int[] array, int value) {
        int result[] = {-1,-1};
        selectIndices(array , 0, array.length -1 , value , result);
        return result;
    }

    private void selectIndices(int[] array, int left, int right, int value, int[] result) {
        int middle = (left + right)/2;
        if(array[middle] == value){
            result[0] = middle;

        }
    }
}
