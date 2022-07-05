package com.sukesh.functional.algorithms.cache.lru;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LeastRecentlyUsedCacheTest {
    private LeastRecentlyUsedCache classToTest;



    @Test
    public void shouldTestTheGetMethod(){
        classToTest = new LeastRecentlyUsedCache(3);
        classToTest.put(2,3);
        int value =classToTest.get(2);
        assertEquals(3 , value);
    }

    @Test
    public void shouldTestThePutWorks(){
        classToTest = new LeastRecentlyUsedCache(3);
        classToTest.put(2,3);
        classToTest.put(3,3);
        classToTest.put(4,3);
        int value =classToTest.get(2);
        int size = classToTest.size();
        assertEquals(3 , size);
    }

    @Test
    public void shouldTestTheSizeIsNotGreaterThanCapacity(){
        classToTest = new LeastRecentlyUsedCache(3);
        classToTest.put(2,3);
        classToTest.put(3,3);
        classToTest.put(4,3);
        int size = classToTest.size();
        classToTest.put(8,9);
        classToTest.put(9,9);
        classToTest.put(19,9);
        assertEquals(3 , size);
        System.out.println(classToTest);
    }
}
