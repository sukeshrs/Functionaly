package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    private ReverseInteger classToTest = new ReverseInteger();

    @Test
    public void itReversesAnInteger(){
        Integer result = classToTest.reverse(123);
        assertEquals(321 , result);
    }

    @Test
    public void itReversesAnIntegerWithZeros(){
        Integer result = classToTest.reverse(1000);
        assertEquals(1 , result);
    }

    @Test
    public void itReversesAnIntegerWithASingleDigit(){
        Integer result = classToTest.reverse(9);
        assertEquals(9 , result);
    }

    @Test
    public void itReversesAnIntegerWithNegativeNumbers(){
        Integer result = classToTest.reverse(-789);
        assertEquals(-987 , result);
    }

    @Test
    public void itReturnsZeroForAnIntegerWithIntegerMaxValue(){
        Integer result = classToTest.reverse(1534236469);
        assertEquals(0 , result);
    }

    @Test
    public void itReversesAnIntegerWithCharArray(){
        Integer result = classToTest.reverseUsingCharArray(153);
        assertEquals(351 , result);
    }

    @Test
    public void itReversesAnIntegerWithCharArrayWithaSingleDigit(){
        Integer result = classToTest.reverseUsingCharArray(0);
        assertEquals(0 , result);
    }

    @Test
    public void itReversesAnIntegerWithStringBuilder(){
        Integer result = classToTest.reverseUsingStringBuilder(5678760);
        assertEquals(678765 , result);
    }
}
