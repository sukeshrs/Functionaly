package com.sukesh.functional.algorithms.cache.lru;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheTest {
    private LRUCache cache = new LRUCache(4);


    @Before
    public void setUp(){

    }

    @Test
    public void shouldTestTheRemovalOfLeastRecentlyUsedEntry(){
        cache.put(3,6);
        cache.put(6,6);
        cache.put(1,8);
        cache.put(9,8);
        System.out.println(cache);
        cache.get(3);
        cache.put(4,8);
        System.out.println(cache);
    }
}
