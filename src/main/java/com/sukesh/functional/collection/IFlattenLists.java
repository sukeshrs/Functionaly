package com.sukesh.functional.collection;

import java.util.List;

public interface IFlattenLists<T> {

    public List<Integer> integerList(List<List<Integer>> list);

    List<T> oneDimentionList(List<List<T>> asList);

    List<String> reduceToOneDimention(List<List<String>> asList);
}
