package com.sukesh.functional.algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciGenerator {
    public void genarate(BigInteger value){
        int a =1;
        int b =1;
        int sum;
        if(value.intValue() ==0){
            return;
        }else{
            for(int i=0 ;i <value.intValue(); i ++){
                sum = a +b ;
                a = b;
                b = sum ;
                System.out.println(b);
            }
        }
    }

    /**
     * Generates the fibonacci sequence using streams
     * Streams
     * @param value
     */
    public void generateUsingStreams(int value){
        Stream.iterate(new int[]{0,1} , n -> new int[]{n[1], n[0] + n[1]})
                .limit(value)
                .forEach(arrayValue -> System.out.println(arrayValue[0]));

    }

    /**
     * Genarates a list of fibonacci numbers based on input and returns as a list
     * @param value
     * @return
     */
    public List<Integer> getListOfFibonacciNumbers(int value){
        List<Integer> list = Stream.iterate(new int[]{0,1} , n -> new int[]{n[1], n[0] + n[1]})
                .limit(value)
                .map(n -> n[0])
                .collect(Collectors.toList());
        return null;
    }
}
