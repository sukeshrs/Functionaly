package com.sukesh.functional.algorithms.cache.lru;

import org.junit.jupiter.api.Test;

public class LinkedHashMapLRUCacheTest {
    private LinkedHashMapLRUCache<Integer, String> classToTest;

    @Test
    public void itTestsTheMap(){
        classToTest = new LinkedHashMapLRUCache(3);
        classToTest.put(1,"qwerty");
        System.out.println(classToTest.size());
    }
}
