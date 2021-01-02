package com.sukesh.functional.collection;

import com.sukesh.functional.Person;
import com.sukesh.functional.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ListApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(ListApi.class);

    public static void main(String[] args) {

        List<Person> people = CommonUtil.returnPersonList();
        //removeIf takes in a Predicate and removes the entries of the predicate matches
        people.removeIf(person -> person.getAge() < 18);

        //Replaces the names with lowercase letters
        people.replaceAll(person -> new Person(person.getAge(), person.getFirstName().toLowerCase(Locale.ROOT), person.getLastName().toLowerCase(Locale.ROOT)));

        LOGGER.info("Lower case names {}", people);


        //Sort based on lambda expressions , s
        people.sort(Comparator.comparing(person -> person.getAge()));
        people.sort(Comparator.comparing(Person::getFirstName));
        people.sort(Comparator.comparing(Person::getLastName).reversed());

        LOGGER.info("Lower case names as comparing operations {}", people);

        // Chaining comparator using thenComparing

        people.sort(Comparator.comparing(Person::getAge)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
        );

        LOGGER.info("After comparator chaining {}", people);

        //Using collections.sort
        Collections.sort(people , Comparator.comparing(person -> person.getAge()));
        Collections.sort(people , (a,b) -> Integer.compare(a.getAge() , b.getAge()));
    }
}
