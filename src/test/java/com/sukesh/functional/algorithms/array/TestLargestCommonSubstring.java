package com.sukesh.functional.algorithms.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestLargestCommonSubstring {
    private LargestCommonSubstring uut = new LargestCommonSubstring();

    @Test
    public void itTestsTheLargestCommonSubstring(){
        String[] list = {"a", "b", "c"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertEquals("", actual);
    }

    @Test
    public void itTestsTheLargestCommonSubstringMatch(){
        String[] list = {"aac", "aba", "aca"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertEquals("a", actual);
    }

    @Test
    public void itTestsTheLargestCommonSubstringNoMatch(){
        String[] list = {"google", "is", "a" ,"data", "company"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertEquals("", actual);
    }

    @Test
    public void itTestsTheLargestCommonSubstringMatchTwoChars(){
        String[] list = {"google", "gogle", "golf"};
        String actual = uut.findLargestCommonPrefix(list);
        Assert.assertEquals("go", actual);
    }
}

