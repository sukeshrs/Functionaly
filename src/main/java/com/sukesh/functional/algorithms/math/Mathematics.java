package com.sukesh.functional.algorithms.math;

/**
 * When n = 5;
 * 5 * fact (4) - 120
 * 4 * fact (3) - 24
 * 3 * fact (2) - 6
 * 2 * fact (1) - 2
 */
public class Mathematics {
    public int factorial(int n){
        if(n <= 1){
            return 1;
        } else{
            n =  n * factorial(n-1);
        }
        return  n;
    }
}

