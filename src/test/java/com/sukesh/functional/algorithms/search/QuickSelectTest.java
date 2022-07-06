package com.sukesh.functional.algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSelectTest {

    QuickSelect classToTest = new QuickSelect();

    @Test
    public void kthLargestTest(){
        int arr[] = {1,5,6,7,3,2};
        int n = classToTest.quickSelect(arr,3);
        assertEquals(5, n);
    }

    @Test
    public void kthLargestTestWithOneElement(){
        int arr[] = {10};
        int n = classToTest.quickSelect(arr,1);
        assertEquals(10, n);
    }

    @Test
    public void kthLargestTestWithRightMostElement(){
        int arr[] = {1,5,6,7,3,2};
        int n = classToTest.quickSelect(arr,1);
        assertEquals(7, n);
    }

    @Test
    public void kthLargestTestWithLeftMostElement(){
        int arr[] = {1,5,6,7,3,2};
        int n = classToTest.quickSelect(arr,6);
        assertEquals(1, n);
    }

    @Test
    public void kthLargestTestWithNegativeNumbers(){
        int arr[] = {1,5,6,7,3,-1,2};
        int n = classToTest.quickSelect(arr,7);
        assertEquals(-1, n);
    }
}
