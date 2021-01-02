package com.sukesh.functional.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CommonUtil {
    public static List<String> buildStringList() {
        List<String> unmodifiableList = Arrays.asList("Hello How","Hello","How are you" ,"Hello World" ,"Hello Java" ,"Why" , "What" , "Hello Coffee");
        List<String> modifiableList = new LinkedList<>(unmodifiableList);
        return modifiableList;
    }
}
