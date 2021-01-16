package com.sukesh.functional.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists<T> implements IFlattenLists<T> {

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

    @Override
    public List<T> oneDimentionList(List<List<T>> asList) {
        List<T> oneDimentionList = new ArrayList<>();
        if(oneDimentionList != null) {
            oneDimentionList = asList.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.toList());
        }
        return oneDimentionList;
    }
}
