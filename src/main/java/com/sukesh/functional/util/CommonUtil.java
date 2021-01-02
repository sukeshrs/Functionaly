package com.sukesh.functional.util;

import com.sukesh.functional.Person;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CommonUtil {
    public static List<String> buildStringList() {
        List<String> unmodifiableList = Arrays.asList("Hello How","Hello","How are you" ,"Hello World" ,"Hello Java" ,"Why" , "What" , "Hello Coffee");
        List<String> modifiableList = new LinkedList<>(unmodifiableList);
        return modifiableList;
    }

    public  static List<Person> returnPersonList() {
        Person p1 = new Person(50, "John", "Doe");
        Person p2 = new Person(21, "john", "Deen");
        Person p3 = new Person(7, "scott", "Smith");
        Person p4 = new Person(78, "Gabriel", "Raman");
        Person p5 = new Person(43, "Christian", "Doe");
        Person p6 = new Person(12, "ustad", "Khan");
        Person p7 = new Person(21, "Jeff", "Gates");
        List<Person> people = new LinkedList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));
        return people;
    }
}
