package com.sukesh.functional.stream;

import com.sukesh.functional.Person;
import com.sukesh.functional.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

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

        IntStream intStream = ThreadLocalRandom.current().ints();
        intStream.limit(1000)
                .filter(integerValue -> integerValue >0)
                .forEach(System.out::println);
//        //Optional
//        Optional<Person> opt = people.stream().findFirst(p -> p);


        Optional<String> optional = Optional.of("Sukesh");
        LOGGER.info("isPresent {}" , optional.isPresent());


        Optional<String> optional1 = Optional.ofNullable(null);
        LOGGER.info("isPresent {}" , optional1.isPresent());


        Optional<String> opt = Optional.of("yes");
        opt.ifPresent(name ->  LOGGER.info("length  {}" ,name.length()));

        // Getting the value of optional using get
        Optional<String> optionalGet = Optional.of("Man");
        String name = optionalGet.get();
        LOGGER.info("name {}" , name);
        //Group by
        //Reference : https://www.baeldung.com/java-groupingby-collector

        //Read a file as a stream
        //Assume each line in the file contains comma seperated value and the value before the first comma is the key

    }
}
