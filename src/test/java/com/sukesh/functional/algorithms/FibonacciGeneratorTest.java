package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciGeneratorTest {
    private FibonacciGenerator sut = new FibonacciGenerator();

    @Test
    public void printFibonacci_value0(){
        sut.genarate(BigInteger.valueOf(0));
    }

    @Test
    public void printFibonacciValue_smallness(){
        sut.genarate(BigInteger.valueOf(10));
    }

    @Test
    public void printFibonacciUsingStream(){
        sut.generateUsingStreams(20);
    }

    @Test
    public void testTheListOfFibonacciNumbers(){
       List<Integer> list =  sut.getListOfFibonacciNumbers(5);
    }

}
