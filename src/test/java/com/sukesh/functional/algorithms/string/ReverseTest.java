package com.sukesh.functional.algorithms.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {
    private Reverse classToTest = new Reverse();

    @Test
    void itReversesAString(){
       String returnValue =  classToTest.reverse("1234");
       assertEquals("4321" , returnValue);
    }

    @Test
    void itReversesAStringUsingCharArray(){
        String returnValue =  classToTest.reverseUsingCharArray("1234");
        assertEquals("4321" , returnValue);
    }

    @Test
    void itReversesAStringUsingCharArraySpecialChars(){
        String returnValue =  classToTest.reverseUsingCharArray("1234$%^&&&***");
        assertEquals("***&&&^%$4321" , returnValue);
    }
}
