package com.sukesh.functional.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ComparatorTest {
    public static void main(String args[]){
        Person person1 = new Person(60, 160.8 , "Harry");
        Person person4 = new Person(40, 170 , "Doe");
        Person person2 = new Person(40, 155 , "Roger");
        Person person3 = new Person(50 , 153 , "Bob");

        List<Person> persons = new CopyOnWriteArrayList<>();
        persons.add(person4);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        //Collections.sort(persons , (p1,p2) -> Integer.compare(p1.getAge() , p2.getAge()));
       // Collections.sort(persons , (p1,p2) -> Double.compare(p1.getHeight(),p2.getHeight()));

      List<Person> list =  persons.stream()
              .filter(person -> person.getHeight() < 165)
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getHeight))
                        .collect(Collectors.toList());

        System.out.println(list);
    }
}
