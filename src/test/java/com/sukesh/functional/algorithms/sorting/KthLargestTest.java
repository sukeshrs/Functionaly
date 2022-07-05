package com.sukesh.functional.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestTest {

    private KthLargest largest = new KthLargest();

    @Test
    public void shouldReturnKthLargestElementBasedOnPosition(){
        int[] array = {2,3,4,5,6,1,3,6};
        int element = largest.findLargest(array , 2);
        assertEquals(6, element);
    }

    @Test
    public void shouldReturnKthLargestElementInArrayBasedOnPosition(){
        int[] array = {6,4,5,1};
        int element = largest.findLargest(array , 4);
        assertEquals(1, element);
    }

    @Test
    public void shouldReturnKthLargestElementInArrayBasedOnValue(){
        int[] array = {6,4,5,1,9,9,9,9,3,2,4,5,1,3};
        int element = largest.findLargestAndDistinct(array , 2);
        assertEquals(6, element);
    }
}
