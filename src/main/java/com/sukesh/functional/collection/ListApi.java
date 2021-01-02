package com.sukesh.functional.collection;

import com.sukesh.functional.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ListApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(ListApi.class);

    public static void main(String[] args) {
        Person p1 = new Person(50, "John", "Doe");
        Person p2 = new Person(21, "john", "Deen");
        Person p3 = new Person(7, "scott", "Smith");
        Person p4 = new Person(78, "Gabriel", "Raman");
        Person p5 = new Person(43, "Christian", "Doe");
        Person p6 = new Person(12, "ustad", "Khan");
        Person p7 = new Person(21, "Jeff", "Gates");

        List<Person> people = new LinkedList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));
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
    }
}
