package com.sukesh.functional.algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch classToTest = new BinarySearch();

    @Test
    public void itSearchesTheNumber(){
        int[] arr = {1,2,3,4,5,6,7};
      int position =    classToTest.search(arr , 5);
      assertEquals(4 , position);
    }

    @Test
    public void itSearchesTheNumberWhenOdd(){
        int[] arr = {1,2,3,4,5,6,7,8};
        int position =    classToTest.search(arr , 1);
        assertEquals(0 , position);
    }

    @Test
    public void itSearchesTheNumberWhenArrayIsOdd(){
        int[] arr = {10,11,12,13,14,15,16,17,18};
        int position =    classToTest.search(arr , 17);
        assertEquals(7 , position);
    }

    @Test
    public void itDoesNotFindTheNumber(){
        int[] arr = {1,2,3,4,5,6,7,8};
        int position =    classToTest.search(arr , 9);
        assertEquals(-1 , position);
    }

    @Test
    public void itFindsTheNumberWhenOnlyOneNumberIsThere(){
        int[] arr = {0};
        int position =    classToTest.search(arr , 0);
        assertEquals(0 , position);
    }
}
