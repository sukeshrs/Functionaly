package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

public class MaxAreaInIntegerArrayTest {
    private MaxAreaInIntegerArray classToTest = new MaxAreaInIntegerArray();


    @Test
    public void shouldReturnTheMaxArea(){
        int[] array = {8,3,4,3,6,7,8,1};
        classToTest.maxAreaDoublePass(array);
    }

    @Test
    public void shouldReturnTheMaxAreaSinglePass(){
        int[] array = {8,3,4,3,6,7,8,1};
        classToTest.maxAreaSinglePass(array);
    }
}
