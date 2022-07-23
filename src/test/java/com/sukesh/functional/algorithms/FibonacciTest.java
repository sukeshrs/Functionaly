package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FibonacciTest {
    private Fibonacci classToTest = new Fibonacci();

    @Test
    public void shouldTestFibonacciNumbersAreReturned(){
       List<Integer> integers = classToTest.getFibonacci(100);
       System.out.println(integers);
    }
}
