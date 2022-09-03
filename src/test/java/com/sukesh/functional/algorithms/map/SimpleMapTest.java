package com.sukesh.functional.algorithms.map;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimpleMapTest {
    private SimpleMap<Integer,Integer> classToTest;

    @Before
    public void setUp(){
        classToTest = new SimpleMap<>();
    }

    @Test
    public void itTestsTheSizeOfTheMap(){
        classToTest = new SimpleMap<>();
        int size = classToTest.size();
    }

}
