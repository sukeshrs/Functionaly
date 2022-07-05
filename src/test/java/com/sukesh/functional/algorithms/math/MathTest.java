package com.sukesh.functional.algorithms.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    private Mathematics classToTest = new Mathematics();

    @Test
    public void itTestFactorial(){
        int returnValue = classToTest.factorial(5);
        assertEquals(120, returnValue);
    }

    @Test
    public void itTestFactorialOfTen(){
        int returnValue = classToTest.factorial(11);
        System.out.println(returnValue);
        //assertEquals(120, returnValue);
    }
}
