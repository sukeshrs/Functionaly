package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatchingBracketsTest {
    private MatchingBrackets classToTest = new MatchingBrackets();

    @Test
    public void itShouldTestIfTheBracketsAreBalanced(){
        boolean result = classToTest.isValid("(");
        assertFalse(result);
    }

    @Test
    public void itShouldTestIfTheBracketsAreBalancedForAValidString(){
        boolean result = classToTest.isValid("()");
        assertTrue(result);
    }

    @Test
    public void itShouldTestIfTheBracketsAreBalancedForAnInValidString_2(){
        boolean result = classToTest.isValid("()))))))))");
        assertFalse(result);
    }

    @Test
    public void itShouldTestIfTheBracketsAreBalancedForAValidString_3(){
        boolean result = classToTest.isValid("[{()}]{}");
        assertTrue(result);
    }
}
