package com.sukesh.functional.algorithms.cache;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheeTest {
    private LRUCache<Integer , Integer> classToTest;


    @Test
    public void shouldTestTheSizeOfTheCache(){
        classToTest = new LRUCache<>(5);
        int size = classToTest.size();
        assertEquals(5, size);
    }

}
