package com.sukesh.functional.algorithms.map;


import org.junit.Before;
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

    @Test
    public void itTestsThePutMethodAndChecksTheSize(){
        classToTest = new SimpleMap<>();
        classToTest.put(1,2);
        int size = classToTest.size();
        assertEquals(1,size);
    }

    @Test
    public void itTestsIfTheKeyIsPresent(){
        classToTest = new SimpleMap<>();
        classToTest.put(2,2);
        boolean response = classToTest.containsKey(2);
        assertTrue(response);
    }

}
