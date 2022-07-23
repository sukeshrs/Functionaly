package com.sukesh.functional.compare;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ComparableTest {
    public static void main(String args[]){
        Person person1 = new Person(60, 160.8 , "Harry");
        Person person2 = new Person(40, 155 , "Roger");
        Person person3 = new Person(50 , 153 , "Bob");

        List<Person> persons = new CopyOnWriteArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        //The following sort is possible only if the objects being sorted implements Comparable
        //Collections.sort(persons);
        List<Person> sortedList =persons.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
