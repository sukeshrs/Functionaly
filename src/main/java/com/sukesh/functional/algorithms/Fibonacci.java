package com.sukesh.functional.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Multiple implementations of fibonacci numbers : 0 1 2 3 5 8 13
 */
public class Fibonacci {
    public List<Integer> getFibonacci(int range){
        int a = 0;
        int b = 1;
        int length = range-1;
        List<Integer> fibNumbers = new ArrayList<>();
        fibNumbers.add(0);

        for (int i= 0; i< length ; i++){
            int temp = b;
            b = a + b;
            fibNumbers.add(b);
            a = temp;
        }

        return fibNumbers;
    }

    public Set<Integer> fibonacciUsingRecursion(int length){
        Set<Integer> set = new HashSet<>();



        return set;
    }

    private int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
