package com.sukesh.functional.algorithms.numbers;

import com.sukesh.functional.algorithms.integers.Reverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {
    private Reverse classToTest = new Reverse();

    @Test
    public void shouldTestIfTheIntegerIsReversed(){
        int valueReturned = classToTest.reverse(1234);
        assertEquals(4321 , valueReturned);
    }

    @Test
    public void shouldTestIfTheIntegerIsReversedForMaxValue(){
        int valueReturned = classToTest.reverse(Integer.MAX_VALUE);
        assertEquals(0 , valueReturned);
    }

    @Test
    public void shouldTestIfTheIntegerIsReversedForMinValue(){
        int valueReturned = classToTest.reverse(Integer.MIN_VALUE);
        assertEquals(0 , valueReturned);
    }

    @Test
    public void shouldTestIfTheIntegerIsReversedForNegativeValue(){
        int valueReturned = classToTest.reverse(-432);
        assertEquals(-234 , valueReturned);
    }
}
