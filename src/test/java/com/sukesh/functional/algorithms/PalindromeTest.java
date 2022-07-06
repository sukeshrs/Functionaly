package com.sukesh.functional.algorithms;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    private Palindrome uut = new Palindrome();


    @Test
    void itTestsIfTheStringIsPalindrome(){
        boolean isPalindrome = uut.isPalindrome(null);
        assertFalse(isPalindrome);
    }

    @Test
    void itTestsIfTheEmptyStringIsPalindrome(){
        boolean isPalindrome = uut.isPalindrome("");
        assertFalse(isPalindrome);
    }

    @Test
    void itTestsIfReversibleStringIsPalindrome(){
        boolean isPalindrome = uut.isPalindrome("abba");
        assertTrue(isPalindrome);
    }

    @Test
    void itTestsIfReversibleStringIsPalindromeWhenThereAreSpaces(){
        boolean isPalindrome = uut.isPalindrome("abb a");
        assertTrue(isPalindrome);
    }

    @Test
    void itTestsIfReversibleStringIsPalindromeWhenThereAreCapitalLetters(){
        boolean isPalindrome = uut.isPalindrome("abBa");
        assertTrue(isPalindrome);
    }

    @Test
    void itTestsIfNonStringIsNotPalindrome(){
        boolean isPalindrome = uut.isPalindrome("abcd");
        assertFalse(isPalindrome);
    }

    @Test
    void itTestsIfTheStringIsPalindromeUsingStreams(){
        boolean isPalindrome = uut.isPalindromeUsingStreams(null);
        assertFalse(isPalindrome);
    }

    @Test
    void itTestsIfReversibleStringIsPalindromeUsingStreams(){
        boolean isPalindrome = uut.isPalindromeUsingStreams("abba");
        assertTrue(isPalindrome);
    }

    @Test
    void itTestsIfReversibleStringIsPalindromeUsingStreams_WhenThereAreSpacesInTheString(){
        boolean isPalindrome = uut.isPalindromeUsingStreams("abb a");
        assertTrue(isPalindrome);
    }
}
