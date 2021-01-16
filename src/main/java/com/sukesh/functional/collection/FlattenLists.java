package com.sukesh.functional.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists implements IFlattenLists {

    @Override
    public List<Integer> integerList(List<List<Integer>> list) {
        List<Integer> listOfIntegers = new LinkedList<>();
        if (list != null) {
            listOfIntegers = list.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.toList());
        }
        return listOfIntegers;
    }
}
