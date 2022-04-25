package com.sukesh.functional.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IniniteStream {
    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(1, i -> i +1);
        List<Integer> list = infiniteStream.skip(10)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
