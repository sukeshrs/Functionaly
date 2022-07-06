package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class LongestSubStringTest {
    private LongestSubString unitUnderTest = new LongestSubString();


//    @ParameterizedTest
//    @CsvSource(value = {"a:1", "abc:3", "abbba:2", "test:3", "90:2"}) // six numbers
//    void itShouldReturnTheLongestSubstringLength(String s , Integer i) {
//        unitUnderTest.lengthOfLongestSubstring(s);
//    }

    @Test
    void itShouldReturnTheLongestSubstringLength() {
        unitUnderTest.lengthOfLongestSubstring("dfdv");
    }
}
