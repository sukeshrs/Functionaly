package com.sukesh.functional.designPatterns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FinalStuff {
    private static final List<String> list;
    private String modifier = "Sukesh";

    static {
        list = new ArrayList<>();
        System.out.println("print static" + list);
    }

    FinalStuff(){
        list.add("SUkesh");
        System.out.println("print Constructoe" + list);
    }

    public void print() {
        System.out.println("print Method" + list);
    }
}
