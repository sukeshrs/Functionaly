package com.sukesh.functional.algorithms.search;

import org.junit.jupiter.api.Test;

public class StartingAndEndingIndexOfANumberTest {
    private StartingAndEndingIndexOfANumber classToTest = new StartingAndEndingIndexOfANumber();
    @Test
    public void itFindsTheStartAndEndIndex(){
        int array[] = {1,2,3,4,5,5,6,7};
        int[] indeces = classToTest.findIndices(array , 5);
    }
}
