package com.sukesh.functional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionalWay {

    private static final Logger LOGGER = LoggerFactory.getLogger(FunctionalWay.class);

    public static void main(String[] args) {
        LOGGER.info("start the great functional journey");
    }

    //1. Function

    //Eg 1 :    Function<Person ,Integer> f = person -> person.getAge();
    //Using method reference for the same below
    Function<Person, Integer> personAge = Person::getAge;

    //BinaryOperator

    //BinaryOperator<Integer> sum = (val1 , val2) -> val1 + val2;
    //BinaryOperator<Integer> sum = (val1 , val2) -> Integer.sum(val1, val2);
    BinaryOperator<Integer> sum = Integer::sum;
    
    //Consumer
}
