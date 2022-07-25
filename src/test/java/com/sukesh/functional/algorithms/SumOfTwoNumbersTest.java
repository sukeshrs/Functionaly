package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SumOfTwoNumbersTest {
    private SumOfTwoNumbers uut = new SumOfTwoNumbers();

    @Test
    public void itTestsTheSumOfTwoNumbers(){
      int[] result =  uut.onePass(new int[]{2, 3, 4},5);
      System.out.println(Arrays.toString(result));
    }

    @Test
    public void itTestsTheSumOfTwoSameNumbers(){
        int[] result =  uut.onePass(new int[]{4, 3, 2, 4},8);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void itTestTheListOfNumbersAreReturned_WhenItAddsUpToTheTarget(){
        List<List<Integer>> result = uut.twoSumWithAllNumbersReturned(new int[]{4, 3, 2, 4 ,1} , 5);
        System.out.println(result);
    }
}
