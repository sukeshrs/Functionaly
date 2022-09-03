package com.sukesh.functional.function;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapContainingListOfEntriesTest {

    MapContainingListOfEntries classToTest = new MapContainingListOfEntries();

    @Test
    public void shouldGetTheKeyValuePairFromAMap_ForGivenListOfKeys() {
        List<String> carList = Arrays.asList("x7", "q7");
        Map<String, String> carPriceMap = createMap();
        Map<String, String> resultMap = classToTest.getFilteredMap(carPriceMap, carList);
        Assert.assertTrue(resultMap.containsKey("x7"));
        Assert.assertFalse(resultMap.containsKey("x5"));
    }
    @Test
    public void shouldTest_WhetherTheMapContainsAllOfTheEntriesInTheList() {
        List<String> carList = Arrays.asList("x7", "q7");
        Map<String, String> carPriceMap = createMap();
        boolean result = classToTest.checkIfMapContainsAllEntries(carList, carPriceMap);
        assertTrue(result);
    }

    @Test
    public void shouldTestThat_TheMapDoesNotContainAnyOfTheEntriesInTheList() {
        List<String> carList = Arrays.asList("x1", "q1");
        Map<String, String> map = createMap();
        boolean result = classToTest.checkIfMapDoesNotContainANyOfTheEntries(carList , map);
        assertTrue(result);

    }

    public void shouldTestTheResultsOfLessThanAThreshold(){
        classToTest.getCarsBelowPriceRange(createMap(), "60000");

    }

    private Map<String, String> createMap() {
        Map<String, String> carPriceMap = new HashMap<String, String>() {
            {
                put("x7", "60000");
                put("x5", "50000");
                put("q7", "61000");
                put("modelY", "59000");
            }
        };
        return carPriceMap;
    }
}
