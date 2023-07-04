package com.sukesh.functional.algorithms.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestLargestCommonSubstring {
    private LargestCommonSubstring uut = new LargestCommonSubstring();

    @Test
    public void itTestsTheLargestCommonPrefix(){
        String[] list = {"a", "b", "c"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertEquals("", actual);
    }

    @Test
    public void itTestsTheLargestCommonPrefixMatch(){
        String[] list = {"aac", "aba", "aca"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertEquals("a", actual);
    }

    @Test
    public void itTestsTheLargestCommonPrefixNoMatch(){
        String[] list = {"google", "is", "a" ,"data", "company"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertEquals("", actual);
    }

    @Test
    public void itTestsTheLargestCommonPrefixMatchTwoChars(){
        String[] list = {"google", "gogle", "golf"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertEquals("go", actual);
    }

    @Test
    public void itTestsTheLargestCommonPrefixDoesNotMatch(){
        String[] list = {"dog", "fog", "jog"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertNotEquals("og", actual);
    }
}

