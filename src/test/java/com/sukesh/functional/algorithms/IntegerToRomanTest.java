package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IntegerToRomanTest {
    private IntegerToRoman classToTest = new IntegerToRoman();

    @Test
    public  void shouldTestIntegerToRoman(){
       String result = classToTest.intToRoman(1);
       assertEquals("I" , result);
    }

    @Test
    public  void shouldTestIntegerToRomanFor4Digit(){
        String result = classToTest.intToRoman(1001);
        assertEquals("MI" , result);
    }
}
