package com.sukesh.functional.stream;

import com.sukesh.functional.Person;
import com.sukesh.functional.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MapReduce {
    private static final Logger LOGGER = LoggerFactory.getLogger(MapReduce.class);
    public static void main(String[] args) {
        List<Person> people = CommonUtil.returnPersonList();
        people.stream()
                .map(Person::getAge)
                .filter(age -> age > 20)
                .forEach(System.out::println);


        //Skip and limit
        people.stream()
                .skip(2)
                .limit(3)
                .filter(person -> person.getAge() > 20)
                .forEach(System.out::println);

        //Any match
        boolean atleastOneMatched = people.stream()
                                    .anyMatch(person -> person.getAge() >20);
        LOGGER.info("At least one person above 20 years : {}", atleastOneMatched);

        //All match
        boolean allOfThemMatched = people.stream()
                .allMatch(person -> person.getAge() >20);
        LOGGER.info("All of the entries are above 20 years : {}", allOfThemMatched);

        //None match
        boolean noMatchesFound = people.stream()
                .noneMatch(person -> person.getAge()>20);
        LOGGER.info("No matches found above 20 years : {}", noMatchesFound);

    }
}
