package com.sukesh.functional.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists<T> implements IFlattenLists<T> {

    @Override
    /**
     * Takes a list is list of integers as arguments and returns a list of integers
     */
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
    /**
     * Takes list of list of objects as arguments and returns a flattened list
     */
    public List<T> oneDimentionList(List<List<T>> asList) {
        List<T> oneDimentionList = new ArrayList<>();
        if(oneDimentionList != null) {
            oneDimentionList = asList.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.toList());
        }
        return oneDimentionList;
    }

    @Override
    /**
     * Takes a list of strings as arguments and returns a flattened list
     * used reduce operation to acheive the result
     */
    public List<String> reduceToOneDimention(List<List<String>> asList) {
        List<String> strings = new ArrayList<>();
        if(asList != null){
            strings = asList.stream().reduce(new ArrayList<String>(), (l1 , l2) ->{
                l1.addAll(l2);
                return l1;
            });
        }
        return strings;
    }
}
