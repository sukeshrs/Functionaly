package com.sukesh.functional.algorithms.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    Palindrome classToTest = new Palindrome();

    @Test
    public void shouldTestTheStringIsPalindrome(){
        boolean response = classToTest.isPalindrome("abba");
        assertTrue(response);
    }

    @Test
    public void shouldTestTheStringIsPalindromeForOddLength(){
        boolean response = classToTest.isPalindrome("abbba");
        assertTrue(response);
    }

    @Test
    public void shouldTestTheStringIsNotPalindrome(){
        boolean response = classToTest.isPalindrome("abb");
        assertFalse(response);
    }

    @Test
    public void shouldTestTheStringIsPalindromeUsingArray(){
        boolean response = classToTest.isPalindromeUsingArray("abba");
        assertTrue(response);
    }

    @Test
    public void shouldTestTheStringIsPalindromeUsingArrayForOddString(){
        boolean response = classToTest.isPalindromeUsingArray("ab9ba");
        assertTrue(response);
    }

    @Test
    public void shouldTestTheStringIsPalindromeUsingArrayForSingleValue(){
        boolean response = classToTest.isPalindromeUsingArray("a");
        assertTrue(response);
    }
}
