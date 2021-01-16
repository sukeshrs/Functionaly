package com.sukesh.functional.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlattenListsTest {

    private IFlattenLists flattenLists = new FlattenLists();

    @Test
    public void itShouldReturnAnEmptyListEvenWhenNullIsPassed(){
        List<Integer> emptyList = new LinkedList<>();
        List<Integer> integerList =  flattenLists.integerList(null);
        // assertNull(integerList);
        assertEquals(emptyList , integerList);
    }

    @Test
    public void itShouldTestTheReturnTypeIsAListOfIntegers(){
        List<Integer> emptyList = new LinkedList<>();
        List<Integer> integerList =  flattenLists.integerList(new LinkedList<>());
       assertEquals(emptyList , integerList);
    }

    @Test
    public void itShouldReturnTheFlattenedListWhenAListOfListIsPassed(){
        List<Integer> firstList = Arrays.asList(1,2,3);
        List<Integer> secondList = Arrays.asList(4,5,6);
        List<Integer> expectedOutput = Arrays.asList(1,2,3,4,5,6);
        List<Integer> integerList =  flattenLists.integerList(Arrays.asList(firstList,secondList));
        assertEquals(expectedOutput , integerList);
    }
}
