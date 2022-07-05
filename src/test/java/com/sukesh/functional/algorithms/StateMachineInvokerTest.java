package com.sukesh.functional.algorithms;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateMachineInvokerTest {
    private StateMachineInvoker uut = new StateMachineInvoker();

    @Test
    public void shouldTestTheStringConversion_WhenStringHasIntegerValue(){
        int result =uut.atoi("1234");
        assertEquals(1234 , result);
    }

    @Test
    public void shouldTestTheStringConversion_WhenStringHasSpaceSignAndIntegerValue(){
        int result =uut.atoi("         +1234");
        assertEquals(1234 , result);
    }

    @Test
    public void shouldTestTheStringConversion_WhenStringHasSpaceNegativeSignAndIntegerValue(){
        int result =uut.atoi("         -67           ");
        assertEquals(-67 , result);
    }

    @Test
    public void shouldTestTheStringConversion_WhenStringHasSpacesAfterNegativeSignAndIntegerValue(){
        int result =uut.atoi("         -      67           ");
        assertEquals(-67 , result);
    }

    @Test
    public void shouldTestTheStringConversion_WhenStringDoesNotHaveIntegerValue(){
        int result =uut.atoi("ahsjkahd");
        assertEquals(-0 , result);
    }

    @Test
    public void shouldTestTheStringConversion_WhenNumbersAreAfterLetters(){
        int result =uut.atoi("       +ahsjkahd999");
        assertEquals(0 , result);
    }

    @Test
    public void shouldTestTheStringConversion_WhenStringIsIntegerMaxValue(){
        int result =uut.atoi("" + Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE , result);
    }

    @Test
    public void shouldTestTheStringConversion_WhenStringIsIntegerMinValue(){
        int result =uut.atoi("" + Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE , result);
    }

//    @Test
//    public void shouldTestTheStringConversion_WhenStringValueIsbiggerThanIntegerMaxValue(){
//        int result =uut.atoi("" + (Integer.MAX_VALUE + 4));
//        assertEquals(Integer.MAX_VALUE , result);
//    }
}
