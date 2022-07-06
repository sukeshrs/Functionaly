package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntArrayOperationsTest {
    IntArrayOperations classToTest = new IntArrayOperations();

    @Test
    public void shouldFindMaximumInteger(){
        int result = classToTest.findMaximum(new int[]{1, 5, 888888888, 88999, 3, 7});
        assertEquals(888888888, result);
    }

    @Test
    public void shouldFindMaximumIntegerUsingIntSTream(){
        int result = classToTest.findMaximumIntStream(new int[]{1, 5, 888888888, 88999, 3, 7});
        assertEquals(888888888, result);
    }

    @Test
    public void shouldFindMaximumIntegerUsingIntSTreamLargeArray(){
        int size = 1000;
        int[] array = new int[size];
        for(int i = 0; i < size ; i++){
            array[i] = i;
        }
        int result = classToTest.findMaximumIntStream(array);
        assertEquals(999, result);
    }

    @Test
    public void shouldFindMaximumIntegerLargeArray(){
        int size = 1000;
        int[] array = new int[size];
        for(int i = 0; i < size ; i++){
            array[i] = i;
        }
        int result = classToTest.findMaximum(array);
        assertEquals(999, result);
    }


    @Test
    public void shouldFindMinimumInteger(){
        int result = classToTest.findMinimum(new int[]{1, -3,5, 888888888, 88999, 3, 7});
        assertEquals(-3, result);
    }

    @Test
    public void shouldReturnArrayWithoutDuplicates(){
        int[] result = classToTest.removeDuplicates(new int[]{1,2,3,3,4,5,5,5,6});
    }
}
