package com.sukesh.functional.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class IterableUsage {
    public static void main(String[] args) {
        List<String> allowList = Arrays.asList("1987", "2008");
        List<String> list = buildStringList();
        // Removes from the list if the condition matches
        list.removeIf(value -> allowList.contains(value.toLowerCase(Locale.ROOT)));
        System.out.println("List after removing some of the worst years in Financial history : " + list );
    }

    private static List<String> buildStringList() {
        List<String> unmodifiableList = Arrays.asList("2018", "2019","2020" , "1987" , "2008" , "2002");
        List<String> modifiableList = new LinkedList<>(unmodifiableList);
        return modifiableList;
    }
}
